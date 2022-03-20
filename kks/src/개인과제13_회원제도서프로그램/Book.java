package 개인과제13_회원제도서프로그램;

public class Book {
	
	// 1. 필드
		//
	String ISBM;
	String bname;
	String bwriter;
	boolean brental;
	String mid;

	// 2. 생성자
		// 1. 빈생성자 메소드 호출용 (컴트롤 스페이스)
	public Book() { // 깡통
		
	}

	public Book(String ISBM, String bname, String bwriter, boolean brental, String mid) {
		this.ISBM = ISBM;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	 
	// 3. 메소드
		//1.도서검색
	void bsearch() {
		System.out.println("--------------- 도서검색-----------------");
		System.out.println("이름으로 검색하려면 (이름) 코드로 검색하려면(코드):");
		String serch = 모범카피.scanner.next();
		if(serch.equals("이름")) {
			System.out.println("알림)) 도서이름을 입력하세요");
			String sn =모범카피.scanner.next();
			for(Book temp : 모범카피.books) {
				if(temp != null) {
					if(sn.equals(temp.bname)) {
						if(temp.brental) {
							System.out.println("입력하신 해당 도서 "+sn+"는 현재 대여 가능합니다.");
							return;
						}
						else {
							System.out.println("입력하신 해당 도서 "+sn+"는 현재 대여중입니다.");
							return;
						}
					}
					else {
						System.out.println("알림)) 해당 도서가 존재하지 않습니다.");
					}
				}
			}
			
		}
		else if(serch.equals("코드")) {
			System.out.println("알림)) 도서코드를 입력하세요");
			String is = 모범카피.scanner.next();
			for(Book temp : 모범카피.books) {
				if(temp != null) {
					if(is.equals(temp.bname)) {
						if(temp.brental) {
							System.out.println("입력하신 해당 도서 "+is+"는 현재 대여 가능합니다.");
							return;
						}
						else {
							System.out.println("입력하신 해당 도서 "+is+"는 현재 대여중입니다.");
							return;
						}
					}
					else {
						System.out.println("알림)) 해당 도서가 존재하지 않습니다.");
					}
				}
			}
			
		}
		else {
			System.out.println("잘못된 입력.");
		}
	}
		//2.도서목록
	void blist() {
		System.out.println("--------------- 도서목록-----------------");
		System.out.print("ISBM\t도서명\t작가\t대여가능여부\n");
		for(Book temp : 모범카피.books) {
			if(temp != null) {
				if(temp.brental) {
				System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"대여가능");
				}
				else {
					System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"대여중");
				}
			}
		}
	}
	void myrentalbook(String loginid) { 
		System.out.println("--------------- 대여목록-----------------");
		System.out.print("ISBM\t도서명\t작가\t대여가능여부\n");
		for(Book temp : 모범카피.books) {
			if(temp.mid == null) {
				System.out.println("알림)) 대여하신 책이 없습니다.");
			}
			else if(temp != null && temp.mid.equals(loginid)) {
				System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"대여중");
			}
		}
	}
		//3.도서대여
	void brental(String loginid) {
		System.out.println("--------------- 도서대여-----------------");
		System.out.print("대여할 ISBM :");String aa = 모범카피.scanner.next();
		int i = 0;
		for(Book temp : 모범카피.books) {
			if(temp != null &&temp.ISBM.equals(aa) && temp.brental) {
				if(temp.brental ) {
					System.out.println("알림)) 해당 도서를 대여합니다.");
					모범카피.books[i].mid = loginid;
					모범카피.books[i].brental = false;
					return;
				}
				else {
					System.out.println("알림)) 이미 대여중인 도서 입니다.");
					return;
				}
			}
			i++;
		}
		System.out.println("알림)) 동일한 ISBM이 없습니다.");
	}
		//4.도서반납
	void bback(String loginid) {
		try{
			System.out.println("--------------- 도서반납-----------------");
			myrentalbook(loginid);
			System.out.print("반납할 ISBM :");String aa = 모범카피.scanner.next();
			int i = 0;
			for(Book temp : 모범카피.books) {
				if(temp.mid == null) {
					System.out.println("알림)) 대여하신 책이 없습니다.");
				}
				if(temp != null &&temp.ISBM.equals(aa) && temp.mid.equals(loginid)) {
					if(temp.brental ) {
						System.out.println("알림)) 대여중인 도서가 아닙니다.");
						return;
					}
					else {
						System.out.println("알림)) 해당 도서를 반납합니다.");
						모범카피.books[i].brental = true;
						모범카피.books[i].mid = null;
						return;
					}
				}
				i++;
			}
		}catch(NullPointerException e){
			System.out.println("알림)) 동일한 ISBM이 없습니다.");
		}
		
	}

		//5.도서등록
	void badd() {
		System.out.println("--------------- 도서등록-----------------");
		System.out.println("ISBM 입력 : ");
		String isbm = 모범카피.scanner.next();//이름
		System.out.println("책이름 :");
		String bname = 모범카피.scanner.next();//이름
		System.out.println("작가의 이름 :");
		String bwritwer = 모범카피.scanner.next();//작성자
		
		
		// 객체화 [ 도서대여여부 = true , 대여회원 id = null]
		Book book = new Book(isbm, bname, bwritwer,true,null);
		int i = 0;
		//등록
		for(Book temp : 모범카피.books) {
			if(temp == null) {
				모범카피.books[i] = book;
				System.out.println("알림)) 도서등록이 완료되었습니다.");
				return;
			}//ISBM 중복체크
			else if(temp != null && temp.ISBM.equals(isbm)) {
				System.out.println("알림)) 현재 사용중인 ISBM 입니다.");
				return;
			}
			i++;
		}
	}
		//6.도서삭제
	void bremove() {
		System.out.println("--------------- 도서삭제-----------------");
		System.out.println("ISBM 입력 :");
		String isbm = 모범카피.scanner.next();//이름
		//ISBM 중복체크
		int i = 0;
		for(Book temp : 모범카피.books) {
			if(temp != null && temp.ISBM.equals(isbm)) {
				모범카피.books[i] = null;
			}
			i++;
		}
	}
}
