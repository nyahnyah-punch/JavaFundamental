package java_20200520;

public class SubDemo2 {

	public static void change(Super sup) { //Super sup = s1; (메소드)
		
		sup.age = 20; //부모한테 있는거만 호출 가능
		sup.playBadook();
		sup.work(); //Sub work()호출 - 오버라이딩때문
	}
	
	public static void main(String[] args) {
		
		Sub s1 = new Sub();
		System.out.println(s1.age);
		
		change(s1); //call by reference 
		System.out.println(s1.age);
		
	}
	
}
