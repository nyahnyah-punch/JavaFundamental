package java_20200518;

public class StaticMethodDemo {

	String name;
	static double InterestRate;
	
	public void m1() {
		//instance method => instance변수 static변수 모두 사용 가능
		//instance method => instance 메서드 static메서드 모두 사용 가능
		this.name = "Miri"; //instance 레퍼런스가 생략된거 - 자기자신 객체
		StaticMethodDemo.InterestRate = 4.2; //클레스네임 생략된거
		this.m2(); //이하
		StaticMethodDemo.m4(); //동문
	}
	
	public void m2() {
		System.out.println("m2() 인스턴스 메서드 호출");
	}
	
	public static void m3() {
		//static method => static변수만 사용 가능
		//static method => static메서드만 호출 가능
		//static method => .this 사용 불가
//		name = "Yeri"; //instance변수
		InterestRate = 3.9;
//		m2(); //instance메소드
		m4();
		//객체생성해야만 instance들 호출 가능 
		
		StaticMethodDemo m1 = new StaticMethodDemo(); //객체생성
		m1.name = "Yeri";
		m1.m2();
	}
	
	public static void m4() {
		System.out.println("m4() static메서드 호출");
	}
	
	public static void main(String[] args) { //main이 없으면 실행이 안됨
		m4(); //가능
		m3(); //가능
		
		InterestRate = 4.3; //가능
		
		//m1(); //불가능
		StaticMethodDemo m = new StaticMethodDemo(); //객체생성
		m.m1(); //호출 가능
		m.m2();
		m.name = "Hanul";
		
	}
}
