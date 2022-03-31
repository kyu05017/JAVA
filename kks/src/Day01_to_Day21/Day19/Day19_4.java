package Day01_to_Day21.Day19;

import java.util.*;

public class Day19_4 {
	
	public static void main(String[] args) {
		
		// p. 747
		
		Hashtable <String, String> map = new Hashtable<>();
		
		map.put("spring","12");
		map.put("summer","123");
		map.put("fall","1234");
		map.put("winter","12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("로그인");
			System.out.println("ID : ");
			String id = scanner.next();
			
			System.out.println("PW : ");
			String pw = scanner.next();
			
			System.out.println();
			
			if(map.containsKey(id)) {	// .contains ( 키 ) : 객체내 해당 키가 존재하면 true / 아니리면 false;
									// 만약에 입력한 아이디가 객체내 key로 존재하면 
				if(map.get(id).equals(pw)) {	
					// 만약에 key 이용한 값 호출 
					System.out.println("로그인 완료!");
					break;
				}
				else {
					System.out.println("비밀번호 불일치");
				}
			}
			else {
				System.out.println("아이디 불일치");
			}
		}
		scanner.close();
	}
	
}
