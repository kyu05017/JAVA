package 개인과제._05_가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 다섯번째 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int player;
		int com;
		int game = 0;
		int pw = 0;
		int cw = 0;
		
		while(true) {
			System.out.println("가위바위보))");
			System.out.println("0)가위 1)바위 2)보 3)종료 및 결과");
			System.out.print("입력 :");
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("결과))");
				System.out.println("게임횟수 "+ game);
				if(pw > cw) {
					System.out.println("플레이어 승리 이긴수 : "+ pw);
				}
				else if(pw < cw) {
					System.out.println("컴퓨터 승리 이긴수 : "+ cw);
				}
				else {
					System.out.println("무승부 입니다.");
				}
			}
			else if(player >=0 && player <= 2) {
				if(player == 0 && com == 2 || player == 1 && com == 0 || player == 2 && com == 0) {
					System.out.println("플레이어승리");
					pw++;
				}
				else if(player == 0 && com ==0|| player ==1 && com ==1 || player ==2 && com ==0) {
					
					System.out.println("무승부 입니다.");
				}
				else {
					System.out.println("컴퓨터 승리");
					cw++;
				}
				game++;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
