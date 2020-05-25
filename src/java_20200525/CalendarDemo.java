package java_20200525;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTimeInMillis(1589168307605l); //롱이니까 뒤에 l붙히기 
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		System.out.println(year + "." + month + "." + day);
		System.out.println(hour + "." + minute + "." + seconds);
		
		//simple date format으로 저 긴 코드를 짧게 축약시켜주기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일"); 
		//년월일 오전 오후 시간 요일 패턴넣기 가능
		
		String date = sdf.format(cal.getTime());
		System.out.println(date);
		
	}

}
