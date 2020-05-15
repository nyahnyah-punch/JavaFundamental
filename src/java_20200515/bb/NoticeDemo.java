package java_20200515.bb;
import java_20200515.aa.Notice; //다른 클래스를 임포트 해와야한다

public class NoticeDemo extends Notice { //상속하는 방법

	public static void main(String[] args) {
		
		Notice n1 = new Notice();
		n1.number = 2; //퍼블릭
		
		//n1.title = "제목";
		//protected는 서로 다른 패키지일경우에는 상속받으면 접근 가능
		//상속 후 자식으로 개체 사용
		NoticeDemo n2 = new NoticeDemo();
		n2.number = 3;
		n2.title = "제목";
		
		//디폴트랑 프라이벳은 다른 페키지면 접근 할 생각도 하덜 말어..
		//할거면 메소드를 사용해야한다 
		
	}
}
