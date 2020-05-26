package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInPutOutPutSttreamDemo2 { 

	public static void main(String[] args) {
		//finally에서 닫을 수 없음으로 나중에 닫아줄 변수를 밖으로 빼서 선언해야함
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		
		try {
			//여기 경로에 파일을 찾는데 파일이 없어서 예외가 발생
			//사실 이거 하나로 문자데이터 이런것까지 다 을궈먹는것도 가능 
			//그데 이거가지고 잘 안되는경우도 있으니 있는게 리더 라이터 
			fis = new FileInputStream("c:\\dev\\IfDemo.java");
			fos = new FileOutputStream("c:\\dev\\IfDemo3.java");
			
			int readByteCount = 0; //읽은 바이트 수
			byte[] readBytes = new byte[1024*8]; //읽은걸 저장하기 위한 배열
			
			//fis.read(readBytes) : FileInputStream에 8192바이트를 읽어서
			//readBytes에 저장하고 읽은 바이트 수를 변환한다 
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount); 
				//처음서부터 (0) 읽은 바이트 (redByteCount)용량만큼만 읽어오도록 한다
				//마지막 남은 친구가 10이면 10만 가져오기
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
					
				} catch (IOException e) {
					e.printStackTrace();
					
				}
		}

	}

}
