package 개인과제01_2라면;

import java.util.Scanner;

public class 라면만들기_5번째 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		while(true) {
			System.out.println("   라면 만들기");
			System.out.println("-----------------");
			System.out.println("라면을 끓입니까?");
			int ch = scanner.nextInt();
			if (ch == 1	) {
				System.out.println("라면을 끓입니다.");
				System.out.println("물을 넣습니다 얼마만큼의 물을 넣겠습니까?");
				bowl.water = scanner.next();
				
				System.out.printf("%s 만믙의 물을 넣었습니다.",bowl.water);
				System.out.println("라면이 끓고 있습니다. 면과 스프를 넣겠습니까?");
				System.out.println("네/아니요");
				String tesk1 = scanner.next();
				if(tesk1.equals("네")) {
					System.out.println("라면이 익어 갑니다.");
					System.out.println("계란을 넣습니까?");
					bowl.ramen = "넣음";
					bowl.soup = "넣음";
					String tesk2 = scanner.next();
					
					if(tesk2.equals("네")) {
						System.out.println("계란을 넣었습니다.");
						bowl.egg = "넣음";
					}
					else {
						System.out.println("계란을 넣지 않았습니다.");
						bowl.egg = "없음";
					}
					if (bowl.egg == null) {
						System.out.println("라면이 완성되었습니다.");
						System.out.printf("재료) 물 %s 면 %s 스프 %s 계란 %s \n" ,bowl.water,bowl.ramen
								,bowl.soup,bowl.egg);
						bowl = null;
					}
					else {
						System.out.println("라면이 완성되었습니다.");
						System.out.printf("재료) 물 %s 면 %s 스프 %s 계란 %s \n" ,bowl.water+"ml",bowl.ramen
								,bowl.soup,bowl.egg);
						bowl = null;
					}
				}
				else {
					System.out.println("냄비가 타버렸습니다.");
					bowl.water = null;
				}
				
			}
			else {
				System.out.println("라면끓이기를 종료했습니다.");
				break;
			}
		}
		
	}

}