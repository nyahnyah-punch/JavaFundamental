package java_20200525;

//사용자 정의 예외 클레스
//자바에서 제공하는 예외클레스가 없기 때문에 새로 만들어서 사용해야함 
public class InsufficiantBalanceException extends Exception {

	public InsufficiantBalanceException(String message) {
		super(message);
	}
	
}
