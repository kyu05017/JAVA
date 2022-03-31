package 개인과제._2_엘리베이터;

import java.util.Scanner;

public class 엘리베이터_세번째_7분6초 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nowFloor = 1;
		String upBotton = "위로";
		String downBotton = "아래로";
		
		while(true) {
			System.out.println("");
			System.out.println("현재 층수" + nowFloor + "층");
			System.out.println("가고자하는 방향을 선택해주세요");
			System.out.println("입력예시) 위로/1 아래로/2");
			String updown = scanner.next();
			if(updown.equals(upBotton) || updown.equals("1")) {
				System.out.println("위로 가는 엘리베이터를 호출했습니다.");
				System.out.println("원하는 층수를 입력하세요 (숫자)");
				int floor = scanner.nextInt();
				
				if(nowFloor == floor) {
					System.out.println("현재 층이랑 같습니다.");
				}
				else {
					switch(floor) {
						case 1 : {
							System.out.println("1층으로 이동했습니다.");
							nowFloor = 1;
							break;
						}
						case 2 : {
							System.out.println("2층으로 이동했습니다.");
							nowFloor = 2;
							break;
						}
						case 3 : {
							System.out.println("3층으로 이동했습니다.");
							nowFloor = 3;
							break;
						}
						case 4 : {
							System.out.println("4층으로 이동했습니다.");
							nowFloor = 4;
							break;
						}
						case 5 : {
							System.out.println("5층으로 이동했습니다.");
							nowFloor = 5;
							break;
						}
					}
				}
			}
			else if(updown.equals(downBotton) || updown.equals("2")) {
				System.out.println("아래로 가는 엘리베이터를 호출했습니다.");
				System.out.println("원하는 층수를 입력하세요 (숫자)");
				int floor = scanner.nextInt();
				
				if(nowFloor == floor) {
					System.out.println("현재 층이랑 같습니다.");
				}
				else {
					switch(floor) {
						case 1 : {
							System.out.println("1층으로 이동했습니다.");
							nowFloor = 1;
							break;
						}
						case 2 : {
							System.out.println("2층으로 이동했습니다.");
							nowFloor = 2;
							break;
						}
						case 3 : {
							System.out.println("3층으로 이동했습니다.");
							nowFloor = 3;
							break;
						}
						case 4 : {
							System.out.println("4층으로 이동했습니다.");
							nowFloor = 4;
							break;
						}
						case 5 : {
							System.out.println("5층으로 이동했습니다.");
							nowFloor = 5;
							break;
						}
					}
				}

			}
			else {
				System.out.println("없는 방향입니다.");
			}
		}
	}

}
