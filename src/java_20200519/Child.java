package java_20200519;

public class Child extends Parent {

	String chicken;
	
	public void goToSchool() {
		System.out.println("Child goToSchool()");
	}
	
	public void play(String starcraft) { //오버라이딩
		super.play(starcraft); //완전 제정의는 보통 안사용한다
		System.out.println("Child Play()");
	}
	
	public void setParentMoney(long money) {
		super.money = money;
	}
	
	public long getParentMoney() {
		return super.money; //이렇게 하면 부모의 머니를 사용할 수 있다
	}
	
}
