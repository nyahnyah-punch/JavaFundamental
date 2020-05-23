package java_20200522;
import java.util.HashSet; //Ctl Sft O
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//1.선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>(); //패킷을 임포트 해워야한다
		//그리고 이터레이터 자식도 임포트 해줘야 새로운 이름으로 쓸 수 있다
		
		//2. 할당
		set.add(1); //프리미티브를 Auto Boxing해줘서 들어간다. 원래는 안들어가야함
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(1); //객체의 중복을 허용하지 않는다. 그리고 순서도 없음 
		set.add(10);
		
		System.out.println("size : " + set.size()); //콜랙션의 길이는 size로 본다
		
		//3. 출력 
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) { //false면 밖으로 빠져나가게 와일문 사용
			Integer number = i.next(); //케스팅
			
			System.out.println(number);
		}
		
		//예시
		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("Miri1"));
		set1.add(new Customer("Miri2"));
		set1.add(new Customer("Miri3"));
		set1.add(new Customer("Miri1"));
		
		System.out.println("size : "+set1.size());
		
		Iterator<Customer> c = set1.iterator();
		while(c.hasNext()) {
			Customer info = c.next(); //케스팅...방법...?
			
			System.out.println(info);
		}
		
		//로또복권 - TreeSet
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random() * 45) + 1;
			lotto.add(random);
			if(lotto.size() == 6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
	}
	
}
