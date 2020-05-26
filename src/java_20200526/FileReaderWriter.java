package java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:\\dev\\IfDemo.java");
			fw = new FileWriter("c:\\dev\\IfDemo2.java");
			/*  
//			 한 문자 읽어서 한 문자 출력
			int readChar = 0;
			
			while((readChar = fr.read()) != -1) {
				//표준출력장치(모니터)로 출력
				System.out.print((char)readChar); 
				fw.write(readChar); //파일로 출력
			}
			*/
			
//			여러개의 문자를 캐릭터배열로 만들어서 출력
			int readCharCount = 0;
			char[] readChars = new char[1024];
			
			while((readCharCount = fr.read(readChars)) != -1) {
				//표준출력장치(모니터)로 출력
				System.out.print(new String(readChars, 0, readCharCount));
				//fw.write(readChars, 0, readCharCount);
				fw.write(new String(readChars, 0, readCharCount)); //이것도 가능 
				//문자데이터엔 이게 있어서 엄청 편하다
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
					
				}
			
		}
		
	}

}
