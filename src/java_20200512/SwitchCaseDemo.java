package java_20200512;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		String season = null;
		
		//month => 수식 (char,byte, short, int, string만 올 수 있다)
		switch(month) {
		//case => 평가값 (유일해야한다!!!!!)
		case 12 :
		case 1 :
		case 2 : season = "겨울"; break;
		case 3 :
		case 4 :
		case 5 : season = "봄"; break;
		case 6 :
		case 7 :
		case 8 : season = "여름"; break;
		case 9 :
		case 10 :
		case 11 : season = "가을"; break;
		default : season = "없는계절";
		} //이러면 흘러흘러 타고 내려간다
		
		System.out.println(month + "월은 " + season+ "입니다.");
	}
	
}
