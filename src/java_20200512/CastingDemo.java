package java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		
		/* byte 범위를 넘어가면 애러 발생
		byte a = 128;
		*/
		
		//형변환을 하면 애러가 발생하지 않고, circuit현상 발생
		//circuit이란? 한바퀴 돈다
		byte a = (byte)128;
		System.out.println(a);
		//여기서 128은 127에서 한바퀴 돌아서 -128이 된다 
		
		/*실수형인 더블은 int에 들어가지 않는다
		int b = 42.5;
		*/
		
		//형변환
		int b = (int)42.5;
		System.out.println(b);
	}
}
