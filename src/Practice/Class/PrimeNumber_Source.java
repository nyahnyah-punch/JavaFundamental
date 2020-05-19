package Practice.Class;

public class PrimeNumber_Source {

	private int Start;
	private int End;
	private int Sum;
	
	public PrimeNumber_Source() { //디폴트 생성자
	}
	
	public PrimeNumber_Source(int Start, int End) { //생성자로 쌔터 생략
		
		this.Start = Start;
		this.End = End;
	}
	
	public int getStart() {
		return Start;
	}
	
	public int getEnd() {
		return End;
	}
	
	public int getSum() {
		return Sum;
	}

	public int PrimeNumber() {
		boolean PrimeYes = true;
		
		for (int i = Start; i <= End; i++) {
			PrimeYes = true;

			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					PrimeYes = false;
				}
			}
			if (i != 1 && PrimeYes == true) {
				Sum += i;
				System.out.printf("%d부터 %d사이의 소수입니다: %d%n", Start, End, i);
			}
		}
		System.out.printf("소수들의 합은 %d입니다!", Sum);
		
		return Sum;
	}
	
}
