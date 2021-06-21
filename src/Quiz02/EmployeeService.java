package Quiz02;

import java.util.Scanner;

public class EmployeeService {
	Scanner sc = new Scanner(System.in); ///4
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 직원 등록");
		System.out.println("2. 직원 목록");
		System.out.println("3. 직원 검색");
		System.out.println("4. 직원 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : "); ///3
		int menu = sc.nextInt(); 
		return menu; ///5
	}
	public Employee empInput() {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println("이름 입력 : ");
		e.setName(sc.next());
		System.out.println("직급 입력 : ");
		e.setRank(sc.next());
		System.out.println("연봉 입력 : ");
		e.setAnnual(sc.nextInt());
		// 위에 애들이 아래 e로 가서 main으로 이동
		return e; ///7
	}
	public void empOutput(Employee[] e) {
		// TODO Auto-generated method stub
		for(int i=0;i <e.length;i++) {
			if(e[i] == null) {
				continue;
			} else {
				System.out.println("#####"+ e[i].getName() +"#####");
				System.out.println("직급 : "+e[i].getRank());
				System.out.println("연봉 : "+e[i].getAnnual());
				System.out.println(); 
			} ///10
		}
	}
	public boolean empFind(Employee[] e) {
		// TODO Auto-generated method stub
		System.out.println("검색할 직원 이름 입력 : ");
		String findName = sc.next();
		
		for(int i=0;i<e.length;i++) {
			if(e[i] == null) {
				continue;
			} else if (e[i].getName().equals(findName)) {
				System.out.println("#####"+ e[i].getName() +"#####");
				System.out.println("직급 : "+e[i].getRank());
				System.out.println("연봉 : "+e[i].getAnnual());
				System.out.println(); 
				return false; // 메서드 종료
			}
		}
		return true; // 여기까지 진행된 것은 검색할 정보가 없다는 뜻
	} ///12
	public boolean empDel(Employee[] e) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 직원 이름 입력 : ");
		String delName = sc.next();
		
		for(int i=0;i<e.length;i++) {
			if(e[i] == null) {
				continue;
			} else if (e[i].getName().equals(delName)) {
				System.out.println(e[i].getName() +" 정보를 삭제합니다.");
				System.out.println(); 
				e[i] = null;
				return false; 
			}
		}
		return true;
	} ///14

}
