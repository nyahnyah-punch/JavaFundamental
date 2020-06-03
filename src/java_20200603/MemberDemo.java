package java_20200603;

import java.util.ArrayList;

public class MemberDemo {
  
	public static void main(String[] args) {
		
		MemberDao mdao = new MemberDao();
		int num = 1;
		String name = "hi"; 
		//MemberDto m = new MemberDto(num, name); //한번만 쓸거면 이걸 해줄 필요가 없다
		
		/*
		//insert 됐나 확인 
		int resultCount = mdao.insert(new MemberDto(num, name));
		if(resultCount == 1) {
			System.out.println("정상적으로 회원가입이 되었습니다!");
			
		} else {
			System.out.println("오류 :(");
			
		}
		*/
		/*
		int resultCount = mdao.update(new MemberDto(num, name));
		if(resultCount == 1) { 
			System.out.println("회원정보가 정상적으로 수정되었습니다!");
			
		} else {
			System.out.println("오류 :(");
			
		}
		*/
		/*
		int resultCount = mdao.delete(num);
		if(resultCount==1) {
			System.out.println("회원이 정상적으로 삭제 되었습니다.");
		}else {
			System.out.println("오류..");
		}
		*/
		
		ArrayList<MemberDto> list = mdao.select();
		
		for(int i=0;i<list.size();i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			System.out.printf("%d , %s,  %n",_num, _name);
		}
		
		System.out.println("======================");
		
		for(MemberDto m : list) {
			int _num = m.getNum();
			String _name = m.getName();
			System.out.printf("%d , %s,  %n",_num, _name);
		}
		
		System.out.println("======================");
		
		MemberDto mdto = mdao.select(num); 
		
		if(mdto != null) {
			int _num = mdto.getNum();
			String _name = mdto.getName();
			System.out.printf("%d, %s %n", _num, _name);
			
		} else {
			System.out.println("회원정보가 없습니다.");
			
		}
		
	}
}
