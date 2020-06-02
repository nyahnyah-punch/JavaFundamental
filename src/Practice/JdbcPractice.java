package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPractice {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			 
		}
		
		Connection con = null; 
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc",
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member1(num, NAME) VALUES(?,?)");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 7);
			pstmt.setString(2, "올라"); 
			
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신: " + resultCount);
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
				try {
					if(con != null) con.close();
					if(pstmt != null) pstmt.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
					
				}
			
		}
			
			
		
		
		
	}
}
