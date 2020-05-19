package java_20200519;

public class AdminDemo {

	public static void main(String[] args) {
		
		Admin a = new Admin("MiriMiri", "11111", "mirimiri@gmail.com", 4);
		//번거로운 쎄터 생략하기
		//디폴트 생성자가 있어야만 불러오기 가능
		
//		a.setId("MiriMiri");
//		a.setPwd("11111");
//		a.setEmail("mirimiri@google.com");
//		a.setLevel(4);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.printf("LEVEL: %d%n", a.getLevel());
		
		//생성자의 오버로딩 - 3개의 값만 초기화해서 출력 
		Admin a1 = new Admin("Yeri", "22222", "yeriberi@gmail.com");
		
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.printf("LEVEL: %d", a1.getLevel());
	}
}
