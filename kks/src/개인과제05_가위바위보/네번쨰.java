package ���ΰ���05_����������;

import java.util.Random;
import java.util.Scanner;

public class �׹��� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int player;
		int com;
		int game =0;
		int pw = 0;
		int cw =0;
		
		while(true) {
			System.out.println("���������� ���� ))");
			System.out.println("0)���� 1)���� 2)�� 3) ���� �� ���");
			System.out.print("�Է� : \n");
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("���Ӱ��)");
				System.out.printf("�Ѱ��� Ƚ�� : %d" , game);
				if(pw > cw) {
					System.out.printf("�÷��̾� �¸� �̱�Ƚ�� %d",pw);
				}
				else if(pw < cw) {
					System.out.printf("��ǻ�� �¸� �̱�Ƚ�� %d",cw);
				}
				else {
					System.out.println("���º�");
				}
			}
			else if(player >= 0 && player <= 2) {
				if(player == 0 && com == 2 || player == 1 && com == 0 || player == 2 && com == 0) {
					System.out.println("�÷��̾� �¸�");
					pw++;
				}
				else if(player == 0 && com == 0  || player == 1 && com == 1 || player == 2 && com == 2 ) {
					System.out.println("���º�");
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
