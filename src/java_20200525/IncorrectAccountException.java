package java_20200525;

public class IncorrectAccountException extends Exception {

	public IncorrectAccountException(String msg) {
		
		super(msg); //exception에 있는 애러메세지를 msg로 바꿔줘라
		//super에 매계변수 하나짜리 호출
		
	}
	
}
