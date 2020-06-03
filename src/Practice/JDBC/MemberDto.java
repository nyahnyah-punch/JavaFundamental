package Practice.JDBC;

public class MemberDto {
	
	private int num;
	private String name;
	
	public MemberDto() {
		super();
	}
	
	public MemberDto(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
