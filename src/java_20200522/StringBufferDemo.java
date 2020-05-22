package java_20200522;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		
		//StringBuffer클래스는 Object의 equals()메서드를 
		//overriding 하지 않음으로 Object equals()메서드를 사용한다
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		//toSting메서드 사용해서 문자열로 바꿔보기
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4));
		
		//사용
		StringBuffer sql = new StringBuffer();
		
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = 'Miri' ");
		sql.append("order by name desc"); //이런식으로 연결해주기
		
		System.out.println(sql);
		
		sql.setLength(0); //이러면 기존 문자열이 날아가버림
		sql.append("selecr no, writer from board");
		
		System.out.println(sql);
	}
	
}
