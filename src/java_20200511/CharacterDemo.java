package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		////유니코드로 이름써보기
		char c1 = '\uAE40';
		char c2 = '\uBBF8';
		char c3 = '\uB9AC';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		//print vs println print --> 나란히 println --> 앤터쳐서 나타나기  
		
		////아스키코드
		/* 48-57 --> 0-9
		   65-90 --> A-Z
		   97-122 --> a-z */
		char c4 = 97;
		System.out.println(c4);
		//문자 표현법
		char c5 = '김';
	    System.out.println(c5);
	    //주로 입사시험에 나온다. 아스키코드로 렌덤값 뽑아내기
	    
	    ////escape code
	    System.out.println("aa"+'\t'+"bb");
	    System.out.println("aa"+'\n'+"bb");
	    System.out.println("aa"+'\r'+"bb");
	}
}
