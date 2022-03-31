package 개인과제._20_PC방_ver2;

public class Main {
	
	public static void main(String[] args) {
		Control con = new Control();
		
		while(true) {
			
			System.out.println("-------------------------------------------------");
			System.out.println("현재자리))");
			
			for(int i = 0; i < Control.PC.length; i++) {
				System.out.print(Control.PC[i]);
				if(i%5==0)System.out.println();
			}
			System.out.println();
			System.out.println("자바 PC방))");
			System.out.println("1)회원가입 2)로그인 3)아이디찾기 4)비밀번호찾기 5)종료");
			System.out.println("-------------------------------------------------");
			
			String tesk = Control.scanner.next();
			
			if(tesk.equals("1")) {
				con.signUp();
			}
			else if(tesk.equals("2")) {
				String result = con.logIn();
				
				if(result.equals("admin")) {
					System.out.println("메세지)) 관리자 로그인");
				}
				else if(result.equals("false")) {
					System.out.println("메세지)) 로그인에 실패 했습니다.");
				}
				else {
					System.out.printf("메세지)) %s님 방문해 주셔서 감사힙니다.\n",result);
				}
			}
			else if(tesk.equals("3")) {
				
			}
			else if(tesk.equals("4")) {
				
			}
			else if(tesk.equals("5")) {
				System.out.println("프로그램 종료))");
				System.out.println("관리자 비밀번호 입력 : ");
				String admin_Pw = Control.scanner.next();
				boolean exit = false;
				for(Member temp : Control.memberList) {
					if(admin_Pw.equals(temp.getPw())) {
						System.out.println("메세지)) 시스템을 종료 합니다.");
						exit = true;
					}
					else {
						System.out.println("메세지)) 관리자만 이용가능합니다.");
						exit = false;
					}
				}
				if(exit) {
					break;
				}
			}
			else {
				System.out.println("");
			}
		}
	}
	
	
	
}
