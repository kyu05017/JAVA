package Day3;

import java.util.Scanner;

public class Day03_3 { //c s

	public static void main(String[] args) {//m s
		
		// 문제 6: 정수를 입력받아 90점 이상이면 합격 아니면 불합격
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수 입력 :");int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println(score + "점 합격입니다");
		}else {
			System.out.println(score + "점 불합격입니다");
		}
		
		
		// 문제 7: 정수를 90점 이상이면 A등급 
		//			   80점 이상이면 B등급
		//			   75점이상이면 C등급
		
		System.out.println("점수 입력 :");int grade = scanner.nextInt();
		
		if(grade >= 90) {
			System.out.println(score + "점 A등급입니다.");
		} else if (grade >= 80) {
			System.out.println(score + "점 B등급입니다.");
		} else if (grade >= 75) {
			System.out.println(score + "점 C등급입니다.");
		} else {
			System.out.println(score + "점 미달입니다.");
		}
		
		//문제8 로그인페이지
		// [ 입력 ] : 아이디와 비밀번호를 입력받기
		// [ 조건 ] : 회원아이디가 admin 이고 
		//           비밀번호가 1234 일 경우에는 
		//          로그인 성공 아니면 로그인 실패 출력
		
		String id = "admin";
		String pw = "1234";
		System.out.println("아이디를 입력하세요"); String putId = scanner.nextLine();
		if(putId.equals(id)){
			System.out.println("비밀번호를 입력하세요");String putPw = scanner.nextLine();
			if(putPw.equals(pw)) {
				System.out.println("로그인에 성공했습니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}

	}//m e

}//c e
