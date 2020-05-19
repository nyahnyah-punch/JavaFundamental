package java_20200519;

class Admin {

	//맴버변수는 무조건 프라이벳!
	private String id;
	private String pwd;
	private String email;
	private int level;
	//
	
	public Admin() { //매개변수 없는 생성자 = 디폴트 생성자
		super(); //모든 생성자 첫줄에 숨어있는 슈퍼 - 부모 클레스에 디폴트 생성자를 호출
	}
	//
	
	//생성자로 새터 생략해주기!
	public Admin(String id, String pwd, String email, int level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	} //클레스 이름과 동일하며, 반환값이 없는게 포인트
	//
	
	//생성자 오버로딩
	public Admin(String id, String pwd, String email) {
//		this.id = id; //중복된 코드를 없애라! 
//		this.pwd = pwd;
//		this.email = email;
		this(id, pwd, email, 0); //super을 대체, 다른 생성자를 호출
	} //반드시 생성자에서만 호출 가능
	
//	public void setId(String id) {
//		this.id = id;
//	}
	
	public String getId() {
		return id;
	}
	//
	
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	}
	
	public String getPwd() {
		return pwd;
	}
	//
	
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	public String getEmail() {
		return email;
	}
	//
	
//	public void setLevel(int level) {
//		this.level = level;
//	}
	
	public int getLevel() {
		return level;
	}
	//
	
}
