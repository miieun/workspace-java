package map_;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	ArrayList<String>playlist=new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	for(int i=0;i<3;i++) {
		System.out.println("곡 제목 입력 : ");
		String song=input.nextLine();
		playlist.add(song);
	}
	System.out.println("\n플레이리스트: ");
	for(String song : playlist) {
		System.out.println("-"+song);
	}
	System.out.println("\n삭제할 곡 제목 입력하세요: ");
	String songToRemove=input.nextLine();
	if(playlist.remove(songToRemove)) {
		System.out.println(songToRemove+" 곡이 삭제되었습니다");
	}else {
		System.out.println("곡을 찾을 수 없습니다");
	}
	System.out.println("\n업데이트 된 플레이리스트");
	for(String song : playlist) {
		System.out.println("-"+song);
	}
}
}