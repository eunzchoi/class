package Quiz01;

import java.util.Scanner;

public class TelBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 기능 실행에 필요한 메서드 클래스 객체 생성
		TelBookService ts = new TelBookService();
		// 전화번호 5개 저장 배열 생성
		TelBook t[] = new TelBook[5];
		// 저장한 전화번호 갯수 카운터
		int cnt = 0;
		
		while(true ) {
			int menu = ts.menu();
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("더이상 입력할 수 없습니다.");
				} else {
					t[cnt] = ts.input();
					cnt++;
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("출력할 전화번호가 없습니다.");
				} else {
					ts.output(t);
				}
				break;
			case 3:
				if(cnt==0) {
					System.out.println("삭제할 전화번호가 없습니다.");
				} else {
					cnt = ts.delete(t, cnt);
							
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
