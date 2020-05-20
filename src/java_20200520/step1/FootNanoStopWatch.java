package java_20200520.step1;

public class FootNanoStopWatch {
	
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedNanoTime() { //나노
		return (double)(endNanoTime - startNanoTime) / 1_000_000_000;
	}
	
	public double getElapsedTime() { //밀리세컨즈
		return (double)(endTime - startTime) / 1000;
	}

	public static void main(String[] args) {
		
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		
		f1.startNanoTime = System.nanoTime();
		for (long i = 0; i < 2_000_000_000l; i++) {
			
		}
		
		double elapsedTime = f1.getElapsedNanoTime();
		System.out.printf("경과시간: %.9f", elapsedTime);
		
	}

}
