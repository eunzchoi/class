package test01;

import java.util.Scanner;

public class TelBookService {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. �Է� 2. ��� 3. ���� 0. ���α׷� ����");
		
		int select = sc.nextInt();
		return select;
	}
	
	public void input(TelBook t[]) {
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				t[i] = new TelBook();
				
				System.out.println("�̸� �Է� : ");
				t[i].setName(sc.next());
				System.out.println("��ȭ��ȣ �Է� : ");
				t[i].setTelNum(sc.nextInt());
				System.out.println("�̸��� �Է� : ");
				t[i].setemail(sc.next());
				System.out.println("������� �Է� : ");
				t[i].setbirth(sc.nextInt());
				break;
			}
		}
	}
	
	public void print(TelBook t[]) {
		System.out.println("����� ��ȭ��ȣ �Է� : ");
		int printNum = sc.nextInt();
		
		boolean b = true;
		
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				continue;
			}
			if(t[i].getTelNum() == printNum) {
				System.out.println("�̸� : " + t[i].getName());
				System.out.println("��ȭ��ȣ : " + t[i].getTelNum());
				System.out.println("�̸��� : " + t[i].getemail());
				System.out.println("������� : " + t[i].getbirth());
				b = false;
				break;
			}
		}
		if(b) {
			System.out.println("�Է��� ��ȭ��ȣ�� �������� �ʽ��ϴ�.");
		}
	}
	
	public int delete(TelBook t[], int cnt) {
		System.out.println("������ ��ȭ��ȣ �Է� : ");
		int delNum = sc.nextInt();
		boolean c = true;
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				continue;
			}
			if(t[i].getTelNum() == delNum) {
				System.out.println(t[i].getName() + " ���� �����մϴ�.");
				t[i] = null;
				cnt--;
				c = false;
				break;
			}
			if(c) {
				System.out.println("�Է��� ��ȭ��ȣ�� �������� �ʽ��ϴ�.");
			}
			return cnt;
		}
		return cnt;
	}
}
