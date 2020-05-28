package java_20200528.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {
	
	private String ip;
	private int port;
	
	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
		
	}
	
	public void run() {
		Socket socket = null; 
		
		try {
//		3. Socket객체를 생성하여 서버와 연결을 시도한다
			socket = new Socket(ip, port);
			
//		4. Socket객채로 출력스트림을 생성하여 서버로 메세지를 보낸다
			OutputStream out = socket.getOutputStream(); //1바이트
			//1바이트를 2바이트로 바꿔서 내주면 더 편하다
			OutputStreamWriter osw = new OutputStreamWriter(out); //스트림체인
			BufferedWriter bw = new BufferedWriter(osw); //스트림체인
			bw.write("안녕하세요 :D 김미리입니다!");
			bw.newLine(); //개행
			bw.flush(); //플러쉬 까묵지마
			
//		7. Socket객채로 인풋스트림을 생성하여 서버의 메세지를 읽는다 
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			
			System.out.println("서버메세지: " + readLine);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		new EchoClient("192.168.0.4", 3000).run(); //접속하고싶은 서버 주소
		

	}
}
