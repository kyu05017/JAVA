package Day04;

import java.util.Scanner;

public class Day04_11_틱텍톡_연습 {// c s
	
	public static void main(String[] args) {
		/*
		 * 삼목 게임 [ 틱택토 게임 ]
				1. 게임판 9칸 생성 
					1. String[] 배열 = new String[9]
			
				2. 사용자에게 0~8 인덱스번호 입력받기
					1. 해당 인덱스에 O 표시
					2. 이미 둔 자리는 재 입력 
			
				3. 컴퓨터는 0~8 사이 난수 발생 
					1. 해당 인덱스에 X 표시
					2. 이미 둔 자리는 재 난수 생성  
			
				4. 승리판단 
					가로 인덱스들의 모양이 모두 동일하면
					012 345 678
						첫번째 인덱스가 0부터 6까지 3씩증가
							두번 : 첫번째+1
	 						세번 : 첫번째+2 
					세로 인덱스들의 모양이 모두 동일하면 
					036 147 258
						첫번째 인덱스가 0부터 2까지 1씩증가 
							두번째 : 첫번째+3
							세번째 : 첫번+6
					대각선 인덱스들의 모양이 모두 동일하면 
					048 246
		 */
		Scanner scanner = new Scanner(System.in);
		String[] gamePad = new String[9];
		
		while(true) {
			
			System.out.println("["+gamePad[0]+"] ["+gamePad[1]+"] ["+gamePad[2]+"]");
			System.out.println("["+gamePad[3]+"] ["+gamePad[4]+"] ["+gamePad[5]+"]");
			System.out.println("["+gamePad[6]+"] ["+gamePad[7]+"] ["+gamePad[8]+"]");
			
		}
		
		
	}
}// c e
