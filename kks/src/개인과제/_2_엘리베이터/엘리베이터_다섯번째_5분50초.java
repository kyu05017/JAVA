package 개인과제._2_엘리베이터;

import java.util.Scanner;

public class 엘리베이터_다섯번째_5분50초 {

	public static void main(String[] args) {
		//입력객체
		Scanner scanner = new Scanner(System.in);
		//현재층수를 선언후 1로 초기화
		int nowFloor = 1;
		
		//무한 반복문 종료는 없음
		while(true) {
			System.out.println();
			System.out.println("엘리베이터");
			//while문의 반복으로 대입받은 nowfloor를 현재층수로 나타냄
			System.out.println("현재층수" + nowFloor +"층");
			
			//원하는 층수를 입력받음
			int floor = scanner.nextInt();
			
			//입력받을때 조건에 부합해야 다음으로 이동
			while(true) {
				System.out.println("원하는 층수를 입력하세요 (숫자입력)");
				//입력한 층수와 현재층수가 같다면 다시 입력하게끝함
				if(floor == nowFloor) {
					System.out.println("현재 층수 입니다.");
				}
				//입력한 층수가 현재층수보다 크다면 종료하고 스위치로 이동
				else if(floor > nowFloor) {
					System.out.println("위로 갑니다");
					break;
				}
				//입력한 층수가 현재층수보다 작다면 종료하고 스위치로 이동
				else if(floor < nowFloor){
					System.out.println("아래로 갑니다.");
					break;
				}
				else { // 없는 번호일 경우 다시입력을 받음
					System.out.println("잘못된 입력입니다.");
				}
			}
			//층수를 선언하기 위한 스위치문
			switch(floor) {
				case 1 : {//1층일 경우 nowfloor에 1을 대입하고 종료
					System.out.println("1층으로 이동합니다");
					nowFloor = 1;
					break;
				}
				case 2 : {//2층일 경우 nowfloor에 2를 대입하고 종료
					System.out.println("2층으로 이동합니다");
					nowFloor = 2;
					break;
				}
				case 3 : {// 3층일 경우 nowfloor에 3을 대입하고 종료
					System.out.println("3층으로 이동합니다.");
					nowFloor = 3;
					break;
				}
				case 4 : {//4층일 경우 nowfloor에 4를 대입하고 종료
					System.out.println("4층으로 이동합니다.");
					nowFloor = 4;
					break;
				}
				case 5 : {//5층일 경우 nowfloor에 5를 대입하고 종료
					System.out.println("5층으로 이동합니다.");
					nowFloor = 5;
					break; 
				}
				default : {
					System.out.println("존재하지 않는 층수 입니다.");
					break; 
				}
			
			}
		}
	}

}
