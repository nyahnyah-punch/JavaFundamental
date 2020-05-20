package java_20200520.step3;

public class StopWatchDemo {

	public static void main(String[] args) {
		
		//이거만 번갈아가면서 주석처리해주면 깔끔!
		//StopNanoWatch s1 = new StopNanoWatch(); 
		StopMilliWatch s1 = new StopMilliWatch();
		
		s1.start();
		for (long i = 0; i < 20000_000_000l; i++) {
			
		}
		
		s1.stop();
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간: %.3f", elapsedTime); 
		//.9랑 .3만 번갈아가면서 바꿔줘야한다
	}
	
}
