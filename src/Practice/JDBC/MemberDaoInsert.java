package Practice.JDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDaoInsert {
	
	public int insert(MemberDto m) {
		int resultCount = 0;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		Connection con = null;
		PreparedStatement prep = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME) VALUES(?, ?)");
			
			prep = con.prepareStatement(sql.toString());
			int index = 0;
			prep.setInt(++index, m.getNum());
			prep.setString(++index, m.getName());
			
			resultCount = prep.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(prep != null) prep.close();
				if(con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return resultCount;
	}

	
	
	
} 
