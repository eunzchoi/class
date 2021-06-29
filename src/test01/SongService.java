package test01;

import java.util.List;
import java.util.Scanner;

public class SongService {
	Scanner sc = new Scanner(System.in);
	public int menu(Song playSong, boolean stop) {
		// TODO Auto-generated method stub
		if(playSong.getTitle() !=null && stop == false) {
			System.out.println("▶ " + playSong.getTitle()
					+" : "+playSong.getSinger());
		} else if (playSong.getTitle() !=null && stop == true) {
			System.out.println("■ "+ playSong.getTitle()
					+" : "+playSong.getSinger());
		}
		System.out.println("1. 노래 재생");
		System.out.println("2. 다음 곡");
		System.out.println("3. 이전 곡");
		System.out.println("4. 노래 저장");
		System.out.println("5. 노래 목록");
		System.out.println("6. 노래 정지");
		System.out.println("0. 프로그램 종료");
		System.out.println(">> 선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	public Song playSong(List<Song> s, Song playSong) {
		// TODO Auto-generated method stub
		if(playSong.getSinger() == null) {
			playSong = s.get(0);
		}
		return playSong;
	}
	public void insertSong(List<Song> s) {
		// TODO Auto-generated method stub
		Song ss = new Song();
		System.out.println("노래 제목 입력 : ");
		ss.setTitle(sc.next());
		System.out.println("가수 이름 입력 : ");
		ss.setSinger(sc.next());
		
		s.add(ss);
	}
	public Song nextSong(List<Song> s, Song playSong) {
		// TODO Auto-generated method stub
		int index = s.indexOf(playSong)+1;
		if(index == s.size()) {
			playSong = s.get(0);
		} else {
			playSong = s.get(index);
		}
		playSong = s.get(index+1);
		return playSong;
	}
	public Song prevSong(List<Song> s, Song playSong) {
		// TODO Auto-generated method stub
		int index = s.indexOf(playSong)-1;
		if(index == -1) {
			playSong = s.get(s.size()-1);
		} else {
			playSong = s.get(index);
		}
		return playSong;
	}
	public void outputSong(List<Song> s) {
		// TODO Auto-generated method stub
		int cnt = 1;
		for(Song ss :s) {
			System.out.println("### "+cnt+"번 ###");
			System.out.println("노래 제목 : "+ss.getTitle());
			System.out.println("가수 이름 : "+ss.getSinger());
			cnt++;
		}
	}
	public boolean stopSong(Song playSong) {
		// TODO Auto-generated method stub
		System.out.println(playSong.getTitle()
				+ "을(를) 정지합니다.");
		return true;
	}
	
}
