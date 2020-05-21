package java_20200521;

public class MathDemo {
	
	public static void main(String[] args) {
		
		double d1 = Math.ceil(4.2);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		long l1 = Math.round(42.5);
		System.out.println(l1);
		
		//round(double d
		d1 = 45.67;
		//소수점 두번째자리에서 반올림해서 45.7만들기
		d1 *= 10;
		l1 = Math.round(d1);
		d1 = (double)l1/10;
		System.out.print(d1);
		
		//double abs(double d
		int a1 = (int)Math.abs(-123); //더블 플로우트 인트 롱 가능
		System.out.println(a1);
		
		//double sqrt(double d1 루트
		Math.sqrt(3);
		System.out.println(d1);
		
		//double pow(double d1 , double d2 2의 3승
		d1 = Math.pow(2, 3);
		System.out.println(d1);
		
		//double random() 랜덤값!
		d1 = Math.random()*45; //곱하기 45하면 0부터 45 사이에 수가 나온다 
		System.out.println(d1);
		
	}

}
