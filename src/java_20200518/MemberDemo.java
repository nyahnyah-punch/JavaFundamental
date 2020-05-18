package java_20200518;

public class MemberDemo {

	public static void main(String[] args) {
		
		Member m = new Member(); //정보를 바꿀 수 있는 세터메소드
		m.setName("Miri");
		m.setZipcode("21217");
		m.setAddr1("서울");
		m.setAddr2("강남");
		m.setSsn1("111111");
		m.setSsn2("22222");
		m.setAge(25);
		m.setRegdate("2020-05-18");
		
		System.out.println(m.getName()); //정보를 가져올 수 있는 게터메소드
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());
		
	}
	
}
