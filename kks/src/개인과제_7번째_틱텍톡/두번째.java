package ���ΰ���_7��°_ƽ����;

import java.util.Random;
import java.util.Scanner;

public class �ι�° {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] pad = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		String win = "";
		int comturn = 0;
		
		while(true) {
			
			for(int i = 0; i < pad.length; i++) {
				System.out.print(pad[i]);
				if(i%3==2)System.out.println();
			}
			while(true) {
				System.out.println("��ġ ����");
				int p = scanner.nextInt();
				if(pad[p].equals("[ ]")) {
					pad[p] = "[O]";
					break;
				}
				else {
					System.out.println("�̹� �ִ� �ڸ��Դϴ�.");
				}
			}
			while(true) {
				int cp = random.nextInt(9);
				if(pad[cp].equals("[ ]")) {
					pad[cp] = "[X]";
					comturn +=1;
					break;
				}
			}
			
			for(int i = 0;i <= 6; i++) {
				if(pad[i].equals(pad[i+1])&&pad[i+1].equals(pad[i+2])) {
					win = pad[i];
				}
			}
			for(int i = 0; i <= 2; i++) {
				if(pad[i].equals(pad[i+3]) && pad[i].equals(pad[i+6])) {
					win = pad[i];
				}
			}
			if(pad[0].equals(pad[4]) && pad[4].equals(pad[6])) {
				win = pad[0];
			}
			if(pad[2].equals(pad[4]) && pad[4].equals(pad[6])) {
				win = pad[2];
			}
			
			boolean draw = false;
			
			for(int i = 0; i < pad.length;i++) {
				if(comturn == 4) {
					if(pad[i].equals("[ ]")) {
						draw = true;
						break;
					}
				}
			}
			
			if(win .equals("[o]")) {
				System.out.println("�÷��̾� �¸�");
				break;
			}
			if(win.equals("[X]")) {
				System.out.println("��ǻ�� �¸�");
			}
			if(draw==true) {
				System.out.println("���º�");
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
