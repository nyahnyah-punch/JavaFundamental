package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) {
		
//		1. 드라이브 로드
		//Driver객체를 메모리에 로드하여 자바 어플리케이션과
		//마리아디비 자바 클라이언트 파일(mariadb-java-client-xxx.jar)연결
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공"); 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("드라이브 로드 실패"); 
			 
		}
//		2. Connection 객체 생성 & 데이터베이스와 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		 
		try { // url, user, password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			System.out.println("데이터베이스(MariaDB) 연결 성공");
			
//			3. SQL문을 연결할 수 있는 PreparedStatement 객체를 생성
			//?가 의미하는것은 바인딩변수 - value 뒤에오는 값에만 사용 가능 
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member1(num, NAME) VALUES(?,?)");
			pstmt = con.prepareStatement(sql.toString()); //스티링버퍼가 올 수 없어서 변환필요
			
//			4. 바인딩변수 설정
			pstmt.setInt(1,9); //1번칼럼에 8 넣고 - 숫자열이므로 setInt
			pstmt.setString(2, "hello"); //2번칼럼에 hi넣고! - 문자열이므로 setString
			
//			5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 수: " + resultCount); 
			
		} catch (SQLException e) {
			e.printStackTrace();
			
//			6.모든 자원을 반납한다 (닫아주기)
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
