package Quiz02;

import java.util.Scanner;

public class AaaMain1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Aaa a[] = new Aaa[5];
	// 5개를 저장하는 배열 생성
	int cnt = 0;
	// 저장한 정보 갯수 카운트
	
	while(true) {
		System.out.println("1. 입력 2. 출력 3. 삭제 0. 프로그램 종료");
		// 메뉴 프린트
		int menu = sc.nextInt();
		// 사용자가 입력한 메뉴 저장
		
			switch(menu) {
			case 1: // 입력
				if(cnt == 5) { // 5개가 모두 채워진 상황
					System.out.println("더이상 입력할 수 없습니다.");
				} else {
					a[cnt] = new Aaa();
					System.out.println("이름 입력 : ");
					a[cnt].setName(sc.next());
				}
				break;
			case 2: // 출력
				if(cnt == 0) { // 5개가 모두 비워져있는 상황
					System.out.println("출력할 전화번호가 없습니다.");
				} else {
					for(int i=0;i=a.length;i++) {
						if(a[i] == null) { //***
							continue;
						} else {
							System.out.println("이름 : " + a[i].getName());
							System.out.println();
						}
					}
				}
				break;
			case 3: // 삭제
				if(cnt==0) {
					System.out.println("삭제할 전화번호가 없습니다.");
				} else {
					System.out.println("검색할 이름 입력 : ");
					String findName = sc.next();
					
					boolean b = true;
					for(int i=0;i<a.length;i++) {
						if(a[i] == null) {
							continue;
						} else if (a[i].getName().equals(findName)) {
							System.out.println(findName + " 님의 정보를 삭제합니다.");
							a[i] = null; // 정보 삭제
							cnt--; // 갯수 마이너스
							b = false; // 논리값 변경
							break;
						}
					}
					if(b) { //***
						System.out.println("검색한 이름이 존재하지 않습니다.");
					}
							
				}
				break;
			case 0: // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			default: // 메뉴에서 벗어난 번호 선택
				System.out.println("없는 메뉴 번호입니다.");
			}
		}
	}
}
