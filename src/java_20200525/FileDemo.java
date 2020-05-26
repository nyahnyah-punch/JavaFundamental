package java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {

	public static void main(String[] args) {
		
//		새로운 디랙토리 (폴더) 생성해보기
		File f1 = new File("C:\\dev\\2020\\05\\25");  
		//c폴더 안에 dev폴더 안에 2020폴더안에 05폴더 안에 25폴더 만들기
		
		//디랙토리 생성하면 참, 이미 디랙토리가 있르면 거짓
		boolean success = f1.mkdirs(); //굳이 싫으면 생략 가능 
		
		if(success) {
			System.out.println("디엑토리가 생성되었습니다.");
		} else {
			System.out.println("이미 디렉토리가 있습니다.");
		}
		
//		파일의 크기 얻어오기
		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		
		long fileSize = f2.length()/1024; //킬로바이트임,로 나누기 1024
		System.out.println(fileSize + "KB");
		
//		파일 이름 & 경로 가져오기 
		String fileName = f2.getName(); //파일 이름만 가져오기
		System.out.println(fileName);
		
		String fileName2 = f2.getPath(); //전체 경로 다 가져오기
		System.out.println(fileName2);
		
//		수정한 날자랑 유형 가져오기
		//유형
		if(fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
			
		} else if(fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
			
		} else if(fileName.endsWith("zip")) {
			System.out.println("압축 파일");
			
		}
		//수정한 날자
		//1970년 1월 1일까지 마지막 수정한 날자까지의 시간을 밀리세컨즈로 변환 
		long lastModified = f2.lastModified();
		System.out.println(lastModified);
		
		//날자로 변환
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy|MM|dd a hh:mm");
		String date = sdf.format(c.getTime()); //시간정보 넣어줘야한다
		
		System.out.println(date);
		
//		새로운 파일 생성 - 파일이 있으면 안만들지롱
		File f3 = new File("c:\\dev\\Hello.java");
		try {
			f3.createNewFile();  //반드시 예외처리를 해줘야 하는 친구이다 
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
//		파일 지우기
		//f3.delete();
		
//		파일 이름 바꾸기
		File f4 = new File("c:\\\\dev\\\\HelloWorld.java");
		
		f3.renameTo(f4); //f3파일을 f4이름으로 바꿔라!
		
	}

}
