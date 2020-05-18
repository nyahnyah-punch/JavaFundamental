package java_20200518;

public class MethodDemo {

	// year을 넣으면 윤년인지 아닌지 핀딘해주는 코드
	public boolean isLeafYear(int year) { // 앞에 아무것도 안붙어서 인스턴스메소드
		// int year = 메계변수 (paramenter)
		// 접근 한정자 + (변수 종류, 스테틱 등) + 반환값 + 메소드 이름 + 변수

		boolean isLeaf = year % 4 == 0 && year % 100 != .0 || year % 400 == 0;
		// 4의 배수이거나 400의 배수, 근데 100의 배수는 아니여야함
		// boolean은 메소드 반환값,
		// 불리안이므로 return value, return valur의 valueeh boolean이여야함

		return isLeaf;
		// 9라인-13라인까지 메소드 정의
	}
	//////////

	// 더하기
	public long plus(int first, int secound) { // 자료 데이터의 한계때문에 int면 안된다

		return (long) first + (long) secound; // 따로따로 바꿔야한다
	}
	//////////

	// 나누기
	public double divide(int first, int secound) {

		return (double) first / (double) secound;
	}
	//////////

	public void println(String message) {
		System.out.println(message); // 문자열 반환 값
		// 반환겂이 없으므로 리턴문이 없다
	}
	//////////

	public int[] Ascending(int[] array) { // 오름차순 어센딩

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array; // 바뀐 array를 리턴, int[]로 반환
	}
	//////////

	// 출력하기
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo(); // m이라는 레퍼런스가 없으면 사용 불가능
		
		//윤년
		boolean test = m.isLeafYear(2100); // argument

		if (test) {
			m.println("윤년 입니다 :)"); // 이러면 syso편하게 대체 가능
		} else {
			m.println("윤년이 아닙니다 :(");
		}
		/////

		//더하기
		long result = m.plus(1000000000, 121390319);
		System.out.println(result); // message가 아니고롱임으로 위에처럼 사용 불가능
		/////

		//나누기
		double result2 = m.divide(12, 5);
		System.out.println(result2);
		/////
		
		//오름차순
		int[] temp = {1, 34, 9, 2, 40, 5, 45};
		int[] result3 = m.Ascending(temp); //정렬 전
		for (int value : result3) { //정렬 후
			System.out.print(value + "\t");
		}
		/////
		
	}

	// 이제는 기능들이 있으면 다 메인 밖 메소드로 빼주자!!
	// 짱짱 개발자들은 이걸 어어엄처엉 많이 가지고있고 클레스파일로 빼서 개인기로 보여준다 ㅋㅋㅋㅋ
	// 오름차순같은거
}
