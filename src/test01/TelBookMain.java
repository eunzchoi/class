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
					System.out.println("�� �̻� ������ �� �����ϴ�.");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}
