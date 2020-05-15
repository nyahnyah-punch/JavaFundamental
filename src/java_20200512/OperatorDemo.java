package java_20200512;

public class OperatorDemo {

	public static void main(String[] args) {
		
		/*산술 연산자*/
		
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = b / a;
		System.out.println(d);
		// 얘는 결과가 이상하다!

		// 소숫점 나눌 때는 소숫점 이하를 버리고 싶지 읺으면 더블로 바꿔서 넣어준다
		//이것도 케스팅 예시 (반대로 소숫점이 보이게 해주는거니까)
		d = b / (double) a;
		System.out.println(d);

		c = a * b;
		System.out.println(c);

		// 나머지 연산자
		c = b % a;
		System.out.println(c);
		
		
		/*복합 대입 연산자*/
		
		// a = a + b를 줄여서 써준것
		a += b;
		System.out.println(a);

		// 깔끔한 코딩의 예시
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// sum = sum + i의 줄임
			sum += i;
		}
		System.out.println(sum);
		
		
		/*증강연산자*/

		// ++의 활용
		a = 10;
		b = 20;

		a++; // a = a+1;
		++b; // b = b+1;
		System.out.println(a);
		System.out.println(b);

		c = a++; // 대입 후 증가 c = 11
		System.out.println(c);

		c = ++a; // 증가 후 대입 c = 13
		System.out.println(c);
		//단독으로 움직일때는 순서가 문제가 없지만 여러개가 대입되면 문제가 생길 수 있다
		//그런데 그렇게 문제가 많이 사용하진 않는다
		
		
		/*비교연산자*/
		
		a = 10;
		b = 20;
		d = 10.0;
		
		boolean InSucess = false;
		
		InSucess = a>b;
		System.out.println(InSucess);
		
		InSucess = a<b;
		System.out.println(InSucess);
		
		InSucess = a>=b;
		System.out.println(InSucess);
		
		InSucess = a<=b;
		System.out.println(InSucess);
		
		InSucess = a==b;
		System.out.println(InSucess);
		InSucess = a==d;
		System.out.println(InSucess);
		//프리미티브 데이터타입은 타입을 비교하는것이 아니라 값이 같은가를 비교한다
		//값는 같으면 트루가 나옴
		
		InSucess = a!=d;
		System.out.println(InSucess);
		
		
		/*비트연산자*/
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		
		//short circuit 
		a = 10;
		b = 20;
		
		InSucess = (a==b) && (++a==b++); //a랑 b랑 다르다 => 뒤에꺼 비교 할 필요도 없다
		System.out.println(InSucess); //false
		System.out.println(a);
		System.out.println(b);
		
		
		// + = 연결연산자(두개중 1개 이상이 문자열인 경우)&산술연산자(두개 모두 숫자일경우)
		//두가지 다의 의미를 가지고 있다
		System.out.println(1+2+3+"456");
		System.out.println("123"+4+5+6);
		//연산자 최고인 괄호를 사용
		System.out.println("123"+4+(5+6)); //5+6뻬고는 다 산술연산자

	}
}
