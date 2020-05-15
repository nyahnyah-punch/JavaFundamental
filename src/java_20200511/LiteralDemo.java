package java_20200511;

public class LiteralDemo {
	public static void main(String[] args) {
		//////byte short int 예시
		/* 사용할 수 없는 리터럴 범위
		byte b1 = 128; --> byte는 -126~127 넘어가면 오버플로우로 컴파일 애러
		*/

		//표기법을 알아보자
		int a1 = 128; //10진수 표기법
		int a2 = 076; //8진수 표기법
		int a3 = 0x123; //16진수 표기법
		int a4 = 0b1010; //2진수 표기법
		//일반적으로 사용하는건 10진수라 그거만 알면 되자만 나오더리도 놀라지 말쟈..! 
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
	    //////long을 알아보자 (뒤에 l이나 L붙히기)
		long l1 = 12l;
		
	    //////float (뒤에 f이나 F붙히기)
		float f1 = 123.4f;
		
	    //////double (뒤에 d이나 D붙히기, 생략가능)
		double d1 = 123.56;
		
		//일반적으론 int랑 더블을 가장 많이쓴다 
		
	    ////// boolean true or false
		boolean ItExisted = false;
		
		//java에서 요상하게 애러가 나는거
		/*
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = b1+b2; --> 에러
		byte b3 = (byte)(b1+b2); 로 헤야 맞다
		
		**자바는 산술연산(+,- etc)이 들어가면 int로 바뀐다 
		그래서 요즘은 거의 안쓴다 
		*/
	}
}
