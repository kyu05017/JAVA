package 개인과제._02_엘리베이터;

import java.util.Scanner;

public class 엘리베이터_첫번째_19분45초 {
	
	
	public static void main(String[] args) {
		/*
		 * 엘리베이터 설계
		 * 1. 층수 지상5층
		 * 		1. 이용자기준
		 * 			1. 올라갈지 내려갈지를 결정
		 * 			2. 층수를 결정 
		 * 			3. 내림
		 * 			
		 */
		Scanner scanner = new Scanner(System.in);
		int nowFloor = 1;
		System.out.println("엘리베이터 프로그램");
		while(true) {
			
			System.out.println();
			System.out.println("엘리베이터를 호출합니다");
			System.out.println("상층 또는 하층을 선택하세요");
			System.out.println("입력예시) 위로/1 아래로/2");
			System.out.println();
			
			String upDonw = scanner.next();
			
			if(upDonw.equals("위로") || upDonw.equals("1")) {
				System.out.println("엘리베이터가 도착했습니다");
				System.out.println("올라갑니다");
				System.out.println("층수를 정해주세요");
				
				int upFloor = scanner.nextInt();
				
				switch (upFloor) {
				case 1: {
					if(nowFloor == upFloor) {
						System.out.println("현재층수랑 같습니다.");
						System.out.println();
						break;
					}
					else {
						System.out.println("1층으로 이동합니다");
						nowFloor = 1;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 2: {
					if(nowFloor == upFloor) {
						System.out.println("현재층수랑 같습니다.");
					}
					else {
						System.out.println("2층으로 이동합니다");
						nowFloor = 2;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 3: {
					if(nowFloor == upFloor) {
						System.out.println("현재층수랑 같습니다.");
						break;
					}
					else {
						System.out.println("3층으로 이동합니다");
						nowFloor = 3;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 4: {
					if(nowFloor == upFloor) {
						System.out.println("현재층수랑 같습니다.");
						break;
					}
					else {
						System.out.println("4층으로 이동합니다");
						nowFloor = 4;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 5: {
					if(nowFloor == upFloor) {
						System.out.println("현재층수랑 같습니다.");
						break;
					}
					else {
						System.out.println("5층으로 이동합니다");
						nowFloor = 5;
						System.out.println("내렸습니다.");
						break;
					}
				}
				default:
					System.out.println("존재하지 않는 층수 입니다.");
					break;
				}//sw e
				
			}//if e
			else if(upDonw.equals("아래로") || upDonw.equals("2")) {
				System.out.println("엘리베이터가 도착했습니다");
				System.out.println("내려갑니다");
				System.out.println("층수를 정해주세요");
				
				int downFloor = scanner.nextInt();
				
				switch (downFloor) {
				case 1: {
					if(nowFloor == downFloor) {
						System.out.println("현재층수랑 같습니다.");
						System.out.println();
						break;
					}
					else {
						System.out.println("1층으로 이동합니다");
						nowFloor = 1;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 2: {
					if(nowFloor == downFloor) {
						System.out.println("현재층수랑 같습니다.");
					}
					else {
						System.out.println("2층으로 이동합니다");
						nowFloor = 2;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 3: {
					if(nowFloor == downFloor) {
						System.out.println("현재층수랑 같습니다.");
						break;
					}
					else {
						System.out.println("3층으로 이동합니다");
						nowFloor = 3;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 4: {
					if(nowFloor == downFloor) {
						System.out.println("현재층수랑 같습니다.");
						break;
					}
					else {
						System.out.println("4층으로 이동합니다");
						nowFloor = 4;
						System.out.println("내렸습니다.");
						break;
					}
				}
				case 5: {
					if(nowFloor == downFloor) {
						System.out.println("현재층수랑 같습니다.");
						break;
					}
					else {
						System.out.println("5층으로 이동합니다");
						nowFloor = 5;
						System.out.println("내렸습니다.");
						break;
					}
				}
				default:
					System.out.println("존재하지 않는 층수 입니다.");
					break;
				}//sw e
			}
		}//w e
	}// m e
}//c e
