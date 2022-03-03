package Day03;

import java.util.Scanner;

public class Day03_7 {//cs

	public static void main(String[] args) //ms
	
	{
		boolean run = true; //실행 여부 변수 / true = 실행 false = 종료
		int balance = 0; // 예금액 [ 통장안에 있는 금액]		
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("|1.예금 | 2.출금 | 3.잔고 | 4.종료");		
			System.out.println("-----------------------------");
			System.out.print("선택 >");
			
			int put = scanner.nextInt();
			
			if(put==1) { //입력값이 1이면 실행
				System.out.println(" 예금액 : "); int 예금액 = scanner.nextInt();
				balance += 예금액; //입력받은 예금액을 통장에 추가
			}
			else if(put==2) { // 입력한 값이 2면 실행
				System.out.println("출금액 : "); int 출금액 = scanner.nextInt();		
				//출금액이 예금액 보다 더 크면 잔액부족
				if(출금액 > balance) {
					System.out.println("잔액부족");
				} 
				else {//아니면 출금
					balance -= 출금액;
				}
				
			}
			else if(put==3 ) { // 입력한 값이 3이면 실행
				
			} 
			else if(put==4) { // 읿력한 값이 4ㅣ면
				break;
			}
			else {
				System.out.println("알수 없는 번호 입니다.");
			
			}
		}

	}

}
