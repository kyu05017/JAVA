package 개인과제19_키오스크_파일처리;

import java.text.DecimalFormat;
import java.util.Hashtable;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		DB.itemLoad();
		
		while(true) {
			
			System.out.println("키오스크))");
			System.out.println("| 순번 | 제품 | 가격 |");
			int t = 0;
			for(Product temp : Control.saleItem) {
				System.out.printf("| %d | %s | %s |\n",(t+1),temp.getName(),Control.df.format(temp.getMoney()));
				t++;
			}
			System.out.println();
			System.out.println("메뉴))");
			System.out.println("1)구매 2)관리자메뉴");
			String work = Control.scanner.next();
			
			if(work.equals("1") || work.equals("구매")) {
				Control con = new Control();
				if(Control.saleItem.size() == 0) {
					System.out.println("메세지)) 상품 없음 관리자 문의");
				}
				else {
					int e = 0;
					System.out.println("| 순번 | 제품 | 가격 |");
					for(Product temp : Control.saleItem) {
						System.out.printf("| %d | %s | %s |\n",(e+1),temp.getName(),Control.df.format(temp.getMoney()));
						e++;
					}
					System.out.println("결제)결제 99)뒤로가기");
					System.out.printf("메뉴)) 품목선택 : (%d : 결제 )\n",Control.saleItem.size()+1);
					while(true) {
						try {
							int itemNum = Control.scanner.nextInt();
							itemNum -= 1;
							if(itemNum > Control.saleItem.size()+2) {
								System.out.println("메세지)) 존재하지 않는 품목 입니다.");
							}
							else if(itemNum+1 == Control.saleItem.size()+1) {
								try {
									Hashtable <String, Integer> map = new Hashtable<>();
									DecimalFormat df2 = new DecimalFormat("#,##0원");
									
									for (int i = 0; i < Control.customerlist.size(); i++) {
										int ticketfee = 0; 
										for (int j = 0; j < Control.customerlist.size(); j++) {
											if (Control.customerlist.get(i).getC_Name().equals(Control.customerlist.get(j).getC_Name())) {
												ticketfee += Control.customerlist.get(i).getC_Pay();
											}
										}
										map.put(Control.customerlist.get(i).getC_Name(), ticketfee);
									}
									
									for(String temp : map.keySet()) {
										String new_money = df2.format(map.get(temp));
										System.out.println("상품 "+temp+ " " + new_money);
									}
									//총 매출액 표시
									int totalsales = 0;
									for (int i = 0; i < Control.customerlist.size(); i++) {
										 totalsales += Control.customerlist.get(i).getC_Pay();
									}
									String new_money = df2.format(totalsales);
									System.out.println("총 결제금액 : " + new_money);
									System.out.println("---------------------------------------------");
									System.out.println("1) 결제 2) 취소");
									int ch = Control.scanner.nextInt();
									if(ch == 1) {
										System.out.println("지불할 금액을 입력하세요.");
										int pay_money = Control.scanner.nextInt();
										if(pay_money < totalsales) {
											System.out.println("결제 금액 부족");
										}
										else if(pay_money >= totalsales) {
											if(pay_money - totalsales == 0) {
												System.out.println("결제가 완료 되었습니다.");
											}
											else {
												String change = df2.format(pay_money - totalsales);
												System.out.println("결제가 완료되었습니다. 거스름돈은 "+change+ "입니다.");	
											}
											
											break;
										}
									}
									else if (ch == 2) {
										System.out.println("결제를 취소합니다.");
										break;
									}
								}//try end
								catch(Exception a) {
									
								}
							}
							else {
								System.out.println(Control.saleItem.get(itemNum).getName()+" 삼품을 담았습니다.");
								con.buy(itemNum);
							}
	
						}
						catch(Exception a) {
							
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
