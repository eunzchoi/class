package Quiz02;

import java.util.Scanner;

public class EmployeeService {
	Scanner sc = new Scanner(System.in); ///4
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.println("���� : "); ///3
		int menu = sc.nextInt(); 
		return menu; ///5
	}
	public Employee empInput() {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println("�̸� �Է� : ");
		e.setName(sc.next());
		System.out.println("���� �Է� : ");
		e.setRank(sc.next());
		System.out.println("���� �Է� : ");
		e.setAnnual(sc.nextInt());
		// ���� �ֵ��� �Ʒ� e�� ���� main���� �̵�
		return e; ///7
	}
	public void empOutput(Employee[] e) {
		// TODO Auto-generated method stub
		for(int i=0;i <e.length;i++) {
			if(e[i] == null) {
				continue;
			} else {
				System.out.println("#####"+ e[i].getName() +"#####");
				System.out.println("���� : "+e[i].getRank());
				System.out.println("���� : "+e[i].getAnnual());
				System.out.println(); 
			} ///10
		}
	}
	public boolean empFind(Employee[] e) {
		// TODO Auto-generated method stub
		System.out.println("�˻��� ���� �̸� �Է� : ");
		String findName = sc.next();
		
		for(int i=0;i<e.length;i++) {
			if(e[i] == null) {
				continue;
			} else if (e[i].getName().equals(findName)) {
				System.out.println("#####"+ e[i].getName() +"#####");
				System.out.println("���� : "+e[i].getRank());
				System.out.println("���� : "+e[i].getAnnual());
				System.out.println(); 
				return false; // �޼��� ����
			}
		}
		return true; // ������� ����� ���� �˻��� ������ ���ٴ� ��
	} ///12
	public boolean empDel(Employee[] e) {
		// TODO Auto-generated method stub
		System.out.println("������ ���� �̸� �Է� : ");
		String delName = sc.next();
		
		for(int i=0;i<e.length;i++) {
			if(e[i] == null) {
				continue;
			} else if (e[i].getName().equals(delName)) {
				System.out.println(e[i].getName() +" ������ �����մϴ�.");
				System.out.println(); 
				e[i] = null;
				return false; 
			}
		}
		return true;
	} ///14

}
