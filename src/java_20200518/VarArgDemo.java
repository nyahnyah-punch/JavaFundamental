package java_20200518;

public class VarArgDemo {

	//variable arguments
	public void print(int...a) { //a라는 변수는 배열로 처리함
		
		int length = a.length; //길이를 알고싶다!
		
		for (int value : a) { //하나하나 뽑아주기
			System.out.printf("%d ", value);
		}
		System.out.println(); //개행(네랴쓰기)
		
	}
	
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		
		v1.print(1);
		v1.print(10,20);
		v1.print(100,200,300);
		v1.print(1000,2000,3000,4000);
		
	}
	
}
