package Quiz02;

public class EmployeeMain {
	public static void main(String[] args) {
		// EmployeeMain에서 실행하는 메서드 객체 생성
		EmployeeService es = new EmployeeService(); ///2
		// 직원등록 5명 위치 저장하는 배열 생성
		Employee e[] = new Employee[5];
		// 직원 등록 갯수 카운터 저장
		int cnt = 0;
		
		while(true) {
			int menu = es.menu(); ///1 빨간밑줄로 Service에 생성
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("더 이상 저장할 수 없습니다.");
				} else {
					e[cnt] = es.empInput(); ///6 e[cnt] = -> 저장을 받도록 / 빨간밑줄로 Service에 생성
					cnt++; ///8
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("출력할 직원 목록이 없습니다.");
				} else {
					es.empOutput(e); 
				} ///9 /빨간밑줄로 Service에 생성
				break;
			case 3:
				if(cnt == 0) {
					System.out.println("검색할 직원 정보가 없습니다.");
				} else {
//					boolean b = es.empFind(e);
//					if(b) { // 찾았으면 값이 false 이거 실행안함
//						System.out.println("검색한 직원 정보가 없습니다.");
//					}
					if(es.empFind(e)) {
						System.out.println("검색할 직원 정보가 없습니다.");
					} // 위와 동일한 결과
				} //11 / 빨간밑줄로 Service에 생성
				break;
			case 4:
				if(cnt == 0) {
					System.out.println("삭제할 직원 정보가 없습니다.");
				} else {
					if(es.empDel(e)) {
						System.out.println("삭제한 직원 정보가 없습니다.");
					} else { ///15 false 값 = 누군가 삭제했다.
						cnt--;
					}
				} ///13 / 빨간밑줄로 Service에 생성
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}
