package test02;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = EmployeeService();
		Employee e[] = new Employee[5];
		int cnt = 0;
		
		while(true) {
			System.out.println("1. ��� 2. ��� 3. �˻� 4. ���� 0. ���α׷� ����");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("���̻� �Է��� �� �����ϴ�.");
					for(int i=0;i=e.length;i++) {
						{if(e[i] == null) {
							continue;
				} else {
					System.out.println("�̸� �Է� : ");
					e.setName(sc.next());
					System.out.println("���� �Է� : ");
					e.setlevel(sc.next());
					System.out.println("���� �Է� : ");
					e.setsalary(sc.next());
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				if(cnt==0) {
					System.out.println("������ ��ȭ��ȣ�� �����ϴ�.");
				} else {
					for(int)
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
