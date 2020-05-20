package java_20200520.step5;

public class StopMicroWatch extends StopWatch{

	private long start;
	private long end;
	
	private double getElapsedTime() { //마이크로세컨즈의 경과시간
		return (double)(end - start) / 1_000_000;
	}
	
	private void start() { //마이크로세컨즈 시작시간
		start = System.currentTimeMillis();
	}
	
	private void stop() { //마이크로세컨즈 종료시간
		end = System.currentTimeMillis();
	}
	
	public void execute() {
		
		start();
		for (long i = 0; i < 20000_000_000l; i++) {
		}

		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간: %.6f", elapsedTime);
		
	}
	
}
