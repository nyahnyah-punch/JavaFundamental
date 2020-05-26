package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("c:\\dev\\IfDemo.java");
			fw = new FileWriter("c:\\dev\\IfDemo4.java");
			
			br = new BufferedReader(fr); //readline()
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true); //오토플러쉬기능 탑제
			
			String readLine = null;
			
			while((readLine = br.readLine()) != null) {
				//bw.write(readLine);
				//bw.newLine(); //개행
				pw.println(readLine);
				
			}
			//bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();
					if(br != null) br.close();
					if(bw != null) bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		

	}
}
