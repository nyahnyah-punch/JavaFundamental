package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL ("https://www.daum.net/");
		InputStream in = url.openStream();
		
		//연결해서 2byte로 읽어서, 한줄단위로 모니터에 출력해보기
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("c://dev//Daum.html");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true);
		
		String readLine = null;
		
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			pw.println(readLine);

		}
		
	}
	
}
