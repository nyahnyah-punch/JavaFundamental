package java_20200521;

public class ImplementClassDemo {

	public static void main(String[] args) {
		InterA i = new ImplementClass(); //자긱객체 생성
		
		i.mA();
		i.mB();
		i.mC();
		
		//인터페이스에 있는 변수는 파이널이므로 변경이 불가
		//InterA.PI = 3.15; 
		
		System.out.println(InterA.PI); //이렇게 찍어볼수 있다
	}
	
}
