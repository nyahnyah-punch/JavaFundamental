package java_20200515;

public class CustomerDemo {
	
	public static void main(String[] args) {
		
		//클레스 객체 생성
		Customer c1 = new Customer();
		//Customer => 타입,
		//c1 => 변수 (레퍼런스)
		//new Customer() => 객체오브젝트 생성
		//보통 타입과 객채의 이름과 일치한다
		
		c1.name = "김미리";
		c1.email = "mkim19@mica.edu";
		c1.phone = "010-2286-2176";
		c1.balance = 1_000_000;
		c1.IsReleased = false;
		
		//출력
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.balance);
		System.out.println(c1.IsReleased);
		
		//변수 2
		Customer c2 = new Customer();
		c2.name = "최예리";
		c2.email = "ychoi02@mica.edu";
		c2.phone = "010-1234_5678";
		c2.balance = 100_000_000;
		c2.IsReleased = false;
		
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.balance);
		System.out.println(c2.IsReleased);
		
		Customer c3 = c2; //c2가 가리키는곳을 c3가 가리켜라
		c3.name = "Miri";
		
		System.out.println(c2.name); //이러면 c2의 이름이 Miri로 바뀐다
		//= c2정보가 변경되면 둘다 변겅 (c2 c3에서 둘 다 수정 가능)
		
		//이렇게 하나의 변수로 여러개의 인스턴스변수를 가질 수 있다 
	}

}
