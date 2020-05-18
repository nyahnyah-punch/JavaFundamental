package java_20200518;

public class MemberVariableDemo {
	//값을 넣지 않아도 디폴트
	String name; //null
	int age; //0
	double weight; //0.0
	boolean IsReleased; //false
	
	public int methodA(String id) { //id는 매계변수
		//void가 반환겂. 앞에 아무것도 안붙었음으로 인스텅스메소드
		
		//지역변수에는 접근 한정자를 붙힐 수 없다 
		//public int test;
		
		//지역변수는 초기화를 하지 않아도 상관없지만 다른 곳에서 연상하면 애러가 발생한다
		//int a;
		//int b = a+10; //a는 아예 값이 없는거.. 0도아니고 아예 없음
		int a = 10; //이렇게 값을 초기회해주면 가능 
		int b = a+10; 
		
		//id, a, b의 유효범위는 methodA에서만 사용 가능
		//MemberVariableDemo에 있는 값은 여기서도 사용 가능 
		
		return 10;
	}
	
	public static void main(String[] args) {
		MemberVariableDemo m = new MemberVariableDemo(); //위에 클레스 내에 있는것들 호출
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.weight);
		System.out.println(m.IsReleased);
	}
}
