package 개인과제19_키오스크_파일처리;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	
	static ArrayList<Product> saleItem = new ArrayList<>();
	static ArrayList<Customer> customerlist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	static DecimalFormat df = new DecimalFormat("#,###원");
	static DecimalFormat df2 = new DecimalFormat("####박스");
	
	public void addItem() {
		
		System.out.println("재고 및 품목 추가))");
		System.out.println("1) 품목 추가 2) 재고 추가");
		
		String work3 = scanner.next();
		while(true) {
			
			if(work3.equals("1")) {
				System.out.println("품목추가))");
				System.out.println();
				System.out.print("상품이름 : \n");
				String name = scanner.next();
				
				int price = 0;
				int item = 0;
				boolean pass1 = true;
				while(pass1) {
					try {
						System.out.print("상품가격 : \n");
						price = scanner.nextInt();
						if(price <= 0) {
							System.out.println("메세지) 가격 오류 입니다.");
							pass1 = true;
						}
						else {
							pass1 = false;
						}
					}
					catch(Exception e) {
						System.out.println("메세지)) 잘못된 입력입니다.");
						pass1 = true;
					}
				}
				boolean pass2 = true;
				while(pass2) {
					try {
						System.out.print("발주할 물량 : \n");
						item = scanner.nextInt();
						if(item <= 0) {
							System.out.println("메세지) 최소 1개부터 발주 가능합니다.");
							pass2 = true;
						}
						else {
							pass2 = false;
						}
					}
					catch(Exception e) {
						System.out.println("메세지)) 잘못된 입력입니다.");
						pass2 = true;
					}
				}
				System.out.println("-------------------");
				System.out.println("상품등록 및 발주))");
				System.out.println("상품명	: " + name);
				System.out.println("가격	: " + df.format(price));
				System.out.println("발주물량	: " + df2.format(item));
				System.out.println("-------------------");
				System.out.println("1)확인 2)취소");
				String work4 = scanner.next();
				
				if(work4.equals("1")) {
					System.out.println("메세지)) 발주 및 등록 완료");
					Product product = new Product(name, item, price);
					saleItem.add(product);
					DB.itemSave();
					break;
				}
				else if(work4.equals("2")) {
					System.out.println("메세지)) 이전 메뉴로 돌아갑니다.");
					break;
				}
			}
			else if(work3.equals("2")) {
				System.out.println("재고 추가))");
				if(saleItem.size() == 0) {
					System.out.println("메세지))추가 발주할 상품이 없습니다.");
				}
				else {
					int i = 0;
					System.out.println("| 순번 | 제품 | 가격 | 재고 |");
					for(Product temp : saleItem) {
						System.out.printf("| %d | %s | %s | %s |\n",(i+1),temp.getName(),df.format(temp.getMoney()),df2.format(temp.getItem()));
						i++;
					}
					System.out.print("번호입력 : \n");
					try {
						boolean pass = true;
						int add_Item = 0;
						int num = 0;
						while(pass) {
							num = scanner.nextInt();
							if(num-1 > saleItem.size()) {
								System.out.println("메세지)) 존재하지 않는 상품입니다.");
								pass = false;
							}
						}
						boolean pass2 = true;
						while(pass2) {
							add_Item = scanner.nextInt();
							if(add_Item <= 0) {
								System.out.println("메세지)) 최소 1개 이상 발주 가능합니다.");
							}
						}
						num -= 1;
						System.out.println("-------------------");
						System.out.println("상품등록 및 발주))");
						System.out.println("상품명	: " + saleItem.get(num).getName());
						System.out.println("가격	: " + df.format(saleItem.get(num).getMoney()));
						System.out.println("발주물량	: " + df2.format(saleItem.get(num).getItem()));
						System.out.println("-------------------");
						System.out.println("1)확인 2)취소");
						String work4 = scanner.next();
						
						if(work4.equals("1")) {
							System.out.println("메세지)) 발주 완료");
							saleItem.get(num).setItem(add_Item);
							DB.itemSave();
							break;
						}
						else if(work4.equals("2")) {
							System.out.println("메세지)) 이전 메뉴로 돌아갑니다.");
							break;
						}
					}
					
					catch (Exception e) {
						System.out.println("잘못된 입력입니다.");
					}
				}
			}
		}
	}
	
	public void removeItem() {
		System.out.println("상품삭제))");
		if(saleItem.size() == 0) {
			System.out.println("메세지))삭제할 상품이 없습니다.");
		}
		else {
			int i = 0;
			System.out.println("| 순번 | 제품 | 가격 | 재고 |");
			for(Product temp : saleItem) {
				System.out.printf("| %d | %s | %s | %s |\n",(i+1),temp.getName(),df.format(temp.getMoney()),df2.format(temp.getItem()));
				i++;
			}
			System.out.print("번호입력 : \n");
			try {
				int num = scanner.nextInt();
				if(num > saleItem.size()) {
					System.out.println("메세지)) 존재하지 않는 상품입니다.");
				}
				else {
					saleItem.remove(num-1);
					DB.itemSave();
				}
			}
			catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	public void itemCheckList() {
		System.out.println("상품 목록))");
		int i = 0;
		System.out.println("| 순번 | 제품 | 가격 | 재고 |");
		for(Product temp : saleItem) {
			System.out.printf("| %d | %s | %s | %s |\n",(i+1),temp.getName(),df.format(temp.getMoney()),df2.format(temp.getItem()));
			i++;
		}
	}
	public void buy(int num) {
		Customer customer = new Customer(saleItem.get(num).getName(), saleItem.get(num).getItem(), saleItem.get(num).getMoney());
		customerlist.add(customer);
	}
}
