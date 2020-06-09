package java_20200604;

import java.util.ArrayList;

public class EmpDemo {

	public static void main(String[] args) {
		
		EmpDao dao1 = EmpDao.getInstance();
		EmpDao dao2 = EmpDao.getInstance();
		
		System.out.println(dao1 == dao2);
		
		EmpDao dao = EmpDao.getInstance();
		
		//insert
		int num = 9000;
		String name = "LEE";
		String job = "ANALYST";
		int mgr = 7788;
		int sal = 2200;
		int comm = 0;
		int deptNo = 30;
		
		EmpDto ed = new EmpDto(num, name, job, mgr, null, sal, comm, deptNo);
		int resultCount = dao.insert(ed);
		
		if(resultCount == 1) {
			System.out.println("사원등록 완료!");
			
		} else {
			System.out.println("ERROR");	
		}
				
		//update
		num = 9000;
		name = "CHOI";
		job = "SALESMAN";
		mgr = 7844;
		sal = 2222;
		comm = 10;
		deptNo = 10;
		
		resultCount = dao.update(ed);
		if(resultCount == 1) {
			System.out.println("업데이트 완료!");
			
		} else {
			System.out.println("ERROR");	
		}
		
		//delete
		resultCount = dao.delete(num);
		if(resultCount ==1) {
			System.out.println("삭제완료");
			
		} else {
			System.out.println("ERROR");
		}
		
		//select (0,10)
		int start = 0;
		int len = 10;
		
		ArrayList<EmpDto> list = dao.select(start, len);
		for(EmpDto dto : list) {
			System.out.printf("%d | %s | %s | %d | %s | %d | %d | %d %n", 
					dto.getNum(),dto.getName(), dto.getJob(), 
					dto.getMgr(), dto.getHireDate(), dto.getSal(), 
					dto.getComm(), dto.getDeptNo());
			
		}
		
		num = 7839;
		EmpDto dto = dao.select(num);
		if(dto != null) {
			System.out.printf("%d | %s | %s | %d | %s | %d | %d | %d %n", 
					dto.getNum(),dto.getName(), dto.getJob(), 
					dto.getMgr(), dto.getHireDate(), dto.getSal(), 
					dto.getComm(), dto.getDeptNo());
		}else {
			System.out.println("회원정보가 없습니다.");
			
		}
		
	}
}
