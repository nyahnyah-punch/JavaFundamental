package java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		//자바 1.4버전에서 프리미티브 데이터타입을 컬랙션에 
		//저장 할 수 없었기 때문에 프리미티브 데이터타입을 
		//객체화 할 수 있는 래퍼클랴스가 필요함
		//즉 list.add(1);이 안된다는말
		//컬랙션에 1을 저장하기 위해선 프리미티브 데이터타입을 
		//객체화하는 Integer클래스로 변환해야함
		
		int[] temp = {1, 2, 3, 4};
		
		ArrayList list = new ArrayList(); //컬랙션 중 하나
		list.add(new Integer(1)); //클래스화 시키면 객체로 저장 가능
		
		Integer i1 = new Integer(1); //프리미티브 -> 래퍼
		Integer i2 = new Integer(2);
		int i3 = i1.intValue() + i2.intValue(); //래퍼 -> 프리미티
	}

}
