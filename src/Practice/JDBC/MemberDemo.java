package Practice.JDBC;

import java.util.ArrayList;

import Practice.JDBC.MemberDto;

public class MemberDemo {
 
	public static void main(String[] args) {
		
		//insert
		MemberDaoInsert mdaoi = new MemberDaoInsert();
		
		int num = 5;
		String name = "하이1";
		MemberDto m = new MemberDto(num, name);
		
		int resultCount = mdaoi.insert(m);
		if(resultCount == 1) {
			System.out.println("회원등록이 완료되었습니다!");
			
		} else {
			System.out.println("회원등록을 실패하였습니다..");
			
		}
		//
		
		//show every table
		MemberDaoEvery mdaoe = new MemberDaoEvery();
		ArrayList<MemberDto> list = mdaoe.select();
		
		for(MemberDto memDto : list) {
			int _num = memDto.getNum();
			String _name = memDto.getName();
			System.out.printf("%d | %s %n", _num, _name);
			
		}
		//
		
	}
}
