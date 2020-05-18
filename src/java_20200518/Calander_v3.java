package java_20200518;

public class Calander_v3 {

	private int year; //이런거 접근 못하게 막아버리기!
	private int month;
	private int day;
	
	//year에 대한 setter메소드: year을 공개해야 할 때 
	public void SetYear(int year) { //Setter메소드를 이용하여 year을 변경한다
		this.year = year; ////자기 자신객체, 로컬변수와 맴버변수를 구별할 때 사용
		//this.year => 맴버변수 year => 로컬변수
		
	}
	
	//year에 대한 getter메소드
	public int GetYear() { //getter 메소드를 이용해 year을 변경한다
		return year; 
	}

	public void set(int year, int month, int day) { //얘를 바꿀 수 있는 방법은 set함수 뿐
		this.year = year; 
		this.month = month;
		this.day = day;

	}

	private int GetCount() {
		int TotalCount = 0;
		int past = year - 1;

		TotalCount = past * 365 + (past / 4 - past / 100 + past / 400);

		int[] MonthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 31 };

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			MonthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			TotalCount += MonthArray[i];
		}

		TotalCount += day;

		return TotalCount;

	}

	public void print() {
		int TotalCount = GetCount();
		int rest = TotalCount % 7;

		String message = null;

		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");

	}
}
