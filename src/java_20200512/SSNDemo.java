package java_20200512;

public class SSNDemo {

	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 6;
		int a3 = 1;
		int a4 = 0;
		int a5 = 0;
		int a6 = 6;

		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 1;

		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + 
				b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 * 4
				+ b6 * 5;

		int rest = sum % 11;

		rest = 11 - rest;
		//rest = rest % 10; //이거는 없어보이게 쓴거다
		rest %= 10;

		if (b7 == rest) {
			System.out.println("정상적인 주민번호!");
		} else {
			System.out.print("비정상적인 주민번호..");
		}

	}
}
