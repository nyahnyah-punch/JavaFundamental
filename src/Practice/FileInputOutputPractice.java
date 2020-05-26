package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	c:\dev\jdk-11.0.7_windows-x64_bin.exe
 	c:\dev\jdk2.exe
 
*/

public class FileInputOutputPractice {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\dev\\jdk2.exe");
			
			int countByte = 0;
			byte[] readByte = new byte[1024 * 8];
			
			while((countByte = fis.read(readByte)) != -1) {
				fos.write(readByte, 0, countByte);
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		

	}
}
