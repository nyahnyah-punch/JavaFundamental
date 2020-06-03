package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} 
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//sql문의 결과 집합을 관리하는 인터페이스
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			
			sql.append("SELECT num, NAME ");
			sql.append("FROM member1 ");
			sql.append("ORDER BY num ASC ");
			 
			//바인딩변수 없으니까 생략
			pstmt = con.prepareStatement(sql.toString());
			//select문일땐 executeQuery()를 사용해야함
			//insert update delete문을 사용할 경우는 execute.Update
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				
				System.out.printf("%d, %s %n", num, name);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
				try { //닫을때는 거꾸로 닫아주기
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
					
				}
			
		}
		
		
	}
}
