package HomeWorks.MemberManage;

import java.util.ArrayList;
import java.util.Scanner;

/* 음.... 코드가 되게 불안정해서 
 * 아이디가 하나 이상 들어가지면 제 기능을 못합니다... :( 
 * 그래도 하나일때는 잘 돌아갑니다.....! */

public class MemberManagementDemo {
	
private ArrayList<Member> list = new ArrayList<Member>(); //list선언,생성
	
	public void print() { //프린트 할 안내문
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");
		
	}
	
	public String input(String msg) { //msg를 인풋
		System.out.print(msg); //msg를 반환
		Scanner sc = new Scanner(System.in); //사용자가 value를 input할 수 있게해주는 친구
		return sc.next();//키보드에서 입력한 데이터를 반환해준다.
	}
	
	public void run(String inputData) { //사용자가 value를 input할 수 있는 option
		if(inputData.equals("1")) {
			insert();
		}else if(inputData.equals("2")) {
			update();
		}else if(inputData.equals("3")) {
			delete();
		}else if(inputData.equals("4")) {
			search();
		}else if(inputData.equals("5")) { //5가지 옵션이 있음
			System.out.println("프로그램이 종료되었습니다.");
		}else {
			System.out.println("똑바로해!"); //만약 5개 안선택하고 이상한거 넣으면
			print();
			String inputD = input("번호를 선택하세요>"); //다시 처음으로
			run(inputD);
		}
	}
	
	//1. 아이디를 입력받는다.
	//2. 이름을 입력받는다.
	//3. ArrayList에 고객을 추가한다.
	//4. ArrayList에 있는 모든 고객을 출력한다.
	//5. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	//6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	public void insert() { //아이디창
		String id = input("아이디>"); //아이디쓰기
		String name = input("이름>"); //이름 쓰기
		
		Member m = new Member(id,name); //id랑 이름이 새로운 맴버 m이 됨
		list.add(m); //m을 새로운 리스트로
		
		for(Member mem : list) { //맴이라는 m이 들어가있는 리스트
			System.out.printf("아이디 : %s , 이름 : %s %n", mem.getId(), mem.getName());
		} //입력한 결과 출력
		
		print();
		String inputData = input("번호를 선택하세요>"); //다시 번호 입력하는 창
		run(inputData); //위에 작성한 inputdata로 돌아가기
		
		
	}
	//1. 수정할 아이디를 입력받는다.
	//2. ArrayList에 있는 고객정보에서 수정할 아이디를 찾아서 있으면 수정할 이름을 
	//   입력받고, ArrayList에 고객정보를 수정한다.
	//   만약, 수정할 아이디가 없으면 "수정할 아이디가 없습니다." 메세지를 출력한다.
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void update() {
		
		String edit = input("아이디를 입력하세요>");
		
		for(Member mem : list) {
			
			if(mem.getId().equals(edit)) {
				String newId = input("새로운 아이디를 입력하세요>");
				String newName = input("새로운 이름을 입력하세요>");
				
				mem.setName(newId);
				mem.setId(newName);
				System.out.printf("아이디 : %s , 이름 : %s %n", mem.getId(), mem.getName());
				
			}else {
				System.out.println("아이디를 찾을 수 없습니다 :(");
			}	
		}
		
		print();
		String inputData = input("번호를 선택하세요>"); 
		run(inputData);
		
	}
	//1. 삭제할 아이디를 입력받는다.
	//2. ArrayList의 Member 객체중에서 삭제할 아이디를 찾아 있으면 삭제하고
	//   없으면 "삭제할 아이디가 없습니다." 메세지를 출력한다.
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete() {
		String quit = input("삭제할 아이디를 입력하세요");
		
		for(Member mem : list) {
			
			if(mem.getId().equals(quit)) {
				list.remove(mem);
				System.out.println("아이디를 삭제하였습니다 :(");
				
			}else {
				System.out.println("아이디를 찾을 수 없습니다 :(");
			}
			
			print();
			String inputData = input("번호를 선택하세요>"); 
			run(inputData);
		}
	}
	//1. 검색할 아이디를 입력 받는다.
	//2. ArrayList에 Member 객체중에서 검색할 아이디를 찾아서 있으면 출력하고
	//   없으면 "검색된 결과가 없습니다." 메세지 출력
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void search() {
		String find = input("찾으실 아이디를 입력해주세요!");
		
		for(Member mem : list) {
			
			if(mem.getId().equals(find)) {
				System.out.printf("%s님 안녕하세요!%n", mem.getName());
				
			}else {
				System.out.println("아이디를 찾을 수 없습니다 :(");
			}
		}
		
		print();
		String inputData = input("번호를 선택하세요>"); 
		run(inputData);
		
	}
	
	public static void main(String[] args) { //이부분이 실제로 보여지는 부분
		MemberManagementDemo m = new MemberManagementDemo(); //클래스 호출
		m.print(); //위에서 받은 맴버 출력
		String inputData = m.input("번호를 선택하세요>");  //번호 선택하는 갈래길
		m.run(inputData); //데이터 넣기
	}

}

