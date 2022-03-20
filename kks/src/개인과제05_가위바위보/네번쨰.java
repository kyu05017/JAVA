package 개인과제05_가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 네번쨰 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int player;
		int com;
		int game =0;
		int pw = 0;
		int cw =0;
		
		while(true) {
			System.out.println("가위바위보 게임 ))");
			System.out.println("0)가위 1)바위 2)보 3) 종료 및 결과");
			System.out.print("입력 : \n");
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("게임결과)");
				System.out.printf("총게임 횟수 : %d" , game);
				if(pw > cw) {
					System.out.printf("플레이어 승리 이긴횟수 %d",pw);
				}
				else if(pw < cw) {
					System.out.printf("컴퓨터 승리 이긴횟수 %d",cw);
				}
				else {
					System.out.println("무승부");
				}
			}
			else if(player >= 0 && player <= 2) {
				if(player == 0 && com == 2 || player == 1 && com == 0 || player == 2 && com == 0) {
					System.out.println("플레이어 승리");
					pw++;
				}
				else if(player == 0 && com == 0  || player == 1 && com == 1 || player == 2 && com == 2 ) {
					System.out.println("무승부");
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
