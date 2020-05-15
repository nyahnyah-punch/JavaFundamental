package java_20200513;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		//1부터 10까지 합
		int sum = 0;
		int i=1;
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.printf("1부터 10까지의 합은 %d입니다.%n", sum);
		
		//구구단을 while문으로 해주기
		i=2; //int = i 는 이미 정의했다
		
		while (i<=9) {
			int j=1; //j는 위에 있을 수 없다. 2단 끝나면 3단으로 넘어가야하니까.
			while (j<=9) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
				j++;
			}
			i++;
		}
	}
}
