package test01;

import java.util.Scanner;

public class TelBookService {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. 입력 2. 출력 3. 삭제 0. 프로그램 종료");
		
		int select = sc.nextInt();
		return select;
	}
	
	public void input(TelBook t[]) {
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				t[i] = new TelBook();
				
				System.out.println("이름 입력 : ");
				t[i].setName(sc.next());
				System.out.println("전화번호 입력 : ");
				t[i].setTelNum(sc.nextInt());
				System.out.println("이메일 입력 : ");
				t[i].setemail(sc.next());
				System.out.println("생년월일 입력 : ");
				t[i].setbirth(sc.nextInt());
				break;
			}
		}
	}
	
	public void print(TelBook t[]) {
		System.out.println("출력할 전화번호 입력 : ");
		int printNum = sc.nextInt();
		
		boolean b = true;
		
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				continue;
			}
			if(t[i].getTelNum() == printNum) {
				System.out.println("이름 : " + t[i].getName());
				System.out.println("전화번호 : " + t[i].getTelNum());
				System.out.println("이메일 : " + t[i].getemail());
				System.out.println("생년월일 : " + t[i].getbirth());
				b = false;
				break;
			}
		}
		if(b) {
			System.out.println("입력한 전화번호는 존재하지 않습니다.");
		}
	}
	
	public int delete(TelBook t[], int cnt) {
		System.out.println("삭제할 전화번호 입력 : ");
		int delNum = sc.nextInt();
		boolean c = true;
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				continue;
			}
			if(t[i].getTelNum() == delNum) {
				System.out.println(t[i].getName() + " 님을 삭제합니다.");
				t[i] = null;
				cnt--;
				c = false;
				break;
			}
			if(c) {
				System.out.println("입력한 전화번호는 존재하지 않습니다.");
			}
			return cnt;
		}
		return cnt;
	}
}
