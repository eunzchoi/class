package Quiz02;

public class EmployeeMain {
	public static void main(String[] args) {
		// EmployeeMain���� �����ϴ� �޼��� ��ü ����
		EmployeeService es = new EmployeeService(); ///2
		// ������� 5�� ��ġ �����ϴ� �迭 ����
		Employee e[] = new Employee[5];
		// ���� ��� ���� ī���� ����
		int cnt = 0;
		
		while(true) {
			int menu = es.menu(); ///1 �������ٷ� Service�� ����
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("�� �̻� ������ �� �����ϴ�.");
				} else {
					e[cnt] = es.empInput(); ///6 e[cnt] = -> ������ �޵��� / �������ٷ� Service�� ����
					cnt++; ///8
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("����� ���� ����� �����ϴ�.");
				} else {
					es.empOutput(e); 
				} ///9 /�������ٷ� Service�� ����
				break;
			case 3:
				if(cnt == 0) {
					System.out.println("�˻��� ���� ������ �����ϴ�.");
				} else {
//					boolean b = es.empFind(e);
//					if(b) { // ã������ ���� false �̰� �������
//						System.out.println("�˻��� ���� ������ �����ϴ�.");
//					}
					if(es.empFind(e)) {
						System.out.println("�˻��� ���� ������ �����ϴ�.");
					} // ���� ������ ���
				} //11 / �������ٷ� Service�� ����
				break;
			case 4:
				if(cnt == 0) {
					System.out.println("������ ���� ������ �����ϴ�.");
				} else {
					if(es.empDel(e)) {
						System.out.println("������ ���� ������ �����ϴ�.");
					} else { ///15 false �� = ������ �����ߴ�.
						cnt--;
					}
				} ///13 / �������ٷ� Service�� ����
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴� ��ȣ�� �����ϴ�.");
			}
		}
	}
}
