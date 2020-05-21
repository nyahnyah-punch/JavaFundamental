package java_20200521;

import java_20200515.Customer;

public class EqualsDemo {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		CustomerClass c1 = new CustomerClass("Miri", "Seoul");
		CustomerClass c2 = new CustomerClass("Miri", "Seoul");
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.toString()); //레퍼런스 찍으면 문자열이 튀어나옴 
		System.out.println(s1.toString()); //오버라이딩해줘서 똑디나옴
		
	}
	
}
