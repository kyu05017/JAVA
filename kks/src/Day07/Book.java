package Day07;

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
	}
		//2.도서목록
	void blist() {
		System.out.println("--------------- 도서목록-----------------");
		System.out.print("ISBM\t도서명\t작가\t대여가능여부\n");
		for(Book temp : Day07_5_bookApplication.books) {
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
		System.out.println("--------------- 도서목록-----------------");
		System.out.print("ISBM\t도서명\t작가\t대여가능여부\n");
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null && temp.mid.equals(loginid)) {

				System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"대여중");
			}
		}
	}
		//3.도서대여
	void brental(String loginid) {
		System.out.println("--------------- 도서대여-----------------");
		System.out.print("대여할 ISBM :");String aa = Day07_5_bookApplication.scanner.next();
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null &&temp.ISBM.equals(aa) && temp.brental) {
				if(temp.brental ) {
					System.out.println("알림)) 해당 도서를 대여합니다.");
					temp.mid = loginid;
					temp.brental = false;
					return;
				}
				else {
					System.out.println("알림)) 이미 대여중인 도서 입니다.");
					return;
				}
			}
			
		}
		System.out.println("알림)) 동일한 ISBM이 없습니다.");
	}
		//4.도서반납
	void bback(String loginid) {
		System.out.println("--------------- 도서반납-----------------");
		myrentalbook(loginid);
		System.out.print("반납할 ISBM :");String aa = Day07_5_bookApplication.scanner.next();
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null &&temp.ISBM.equals(aa) && temp.mid.equals(loginid)) {
				if(temp.brental ) {
					System.out.println("알림)) 대여중인 도서가 아닙니다.");
					return;
				}
				else {
					System.out.println("알림)) 해당 도서를 반납합니다.");
					temp.brental = true;
					temp.mid = null;
					return;
				}
			}
			
		}
		System.out.println("알림)) 동일한 ISBM이 없습니다.");
	}

		//5.도서등록
	void badd() {
		System.out.println("--------------- 도서등록-----------------");
		System.out.println("ISBM 입력 : ");
		String isbm = Day07_5_bookApplication.scanner.next();//이름
		System.out.println("책이름 :");
		String bname = Day07_5_bookApplication.scanner.next();//이름
		System.out.println("작가의 이름 :");
		String bwritwer = Day07_5_bookApplication.scanner.next();//작성자
		
		
		// 객체화 [ 도서대여여부 = true , 대여회원 id = null]
		Book book = new Book(isbm, bname, bwriter,true,null);
		int i = 0;
		//등록
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp == null) {
				Day07_5_bookApplication.books[i] = book;
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
		String isbm = Day07_5_bookApplication.scanner.next();//이름
		//ISBM 중복체크
		int i = 0;
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null && temp.ISBM.equals(isbm)) {
				Day07_5_bookApplication.books[i] = null;
			}
			i++;
		}
	}
}
