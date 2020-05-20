package java_20200520.step5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StopWatchDemo{

	public static void run(StopWatch s1) {
		s1.execute();
	}

	public static void main(String[] args) throws Exception{

		// 별도의 수정 없이 이거만 번갈아가면서 주석처리해주면 사용 가능!
		// StopNanoWatch s1 = new StopNanoWatch();
		//StopMicroWatch s1 = new StopMicroWatch();
		//StopMillliWatch s1 = new StopMillliWatch();

		//run(s1);
		
		//Java IO
		BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundamental\\src\\java_20200520\\step5\\class.txt"));

		String readLine = br.readLine();
		
		//Java Reflection
		Class clazz = Class.forName(readLine);
		StopWatch s = (StopWatch)clazz.newInstance();
		run(s);
	}

}
