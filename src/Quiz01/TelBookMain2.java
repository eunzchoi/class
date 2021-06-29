package Quiz01;

import java.util.Scanner;

public class TelBookMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 전화번호 5개 저장 배열 생성
		TelBook t[] = new TelBook[5];
		// 저장한 전화번호 갯수 카운터
		int cnt = 0;
		
		while(true ) {
			
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("더이상 입력할 수 없습니다.");
				} else {
					t[cnt] = new TelBook();
					System.out.println("이름 입력 : ");
					t[cnt].setName(sc.next());
					System.out.println("전화번호 입력 : ");
					t[cnt].setTelnum(sc.next());
					System.out.println("이메일 입력 : ");
					t[cnt].setEmail(sc.next());
					System.out.println("생년월일 입력 : ");
					t[cnt].setBirth(sc.next());
					cnt++;
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("출력할 전화번호가 없습니다.");
				} else {
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
				break;
			case 3:
				if(cnt==0) {
					System.out.println("삭제할 전화번호가 없습니다.");
				} else {
					System.out.println("검색할 이름 입력 : ");
					String findName = sc.next();
					
					boolean b = true;
					for(int i=0;i<t.length;i++) {
						if(t[i] == null) {
							continue;
						} else if (t[i].getName().equals(findName)) {
							System.out.println(findName + " 님의 정보를 삭제합니다.");
							t[i] = null;
							cnt--;
							b = false;
							break;
						}
					}
					if(b) {
						System.out.println("검색한 이름이 존재하지 않습니다.");
					}
							
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴 번호입니다.");
			}
		}
		
	}
}
