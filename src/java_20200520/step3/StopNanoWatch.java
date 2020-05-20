package java_20200520.step3;

public class StopNanoWatch {

	long start; //클래스를 분리해줘서 구현부분 빼고 다 동일하게 사용할 수 있다
	long end;
	
	public double getElapsedTime() { //나노세컨즈의 경과 시간
		return (double)(end - start) / 1_000_000_000;
		
	}
	
	public void startNano() { //나노세컨즈 시작시간
		start = System.nanoTime();
	}
	
	public void stopNano() { //나노세컨즈 종료시간
		end = System.nanoTime();
	}
	
}
