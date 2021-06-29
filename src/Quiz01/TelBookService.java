package Quiz01;

import java.util.Scanner;

public class TelBookService {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. �Է� 2. ��� 3. ���� 0. ���α׷� ����");
//		int menu = sc.nextInt();
//		return menu;
		return sc.nextInt();
	}
	
	public TelBook input() {
		TelBook t = new TelBook();
		System.out.println("�̸� �Է� : ");
		t.setName(sc.next());
		System.out.println("��ȭ��ȣ �Է� : ");
		t.setTelnum(sc.next());
		System.out.println("�̸��� �Է� : ");
		t.setEmail(sc.next());
		System.out.println("������� �Է� : ");
		t.setBirth(sc.next());
		
		return t;
	}
	
	public void output(TelBook t[]) {
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
	
	public int delete(TelBook t[], int cnt) {
		System.out.println("�˻��� �̸� �Է� : ");
		String findName = sc.next();
		
		boolean b = true;
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				continue;
			} else if (t[i].getName().equals(findName)) {
				System.out.println(findName + " ���� ������ �����մϴ�.");
				t[i] = null;
				b = false;
				cnt--;
				break;
			}
		}
		if(b) {
			System.out.println("�˻��� �̸��� �������� �ʽ��ϴ�.");
		}
		return cnt;
	}
}
