package Quiz02;

import java.util.Scanner;

public class AaaMain1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Aaa a[] = new Aaa[5];
	// 5���� �����ϴ� �迭 ����
	int cnt = 0;
	// ������ ���� ���� ī��Ʈ
	
	while(true) {
		System.out.println("1. �Է� 2. ��� 3. ���� 0. ���α׷� ����");
		// �޴� ����Ʈ
		int menu = sc.nextInt();
		// ����ڰ� �Է��� �޴� ����
		
			switch(menu) {
			case 1: // �Է�
				if(cnt == 5) { // 5���� ��� ä���� ��Ȳ
					System.out.println("���̻� �Է��� �� �����ϴ�.");
				} else {
					a[cnt] = new Aaa();
					System.out.println("�̸� �Է� : ");
					a[cnt].setName(sc.next());
				}
				break;
			case 2: // ���
				if(cnt == 0) { // 5���� ��� ������ִ� ��Ȳ
					System.out.println("����� ��ȭ��ȣ�� �����ϴ�.");
				} else {
					for(int i=0;i=a.length;i++) {
						if(a[i] == null) { //***
							continue;
						} else {
							System.out.println("�̸� : " + a[i].getName());
							System.out.println();
						}
					}
				}
				break;
			case 3: // ����
				if(cnt==0) {
					System.out.println("������ ��ȭ��ȣ�� �����ϴ�.");
				} else {
					System.out.println("�˻��� �̸� �Է� : ");
					String findName = sc.next();
					
					boolean b = true;
					for(int i=0;i<a.length;i++) {
						if(a[i] == null) {
							continue;
						} else if (a[i].getName().equals(findName)) {
							System.out.println(findName + " ���� ������ �����մϴ�.");
							a[i] = null; // ���� ����
							cnt--; // ���� ���̳ʽ�
							b = false; // ���� ����
							break;
						}
					}
					if(b) { //***
						System.out.println("�˻��� �̸��� �������� �ʽ��ϴ�.");
					}
							
				}
				break;
			case 0: // ���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default: // �޴����� ��� ��ȣ ����
				System.out.println("���� �޴� ��ȣ�Դϴ�.");
			}
		}
	}
}
