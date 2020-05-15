package java_20200514;

public class ArrayDemo {

	public static void main(String[] args) {

		///// 배열의 기본///// 1번, 2번
		// 1.배열 선언 & 생성
		int[] a = new int[4]; // a라는 변수로 4개의 0을 가진 방이 만들어짐

		// 2.배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		// 3. 배열 출력
		for (int i = 0; i < a.length; i++) { // a.length를 사용해 갯수를 유동적으로 출력
			System.out.println(a[i]);
		}

		///// 배열의 기본///// 3번, 4번
		// 배열 선언, 생성, 할당을 동시에!
		int[] b = { 100, 200, 300, 400, 500};
		
		//배열의 값 변경하는 방법
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		//배열 출력
		for (int i=0; i<b.length; i++) { //인댁스를 표시하면서 출력할 수 있다
			System.out.println(b[i]);
		}
		
		//신새대의 출력방법 (Enhanced For)
		for (int value : b) { //b배열에 0번째꺼를 출력해라 => 알아서 새서 출력
			System.out.println(value);
		}
		
		//int[] c = a+b; 이렇게 레퍼런스끼리 더하는짓 하지 말자..
		int[] c = a; //대신 이렇게 같은 객체를 찾아줄 수 있다
		c[0] = 11;
		
		System.out.println(a[0]); //a의 결과도 바뀌어있다
		System.out.println(c[0]);
		
		//프리미티브는 다르다
		int a1 = 10;
		int b1 = a1;
		a1=20;
		System.out.println(a1);
		System.out.println(b1); //a1이 원래 가지고있는 값을 넣어준다
	}
}
