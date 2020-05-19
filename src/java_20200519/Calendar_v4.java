package java_20200519;

public class Calendar_v4 {
	
	private int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	//각각의 월의 일수를 새주는 배열
	//이걸로 다 사용 가능
	
	public static final int	SUNDAY = 0; //final변수는 공개 해봐야 바꿀수도 없음
	public static final int	MONDAY = 1; //월-일까지 판별 결과
	public static final int	TUESDAY = 2;
	public static final int	WEDNESDAY = 3;
	public static final int	THURSDAY = 4;
	public static final int	FRIDAY = 5;
	public static final int	SATURDAY = 6;
	
	private int getCount(int year, int month, int day) {
		int totalCount = 0;
		
		int preYear = year-1;
		
		totalCount = preYear * 365 + 
				(preYear/4 - preYear/100 + preYear/400);
		
		boolean isLeafYear = isLeafYear(year);
		
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		
		for(int i=0;i<month-1;i++) {
			totalCount += monthArray[i];
		}
		
		totalCount += day;
		
		return totalCount;
	}

	private boolean isLeafYear(int year) {
		boolean isLeafYear = year%4==0 && year%100 != 0 || year%400==0;
		return isLeafYear;
	}
	
	private int getLastDay(int year, int month) {

		boolean isLeafYear = isLeafYear(year);
		
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		return monthArray[month-1];
	}
	
	public void print(int year, int month, int day) {
		int totalCount = getCount(year, month, day);
		int dayOfWeek = totalCount % 7;
		String message = null;
		if(dayOfWeek == Calendar_v4.MONDAY) { //코드에 1 2 3 4가 들어가는건 좋은 코드가 아니다
			message = "월요일";
		}else if(dayOfWeek == Calendar_v4.TUESDAY) {
			message = "화요일";
		}else if(dayOfWeek == Calendar_v4.WEDNESDAY) {
			message = "수요일";
		}else if(dayOfWeek == Calendar_v4.THURSDAY) {
			message = "목요일";
		}else if(dayOfWeek == Calendar_v4.FRIDAY) {
			message = "금요일";
		}else if(dayOfWeek == Calendar_v4.SATURDAY) {
			message = "토요일";
		}else if(dayOfWeek == Calendar_v4.SUNDAY) {
			message = "일요일";
		}
		
		
		System.out.println(year+"년 "+month+"월 "+day+" 일은 "+
		message+" 입니다.");
	}
	
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//2020년 5월 1일 날짜를 구해서 일부터 1일 이전 날짜까지 빈공백 처리
		
		int totalCount = getCount(year,month,1);
		int rest = totalCount % 7;
		
		for(int i=0;i<rest;i++) {
			System.out.print("\t");
		}
		
		for(int i=1;i<=getLastDay(year,month);i++) {
			System.out.print(i+"\t");
			rest++;
			if(rest%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void print(int year) {
		for(int i=1;i<=12;i++) {
			print(year, i);
		}
	}
	
	public Calendar_v4() { //디폴트생성자
	}
	
}
