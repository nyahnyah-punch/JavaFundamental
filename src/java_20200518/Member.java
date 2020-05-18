package java_20200518;

public class Member {

	//쎄너게터만들기 연습
	private String name;
	private String zipcode;
	private String addr1;
	private String addr2;
	private String ssn1;
	private String ssn2;
	private int age;
	private String regdate;
	
	
	public void setName(String name) { //정보 수정
		this.name = name;
	}
	
	public String getName() { //정보 가지고오기
		return name;
	}
	//
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	//
	
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	
	public String getAddr1() {
		return addr1;
	}
	//
	
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	
	public String getAddr2() {
		return addr2;
	}
	//
	
	public void setSsn1(String ssn1) {
		this.ssn1 = ssn1;
	}
	
	public String getSsn1() {
		return ssn1;
	}
	//
	
	public void setSsn2(String ssn2) {
		this.ssn2 = ssn2;
	}
	
	public String getSsn2() {
		return ssn2;
	}
	//
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	//
	
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public String getRegdate() {
		return regdate;
	}
	
	//private으로 돌아가있는걸 부분적으로 퍼블릭으로 만들고 싶을 때
	
	
}
