package Quiz02;

import java.util.Scanner;

public class AaaMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AaaService as = new AaaService();
		// 기능 실행에 필요한 메서드 클래스 객체 생성
		Aaa a[] = new Aaa[5];
		// 저장한 전화번호 갯수 카운터
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
