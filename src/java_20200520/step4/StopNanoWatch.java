package java_20200520.step4;

public class StopNanoWatch{

	private long start; //클래스를 분리해줘서 구현부분 빼고 다 동일하게 사용할 수 있다
	private long end;
	
	private double getElapsedTime() { //나노세컨즈의 경과 시간
		return (double)(end - start) / 1_000_000_000;
	}
	
	private void start() { //나노세컨즈 시작시간
		start = System.nanoTime();
	}
	
	private void stop() { //나노세컨즈 종료시간
		end = System.nanoTime();
	}
	
	public void execute() {
		
		start();
		for (long i = 0; i < 20000_000_000l; i++) {
		}

		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간: %.9f", elapsedTime);
		
	}
	
}
