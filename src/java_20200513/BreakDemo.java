package java_20200513;

public class BreakDemo {

	public static void main(String[] args) {
		
		//1부터 10을 새는 반복문에서 5까지의 합만 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6) break;
			sum += i;
		}
		
		System.out.printf("1부터 5까지의 합은 %d입니다.%n", sum);
		
		//구구단을 외자
		outter: for (int i = 2; i <= 9; i++) { //래이블에 있는 위치까지 가고 빠져나가기
			for (int j = 1; j <= 9; j++) {
				if(i==5 && j==6) break outter; //5x5까지만 출력하기 (outter이름은 마음대로 명시 가능)
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
	}
	}
}
