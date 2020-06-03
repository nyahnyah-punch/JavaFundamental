package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {

	public static void main(String[] args) {
//		1.드라이브 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		Connection con = null;
		PreparedStatement pstm = null;
		
//		2. 데이터베이스와 연결
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc",
					"kpc12", "kpc1234");
			
//		3. sql문을 전송하는  prepared statement객체 생성
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member1 ");
			sql.append("WHERE num = ? ");
			
			pstm = con.prepareStatement(sql.toString());
			
//		4. 바인딩 변수 설정 (없으면 생략)	
			pstm.setInt(1, 9); 
		
//		5. sql문 전송 
			int resultCount = pstm.executeUpdate();
			System.out.println("삭제된 행의 수: " + resultCount);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
				try {
					if(con != null) con.close();
					if(pstm != null) pstm.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		

	}
}
