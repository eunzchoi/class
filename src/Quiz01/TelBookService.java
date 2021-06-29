package Quiz01;

import java.util.Scanner;

public class TelBookService {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. 입력 2. 출력 3. 삭제 0. 프로그램 종료");
//		int menu = sc.nextInt();
//		return menu;
		return sc.nextInt();
	}
	
	public TelBook input() {
		TelBook t = new TelBook();
		System.out.println("이름 입력 : ");
		t.setName(sc.next());
		System.out.println("전화번호 입력 : ");
		t.setTelnum(sc.next());
		System.out.println("이메일 입력 : ");
		t.setEmail(sc.next());
		System.out.println("생년월일 입력 : ");
		t.setBirth(sc.next());
		
		return t;
	}
	
	public void output(TelBook t[]) {
		for(int i=0;i=t.length;i++) {
			if(t[i] == null) {
				continue;
			} else {
				System.out.println("이름 : " + t[i].getName());
				System.out.println("전화번호 : " + t[i].getTelnum());
				System.out.println("이메일 : " + t[i].getEmail());
				System.out.println("생년월일 : " + t[i].getBirth());
				System.out.println();
			}
		}
	}
	
	public int delete(TelBook t[], int cnt) {
		System.out.println("검색할 이름 입력 : ");
		String findName = sc.next();
		
		boolean b = true;
		for(int i=0;i<t.length;i++) {
			if(t[i] == null) {
				continue;
			} else if (t[i].getName().equals(findName)) {
				System.out.println(findName + " 님의 정보를 삭제합니다.");
				t[i] = null;
				b = false;
				cnt--;
				break;
			}
		}
		if(b) {
			System.out.println("검색한 이름이 존재하지 않습니다.");
		}
		return cnt;
	}
}
