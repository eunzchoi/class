package Quiz02;

import java.util.Scanner;

public class AaaMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AaaService as = new AaaService();
		// ��� ���࿡ �ʿ��� �޼��� Ŭ���� ��ü ����
		Aaa a[] = new Aaa[5];
		// ������ ��ȭ��ȣ ���� ī����
		int cnt = 0;
		
		while(true) {
			int menu = as.menu();
			
			switch(menu) {
			case 1:
			case 2:
			case 3:
			case 0:
			}
		}
	}
}
