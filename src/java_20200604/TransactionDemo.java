package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement prep1 = null;
		PreparedStatement prep2 = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",
					"kpc12","kpc1234");
			
			//트랜젝션 시작
			con.setAutoCommit(false); //원래는 트루인거를 false로 바꿔주는거
			
			//인서트작업 1
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES (110, 'A7', 'B7') ");
			
			prep1 = con.prepareStatement(sql.toString());
			prep1.executeUpdate();
			
			sql.setLength(0);
			
			//인서트작업 2
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES (120, 'A8', 'B8') ");
			
			prep2 = con.prepareStatement(sql.toString());
			prep2.executeUpdate();
			
			isSuccess = true;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				//두개가 묶여있으므로 둘중 하나만 안들어가도 둘 다 안들어가진다
				if(isSuccess) {
					con.commit(); //트랜젠셕 끝
				} else {
					con.rollback(); //트랜젠셕 끝
				}
				con.setAutoCommit(true); //커넥션 원상복귀 & 반납 
				
				if(prep2 != null) prep2.close();
				if(prep1 != null) prep1.close();
				if(con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
