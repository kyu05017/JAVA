package 개인과제10_PC방자리;

import java.util.Scanner;

public class 개인과제_10번째_PC방 {

	public static void main(String[] args) {
	/*
	 * 	 개인과제 [PC방 자리 관리]
	 * 		1.메인메뉴
	 * 			1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	 * 		2.일반메뉴 [ 입력된 시간을 보여줌. ( 분단위)
	 * 			1.시간추가 2.자리선택 3.자리이동 4.로그아웃
	 * 		3.관리자메뉴
	 * 			1.회원강제로그아웃 2.회원가입된목록 3.회원시간수정 4.로그아웃
	 * 
	 */	Scanner scanner = new Scanner(System.in);
		try {
			//pc방 자리를 표현함
			String[] PC = {"[카운터]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
			//맴버와 맴버의 정보를 저장할 2차원 배열
			String[][] members = new String[100][7];
			
			//무한반복 - 종료조건 없음
			while(true) {
				System.out.println("-------------------------------------------------");
				System.out.println("현재자리))");
				//현재 자리를 보여줌
				for(int i = 0; i < PC.length; i++) {
					System.out.print(PC[i]);
					//0을 제외하고 5개 마다 줄바꿈
					if(i%5==0)System.out.println();
				}
				System.out.println();
				System.out.println("자바 PC방))");
				System.out.println("1)회원가입 2)로그인 3)아이디찾기 4)비밀번호찾기");
				System.out.println("-------------------------------------------------");
				int ch = scanner.nextInt();
				if(ch == 1) {//1번일 경우 회원가입
					boolean pass = true;
					String id = null;
					while(true) { // 무한반복 - 동일한 아이디가 없다면 탈출
						System.out.println("회원가입))");
						System.out.print("ID : \n");
						id = scanner.next();//아이디를 입력받을때 검사해서 동일한 아이디가 있을경우 재입력 받음
						for(int i = 0; i < members.length;i++) {
							if(members[i][0] != null && members[i][0].equals(id)) {
								System.out.println("메세지)) 이미 존재하는 아이디 입니다.");
								pass = false;
								break;
							}
							else {
								pass = true;
							}
						}
						if(pass)break;//동일한 아이디가 없음으로 탈출
					}
					System.out.print("PW : \n");
					String pw = scanner.next();
					System.out.print("Name : \n");
					String name = scanner.next();
					System.out.print("Phone : \n");
					String phone = scanner.next();
					if(pass) {
						for(int i = 0; i < members.length;i++) {
							if(members[i][0] == null) {
								members[i][0] = id;			//아이디
								members[i][1] = pw;			//비밀번호
								members[i][2] = name;		//이름
								members[i][3] = phone;		//핸드폰번호
								members[i][4] = "0";		//남은시간
								members[i][5] = null;		//자리번호
								members[i][6] = "오프라인";	//접속여부
								System.out.println("메세지)) 이미 존재하는 아이디 입니다.");
								break;
							}
						}
					}
				}
				else if(ch == 2) {
					System.out.println("로그인))");
					System.out.print("ID : \n");
					String id = scanner.next();
					System.out.print("PW : \n");
					String pw = scanner.next();
					int login = 0;
					
					for(int i = 0; i < members.length; i++) {//배열을 검사해서
						//입력받은 아이디가 admin이면 로그인에 100을 줌
						if(members[i][0] != null && id.equals("admin") && members[i][1].equals(pw)) {
							System.out.println("메세지)) 관리자로 로그인하셧습니다.");
							login = 100;
							break;
						}
						//입력받은 아이디와 비밀번호가 동일하면 로그인 변수에 1을 주고 메세지를 띄움
						if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
							System.out.println("메세지)) 찾아주셔서 반갑습니다. "+id+"님 잔여시간 : "+ members[i][5]+"분");
							login = 1;
							break;
						}
					}
					
					if(login == 100) {//운영자로그인
						while(true) {
							System.out.println("-------------------------------------------------");
							System.out.println("현재 자리))");
							//저장된 자리배열을 보여줌
							for(int i = 0; i < PC.length; i++) {
								System.out.print(PC[i]);
								if(i%5==0)System.out.println();
								//0을 제외하고 5개마다 줄바꿈
							}
							System.out.println("관리자 메뉴))");
							System.out.println("1)회원 강제 로그아웃 2)가입된 회원 목록 3)회원 시간 수정 4)로그아웃");
							int ch3 = scanner.nextInt();
							if(ch3 == 1) {
								System.out.println("회원 로그아웃))");
								System.out.println("로그아웃 시킬 ID");
								String id2 = scanner.next();
								for(int i = 0;i<members.length;i++) {
									//입력받은 아이디가 온라인 이라면 오프라인으로 강제 전환함!
									if(members[i][0] != null && !(members[i][0].equals("admin")) && 
											members[i][0].equals(id2) && members[i][6].equals("온라인")) {
										//저장된 자리번호를 정수형으로 가져와서
										int myseat = Integer.parseInt(members[i][5]);
										//변수를 배열 인덱스로 이용해서 그 자리에 [o]가 있다면
										if(PC[myseat].equals("[o]")) {
											//빈공간으로 바꿔주고
											PC[myseat]="[ ]";
										}
										//회원의 정보를 바꿔줌
										members[i][5] = "";
										members[i][6] = "오프라인";
									}
								}
							}
							else if(ch3 == 2) {//접속중인 회원들의 목록으로 보여줌
								System.out.print("번호\t아이디\t남은시간\t접속여부\t이용자리\n");
								for(int i = 0;i<members.length;i++) {
									if(members[i][0] != null && !(members[i][0].equals("admin"))) {
										System.out.printf("%s\t%s\t%s분\t%s\t%s\n",i,members[i][0],members[i][4],members[i][6],members[i][5]);
									}
								}
							}
							else if(ch3 == 3) {
								System.out.println("회원 시간수정))");
								System.out.println("시간변경할 ID");
								String id2 = scanner.next();
								System.out.println("변경할 시간 : ");
								int extime = scanner.nextInt();
								for(int i = 0;i<members.length;i++) {
									if(members[i][0] != null && !(members[i][0].equals("admin")) && 
											members[i][0].equals(id2) && members[i][6].equals("온라인")) {
										//입력한 정수를 저장하기위해 문자열로 바꿔서 배열에 저장함
										String str_time = String.valueOf(extime);
										members[i][4] = str_time;
									}
								}
							}
							else if(ch3 == 4) {
								System.out.println("메세지) 로그아웃 했습니다.");
								break;
							}
							else {
								System.out.println("존재하지 않는 메뉴 입니다.");
							}
						}
					}
					else if(login == 1) {
						while(true) {
							System.out.println("-------------------------------------------------");
							System.out.println("현재 자리))");
							for(int i = 0; i < PC.length; i++) {
								System.out.print(PC[i]);
								if(i%5==0)System.out.println();
							}
							System.out.println("메뉴))");
							System.out.println("1)시간추가 2)자리선택 3)자리이동 4)로그아웃 5)메인메뉴(컴퓨터종료x)");
							int ch3 = scanner.nextInt();
							if(ch3 == 1) {
								System.out.println("시간 추가))");
								System.out.println("1)1시간(60분) 2)2시간(120분) 3)5시간(300분) 4)시간입력(분)");
								int ch4 = scanner.nextInt();
								if(ch4 == 1) {
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// 저장된 시간을 가져와서 정수열로 변경함
											int time = Integer.parseInt(members[i][4]);
											// 정수형을 변환된 시간에 메뉴만큼의 시간을 추가함
											time += 60;
											//추가된 정수형을 다시 문자열로 변경함
											String str_time = String.valueOf(time);
											// 배열에 저장
											members[i][4] = str_time;
											System.out.println("메세지)) 60분을 추가 하셨습니다.");
										}
									}
								}
								else if(ch4 == 2) {
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// 저장된 시간을 가져와서 정수열로 변경함
											int time = Integer.parseInt(members[i][4]);
											// 정수형을 변환된 시간에 메뉴만큼의 시간을 추가함
											time += 120;
											String str_time = String.valueOf(time);
											//추가된 정수형을 다시 문자열로 변경함
											members[i][4] = str_time;
											// 배열에 저장
											System.out.println("메세지)) 120분을 추가 하셨습니다.");
										}
									}
								}
								else if(ch4 == 3) {
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// 저장된 시간을 가져와서 정수열로 변경함
											int time = Integer.parseInt(members[i][4]);
											// 정수형을 변환된 시간에 메뉴만큼의 시간을 추가함
											time += 300;
											//추가된 정수형을 다시 문자열로 변경함
											String str_time = String.valueOf(time);
											// 배열에 저장
											members[i][4] = str_time;
											System.out.println("메세지)) 300분을 추가 하셨습니다.");
										}
									}
								}
								else if(ch4 == 4) {
									System.out.print("원하는 시간 입력 : \t");
									int time = scanner.nextInt();
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// 저장된 시간을 가져와서 정수열로 변경함
											int mytime = Integer.parseInt(members[i][4]);
											// 정수형을 변환된 시간에 입력한 만큼의 시간을 추가함
											mytime += time;
											//추가된 정수형을 다시 문자열로 변경함
											String str_time = String.valueOf(time);
											// 배열에 저장
											members[i][4] = str_time;
											System.out.println("메세지)) "+time+"분을 추가 하셨습니다.");
										}
									}
								}
								else {
									System.out.println("메세지)) 존재하지 않는 옵션입니다.");
								}
							}
							else if(ch3 == 2) {
								System.out.print("자리선택 : \n");
								int seat = scanner.nextInt();
								//0번은 카운터 자리
								if(seat == 0) {
									System.out.println("존재하지 않는 자리 입니다.");
								}
								//입력한 자리가 빈공간이라면 [o]을 넣어서 사용중을 확인시켜줌
								else if(PC[seat].equals("[ ]")) {
									PC[seat]="[o]";
								}
								else {//그외라면 메세지를 띄움
									System.out.println("메세지)) 사용중인 자리 입니다.");
								}
								//입력받은 정수를 문자열로 변경함
								String str_seat = String.valueOf(seat);
								//배열에 자리숫자와 "온라인" 이라고 접속상태를 바꿔줌
								for(int i = 0; i <members.length; i++) {
									if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
										members[i][5] = str_seat;
										members[i][6] = "온라인";
									}
								}
							}
							else if(ch3 == 3) {
								System.out.print("자리이동 : \n");
								int newseat = scanner.nextInt();
								//0번은 카운터 자리
								if(newseat == 0) {
									System.out.println("메세지)) 존재하지 않는 자리 입니다.");
								}
								//입력한 자리가 빈공간이라면 [o]을 넣어서 사용중을 확인시켜줌
								else if(PC[newseat].equals("[ ]")) {
									PC[newseat]="[o]";
								}
								else {//그외라면 메세지를 띄움
									System.out.println("메세지)) 사용중인 자리 입니다.");
								}
								//새로운 자리는 저장이 되었기 때문에 배열에 저장하기위해 문자열로 바꿈
								String str_seat = String.valueOf(newseat);
								for(int i = 0; i <members.length; i++) {
									if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
										//저장되어있는 자리의 문자열을 다시 정수형으로 바꿔줌 
										int myseat = Integer.parseInt(members[i][5]);
										//변환해온 정수를 배열 인데스와 비교해
										// 그 자리가 [o]라면 비워줌
										if(PC[myseat].equals("[o]")) {
											PC[myseat]="[ ]";
										}
										//새로운 자리를 배열에 저장함
										members[i][5] = str_seat;
									}
								}
							}
							else if(ch3 == 4) {
								System.out.println("메세지) 접속을 종료했습니다.");
								for(int i = 0; i <members.length; i++) {
									if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
										//저장된 pc방 자리를 정수형으로 가지고옴
										int myseat = Integer.parseInt(members[i][5]);
										//자리 배열에 인데스로 이용해서 현재 그 자리가 [o]라면 비워줌
										if(PC[myseat].equals("[o]")) {
											PC[myseat]="[ ]";
										}
										//이용중이 아니기때문에 비워줌
										members[i][5] = "";
										//접속중이 아니라고 배열에 저장함
										members[i][6] = "오프라인";
									}
								}
								break;
							}
							else if(ch3 == 5) {
								System.out.println("메세지) 로그아웃 했습니다.");
								break;
							}
							else {
								System.out.println("존재하지 않는 메뉴 입니다.");
							}
						}
					}
				}
				else if(ch == 3) {
					System.out.println("아이디 찾기))");
					System.out.print("Name : \n");
					String name = scanner.next();
					System.out.print("Phone : \n");
					String phone = scanner.next();
					for(int i = 0; i < members.length;i++) {
						//배열에 저장된 이름과 핸드폰 번호가 동일하다면 아이디를 띄워줌
						if(members[i][0] != null && members[i][2].equals(name) && members[i][3].equals(phone)) {
							System.out.println("메세지)) 회원님의 아이디는 "+members[i][0]+ "입니다.");
							break;
						}
						else {
							System.out.println("메세지)) 존재하지 않는 회원입니다.");
							break;
						}
					}
				}
				else if(ch == 4) {
					System.out.println("비밀번호 찾기))");
					System.out.print("ID : \n");
					String id = scanner.next();
					System.out.print("Phone : \n");
					String phone = scanner.next();
					// 입력된 아이디와 핸드폰 번호가 동일하다면
					for(int i = 0; i < members.length;i++) {
						if(members[i][0] != null && members[i][0].equals(id) && members[i][3].equals(phone)) {
							//저장된 비밀번호를 불러주고
							System.out.println("메세지)) 회원님의 비밀번호는 "+members[i][1]+ "입니다.");
							System.out.println("1)변경 2)뒤로가기");
							int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {//변경하기
								System.out.println("비밀번호 변경))");
								System.out.print("PW : \n");
								String newPW = scanner.next();
								//새로 입력받아 그 대로 같은배열에 대입함
								members[i][1] = newPW;
								System.out.println("메세지)) 비밀번호 변경이 완료 되었습니다.");
								break;
							}
							else if(ch2 == 2) {//뒤로가기
								System.out.println("메세지)) 이전 메뉴로 돌아갑니다.");
								break;
							}
							else {
								System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
							}
						}
						else {
							System.out.println("메세지)) 존재하지 않는 회원입니다.");
							break;
						}
					}
					
				}
				else {
					System.out.println("존재하지 않는 메뉴 입니다.");
				}
				
				
			}
		}
		catch(Exception e) {// 예외가 발생한다면 모든 예외를 묶어서 메세지를 띄우고 다시 입력하게 함
			System.out.println("메세지) 오류 관리자의 문의");
			scanner = new Scanner(System.in);
		}
	}

}
