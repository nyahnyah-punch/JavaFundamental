package java_20200515;
//customer클레스
public class Customer { //은행에서 고객을 관리하는 
	//instance변수 (name, email, phone, balance, IsRealeased)
	//객체가 생성될때만 만들어지는 변수
	
	public String name; //아무것도 안붙어있으니까 인스턴스변수
	public String email;
	public String phone;
	public double balance;
	public boolean IsReleased;
	public static double InterestRate; //이자율이 다 똑같으면 static변수가 맞다
	public static final String BANKNAME = "신한은행"; //힌번 세팅해주면 끝
	
}
