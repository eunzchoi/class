package test01;

import java.util.Scanner;

public class TelBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TelBookService tbs = new TelBookService();
		TelBook t[] = new TelBook[5];
		int cnt = 0;
		
		while(true) {
			int select = tbs.menu();
			
			switch(select) {
			case 1:
				if(cnt == 5) {
					System.out.println("더 이상 저장할 수 없습니다.");
				} else {
					tbs.input(t);
					cnt++;
				}
				break;
			case 2:
				tbs.print(t);
				break;
			case 3:
				cnt = tbs.delete(t, cnt);
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("선택된 메뉴는 없습니다.");
			}
		}
	}
}
