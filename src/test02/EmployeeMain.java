package test02;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = EmployeeService();
		Employee e[] = new Employee[5];
		int cnt = 0;
		
		while(true) {
			System.out.println("1. 등록 2. 목록 3. 검색 4. 삭제 0. 프로그램 종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("더이상 입력할 수 없습니다.");
					for(int i=0;i=e.length;i++) {
						{if(e[i] == null) {
							continue;
				} else {
					System.out.println("이름 입력 : ");
					e.setName(sc.next());
					System.out.println("직급 입력 : ");
					e.setlevel(sc.next());
					System.out.println("연봉 입력 : ");
					e.setsalary(sc.next());
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				if(cnt==0) {
					System.out.println("삭제할 전화번호가 없습니다.");
				} else {
					for(int)
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴 번호입니다.");
			}
		}
	}
}
