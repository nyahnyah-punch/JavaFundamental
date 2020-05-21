package Practice.Class;

public class SSN {

	private int a1;
	private int a2;
	private int a3;
	private int a4;
	private int a5;
	private int a6;

	private int b1;
	private int b2;
	private int b3;
	private int b4;
	private int b5;
	private int b6;
	private int b7;
	
	public SSN(int a1, int a2, int a3, int a4, int a5, int a6, int b1, int b2, int b3, int b4, int b5, int b6, int b7) {
		
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.a6 = a6;
		
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
		this.b5 = b5;
		this.b6 = b6;
		this.b7 = b7;
	}
	
	public int getA1() {
		return a1;
	}

	public int getA2() {
		return a2;
	}

	public int getA3() {
		return a3;
	}

	public int getA4() {
		return a4;
	}

	public int getA5() {
		return a5;
	}

	public int getA6() {
		return a6;
	}

	public int getB1() {
		return b1;
	}

	public int getB2() {
		return b2;
	}

	public int getB3() {
		return b3;
	}

	public int getB4() {
		return b4;
	}

	public int getB5() {
		return b5;
	}

	public int getB6() {
		return b6;
	}

	public int getB7() {
		return b7;
	}

	public int Count() {
		
		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 * 4
				+ b6 * 5;

		int rest = sum % 11;

		rest = 11 - rest;
		rest %= 10;
		
		if (b7 == rest) {
			System.out.println("정상적인 주민번호!");
		} else {
			System.out.print("비정상적인 주민번호..");
		}
		
		return rest;
	}
	


}
