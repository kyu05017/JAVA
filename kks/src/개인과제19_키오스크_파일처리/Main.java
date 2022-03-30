package ���ΰ���19_Ű����ũ_����ó��;

import java.text.DecimalFormat;
import java.util.Hashtable;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		DB.itemLoad();
		
		while(true) {
			
			System.out.println("Ű����ũ))");
			System.out.println("| ���� | ��ǰ | ���� |");
			int t = 0;
			for(Product temp : Control.saleItem) {
				System.out.printf("| %d | %s | %s |\n",(t+1),temp.getName(),Control.df.format(temp.getMoney()));
				t++;
			}
			System.out.println();
			System.out.println("�޴�))");
			System.out.println("1)���� 2)�����ڸ޴�");
			String work = Control.scanner.next();
			
			if(work.equals("1") || work.equals("����")) {
				Control con = new Control();
				if(Control.saleItem.size() == 0) {
					System.out.println("�޼���)) ��ǰ ���� ������ ����");
				}
				else {
					int e = 0;
					System.out.println("| ���� | ��ǰ | ���� |");
					for(Product temp : Control.saleItem) {
						System.out.printf("| %d | %s | %s |\n",(e+1),temp.getName(),Control.df.format(temp.getMoney()));
						e++;
					}
					System.out.println("����)���� 99)�ڷΰ���");
					System.out.printf("�޴�)) ǰ���� : (%d : ���� )\n",Control.saleItem.size()+1);
					while(true) {
						try {
							int itemNum = Control.scanner.nextInt();
							itemNum -= 1;
							if(itemNum > Control.saleItem.size()+2) {
								System.out.println("�޼���)) �������� �ʴ� ǰ�� �Դϴ�.");
							}
							else if(itemNum+1 == Control.saleItem.size()+1) {
								try {
									Hashtable <String, Integer> map = new Hashtable<>();
									DecimalFormat df2 = new DecimalFormat("#,##0��");
									
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
										System.out.println("��ǰ "+temp+ " " + new_money);
									}
									//�� ����� ǥ��
									int totalsales = 0;
									for (int i = 0; i < Control.customerlist.size(); i++) {
										 totalsales += Control.customerlist.get(i).getC_Pay();
									}
									String new_money = df2.format(totalsales);
									System.out.println("�� �����ݾ� : " + new_money);
									System.out.println("---------------------------------------------");
									System.out.println("1) ���� 2) ���");
									int ch = Control.scanner.nextInt();
									if(ch == 1) {
										System.out.println("������ �ݾ��� �Է��ϼ���.");
										int pay_money = Control.scanner.nextInt();
										if(pay_money < totalsales) {
											System.out.println("���� �ݾ� ����");
										}
										else if(pay_money >= totalsales) {
											if(pay_money - totalsales == 0) {
												System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
											}
											else {
												String change = df2.format(pay_money - totalsales);
												System.out.println("������ �Ϸ�Ǿ����ϴ�. �Ž������� "+change+ "�Դϴ�.");	
											}
											
											break;
										}
									}
									else if (ch == 2) {
										System.out.println("������ ����մϴ�.");
										break;
									}
								}//try end
								catch(Exception a) {
									
								}
							}
							else {
								System.out.println(Control.saleItem.get(itemNum).getName()+" ��ǰ�� ��ҽ��ϴ�.");
								con.buy(itemNum);
							}
	
						}
						catch(Exception a) {
							
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
