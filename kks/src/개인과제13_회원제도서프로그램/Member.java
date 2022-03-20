package 개인과제13_회원제도서프로그램;

import java.util.Scanner;

public class Member {

	// 1. 필드
		//회원번호, 아이디, 비밀번호, 이름, 연락처
	int mno;
	String id;
	String password;
	String name;
	String phone;
	Scanner scanner = new Scanner(System.in);
	
	// 2. 생성자 [ 생성자 == 클래스]
		// 1. 빈생성자 [ 기본생성자 (메소드 호출용)]
	public Member() {
		
	}
		// 2. 모든 필드를 받는 생성자
	public Member(int mno, String id, String password, String name, String phone) {
		this.mno = mno; // 중복 x
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	// 3. 메소드
		//1,회원가입 [ 인수 x 반환 o ]
	
	boolean singup() {//가입성공시 참 실패시 거짓
		
		System.out.println(" ----- 회원가입 페이지 ------");
		// 1. 입력받는다 [ id , pw , name, phone ] 
		System.out.print(" 아이디 : ");	String id = scanner.next();
		System.out.print(" 비밀번호 : ");	String password = scanner.next();
		System.out.print(" 이름 : ");	String name = scanner.next();
		System.out.print(" 연락처 : ");	String phone = scanner.next();
			// * scanner 객체가 다른 클래스내 static 선언되어있음. // * 클래스명.필드명.함수명()  
			// * static 필드,메소드는 객체없이 호출가능 [ 클래스명.필드명/메소드명 ]
			// * 아이디중복체크 
			for( Member temp : 모범카피.members ) {
				if( temp != null && temp.id.equals(id)) { // 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면 
					System.out.println(" 알림]] 현재 사용중인 아이디 입니다. ");
					return false; // 함수종료 ---> 아이디가 중복되었기 문에 false[가입실패]
				}
			} 
			// * 회원번호 자동부여 [ 가장 최근에 가입한 회원[마지막회원]의 번호 + 1 ]
			int bno = 0; // 회원번호 저장하는 변수 
			int j = 0; // 반복횟수 [ 인덱스 ]
			for( Member temp : 모범카피.members ) {
				if( temp == null ) { // null 찾기 [ null 찾았을때 null-1 하면 마지막회원 ]
					if( j == 0 ) {   // 첫번째 인덱스[0번인덱스]가 null => 첫회원 => 첫회원번호 = 1 부여
						bno = 1; break; // 끝내기 
					}
					else { // 첫번째 회원이 아니면 
						bno = 모범카피.members[ j-1 ].mno + 1 ; // null 앞 [ 마지막회원 ]번호에 +1
						break; // 끝내기 
					}
				}
				j++; // 인덱스 증가
			}
		// 2. 4개변수 -> 객체화 -> 1개
		Member member = new Member( bno , id, password, name, phone ); // 모든 필드 받는 생성자로 객체생성
		
		// 3. 배열내 빈 공간을 찾아서 새로운 회원[객체] 넣기 
		int i = 0 ; // 반복횟수 [ 인덱스체크 ]
		for( Member temp : 모범카피.members ) {
			if( temp == null ) { // 빈공간이면 
				모범카피.members[i] = member; // 빈 인덱스에 새로운 회원 대입
				System.out.println(" 알림)) 회원님의 회원번호 : " + bno);
				return true; // 회원가입 메소드 종료 ~~~~~~~ [ 반환 : true ]
			}
			i++; // i증가 
		}
		// 4. 가입 성공시 true 반환 실패시 false 반환 
		return false; // 회원가입 메소드 종료 ~~~~~~ [ 반환 : false ]
	}
		//2.로그인메소드 [ 인수 x 반환 o ]
	String login() {//로그인 성공하면 성공한 아이디 반환 실패시 null를 반환
		System.out.println("---------------로그인---------------");
		System.out.println("아이디를 입력하세요");
		String id = scanner.next();
		System.out.println("비밀번호를입력하세요");
		String pw = scanner.next();
		
		for( Member temp : 모범카피.members ) {
			if(  temp != null && temp.id.equals(id) 
					&& temp.password.equals(pw) ) {
				// * 공백이 아니면서 id와 password가 동일하면 
				return temp.id; // 성공한 id 반환
			}
			else if(temp != null && id.equals("admin") && temp.password.equals(pw)) {
				return "admin";
			}
		}
		return null;
	}
	
		//3.아이디찾기
	void findid() {
		System.out.println("---------------아이디찾기---------------");
		System.out.println("이름을 입력하세요.");
		String inputname = scanner.next();
		System.out.println("전화번호를 입력하세요.");
		String inputphone = scanner.next();
		boolean ck = false;
		int i = 0;
		for(Member temp : 모범카피.members) {
			if(temp != null &&temp.name.equals(inputname) && temp.phone.equals(inputphone)) {
				System.out.println("사용자의 아이디는 " + temp.id+"입니다");
				ck = true;
				break;
			}
		}
		if(ck == false) {
			System.out.println("알림)) 잘못된 정보 입니다.");
		}
	}
		//4.비밀번호 찾기
	void findpw() {
		System.out.println("---------------아이디찾기---------------");
		System.out.println("아이디를 입력하세요.");
		String inputid = scanner.next();
		System.out.println("전화번호를 입력하세요.");
		String inputphone = scanner.next();
		boolean ck = false;
		int i = 0;
		for(Member temp : 모범카피.members) {
			if(temp != null &&temp.id.equals(inputid) && temp.phone.equals(inputphone)) {
				System.out.println("사용자의 비밀번호는 " + temp.password+"입니다");
				ck = true;
				break;
			}
			else if(temp == null){
				ck = false;
			}
			else {
				ck = false;
			}
		}
		if(ck == false) {
			System.out.println("알림)) 잘못된 정보 입니다.");
		}
	}
		//5.회원탈퇴
		//6.회원수정

}
