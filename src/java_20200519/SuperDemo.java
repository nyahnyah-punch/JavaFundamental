package java_20200519;

import java.lang.*;

public class SuperDemo extends Object{
	public SuperDemo() { //컴파일러가 디폴드 생성자를 만들때는 클래스의 접근한정자를 따라간다
		super();
	}
}

class A {
	A(int a) {
		
	}
	
	A() { //부모클래스는 무조건 디폴드 셍성자를 만들어두는게 국룰
		
	}
}

class B extends A{
	B() {
		super(); //A클래스의 디폴트 생성자를 호출
	}
}

/*
class A extends Object{
	A() { //얘는 디폴트
		super();
	}
}

class B extends A{
	B() {
		super();
	}
}

//호출이 하나라도 막히면 애러가 난다
*/