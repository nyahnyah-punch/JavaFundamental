package java_20200515;

public class CustomerStaticDemo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name = "송하늘";
		Customer.InterestRate = 30.54; 
		//스테틱은 객체의 이름(레퍼런스)을 쓰지 않고 클레스 이름으로 접근
		
		Customer c2 = new Customer();
		c2.name = "유예원";
		Customer.InterestRate = 12.25;
		
		System.out.println(Customer.InterestRate);
		//12.25가 밑에 있어서 30.54를 overtake한다 
		
		//Customer.BANKNAME = "국민은행"; //여기서 이렇게 수정이 안된다
	}
}
