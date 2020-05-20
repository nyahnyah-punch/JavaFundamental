package java_20200520.step3;

public class StopMilliWatch {

	long start;
	long end;
	
	public double getElapsedTime() { //밀리세컨즈의 경과시간
		return (double)(end - start) / 1000;
	}
	
	public void start() { //밀리세컨즈 시작시간
		start = System.currentTimeMillis();
	}
	
	public void stop() { //밀리세컨즈 종료시간
		end = System.currentTimeMillis();
	}
	
}
