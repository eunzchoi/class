package test01;

import java.util.ArrayList;
import java.util.List;

public class SongMain {
	public static void main(String[] args) {
		// 노래 저장하는 ArrayList 생성
		List<Song> s = new ArrayList<Song>();
		// 기능을 구현한 객체를 생성
		SongService ss = new SongService();
		// 재생 정지를 기억하는 변수
		boolean stop = false;
		
		// 곡 저장 방식
		// 1. 객체 저장
		// 2. 인덱스번호 저장
		
		// 첫번째 방법
		Song playSong = new Song();
		
		while(true) {
			int menu = ss.menu(playSong,stop);
			
			switch(menu) {
			case 1:
				playSong = ss.playSong(s, playSong);
				stop = false;
				break;
			case 2:
				playSong = ss.nextSong(s, playSong);
				break;
			case 3:
				playSong = ss.prevSong(s, playSong);
				break;
			case 4:
				ss.insertSong(s);
				break;
			case 5:
				ss.outputSong(s);
				break;
			case 6:
				stop = ss.stopSong(playSong);
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
