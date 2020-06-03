package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	
	public static void main(String[] args) {
		
//		1. 드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
//		2. 데이터베이스 연결 -> connection객체를 생성한다
		//local host - 데이터베이스 설치 ip
		//3306 - 데이터베이스 포트
		//kpc - 데이터베이스명 
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc",
					"kpc12", "kpc1234");
			
//		3. sql문을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member1 "); //끝에 한칸 띄워넣는게 포인트
			sql.append("SET NAME = ? ");
			sql.append("WHERE num = ? "); 
			//string buffer문자열로 바꿔주기
			pstmt = con.prepareStatement(sql.toString());
			 
//		4. 바인딩변수처리 	
			int index = 0; //변수를 만들어줘서 번거롭게 번호를 넣고 바꿔줄 필요 없다
			pstmt.setString(++index, "안녕안녕!"); //증가 한다음 대입하는거니까 1에서 시작
			pstmt.setInt(++index, 7);
			
//		5. sql문 전송
			int resultCount = pstmt.executeUpdate();
			//업데이트 된 행의 수 반환 
			System.out.println("전송결과: " + resultCount); 
			 
		} catch (SQLException e) { 
			e.printStackTrace();
			
		} finally {
//		6. 모든 자원 반납
				try {
					if(con != null) con.close();
					if(pstmt != null) pstmt.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
		
	}
	
}
