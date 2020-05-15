package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		
		//똑같이 1부터 10 합 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i==6) continue; //i가 6이되면 그 이하 문장이 실행 안되고 바로 위(증가문)으로 올라간다 -> 7로 감
			sum += 1;
		}
		
		System.out.printf("1부터 10까지 합은 %d입니다. (단 6은 제외한다.)%n", sum);
		
		//구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j==5) continue; //j에서 5만 뺀 값들이 주루루룩 나온다 
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
		//구구단
		outter: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j==5) continue outter;//*5이상은 안나온다 
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
		//잠깐 보는 리턴문
		
		//깔끔한 코딩 가능 
	}
}
