package ���ΰ���._05_����������;

import java.util.Random;
import java.util.Scanner;

public class �ټ���° {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int player;
		int com;
		int game = 0;
		int pw = 0;
		int cw = 0;
		
		while(true) {
			System.out.println("����������))");
			System.out.println("0)���� 1)���� 2)�� 3)���� �� ���");
			System.out.print("�Է� :");
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("���))");
				System.out.println("����Ƚ�� "+ game);
				if(pw > cw) {
					System.out.println("�÷��̾� �¸� �̱�� : "+ pw);
				}
				else if(pw < cw) {
					System.out.println("��ǻ�� �¸� �̱�� : "+ cw);
				}
				else {
					System.out.println("���º� �Դϴ�.");
				}
			}
			else if(player >=0 && player <= 2) {
				if(player == 0 && com == 2 || player == 1 && com == 0 || player == 2 && com == 0) {
					System.out.println("�÷��̾�¸�");
					pw++;
				}
				else if(player == 0 && com ==0|| player ==1 && com ==1 || player ==2 && com ==0) {
					
					System.out.println("���º� �Դϴ�.");
				}
				else {
					System.out.println("��ǻ�� �¸�");
					cw++;
				}
				game++;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
