package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_12_틱텍톡_연습2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] gamePad = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		String win = "";
		
		while(true) {
			for(int i = 0; i < gamePad.length; i++) {
				System.out.print(gamePad[i]);
				if(i%3 == 2) {
					System.out.println();
				}
			}
			while(true) {
				System.out.println(" 위치선택 ");
				int point = scanner.nextInt();
				if (gamePad[point].equals("[ ]")) {
					gamePad[point] = "[O]";
					break;
				}
				else {
					System.out.println("이미 위치에 알이 존재합니다.");
				}
			}
			while(true) {
				Random random = new Random(); // 1. 난수 객체 생성 
				int 위치 = random.nextInt(9); // 2. 0~8 사이의 난수 int형으로 가져오기 
				if( gamePad[위치].equals("[ ]") ) { // 3. 해당 난수위치가 공백이면 
					// 난수 위치에 공백이면 X 알 두기 
					gamePad[위치]="[X]"; break;	 // 4. 알을 두었으면 반복문 탈출
				}
			}
			
		}//첫번째 while 끝
		

		
	}//m e
}//c e
