package ���ΰ���._05_����������;

import java.util.Random;
import java.util.Scanner;

public class �ι�° {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		Random random = new Random();
		
		int player;
		int com;
		int game = 0;
		int playerwin = 0;
		int comwin = 0;
		
		while(true) {
			System.out.println("�������̺�����))");
			System.out.println("0)���� 1)���� 2)�� 3)��� �� ����");
			
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("���))");
				System.out.printf("���� Ƚ�� : %d",game);
				if(playerwin > comwin) {
					System.out.println("�÷��̾��");
				}
				else if(playerwin < comwin) {
					System.out.println("��ǻ�� ��");
				}
				else {
					System.out.println("���º�");
				}
				break;
			}
			else if(player >= 0 && player <= 2) {
				if(player == 0 && com ==2 || player == 1 && com == 0 || player == 2 && com == 1) {
					System.out.println("�÷��̾� �¸�");
					playerwin ++;
				}
				else if(player == 0 && com == 0 || player == 1 && com == 1|| player ==2 && com ==2) {
					System.out.println("���º�");
				}
				else {
					System.out.println("��ǻ�� �¸�");
					comwin++;
				}
				game++;
			}
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
}
