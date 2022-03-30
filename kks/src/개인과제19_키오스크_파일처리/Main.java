package 개인과제19_키오스크_파일처리;

public class Main {
	
	public static void main(String[] args) {
		
		DB.itemLoad();
		
		while(true) {
			
			System.out.println("키오스크))");
			System.out.println("| 순번 | 제품 | 가격 |");
			int i = 0;
			for(Product temp : Control.saleItem) {
				System.out.printf("| %d | %s | %s |\n",(i+1),temp.getName(),Control.df.format(temp.getMoney()));
				i++;
			}
			System.out.println();
			System.out.println("메뉴))");
			System.out.println("1)구매 2)관리자메뉴");
			String work = Control.scanner.next();
			
			if(work.equals("1") || work.equals("구매")) {
				Control con = new Control();
				if(Control.saleItem.size() == 0) {
					System.out.println("메세지)) 재고 없음 관리자 문의");
				}
				else {
					int j = 0;
					for(Product temp : Control.saleItem) {
						System.out.printf("| %d | %s | %s |\n",(j+1),temp.getName(),Control.df.format(temp.getMoney()));
						i++;
					}
					System.out.println("95)구매완료 99)뒤로가기");
					System.out.println("메뉴)) 품목선택 :");
					while(true) {
						try {
							int itemNum = Control.scanner.nextInt();
							itemNum -= 1;
							if(itemNum > Control.saleItem.size()) {
								System.out.println("메세지)) 존재하지 않는 품목 입니다.");
							}
							if(itemNum == 99) {
								System.out.println("메세지)) 이전 메뉴로 돌아갑니다.");
								break;
							}
							if(itemNum == 95) {
								
							}
							else {
								con.buy(itemNum);
							}

						}
						catch(Exception e) {
							
						}
				}
				}
			}
			else if(work.equals("2") || work.equals("관리자") || work.equals("관리자메뉴")) {
				System.out.println("비밀번호 입력 : ");
				String pw = Control.scanner.next();
				if(pw.equals("1234")) {
					while(true) {
						Control con = new Control();
						System.out.println("관리자 메뉴))");
						System.out.println("1) 재고추가 2) 재고확인 3) 품목삭제 4)로그아웃");
						String work2 = Control.scanner.next();
						
						if(work2.equals("1") || work2.equals("재고추가")) {
							con.addItem();
						}
						else if(work2.equals("2") || work2.equals("재고확인")) {
							con.itemCheckList();
						}
						else if(work.equals("3") || work2.equals("품목삭제")) {
							con.removeItem();
						}
						else if(work.equals("4") || work2.equals("로그아웃")) {
							System.out.println("메세지)) 메인메뉴로 돌아갑니다.");
							break;
						}
						else {
							System.out.println("메세지)) 잘못된 입력입니다.");
						}
					}
				}
				else {
					System.out.println("메세지)) 관리자외 사용금지");
				}
			}
			else if(work.equals("4") || work.equals("종료")) {
				System.out.println("메세지)) 프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
			}
		}
	}
}
