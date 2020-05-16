package HomeWorks;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int Start = 1;
		int End = 100;
		int Sum = 0;
		boolean PrimeYes = true;
		
		for (int i = Start; i <= End; i++) {
			PrimeYes = true;
			
			for (int j = 2; j <= i-1; j++) {
				if (i%j == 0) {
					PrimeYes = false;
				}
			}
			if (i != 1 && PrimeYes == true) {
				Sum += i; 
				System.out.printf("%d부터 %d사이의 소수입니다: %d%n", Start, End, i);
			}
		}
		System.out.printf("소수들의 합은 %d입니다!", Sum);
		
	}
}
