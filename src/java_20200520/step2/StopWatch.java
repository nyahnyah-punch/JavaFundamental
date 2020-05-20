package java_20200520.step2;

public class StopWatch {

	//밀리세컨즈를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	public double getElapsedTime() { //밀리세컨즈의 경과시간
		return (double)(endTime - startTime) / 1000;
	}
	
	public void start() { //밀리세컨즈 시작시간
		startTime = System.currentTimeMillis();
	}
	
	public void stop() { //밀리세컨즈 종료시간
		endTime = System.currentTimeMillis();
	}
	
	//나노세컨즈를 관리하기 위한 변수
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedNanoTime() { //나도세컨즈의 경과 시간
		return (double)(endNanoTime - startNanoTime) / 1_000_000_000;
		
	}
	
	public void startNano() { //나노세컨즈 시작시간
		startNanoTime = System.nanoTime();
	}
	
	public void stopNano() { //나노세컨즈 종료시간
		endNanoTime = System.nanoTime();
	}
	
}
