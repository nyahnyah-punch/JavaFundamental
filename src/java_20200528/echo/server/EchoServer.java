package java_20200528.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private int port;
	
	public EchoServer(int port) {
		this.port = port;
		
	}
	
	public void run() {
		ServerSocket serverSocket = null;
		
//		1. 객채를 생성한다
		try {
			serverSocket = new ServerSocket(port);
			
			while(true) { //무한루프
				System.out.println("클라이언트 접속을 기다리고 있습니다.");
//		2. accept(): 클라이언트 접속을 기다리고 있음
//					  클라이언트가 접속하면 클라이언트와 통신할 수 있는 socket객체를 생성해줌
				Socket socket = serverSocket.accept(); //여기서 무한대 대기 
				//연결하고도 계속 기다림.. 서버는 절대 죽지아나 
				InetAddress i = socket.getInetAddress(); 
				//클라이언트 ip끄집어낼 수 있음
				String ip = i.getHostAddress();
				System.out.printf("[s%]클라이언트가 접속했습니다.%n", ip);
				
//		5. Socket객채로 인풋스트림을 생성하여 클라이언트 메세지를 읽는다 
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in); //스트림체인
				BufferedReader br = new BufferedReader(isr); //스트림체인
				String readLine = br.readLine();
				
				System.out.println("클라이언트 메세지: " + readLine);
				
//		6. Socket객체로 출력 스트림을 생성하여 클라이언트에게 메세지
				OutputStream out = socket.getOutputStream();
				//1바이트 -> 2 바이트
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.close();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new EchoServer(3000).run(); //3000번 포트 열어두기
		
	}
}
