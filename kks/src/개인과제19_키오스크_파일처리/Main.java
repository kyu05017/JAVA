package ���ΰ���19_Ű����ũ_����ó��;

public class Main {
	
	public static void main(String[] args) {
		
		DB.itemLoad();
		
		while(true) {
			
			System.out.println("Ű����ũ))");
			System.out.println("| ���� | ��ǰ | ���� |");
			int i = 0;
			for(Product temp : Control.saleItem) {
				System.out.printf("| %d | %s | %s |\n",(i+1),temp.getName(),Control.df.format(temp.getMoney()));
				i++;
			}
			System.out.println();
			System.out.println("�޴�))");
			System.out.println("1)���� 2)�����ڸ޴�");
			String work = Control.scanner.next();
			
			if(work.equals("1") || work.equals("����")) {
				Control con = new Control();
				if(Control.saleItem.size() == 0) {
					System.out.println("�޼���)) ��� ���� ������ ����");
				}
				else {
					int j = 0;
					for(Product temp : Control.saleItem) {
						System.out.printf("| %d | %s | %s |\n",(j+1),temp.getName(),Control.df.format(temp.getMoney()));
						i++;
					}
					System.out.println("95)���ſϷ� 99)�ڷΰ���");
					System.out.println("�޴�)) ǰ���� :");
					while(true) {
						try {
							int itemNum = Control.scanner.nextInt();
							itemNum -= 1;
							if(itemNum > Control.saleItem.size()) {
								System.out.println("�޼���)) �������� �ʴ� ǰ�� �Դϴ�.");
							}
							if(itemNum == 99) {
								System.out.println("�޼���)) ���� �޴��� ���ư��ϴ�.");
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
			else if(work.equals("2") || work.equals("������") || work.equals("�����ڸ޴�")) {
				System.out.println("��й�ȣ �Է� : ");
				String pw = Control.scanner.next();
				if(pw.equals("1234")) {
					while(true) {
						Control con = new Control();
						System.out.println("������ �޴�))");
						System.out.println("1) ����߰� 2) ���Ȯ�� 3) ǰ����� 4)�α׾ƿ�");
						String work2 = Control.scanner.next();
						
						if(work2.equals("1") || work2.equals("����߰�")) {
							con.addItem();
						}
						else if(work2.equals("2") || work2.equals("���Ȯ��")) {
							con.itemCheckList();
						}
						else if(work.equals("3") || work2.equals("ǰ�����")) {
							con.removeItem();
						}
						else if(work.equals("4") || work2.equals("�α׾ƿ�")) {
							System.out.println("�޼���)) ���θ޴��� ���ư��ϴ�.");
							break;
						}
						else {
							System.out.println("�޼���)) �߸��� �Է��Դϴ�.");
						}
					}
				}
				else {
					System.out.println("�޼���)) �����ڿ� ������");
				}
			}
			else if(work.equals("4") || work.equals("����")) {
				System.out.println("�޼���)) ���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
}
