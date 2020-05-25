package java_20200525;

public class ThrowDemo {
	
	public static double withdraw(String account, int amount )
	throws IncorrectAccountException, InsufficiantBalanceException {
		
		double myBalance = 10000;
		String myAccount = "123-123-123";
		
		if(myAccount.equals(account)) {
			
			if(myBalance - amount >= 0) {
				myBalance -= amount;
			} else {
				
				//예외를 개발자가 임의로 발생
				throw new InsufficiantBalanceException("잔고가 부족합니다.");
				
			}
			
		} else {
			
			//예외를 개발자가 임의로 발생
			throw new IncorrectAccountException("잘못된 계정입니다.");
			//리턴 해주지 않는다 
			
		}
		
		return myBalance;
		
	}
	
	public static void main(String[] args) {
		
		double balance = 0;
		
		try {
			
			balance = withdraw("123-123-123", 1000000);
			
			System.out.printf("잔고: %.2f%n", balance);
			
		} catch (IncorrectAccountException e) {
			
			System.err.println(e.getMessage());
			
		} catch (InsufficiantBalanceException e) {
			
			System.err.println(e.getMessage());
			
		}
		
		
	}

}
