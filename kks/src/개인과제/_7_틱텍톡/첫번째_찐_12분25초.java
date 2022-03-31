package 개인과제._7_틱텍톡;

import java.util.Random;
import java.util.Scanner;

public class 첫번째_찐_12분25초 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] pad = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		String win = "";
		String my = "[O]";
		String com = "[X]";
		int conut = 0;
		
		while(true) {
			
			for(int i = 0; i < pad.length;i++) {
				System.out.print(pad[i]);
				if(i%3==2)System.out.println();
			}
			while(true) {
				System.out.println("위치선택");
				int p = scanner.nextInt();
				if(pad[p].equals("[ ]")) {
					pad[p] = my;
					break;
				}
				else {
					System.out.println("이미 선점된 자리 입니다.");
				}
			}
			while(true) {
				int cp = random.nextInt(9);
				if(pad[cp].equals("[ ]")) {
					pad[cp] = com;
					conut +=1;
					break;
				}
			}
			for(int i = 0; i <= 6; i++) {
				if(pad[i].equals(pad[i+1]) && pad[i+1].equals(pad[i+2])) {
					win = pad[i];
				}
			}
			for(int i = 0; i <= 2; i++) {
				if(pad[i].equals(pad[i+3]) && pad[i+3].equals(pad[i+6])) {
					win = pad[i];
				}
			}
			if(pad[0].equals(pad[4]) && pad[4].equals(pad[8])) {
				win = pad[0];
			}
			if(pad[2].equals(pad[4]) && pad[4].equals(pad[6])) {
				win = pad[2];
			}
			boolean draw = false;
			
			if(conut == 4) {
				draw = true;
			}
			
			if(win.equals(my)) {
				System.out.println("플레이어 승리");
				break;
			}
			if(win.equals(com)) {
				System.out.println("컴퓨터 승리");
				break;
			}
			if(draw == true) {
				System.out.println("무승부");
				break;
			}
		}
		for(int i = 0; i < pad.length ; i++) {
			System.out.print(pad[i]);
			if(i%3==2) {
				System.out.println();
			}
		}
	}
}
