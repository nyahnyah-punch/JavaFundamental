package java_20200515;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		
		String[] fruits = {"apple", "banana", "watermelon", "blueberry"};
		
		String[] temp = new String[6];
		
		System.arraycopy(fruits, 0, temp, 2, 4); 
		//fruits를 0번째에서부터 temp의 2번째로 4개를 넣어라
		
		temp[0] = "peach";
		temp[1] = "pear";
		temp[3] = "plum"; //이러면 복시되는 apple뒤에 붙는다
		
		System.out.println(temp[0].length()); //이건 문자열의 길이
		
		for (int i=0; i<temp.length; i++) { //출력방법 1 (인덱스까지 풀력 가능)
			System.out.println(temp[i]);
		}
		
		for (String value : temp) { //출력방법 2 (실수 누락 확률 다운!)
			System.out.println(value);
		}
		
		//다른 언어들과는 다르게 배열의 길이는 병경할 수 없음으로 필요시엔 새로운 배열을 만들어서 복사해준다
	}
}
