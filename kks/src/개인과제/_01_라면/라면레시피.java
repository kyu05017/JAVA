package 개인과제._01_라면;

import java.util.Scanner;

public class 라면레시피 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		while(true) {
			System.out.println("라면 레시피");
			
			System.out.println("라면을 끓입니다.");
			System.out.println("넣을 물의 량을 입력하세요");
			bowl.water = scanner.next();
			
			System.out.printf("%s 만큼의 물을 넣었습니다." , bowl.water);
			
			System.out.println("물이 끓습니다. 면과 스프를 넣을까요?");
			System.out.println("네/아니여");
			String tesk = scanner.next();
			if(tesk.equals("네")) {
				System.out.println("라면이 거의 완성 되었습니다");
				bowl.ramen = "넣음";
				bowl.soup = "넣음";
				System.out.println("계란을 넣을까요?");
				System.out.println("네/ 아니요");
				String eggtesk = scanner.next();
				
				if(eggtesk.equals("네")) {
					System.out.println("계란을 넣었씁니다.");
					bowl.egg = "넣음";
				}
				else {
					System.out.println(" 계란을 넣지 않았습니다.");
				}
				if(bowl.egg == null) {
					System.out.println("라면이 완성되었습니다.");
					System.out.printf("재료 물 %s 면 %s 스프 %s",bowl.water,bowl.ramen , bowl.soup);
					bowl = null;
				}
				else {
					System.out.println("라면이 완성되었습니다.");
					System.out.printf("재료) 물 %s 면 %s 스프 %s 계란",bowl.water,bowl.ramen,bowl.soup,bowl.egg);
					bowl =null;
				}
			}
			else {
				System.out.println("냄비가 탔습니다 ");
				bowl.water = null;
			}
		}
	}
}
