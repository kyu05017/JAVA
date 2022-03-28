package Day19;

import java.util.*;

public class Day19_2 {
	
	// set 중복 불가능
		// 객체 내 모든 필드가 동일하면 중복 불가

	public static void main(String[] args) {
		
		// 로또 프로그램 
			// set 컬렉션 
		Scanner scanner = new Scanner(System.in);	// 1. 입력객체
		
		HashSet<Integer> set = new HashSet<>();		// 2. set컬렉션 Hashset 클래스 객체 선언
		
		
		while(true) {	// 3. 무한루프 : set객체내 객체수가 6이명 break
			
			System.out.println("1~45 번호 입력( 중복불가 ) : ");
			int mynum = scanner.nextInt();	// 입력받기
			
			if(mynum < 1 || mynum > 45) { // 4. 1 ~ 45 가 아니라면 다시 입력받기
				System.out.println("선택할수 없는 번호");
			}
			else {
				set.add(mynum);	// 5. 1~45 사이면 set객체에 저장 
				System.out.println("확인 : " + set);
			}
			if(set.size() == 6) {	// 6. 만약 set객체내 객체수가 6이면 종료
				break;
			}
			
		}
		
	}
}
