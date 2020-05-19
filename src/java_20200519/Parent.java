package java_20200519;

public class Parent {

	long money; //부모님 재산이 21억이 넘어가면 long ㅋㅋㅋㅋ
	//접근 한정자를 long앞에 넣어주기 (지금은 디폴트-같은 패키지에서만 사용 가능)
	
	public void makeMoney() {
		System.out.println("Parent makeMoney()");
	}
	
	public void play(String baduk) {
		System.out.println("Parent play()");
	}
	
}
