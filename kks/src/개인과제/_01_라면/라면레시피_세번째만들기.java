package 개인과제._01_라면;

import java.util.Scanner;

public class 라면레시피_세번째만들기 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		System.out.println("라면만들기");
		
		while(true) {
			
			System.out.println("라면을 만듭니다");
			System.out.println("1) 라면 끓이기, 2) 종료");
			String tesk1 = scanner.next();
			
			if(tesk1.equals("1")) {
				System.out.println("냄비에 물을 넣습니다.");
				System.out.println("얼마만큼의 물을 넣습니까?");
				bowl.water = scanner.next()+"ml";
				System.out.printf("%s 만큼의 물을 넣었습니다.",bowl.water);
				
				System.out.println("물이 끓기 시작했습니다.");
				System.out.println("면과 스프를 넣습니다. (네/아니요)");
				String tesk2 = scanner.next();
				if(tesk2.equals("네")) {
					System.out.println("라면이 익어갑니다 계란을 넣을까요?(네/아니여");
					String eggtesk = scanner.next();
					bowl.ramen = "넣음";
					bowl.soup = "넣음";
					if(eggtesk.equals("sp")) {
						bowl.egg = "넣음";
					}
					else {
						System.out.println("계란을 넣지 않았습니다.");
					}
					System.out.println("라면이 완성되었습니다.");
					
					if(bowl.egg == null) {
						System.out.println("재료) 면,스프");
					}
					else {
						System.out.println("재료) 면,스프,계란");
					}
					
				}
				else {
					System.out.println("냄비가 타버렸습니다.");
					bowl.water = null;
				}
			}
			else if(tesk1.equals("2")) {
				System.out.println("라면 끓이기를 종료했습니다.");
			}
			else {
				System.out.println("라면을 끓이지 않습니다.");
				break;
			}
		}
		
	}
}
