package Quiz01;

import java.util.Scanner;

public class TelBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��� ���࿡ �ʿ��� �޼��� Ŭ���� ��ü ����
		TelBookService ts = new TelBookService();
		// ��ȭ��ȣ 5�� ���� �迭 ����
		TelBook t[] = new TelBook[5];
		// ������ ��ȭ��ȣ ���� ī����
		int cnt = 0;
		
		while(true ) {
			int menu = ts.menu();
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("���̻� �Է��� �� �����ϴ�.");
				} else {
					t[cnt] = ts.input();
					cnt++;
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("����� ��ȭ��ȣ�� �����ϴ�.");
				} else {
					ts.output(t);
				}
				break;
			case 3:
				if(cnt==0) {
					System.out.println("������ ��ȭ��ȣ�� �����ϴ�.");
				} else {
					cnt = ts.delete(t, cnt);
							
				}
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("���� �޴� ��ȣ�Դϴ�.");
			}
		}
		
	}
}
