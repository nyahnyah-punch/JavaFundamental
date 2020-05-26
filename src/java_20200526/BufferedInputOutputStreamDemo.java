package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			/*
//			 1. FileInputStream과 FileOutputStream을 이용하여 
//			 	1바이트 읽어서 1바이트 출력하는 예제
			
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			fos = new FileOutputStream("c:\\dev\\Git.exe");
			
			int readByte = 0;
			
			while((readByte = fis.read()) != -1) {
				fos.write(readByte);
			}
			
			//경과시간 확인해보기
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();
			
			System.out.printf("경과시간 %d%n", end-start); //317386 밀리세컨즈
			*/
			
			/*
//			2.  FileInputStream과 FileOutputStream을 이용하여
//				8192바이트만큼 읽어서 8192바이트를 출력하는 예제
			
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			fos = new FileOutputStream("c:\\dev\\Git.exe");
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes);
				
			}
			
			//경과시간 확인해보기
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();
			
			System.out.printf("경과시간 %d%n", end-start); //75 밀리세컨즈
			*/
			
//			3.  BufferedInputStream과 BuferedOutputStream을 이용해서
//				1바이트 읽어서 1바이트 출력한 예제
//			BufferedInputStream의 read()메서드는 1바이트 읽어서
//			BufferedInputStream의 버퍼(byte[])공간 저장한다.
//			BufferedOutputStream의 write()메서드는 1바이트 출력하는것이 아니라
//			BufferedOutputStream의 버퍼(byte[])공간에 가득 차 이쓰면 출력한다. 
//			만약 다 체워지지 않으면 출력하지 않음.
//			이런경우 finished메서드를 이용해야한다.
			
			fis = new FileInputStream("\\dev\\Git-2.26.2-64-bit.exe");
			//stream chaining => 기능이 향상됨 
			bis = new BufferedInputStream(fis); 
			//기본 버퍼 사이즈는 8191. 늘리고싶으면 fis, 1024*n 넣어주면 됨 
			//근데 버퍼공간 늘려줘도 사실 속도의 별 차이는 없다
			
			fos = new FileOutputStream("c:\\dev\\Git.exe");
			bos = new BufferedOutputStream(fos);
			
			int readByte = 0; 
			//1바이트씩 읽는것처럼 보이지만 일근것들을 중간에 여러 바이트를 모았다가 사용해줌
			
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			//BufferedOutputStream의 버퍼 (byte[])가 다 체워지면 자동으로 
			//전송되지만, 다 체워지지 않으면 전송되지 않는다.
			//따라서 다 체워지지 않더라도 버퍼를 비워주기 위해서는 flush()메소드를 사용해야 한다.
			bos.flush();
			
			//경과시간 확인해보기
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();
			
			System.out.printf("경과시간 %d%n", end-start); //924 밀리세컨즈
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
					if(bis != null) bis.close();
					if(bis != null) bos.close();
					
				} catch (IOException e) {
					e.printStackTrace();
					
				}
			
		}
		
		
		

		
	}
}
