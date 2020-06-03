package Practice.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Practice.JDBC.MemberDto;

public class MemberDaoEvery {
	
	public ArrayList<MemberDto> select() {

		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} 
		
		Connection con = null;
		PreparedStatement prep = null;
		ResultSet rs= null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc", 
					"kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME ");
			sql.append("FROM member ");
			sql.append("ORDER BY num ASC ");
			
			prep = con.prepareStatement(sql.toString());
			rs = prep.executeQuery();
			
			while(rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				list.add(new MemberDto(num,name));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(prep != null) prep.close();
				if(con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	
}
