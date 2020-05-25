package java_20200525;

public class TryCatchDemo {
	
	public static double getAvg(int first, int second) {
		
		//평균값 구하는 함수
		int sum = first + second;
		double avg = (double) sum/2;
		return avg;
	}

	public static void main(String[] args) {
		
		try {
		int korean = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]); //사용자로부터 두개의 입력값을 받음
		
		//평균값구하는 메소드 
		double average = getAvg(korean, english);
		System.out.printf("평균: %.2f%n", average);
		
		} catch(ArrayIndexOutOfBoundsException e) { //array 값을 하나만 넣었을 때
			
			//System.out.println("예외메세지: " + e.getMessage()); //예외 메세지 출력
			System.err.println("2개 넣어!"); //err메세지로 넣으면 빨간글자가 나옴 (이클립스 내에서)
			//e.printStackTrace(); //어디서 애허가 발생했는지, 메세지 다 나옴 
			
		} catch(NumberFormatException e) {
			
			//System.out.println("예외메세지: " + e.getMessage());
			System.out.println("문자말고 숫자 넣어!");
			
		} finally { //애러가 나던 안나던 무조건 실행됨 
			
			System.out.println("finally");
			
		}
		
	}
	
}
