package 개인과제01_2라면;

import java.util.Scanner;

public class 라면레시피_첫번째만들기_17분8초 {//c s

	public static void main(String[] args) {//m s
		
		/*
		 * 
		 * 라면레시피
		 * 필요한 재료 물550ml, 건더기스프, 분말스프, 계란
		 * 물이 끓으면 면, 건더기 스프, 분말스프 ,계란 넣기
		 * 그릇에 옮기기끝
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("라면끓이기");
		
		
		Bowl bowl = new Bowl();
		
		System.out.println("냄비에 물을 넣겠니까?(네/아니요)");
		String tesk = scanner.next();
		
		if(tesk.equals("네")) {
			System.out.println("냄비에 물을 얼마나 넣겠습니까?");
			bowl.water =scanner.next()+"ml" ;
			
			
				System.out.printf("%s 만큼의 물을 넣었습니다.",bowl.water);
				System.out.println("물이 끓습니다. 면과 스프를 넣겠습니까?(네/아니요)");
				String ramentesk = scanner.next();
				
				if(ramentesk.equals("네")) {
					bowl.ramen = "있음";
					bowl.soup = "있음";
					bowl.soup2 = "있음";
					
					System.out.println("라면이 거의다 되어갑니다. 계란을 넣겠습니까? (네/아니요)");
					String eggtesk = scanner.next();
					if(eggtesk.equals("네")) {
						System.out.println("라면이 완성 되었습니다. 재료를 보려면 (재료)를 입력하세요");
						bowl.egg = "있음";
						String item = scanner.next();
						if(item.equals("재료")) {
							if(bowl.egg != null) {
								System.out.printf("들어간 재료) 면,건더기,스프,계란 ");
							}
						}
					}
					else {
						System.out.println("라면이 완성 되었습니다. 재료를 보려면 (재료)를 입력하세요");
						String item = scanner.next();
						if(item.equals("재료")) {
							if(bowl.egg == null) {
								System.out.printf("들어간 재료) 면,건더기,스프 ");
							}
						}
					}
				}
				else {
					System.out.println("물이  끓어 증발해 냄비가 탔습니다.");
					bowl.water = null;
				}
			}
			else {
				System.out.println("물을 넣으세요");
			}
	}//m e

}//c e