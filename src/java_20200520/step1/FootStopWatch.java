package java_20200520.step1;

public class FootStopWatch {

	long startTime;
	long endTime;
	
	public double getElapsedTime() { //경과시단 메소드
		return (double)(endTime - startTime) / 1000;
	}
	
	public static void main(String[] args) {
		
		FootStopWatch f1 = new FootStopWatch();
		
		//1970년 1월 1일부터 지금까지의 시간을 밀리세컨즈롤 반환
		f1.startTime = System.currentTimeMillis();
		
		for (long i = 0; i < 20_000_000_000l; i++) {
			
		}
		
		f1.endTime = System.currentTimeMillis();
		
		double elapsedTime = f1.getElapsedTime();
		
		System.out.printf("경과시간: %.3f", elapsedTime); 
		//치수형은 %f | .3은 소수점 이하 3째자리까지
	}
	
}
