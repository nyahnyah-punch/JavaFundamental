package java_20200513;

public class ForLoopDemo {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 10까지 합은 %d입니다.%n", sum); //%n은 줄띄기
		//printf(sum) prints(string)등등 변수에 따라서 다른 기호를 넣어야 한디
		
		//쩍수 합 구하기
		sum = 0; //sum 값 다시 초기화해줘야함
		for(int i=1; i<=10; i++) {
			if (i%2 == 0) { //i를 2로 나눌 때 나머지가 0이면 짝수, 1이면 홀수 <--유명
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d입니다.%n", sum);
		
		//구구단을 외자!
		for (int i = 2; i <= 9; i++) { //i가 2부터 시작해서 9까지 간다
			for (int j = 1; j <= 9; j++) { //j가 1부터 시작해서 9까지 계에에에소오옥 돌아간다
				System.out.printf("%d * %d = %d%n", i, j, i*j); //앞에 대입되는 순서 
			} //실제로 개발할때는 for안에 for을 잘 안넣지만 코테볼때는 두번이상 돌려야 한다
		}
		
		//9단부터 꺼꾸로 외워보기!!
		for (int i = 9; i >= 2; i--) {
			for (int j = 9; j >= 1; j--) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
		/* 만들기
		 
		 * 
		 **
		 ***
		 ****
		 *****
		 
		 */ 
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) { //i를 변수처리 해주기, j < [값]이 고정값이면 안된다
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/* 만들기
		 
		 ***** 
		 ****
		 ***
		 **
		 *
		 
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/* 챌린지한 만들기!
		 
		      * 
		     **
		    ***
		   ****
		  *****
		 
		 */
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
	} 
}
