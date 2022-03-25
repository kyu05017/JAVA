package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		// 대기명단 프로그램
			// 1.대기추가 2.대기취소 [ 관리자] 3. 대기자 입장
		
		ArrayList<wait_person> waitlist = new ArrayList<>();
		
		int waitnum = 1;
		
		while(true) {
			System.out.println("대기 명단))");
			System.out.println("대기번호  명수 ");
			
			for(wait_person temp : waitlist) {
				if(waitlist.indexOf(temp) == 0) {
					System.out.println(temp.waitting_num + " " + temp.persons+ "바로입장가능");
				}
				else {
				System.out.println(temp.waitting_num + " " + temp.persons+ " "+ waitlist.indexOf(temp)*3+"분");
				}
			}
			
			System.out.println("메뉴))");
			System.out.println("1)대기추가 2)대기취소 3)입장");
			
			String work = scanner.next();
			
			if(work.equals("1")) {
				System.out.println("대기 추가");
				System.out.println("전화번호 : ");
				String phone = scanner.next();
				System.out.println("인원수 입력 :");
				int members = scanner.nextInt();
				
				wait_person wait = new wait_person(waitnum, phone, members);
				
				waitlist.add(wait);
				// * 대기번호는 증가
				waitnum++;
			}
			else if(work.equals("2")) {
				System.out.println("대기 취소");
				System.out.println("취소할 대기번호 : ");
				int input = scanner.nextInt();
				
				for(wait_person temp : waitlist) {
					if(temp.waitting_num == input) {
						waitlist.remove(temp);
						break;
					}
				}
				
			}
			else if(work.equals("3")) {
				System.out.println("가장 앞에있는 대기자를 입장");
				waitlist.remove(0);
				
				
			}
			else {
				System.out.println("없는 메뉴");
			}
		}
	}
}


