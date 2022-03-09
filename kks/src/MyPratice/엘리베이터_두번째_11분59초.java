package MyPratice;

import java.util.Scanner;

public class 엘리베이터_두번째_11분59초 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nowFlooer = 1;
		String upBottn = "위로";
		String downBottn = "아래로";
		
		System.out.println("엘리베이터 프로그램");
		while(true) {
			System.out.println();
			System.out.println("현재 층수 " + nowFlooer + "층");
			System.out.println("엘리베이터를 호출 합니다.");
			System.out.println("올라갈지 내려갈지 겅합니다.");
			System.out.println("입력예시) 1/위로 2/아래로");
			
			String upDown = scanner.next();
			
			if(upDown.equals(upBottn) || upDown.equals("1")) {
				System.out.println("엘리베이터가 도착했습니다.");
				System.out.println("가고자 하는 층수를 입력하세요 (숫자 입력)");
				
				int floor = scanner.nextInt();
				
				switch (floor) {
				case 1: {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("1층으로 이동합니다.");
						nowFlooer = 1;
						break;
					}
					
				}
				case 2 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("2층으로 이동합니다.");
						nowFlooer = 2;
						break;
					}
					
				}
				case 3 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("3층으로 이동합니다.");
						nowFlooer = 3;
						break;
					}
					
				}
				case 4 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("4층으로 이동합니다.");
						nowFlooer = 4;
						break;
					}
					
				}
				case 5 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("5층으로 이동합니다.");
						break;
					}
					
				}
				default:
					
				}	
			}
			else if(upDown.equals(downBottn) || upDown.equals("2")) {
				System.out.println("엘리베이터가 도착했습니다.");
				System.out.println("가고자 하는 층수를 입력하세요 (숫자 입력)");
				
				int floor = scanner.nextInt();
				
				switch (floor) {
				case 1: {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("1층으로 이동합니다.");
						nowFlooer = 1;
						break;
					}
					
				}
				case 2 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("2층으로 이동합니다.");
						nowFlooer = 2;
						break;
					}
					
				}
				case 3 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("3층으로 이동합니다.");
						nowFlooer = 3;
						break;
					}
					
				}
				case 4 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("4층으로 이동합니다.");
						nowFlooer = 4;
						break;
					}
					
				}
				case 5 : {
					if(nowFlooer == floor) {
						System.out.println("현재층수랑 같습니다");
						break;
					}
					else {
						System.out.println("5층으로 이동합니다.");
						break;
					}
					
				}
				default:
					
				}	
			}
			else {
				System.out.println("존재하지 않는 기능입니다.");
			}
		}
	}
}
