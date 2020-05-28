package java_20200528;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	
	public static void main(String[] args) throws IOException {
		//URL클래스는 url구성요소를 가지고 올 수 있고, 
		//url자원 (html, image etc)정보를 가지고 올 수 있다
		
		//URLConnection클래스는 url에 있는 원격서버와 해더 정보를 가져올 수 있고, 
		//url자원 (html, image etc)정보를 가지고 올 수 있다
		
		URL url = new URL("https://www.naver.com/");
		URLConnection urlCon = url.openConnection(); //원격 해더정보를 가지고오는 클래스
		
		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");
		
		System.out.println("cacheControl : " + cacheControl);
		System.out.println("contentType : " + contentType);
		System.out.println("date : " + date); 
		
		InputStream in = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			
		}
		
		in.close();
		isr.close();
		br.close();
		
		
		
	}
}
