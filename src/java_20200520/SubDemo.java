package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		
		Super s1 = new Super(); //부모의 age, work, playBadook 다 접근 가능
		System.out.println(s1.age);
		s1.playBadook();
		s1.work(); //오버라이딩
		
		System.out.println("======================");
		
		Sub s2 = new Sub(); //자식꺼 부모꺼 다 접근 가능
		System.out.println(s2.heignt);
		s2.playGame();
		s2.work(); //오버라이딩 - 지꺼
		//여기부턴 부모꺼 - 오버라이딩 된 work method는 호출 불가능 
		s2.age = 20; //부모꺼 활용해서 지껄로 사용 가능
		System.out.println(s2.age);
		s2.playBadook();
		//여기까지가 어제 배운거
		
		System.out.println("======================");
		
		//Super s3 = s2; //이러면 써브를 가리킨다
		//s3는 새로 생긴게 아니라 s2가 가리키는걸 s3가 가리키는거
		Super s3 = new Sub(); //부모를 가리키고 
		System.out.println(s3.age); //부모꺼인 애이지 가능
		s3.playBadook(); //부모꺼
		s3.work(); //예외적으로 자식꺼 호출됨

	}

}
