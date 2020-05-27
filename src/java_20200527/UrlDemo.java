package java_20200527;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlDemo {

	public static void main(String[] args) throws IOException {
//		URL클래스의 기능1
//		구성요소 하나씩 잘라서 가지고오기
		URL url = new URL("http://corners.gmarket.co.kr/Bestsellers?ItemId=1703797777#1703797777");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
		System.out.println("reference : " + reference);

//		URL클래스의 기능2
//		결과패이지의 html소스를 가지고올 수 있음
		/*
		//웹사이트 html소스 출력
		InputStream in = url.openStream(); //html정보
		//1byte -> 2byte
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		*/
		
		//이미지파일 저장하기
		//이미지는 2byte이므로 바꿀 필요 없이 바로 출력 가능
		URL url2 = new URL("http://gdimg.gmarket.co.kr/1803177701/still/300");
		
		InputStream in = url2.openStream(); //이미지정보
		//얘가 인풋스트림이므로 별도의 FileInputStream은 안가지고온다 (이미 있으므로)
		FileOutputStream fis = new FileOutputStream("c:\\dev\\YakkiBarae.jpg");
		
		byte[] readBytes = new byte[1024*8];
		int readByteCount = 0;
		
		while((readByteCount = in.read(readBytes)) != -1) {
			fis.write(readBytes, 0, readByteCount);
			
		}
		
		in.close();
		fis.close();
		
		
	}
}
