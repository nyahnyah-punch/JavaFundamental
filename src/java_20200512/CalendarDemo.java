package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		int year = 2020;
		int month = 5;
		int day = 12;
		int TotalCount = 0;
		int rest = 0;
		int past = year - 1;

		// 2019년 총 일수
		TotalCount = past * 365 + (past / 4 - past / 100 + past / 400);
		// 2020년 1월 ~ 4월 일수
		TotalCount += 31 + 29 + 31 + 30;
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

		System.out.println(year + "년" + month + "월" + day + "일은 " + message + "입니다.");

	}

}