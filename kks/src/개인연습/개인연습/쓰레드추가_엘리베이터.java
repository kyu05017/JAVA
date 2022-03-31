package 개인연습.개인연습;

import java.util.Scanner;

public class 쓰레드추가_엘리베이터 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);
		int up_Down = 0;
		int floor = 0;
		
		while(true) {
			System.out.println("엘리베이터))");
			
			System.out.println("현재 계신층을 입력하세요");
			int now_Floor = in.nextInt();
			
			System.out.println("위/ 아래 중 가실 방향을 입력하세요.");

			String input_UpDowm = in.next();
			if(input_UpDowm.equals("위")) {
				up_Down = 1;
				
			}
			else if(input_UpDowm.equals("아래로")) {
				up_Down = -1;
			}
			
			Thread.sleep(3000);
			System.out.println("엘리베이턱 도착했습니다.");
			System.out.println("가실 층을 입력하세요.");
			
			int go_Floor = in.nextInt();
			
			if(go_Floor == now_Floor) {
			System.out.println("현재 같은층에 있습니다.");
			}
			else if(now_Floor < go_Floor) {
				
				System.out.println(go_Floor+"층으로 이동합니다.");
				
				floor = go_Floor;
			}
			else if(now_Floor > go_Floor) {
				
				System.out.println(go_Floor+"층으로 이동합니다.");
				
				floor = go_Floor;
			}
		
			
			
			
		}
		
		
	}
}
