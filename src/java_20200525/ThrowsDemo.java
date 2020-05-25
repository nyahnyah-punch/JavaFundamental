package java_20200525;

public class ThrowsDemo {
	
	public static int getDivide(int first, int second) throws ArithmeticException {
		//프로그램의 잘못이 아닌 호출해주는쪽에서 세컨값을 잘 입력해야하는 경우이다
		//예외처리 해도 되고 안해도 되게 바뀜 1해결 안돼서 캐치블럭으로 보냄
		
		int result = first / second; //예외가 발생하는 코드 1
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			int first = Integer.parseInt(args[0]); //예외가 발생하는 코드 2
			int second = Integer.parseInt(args[1]); //예외가 발생하는 코드 3
			
			int result = getDivide(first, second);
			System.out.printf("결과: %d%n", result);
			
		} catch(ArrayIndexOutOfBoundsException e) { //2, 3해결
			
			System.err.println("인자를 2개 입력하셔야 합니다.");
			
		} catch(NumberFormatException e) { //2, 3 해결
			
			System.out.println("인자에는 숫자를 넣으셔야 합니다.");
			
		} catch(ArithmeticException e){ //1 해결 
			
			System.out.println("0으로 나눌 수 없습니다.");
			
		}finally {
			
			System.out.println("finally");
			
		}
		
		System.out.println("끝"); //예외처리를 하면 그 뒤에도 코딩할 수 있다
		
	}

}
