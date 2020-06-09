package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {
	//1. singleton pattern 코딩 하는 방법
	//	1) 생성자의 접근 한정자를 private으로 만든다
	//	2) 해당 클래스의 객체를 생성할 수 있는 변수를 static으로 선언한다
	//	3) 해당 클래스의 객체를 생성할 수  있는 메서드를 static으로 만든다
	
	private static EmpDao dao; // 2)
	
	public static EmpDao getInstance() { // 3)
		if(dao == null) {
			dao = new EmpDao();
			
		}
		return dao;
	}
	
	//생성자에다가 한번만 민들어주기
	private EmpDao() { // 1)
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//insert
	public int insert(EmpDto e) {
		int resultCount = 0;
		
		Connection con = null;
		PreparedStatement prep = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUE(?, ?, ?, ?, CURDATE(), ?, ?, ?) ");
			
			prep = con.prepareStatement(sql.toString());
			int index = 0;
			prep.setInt(++index, e.getNum());
			prep.setString(++index, e.getName());
			prep.setString(++index, e.getJob());
			prep.setInt(++index, e.getMgr());
			prep.setInt(++index, e.getSal());
			prep.setInt(++index, e.getComm());
			prep.setInt(++index, e.getDeptNo());
			
			resultCount = prep.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			
		} finally {
			close(con, prep, null);
			
		}
		
		
		return resultCount;
	}
	
	//update
	public int update(EmpDto e) {
		int resultCount = 0;
		
		Connection con = null;
		PreparedStatement prep = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp ");
			sql.append("SET ename = ?, job = ?, mgr = ?, ");
			sql.append("CURDATE(), sal = ?, comm = ?, deptno = ? ");
			sql.append("WHERE empno = 8002");
			
			prep = con.prepareStatement(sql.toString());
			int index = 0;
			prep.setInt(++index, e.getNum());
			prep.setString(++index, e.getName());
			prep.setString(++index, e.getJob());
			prep.setInt(++index, e.getMgr());
			prep.setInt(++index, e.getSal());
			prep.setInt(++index, e.getComm());
			prep.setInt(++index, e.getDeptNo());
			
			resultCount = prep.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			
		} finally {
			close(con, prep, null);
			
		}
		
		return resultCount;
	}

	//delete
	public int delete(int num) {
		int resultCount = 0;
		
		Connection con = null;
		PreparedStatement prep = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM emp ");
			sql.append("WHERE empno = ? ");
			
			prep = con.prepareStatement(sql.toString());
			prep.setInt(1, num);
			
			resultCount = prep.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(prep != null) prep.close();
				if(con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			
			} finally {
				close(con, prep, null);
				
			}
			
		}
		
		return resultCount;
	}
	
	//select - 여러개의 결과
	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		
		Connection con = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, ");
			sql.append("DATE_FORMAT(hiredate, '%Y.%m.%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY empno DESC ");
			
			prep = con.prepareStatement(sql.toString());
			rs = prep.executeQuery();
			
			while(rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptNo = rs.getInt(++index);
				list.add(new EmpDto (num, name, job, mgr, hireDate, sal, comm, deptNo));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		} finally {
			close(con, prep, rs);
			
		}
		
		
		return list;
	}

	//select -하나의 결과
	public EmpDto select(int num) {
		EmpDto empDto = null;
		
		Connection con = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, ");
			sql.append("DATE_FORMAT(hiredate, '%Y.%m.%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("where empno = ? ");
			
			prep = con.prepareStatement(sql.toString());
			prep.setInt(1, num);
			
			rs = prep.executeQuery();
			if(rs.next()) {
				int index = 0;
				int _num = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptNo = rs.getInt(++index);
				empDto = new EmpDto(_num, name, job, mgr, hireDate, sal, comm, deptNo);
				
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			close(con, prep, rs);
			
		}
		
		return empDto;
	}
	
	//close
	private void close(Connection con, PreparedStatement prep, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(prep != null) prep.close();
			if(con != null) con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
