package 개인과제._01_라면;

import java.util.Scanner;


public class 라면레시피_두번째만들기_7분40초 { //c s

	public static void main(String[] args) {//m s
		
		//입력객체 선언
		Scanner scanner= new Scanner(System.in);
		//bolw 클래스 선언
		Bowl bowl = new Bowl();
		
		System.out.println("라면 끓이기");
		System.out.println("냄비에 물을 넣습니까?");
		//tesk1를 입력받는 문자열로 선언해서 입력받기
		String tesk1 = scanner.next();
		
		//"네"일 경우 물을 넣음
		if(tesk1.equals("네")) {
			System.out.println("라면에 물을 넣습니다");
			System.out.println("얼마만큼의 물을 넣습니까?");
			//입력받은 물의 양과 "ml"을 bowl.water에 넣음
			bowl.water = scanner.next() + "ml";
			
			//입력받은 물의 량을 표시해쥼
			System.out.printf("%s 만큼의 물을 넣었습니다.",bowl.water);
			System.out.print("물이 끓고 있습니다. 면과 스프를 넣겠습니까 (네/아니요)");
			String tesk2 = scanner.next();
			if(tesk2.equals("네")) {
				bowl.ramen = "넣음";
				bowl.soup = "넣음";
				System.out.println("라면이 거의다 익어 갑니다.");
				System.out.println("계란을 넣겠습니까? (네/아니요");
				String tesk3 = scanner.next();
				
				//계란을 넣을경우 계란 포함
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
				//냄비에 넣은 물을 다시 비워줌
				bowl.water = null;
			}
		}
		else {
			System.out.println("라면 끓이기를 종료합니다.");
		}
	}

}
