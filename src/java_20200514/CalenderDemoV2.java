package java_20200514;

public class CalenderDemoV2 {
	
	public static void main(String[] args) {
		int year = 2020;
		int month = 5;
		int day = 17;
		int TotalCount = 0;
		int rest = 0;
		int past = year - 1;

		// 2019년 총 일수
		TotalCount = past * 365 + (past / 4 - past / 100 + past / 400);
		
		int[] MonthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 31};
		
		//year이 윤년인지 아닌지 판단해야함
		//윤년이면 MonthArray 두번째 방의 값을 29로 변경해야 한다.
		/*조건
		  100을 넣으면 True False = False / 100%400 = False => 100은 윤년이 아니다
		  400 True False True => 윤년
		  4의 배수 이면서 100의 배수가 아니여아하고, 그중 400의 배수는 윤년이다 */
//		boolean IsLeafYear = year%4==0 && year%100 != 0 || year%400==0;
//		if (IsLeafYear) {
//			MonthArray[1] = 29;
//		}
		//사실 불리언 정의 필요없
		if (year%4==0 && year%100 != 0 || year%400==0) {
			MonthArray[1] = 29;
		}
		
		for (int i=0; i<month-1; i++) {
			TotalCount += MonthArray[i];
		}
		
		// 2020년 1월 ~ 4월 일수
		// 2020년 5월 12일까지 총 일수
		TotalCount += day;

		rest = TotalCount % 7;

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
