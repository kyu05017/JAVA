package Day03;

import java.util.Scanner;

public class Day03_3 { //c s

	public static void main(String[] args) {//m s
		
		// 문제 6: 정수를 입력받아 90점 이상이면 합격 아니면 불합격
		
		Scanner scanner = new Scanner(System.in);
		/*
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
		*/
		String id = "admin";
		int pw = 1234;
		System.out.println("아이디를 입력하세요");
		String putId = scanner.nextLine();
		
		//char는 문자 한개 밖에 저장할수 없다.
		//자료형으로 문자열을 저장할수 없다.
			//1.String 클래스 사용하면 문자열 저장가능
			//2.char 배열 /리스트 사용하면 가능
		//객체는 연산불가
			//자료형 사용하는 변수는 연산자는 사용가능
			//클래스를 사용하는 객체는 연산자 사용가능 -> 메소드
				//문자열 비교시 .equals
				//문자열1.equals(문자열2)
				//
		boolean 로그인성공 = false;
			//True or False 만 사용 가능
		if(putId.equals(id)){ //아이디가 같으면 실행 아니면 실행불가
			//id는 클래스 객체이기 때문에 == 불가능 //객체 비교시 이퀄 .equals
			System.out.println("비밀번호를 입력하세요"); 
			int putPw = scanner.nextInt();
			if(putPw == pw) { //비밀번호가 같으면 실행 아니라면 실행불가
				// 자료형 변수이기 때문에 === 가능
				System.out.println("로그인에 성공했습니다.");
				로그인성공 = true; // id,pw 가 모두 동일하면 변수값 변경 [ 
			} else { //비밀번호가 틀리면
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {//아이디가 admin이 아니라면
			System.out.println("존재하지 않는 회원입니다.");
		}
		if ( 로그인성공 == false) {
			System.out.println("로그인 실패");
			//로그인 성공변수가 false라면 출력
		}
		
		//문제9 
		//[입력] : 국어 영어 수학
		//[조건] : 평균 90점 이상이면서 국어점수 100이면 
		//						 영어점수 100점이면
		//						 수학점수 100점이면
		
		System.out.println("국어점수 입력 :");int 국어 = scanner.nextInt();
		System.out.println("영어점수 입력 :");int 영어 = scanner.nextInt();		
		System.out.println("수학점수 입력 :");int 수학 = scanner.nextInt();
		
		int total = (국어 + 영어 + 수학)/3;
		
		if(total >= 90){//평균 90점 이상이면
				//if 중첩
			if(국어==100) {
				System.out.println("국어우수");
			}if (영어 == 100) {
				System.out.println("영어우수");
			}if (수학 == 100 ) {
				System.out.println("수학우수");
			}
		} else if(total >= 80) { //평균 80점 이상이면
				//if 중첩
			if(국어>=90) {
				System.out.println("국어장려");
			}if (영어 >=90) {
				System.out.println("영어장려");
			}if (수학 >=90 ) {
				System.out.println("수학장려");
			}
		} else {
			System.out.println("재시험");
		}
		
	}//m e

}//c e

