package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutPutStreamDemo {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try { // 반드시 예외처리 필수
			// 파일 인풋스트림으로 연결해줌
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\dev\\jdk.exe");
			
			// fis.read() : 한바이트 읽어 반환한다, 더이상 읽을게 없으면반환
			int readByte = 0; 
			
			while ((readByte = fis.read()) != -1) { //for블록은 잘 안쓴다 io 네트워크쪽은
				//fos.Writr(~) : 한바이트 쓰기
				fos.write(readByte);
				
			} // io서부터는 애지간한걸 다 예외처리 해야할거임
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			// 항상 닫아줘야함
			try {
				if (fis != null) fis.close(); //널체크해서 객체가 생성이 됐을 땐 닫아주기
				if (fos != null) fos.close(); //널체크해서 객체가 생성이 됐을 땐 닫아주기
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
	
	}

}
