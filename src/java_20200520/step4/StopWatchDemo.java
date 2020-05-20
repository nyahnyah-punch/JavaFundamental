package java_20200520.step4;

public class StopWatchDemo {

	public static void run(StopMillliWatch s1) {
		s1.execute();
	}

	public static void run(StopNanoWatch s1) {
		s1.execute();
	}

	public static void main(String[] args) {

		// 이거만 번갈아가면서 주석처리해주면 깔끔!
		// StopNanoWatch s1 = new StopNanoWatch();
		StopMillliWatch s1 = new StopMillliWatch();

		run(s1);

	}

}
