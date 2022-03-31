package Day01_to_Day21.Day08;

import java.time.Period;

public class Day08_2 {

	public static void main(String[] args) {

		//p.245 : final
			//최종적 뜻.
			// 고정값 만들기
			//사용방법 1. 필드 선언시 2.생성자에서
		
		// 1.객체생성
		Person p1 = new Person("123123-123123", "계백");
		
		// 2. 객체내 필드 수정
		//p1.nation = "USA"; // final 필드가 아니면 수정 가능 
		//p1.ssn = "321321-321321"; //final 필드 수정불가 
		p1.name = "유쥬ㅔ석";

	}

}
