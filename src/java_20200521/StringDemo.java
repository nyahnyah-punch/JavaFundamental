package java_20200521;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);
		
		
		String s3 = "world";
		String s4 = "world";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		//그림처럼 둘이 가르키는 곳이 다르다
		
	}
	
	
}
