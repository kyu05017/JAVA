package 개인과제._31_Map응용_회원제방명록;

public class App {
	
	public static void main(String[] args) {
		Control con = new Control();
		App app = new App();
		Dao.memberLoad();
		while(true) {
			System.out.println("회원제 방명록");
			System.out.println("----------------------------------------------------");
			for(Dto_Member temp : Control.list.keySet()) {
				if(temp != null) {
					System.out.println(temp.getId() + "님 "+ Control.list.get(temp).getContents()+" | " + Control.list.get(temp).getDate());
				}
			}
			System.out.println("----------------------------------------------------");
			System.out.println("1)글쓰기 2)종료");
			String work = Control.scanner.next();
			if(work.equals("1")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				System.out.println("내용 : ");
				String contents = Control.scanner.next();
				
				boolean result = con.singup(id, pw,contents);
				if(result) {
					System.out.println("작성이 완료 되었습니다.");
				}
			}
			else if(work.equals("2")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}	
			else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
		
	}

}
	
