package Quiz01;

import java.util.Scanner;

public class TelBookMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ��ȭ��ȣ 5�� ���� �迭 ����
		TelBook t[] = new TelBook[5];
		// ������ ��ȭ��ȣ ���� ī����
		int cnt = 0;
		
		while(true ) {
			
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("���̻� �Է��� �� �����ϴ�.");
				} else {
					t[cnt] = new TelBook();
					System.out.println("�̸� �Է� : ");
					t[cnt].setName(sc.next());
					System.out.println("��ȭ��ȣ �Է� : ");
					t[cnt].setTelnum(sc.next());
					System.out.println("�̸��� �Է� : ");
					t[cnt].setEmail(sc.next());
					System.out.println("������� �Է� : ");
					t[cnt].setBirth(sc.next());
					cnt++;
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("����� ��ȭ��ȣ�� �����ϴ�.");
				} else {
					for(int i=0;i=t.length;i++) {
						if(t[i] == null) {
							continue;
						} else {
							System.out.println("�̸� : " + t[i].getName());
							System.out.println("��ȭ��ȣ : " + t[i].getTelnum());
							System.out.println("�̸��� : " + t[i].getEmail());
							System.out.println("������� : " + t[i].getBirth());
							System.out.println();
						}
					}
				}
				break;
			case 3:
				if(cnt==0) {
					System.out.println("������ ��ȭ��ȣ�� �����ϴ�.");
				} else {
					System.out.println("�˻��� �̸� �Է� : ");
					String findName = sc.next();
					
					boolean b = true;
					for(int i=0;i<t.length;i++) {
						if(t[i] == null) {
							continue;
						} else if (t[i].getName().equals(findName)) {
							System.out.println(findName + " ���� ������ �����մϴ�.");
							t[i] = null;
							cnt--;
							b = false;
							break;
						}
					}
					if(b) {
						System.out.println("�˻��� �̸��� �������� �ʽ��ϴ�.");
					}
							
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
