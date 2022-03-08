package MyPratice;

import java.util.Scanner;


public class 라면레시피_두번째만들기_7분40초 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		System.out.println("라면 끓이기");
		System.out.println("냄비에 물을 넣습니까?");
		String tesk1 = scanner.next();
		
		if(tesk1.equals("네")) {
			System.out.println("라면에 물을 넣습니다");
			System.out.println("얼마만큼의 물을 넣습니까?");
			bowl.water = scanner.next() + "ml";
			
			System.out.printf("%s 만큼의 물을 넣었습니다.",bowl.water);
			System.out.print("물이 끓고 있습니다. 면과 스프를 넣겠습니까 (네/아니요)");
			String tesk2 = scanner.next();
			if(tesk2.equals("네")) {
				bowl.ramen = "넣음";
				bowl.soup = "넣음";
				System.out.println("라면이 거의다 익어 갑니다.");
				System.out.println("계란을 넣겠습니까? (네/아니요");
				String tesk3 = scanner.next();
				if(tesk3.equals("네")) {
					System.out.println("라면이 완성되었습니다.");
					System.out.println("사용된 재료 면, 스프, 건더기, 계란");
				}
				else {
					System.out.println("라면이 완성되었습니다.");
					System.out.println("사용된 재료 면, 스프, 건더기");
				}
			}
			else {
				System.out.println("냄비가 다 끓어서 타버렸습니다");
				bowl.water = null;
			}
		}
		else {
			System.out.println("라면 끓이기를 종료합니다.");
		}
	}

}
