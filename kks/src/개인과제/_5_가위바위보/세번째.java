package ���ΰ���._5_����������;

import java.util.Random;
import java.util.Scanner;

public class ����° {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int player;
		int com;
		int game = 0;
		int playerwin = 0;
		int comwin = 0;
		
		while(true) {
			System.out.println("����������))");
			System.out.println("0)���� 1)���� 2)�� 3)����� ���");
			System.out.print("�Է� :");
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("�˸�)) ��������");
				System.out.printf("����Ƚ�� : %d" ,game);
				if(playerwin > comwin) {
					System.out.printf("�÷��̾� �¸� �̱�Ƚ�� : %d",playerwin);
				}
				else if(playerwin < comwin ) {
					System.out.printf("��ǻ�� �¸� �̱�Ƚ�� : %d",comwin);
				}
			}
			else if(player >= 0 && player <= 0) {
				if(player == 0 && com == 2 || player == 1 && com == 0|| player == 2 && com == 1) {
					System.out.println("�÷��̾� �¸�");
					playerwin++;
					
				}
				else if(player == 0 && com == 0 || player == 1 && com == 1 || player == 2 && com == 2) {
					System.out.println("���º� �Դϴ�");
				}
				else {
					System.out.println("��ǻ�� �¸�");
					comwin ++;
				}
				game ++;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
