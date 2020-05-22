package java_20200522;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		String ssn = "111111-1111118";
		
		//charAt(int index) -> 문자열중에 큭정 인댁스에 있는 믄자열 변환
		char c = ssn.charAt(6);
		System.out.println(c);
		
		//concat(String msg) -> 문자열 연결
		ssn = ssn.concat("abcd");
		System.out.println(ssn);
		
		//endsWith(String msg) -> msg문자열로 끝나면 true, or false
		String fileName = "abcd.doc"; //확장자명에 따라 결과를 다르게 출력
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		
		//startsWith(String msg) -> msg문자열로 시작하면 true, 아니면 false
		String url = "http://www.naver.com";
		String path = "/news/ssss.do?id=123";
		
		if(path.startsWith("/news")) {
			System.out.println("뉴스페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equalsIgnoreCase(String msg) -> 대소문자를 구분하지 않고
		//문자열을 비교하여 같으면 true아니면 false
		boolean success = fileName.equalsIgnoreCase("abcd.DOC");
		System.out.println(success);
		
		//indexOf(String msg) -> msg 문자열의 위피를 반환
		int index = ssn.indexOf("-"); //다른거랑 같이 많이 쓴다
		System.out.println(index);
	
		//lastIndexOf(String msg) -> msg문자열의 위치를 마지막에서 시작하여 찾고
		//index는 처음부터 ms문자열까지 index를 반환
		fileName = "abc.abc.abc.abc.doc"; //맨 마지막 점의 왼쪽과 오른쪽 구별
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
		//배열의 길이: length, 문자열의 길이: length()
		//trim() -> 앞 뒤 문자열 공백제거 
		String dbid = "mirimiri".trim();
		String userid = "mirimiri ".trim();
		System.out.println(dbid.equals(userid));
		
		//subString(int first, int last) -> first(포함)부터 secound(미포함) 사이의 문자열 추출
		//substring(int first)는 first(포함) 보다 큰 모든 문자열을 추출
		fileName = "abc.abc.abc.doc";
		String first = fileName.substring(0,fileName.lastIndexOf(".")); //번호 말고 이렇게도 추출 가능
		String last = fileName.substring(fileName.lastIndexOf(".")+1); //끝에 지정하지 않으면 다 가지고옴
		System.out.println(first);
		System.out.println(last);
		
		//replaceAll(String first, String second) -> first문자열을 second문자열로 변환
		String html = "안녕하세요\n 저는 김미리 입니다.\n 잘 부탁드립니다!";
		html = html.replace("\n", "<br>");
		System.out.println(html);
		
		//toUpperCase() -> 대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();
		System.out.println(m1);
		
		//toLowerCase() -> 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		//String.valueOf(~) -> primitive data type을 문자열로 변환
		char[] c1 = {'a', 'b', 'c'};
		String msg = String.valueOf(c1);
		System.out.println(msg);
		
		//split(String regex) -> regex기준으로 나눠버리기
		String[] str = ssn.split("-"); //-를 기준으로 문자열을 나눠버리기
		String ssn1 = str[0]; //두 파트로 니눠지기 때문에 array 
		String ssn2 = str[1];
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		//format(String format, Object) -> Object를 가진 문자열 (String format의 기준)
		String str2 = String.format("%,.2f", 123123.4567); //123,123.46을 가진 문자열이 됨
		System.out.println(str2);
		
		str2 = String.format("%3$,20.2f%n %2$,20.2f%n %1$,20.2f%n", 1234.4590, 123345.55, 34234.5690);
		System.out.println(str2);
		
	}
}
