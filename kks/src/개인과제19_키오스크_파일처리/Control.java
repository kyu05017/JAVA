package ���ΰ���19_Ű����ũ_����ó��;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	
	static ArrayList<Product> saleItem = new ArrayList<>();
	static ArrayList<Customer> customerlist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	static DecimalFormat df = new DecimalFormat("#,###��");
	static DecimalFormat df2 = new DecimalFormat("####�ڽ�");
	
	public void addItem() {
		
		System.out.println("��� �� ǰ�� �߰�))");
		System.out.println("1) ǰ�� �߰� 2) ��� �߰�");
		
		String work3 = scanner.next();
		while(true) {
			
			if(work3.equals("1")) {
				System.out.println("ǰ���߰�))");
				System.out.println();
				System.out.print("��ǰ�̸� : \n");
				String name = scanner.next();
				
				int price = 0;
				int item = 0;
				boolean pass1 = true;
				while(pass1) {
					try {
						System.out.print("��ǰ���� : \n");
						price = scanner.nextInt();
						if(price <= 0) {
							System.out.println("�޼���) ���� ���� �Դϴ�.");
							pass1 = true;
						}
						else {
							pass1 = false;
						}
					}
					catch(Exception e) {
						System.out.println("�޼���)) �߸��� �Է��Դϴ�.");
						pass1 = true;
					}
				}
				boolean pass2 = true;
				while(pass2) {
					try {
						System.out.print("������ ���� : \n");
						item = scanner.nextInt();
						if(item <= 0) {
							System.out.println("�޼���) �ּ� 1������ ���� �����մϴ�.");
							pass2 = true;
						}
						else {
							pass2 = false;
						}
					}
					catch(Exception e) {
						System.out.println("�޼���)) �߸��� �Է��Դϴ�.");
						pass2 = true;
					}
				}
				System.out.println("-------------------");
				System.out.println("��ǰ��� �� ����))");
				System.out.println("��ǰ��	: " + name);
				System.out.println("����	: " + df.format(price));
				System.out.println("���ֹ���	: " + df2.format(item));
				System.out.println("-------------------");
				System.out.println("1)Ȯ�� 2)���");
				String work4 = scanner.next();
				
				if(work4.equals("1")) {
					System.out.println("�޼���)) ���� �� ��� �Ϸ�");
					Product product = new Product(name, item, price);
					saleItem.add(product);
					DB.itemSave();
					break;
				}
				else if(work4.equals("2")) {
					System.out.println("�޼���)) ���� �޴��� ���ư��ϴ�.");
					break;
				}
			}
			else if(work3.equals("2")) {
				System.out.println("��� �߰�))");
				if(saleItem.size() == 0) {
					System.out.println("�޼���))�߰� ������ ��ǰ�� �����ϴ�.");
				}
				else {
					int i = 0;
					System.out.println("| ���� | ��ǰ | ���� | ��� |");
					for(Product temp : saleItem) {
						System.out.printf("| %d | %s | %s | %s |\n",(i+1),temp.getName(),df.format(temp.getMoney()),df2.format(temp.getItem()));
						i++;
					}
					System.out.print("��ȣ�Է� : \n");
					try {
						boolean pass = true;
						int add_Item = 0;
						int num = 0;
						while(pass) {
							num = scanner.nextInt();
							if(num-1 > saleItem.size()) {
								System.out.println("�޼���)) �������� �ʴ� ��ǰ�Դϴ�.");
								pass = false;
							}
						}
						boolean pass2 = true;
						while(pass2) {
							add_Item = scanner.nextInt();
							if(add_Item <= 0) {
								System.out.println("�޼���)) �ּ� 1�� �̻� ���� �����մϴ�.");
							}
						}
						num -= 1;
						System.out.println("-------------------");
						System.out.println("��ǰ��� �� ����))");
						System.out.println("��ǰ��	: " + saleItem.get(num).getName());
						System.out.println("����	: " + df.format(saleItem.get(num).getMoney()));
						System.out.println("���ֹ���	: " + df2.format(saleItem.get(num).getItem()));
						System.out.println("-------------------");
						System.out.println("1)Ȯ�� 2)���");
						String work4 = scanner.next();
						
						if(work4.equals("1")) {
							System.out.println("�޼���)) ���� �Ϸ�");
							saleItem.get(num).setItem(add_Item);
							DB.itemSave();
							break;
						}
						else if(work4.equals("2")) {
							System.out.println("�޼���)) ���� �޴��� ���ư��ϴ�.");
							break;
						}
					}
					
					catch (Exception e) {
						System.out.println("�߸��� �Է��Դϴ�.");
					}
				}
			}
		}
	}
	
	public void removeItem() {
		System.out.println("��ǰ����))");
		if(saleItem.size() == 0) {
			System.out.println("�޼���))������ ��ǰ�� �����ϴ�.");
		}
		else {
			int i = 0;
			System.out.println("| ���� | ��ǰ | ���� | ��� |");
			for(Product temp : saleItem) {
				System.out.printf("| %d | %s | %s | %s |\n",(i+1),temp.getName(),df.format(temp.getMoney()),df2.format(temp.getItem()));
				i++;
			}
			System.out.print("��ȣ�Է� : \n");
			try {
				int num = scanner.nextInt();
				if(num > saleItem.size()) {
					System.out.println("�޼���)) �������� �ʴ� ��ǰ�Դϴ�.");
				}
				else {
					saleItem.remove(num-1);
					DB.itemSave();
				}
			}
			catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	
	public void itemCheckList() {
		System.out.println("��ǰ ���))");
		int i = 0;
		System.out.println("| ���� | ��ǰ | ���� | ��� |");
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
