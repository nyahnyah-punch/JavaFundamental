package java_20200522;
import java.util.HashSet; //Ctl Sft O
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		//1.선언 및 생성
		HashSet set = new HashSet(); //패킷을 임포트 해워야한다
		
		//2. 할당
		set.add(1); //프리미티브를 Auto Boxing해줘서 들어간다. 원래는 안들어가야함
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1); //객체의 중복을 허용하지 않는다. 그리고 순서도 없음 
		
		System.out.println(set.size()); //콜랙션의 길이는 size로 본다
		
		//3. 출력 
		Iterator i = set.iterator();
		while(i.hasNext()) { //false면 밖으로 빠져나가게 와일문 사용
			Integer number = (Integer)i.next(); //케스팅
			
			System.out.println(number);
		}
	}
	
}
