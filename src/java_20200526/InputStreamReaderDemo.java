package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		
		System.out.print("입력하세요: ");
		InputStream in = System.in; //표준 입력장치(키보드)
		InputStreamReader isr = null;
		BufferedReader br = null; //readline을 이용
		
		try {
			//1byte -> 2byte
			isr = new InputStreamReader(in); //키보드랑 연결돼있는 스트림 
			//키보드와 연결돼있는거 1바이트여서 2바이트로 바꿔서 사용하면 편하다
			br = new BufferedReader(isr);
			String readLine = null;
			
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.println("입력하세요: ");
			}
			
			/*
			byte[] b = new byte[100]; //충분한 바이트배열얼 선언해야한다
			
			//in.read(b) : 입력을 기다리림
			//키보드 입력후, 앤터를 치면 입력한 데이터를 b에 저장한다 
			int readByteCount = in.read(b); 
			//키보드 립력을 기다리기, 앤터를 치면 b로 들어가서 readByteCount로 읽히기 
			
			while((readByteCount - in.read(b)) != -1) { //무한대로 입력할 수 있게 대기
				
				//입력하는거 바로 표준출력장치로 출력
				String str = new String(b, 0, readByteCount);
				System.out.println(str); //표준 출력장치(모니터)에 출력하고 끝
				System.out.print("입력하세요: ");
				
			}
			*/
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
	}
}
