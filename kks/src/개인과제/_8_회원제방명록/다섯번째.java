package 개인과제._8_회원제방명록;

import java.util.Scanner;

public class 다섯번째 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 회원과 게시판을 2차원 배열로 선언 100개의 행과 3개의 열
		String[][] members = new String[100][3];
		String[][] boards = new String[100][3];
		
		//무한 반복
		while(true) {// 종료 조건 없음
			System.out.println("회원제 방문록))");
			System.out.println("1)회원가입 2)로그인");
			// 입력받음
			int ch = scanner.nextInt();
			// 1일경우 회원가입
			if(ch == 1) {
				//사용자의 정보를 입력받음
				System.out.println("회원가입 페이지))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				System.out.println("Name : ");
				String name = scanner.next();
				//참을 줘서 통과시킴
				boolean pass = true;
				
				//맴버길이만큼의 수를 맴버배열에 대입하여 모두 검사후 아이디와 0열이랑 동일하면 pass를 false 로 반환
				for(int i = 0; i < members.length; i++) {
					if(members[i] != null && members[i][0].equals(id)) {
						System.out.println("이미 존재하는 회원 ");
						pass = false;
					}
				}
				// pass가 참이면 입력받은 정보를 배열 i 번에 0 은 아이디 1은 비밀번호 2는 이름을 저장 그리고 반복문 탈출
				if(pass) {
					for(int i =0; i < members.length;i++) {
						if(members[i] == null) {
							members[i][0]= id;
							members[i][1]=pw;
							members[i][2]=name;
							System.out.println("회원가입이 완료 되었습니다.");
							break;
						}
					}
				}
			}
			//2일 경우 로그인을함
			else if(ch == 2) {
				//사용자에게 정보를 받아옴
				System.out.println("로그인 페이지))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				boolean pass2 = false;
				
				//사용자에게 입력받은 정보가 저장된 정보와 같다면 참을 줘서 다음으로 진행 시킴
				for(int i =0 ; i < members.length; i++) {
					if(members[i] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						System.out.println("로그인이 완료되었씁니다.");
						pass2 = true;
						
						if(pass2) {// 참일경우 실행
							while(true) {//무한 반복 종료조건 로그아웃
								System.out.println("방명록");
								System.out.println("번호\t작성자\t제목\t내용");
								//보드의 길이만큼 검사해서 빈공간이 아니라면 출력
								for(int j =0 ; j < boards.length;j++) {
									if(boards[j] != null) {
										System.out.printf("%d\t%s\t%s\t%s",j,members[j][2],members[j][0],members[j][1]);
									}
								}
								System.out.println("1)방명록작성 2)로그아웃");
								int ch2 = scanner.nextInt();
								//입력받은 값이 1번이면 실행
								if(ch2 == 1) {
									//사용자에게 정보를 입력받음
									System.out.println("방문록 작성))");
									System.out.println("제목 :");
									String title = scanner.next();
									System.out.println("내용 : ");
									String cont = scanner.next();
									
									//입력받은 정보를 j에 배열길이수 만큼 검사해서 빈공간이 있다면
									// 0번 열에는 제목 1번 열에는 내용 2번열에는 사용자의 아이디를 가져와서 저장하고 반복문 탈출 
									for(int j = 0; j < boards.length; j++) {
										if(boards[j] == null) {
											boards[j][0] = title;
											boards[j][1] = cont;
											boards[j][2] =id;
											
											System.out.println("방명록 작성이 완료되었습니다.");
											break;
										}
									}
								}
								else if (ch2 == 2) {//입력받은 값이 2번이면 로그아웃으로 반복문 탈출
									System.out.println("로그아웃합니다. 메인메뉴로 돌아갑니다.");
									break;
								}
								else {//다른 정보가 입력되면 실행
									System.out.println("존재하지 않는 메뉴 입니다.");
								}
							}
						}
					}
				}
				
			}
			else {//다른 정보가 입력되면 실행
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
	}
}