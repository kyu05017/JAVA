package 개인과제._31_Map응용_회원제방명록;

public class App {
	
	public static void main(String[] args) {
		Control con = new Control();
		Dao.memberLoad();
		while(true) {
			System.out.println("회원제 방명록");
			System.out.println("----------------------------------------------------");
			con.read();
			System.out.println("----------------------------------------------------");
			System.out.println("1)글쓰기 2)수정 3)삭제 4)종료");
			String work = Control.scanner.next();
			if(work.equals("1")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				System.out.println("내용 : ");
				String contents = Control.scanner.next();
				
				boolean result = con.create(id, pw,contents);
				if(result) {
					System.out.println("작성이 완료 되었습니다.");
				}
			}
			else if(work.equals("2")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				System.out.println("내용 : ");
				String contents = Control.scanner.next();
				
				boolean result = con.update(id, pw, contents);
				if(result) {
					System.out.println("수정이 완료 되었습니다.");
				}
				else {
					System.out.println("");
				}
			}	
			else if(work.equals("3")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				
				boolean result = con.delete(id, pw);
				if(result) {
					System.out.println("삭제가 완료 되었습니다.");
				}
				else {
					System.out.println("");
				}
			}	
			else if(work.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}	
			else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
		
	}

}
	
