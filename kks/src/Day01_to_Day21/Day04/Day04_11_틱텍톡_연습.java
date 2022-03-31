package Day01_to_Day21.Day04;

import java.util.Random;
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
		
		String[] gamePad = { "[ ]", "[ ]", "[ ]" ,
						     "[ ]", "[ ]", "[ ]" , 
						     "[ ]", "[ ]", "[ ]" };
		String win = "";
		int myturn = 0;
		int comturn = 0;
		
		
		while(true) {
			//게임판 출력
			for(int i = 0; i < gamePad.length; i++) {
				//i는 게임패드[0~8] 9까지 1씩 증가하며 반복
				System.out.print(gamePad[i]);
				//인덱스 번호가 2 5 8이먄 줄바꿈
				if( i % 3 == 2 ) {
					System.out.println();
				}
			}
			//플레이어 위치 선택
			while( true ) {
				System.out.print("위치 선택");
				int point = scanner.nextInt(); 
				if( gamePad[point].equals("[ ]")) {
					// 선택한 위치가 공백이면 O 알 두기 
					gamePad[point] = "[O]";
					myturn +=1;
					break;	// 가장 가까운 반복문 탈출;
				}else {
					System.out.println(" 알림)) 해당 위치에 이미 알이 존재. [ 재 선택 ] ");
				}
			}
			//컴퓨터 위치선택
			while(true) {
				Random random = new Random();
				int cumPoint = random.nextInt(9);
				if(gamePad[cumPoint].equals("[ ]")) {
					gamePad[cumPoint] = "[X]";
					comturn +=1;
					break;
				}
			}
			
			//가로로 승리
			
			for(int i = 0; i <= 6; i+=3) {
				if(gamePad[i].equals(gamePad[i+1]) && gamePad[i+1].equals(gamePad[i+2])) {
				//i가 0일때 인덱스0이 1과 같으면서 1일때 2와 같은경우
				//i가 3일때 인데스3이 4와 같으면서 4일때 5와 같은경우
				//i가 6일때 인데스6이 7과 같으면서 7일대 8과 같은경우
				win = gamePad[i];//동일한 알으 승리알 변수에 대입
				}
			}
			//세로로 승리
			for(int i = 0; i <= 2; i++) {
				if(gamePad[i].equals(gamePad[i+3]) && gamePad[i+3].equals(gamePad[i+6])) {
				//i가 0일때 인덱스 0이 3과 같으면서 3이 6이랑 동일한 경우
				//i가 1일때 인덱스 1이 4와 같으면서 4가 7이랑 동일한 경우
				//i가 2일때 인덱스 2가 5와 같으면서 5가 8이랑 동일한 경우
					win = gamePad[i];
				}
			}
			if( gamePad[0].equals(gamePad[4]) && gamePad[4].equals(gamePad[8] )) {
				win = gamePad[0];
			}
			if( gamePad[2].equals(gamePad[4]) && gamePad[4].equals(gamePad[6] )) {
				win = gamePad[2];
			}
						//무승부
			boolean draw = false;
			
			for(int i = 0; i < gamePad.length; i++) {
				if(comturn == 4)
				{
					if (gamePad[i].equals("[ ]")) {
						draw = true;
						break;
					}
				}
				
			}
						
						/////////////////////////// 4. 게임종료 //////////////////////////////
			if( win.equals("[O]") ) { 
				System.out.println(" 알림)) 플레이어 승리"); 
				break; // 게임종료 
			}
			if( win.equals("[X]") ) {
				System.out.println(" 알림)) 컴퓨터 승리");
				break; // 게임종료
			}
			if (draw == true) {
				System.out.println("알림)) 비겼습니다");
				break;
			}
		}//w e
		
		for( int i = 0 ; i<gamePad.length; i++ ) {
			System.out.print( gamePad[i] );
			// 인덱스 2 5 8 이면 줄바꿈 
			if( i % 3 == 2 ) System.out.println();
		}
		
	}//m e
}// c e
