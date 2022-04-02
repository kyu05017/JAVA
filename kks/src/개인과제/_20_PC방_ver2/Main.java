package ���ΰ���._20_PC��_ver2;

import java.text.DecimalFormat;
import java.util.Hashtable;

public class Main {
	
	public static void main(String[] args) {
		Control con = new Control();
		Main main = new Main();
		PcUse use = new PcUse();
		DB.memberLoad();
		DB.itemLoad();
		DB.Load();
		
		for(Member temp : Control.memberList) {
			if(temp.isUse() == true && temp.getTime() != 0) {
				if(temp.getId().equals("admim")) {
					
				}
				else {
					Control.PC[temp.getSeat()]="[o]";
				}
			}
		}
		use.start();
		while(true) {
			
			for(Member temp : Control.memberList) {
				if(temp.isUse() == true && temp.getTime() == 0) {
					if(temp.getId().equals("admim")) {
						
					}
					else {
						Control.PC[temp.getSeat()]="[ ]";
						temp.setUse(false);
						temp.setSeat(0);
						Control.PC[0]="[ī����]";
					}
				}
			}
			System.out.println("-------------------------------------------------");
			System.out.println("�����ڸ�))");
			
			for(int i = 0; i < Control.PC.length; i++) {
				System.out.print(Control.PC[i]);
				if(i%5==0)System.out.println();
			}
			System.out.println();
			System.out.println("�ڹ� PC��))");
			System.out.println("1)ȸ������ 2)�α��� 3)���̵�ã�� 4)��й�ȣã�� 5)����");
			System.out.println("-------------------------------------------------");
			
			String tesk = Control.scanner.next();
			
			if(tesk.equals("1")) {
				con.signUp();
			}
			else if(tesk.equals("2")) {
				String result = con.logIn();
				
				if(result.equals("admin")) {
					System.out.println("�޼���)) ������ �α���");
					main.adminMenu();
				}
				else if(result.equals("false")) {
					System.out.println("�޼���)) �α��ο� ���� �߽��ϴ�.");
				}
				else {
					System.out.printf("�޼���)) %s�� �湮�� �ּż� �������ϴ�.\n",result);
					main.memberMenu(result);
				}
			}
			else if(tesk.equals("3")) {
				con.findid();
			}
			else if(tesk.equals("4")) {
				con.findpw();
			}
			else if(tesk.equals("5")) {
				System.out.println("���α׷� ����))");
				System.out.println("������ ��й�ȣ �Է� : ");
				String admin_Pw = Control.scanner.next();
				boolean exit = false;
				for(Member temp : Control.memberList) {
					if(admin_Pw.equals(temp.getPw())) {
						System.out.println("�޼���)) �ý����� ���� �մϴ�.");
						exit = true;
					}
					else {
						System.out.println("�޼���)) �����ڸ� �̿밡���մϴ�.");
						exit = false;
					}
				}
				if(exit) {
					break;
				}
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
	
	public void memberMenu(String id) {
		
		Control con = new Control();
		
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("���� �ڸ�))");
			//����� �ڸ��迭�� ������
			for(int i = 0; i < Control.PC.length; i++) {
				System.out.print(Control.PC[i]);
				if(i%5==0)System.out.println();
				//0�� �����ϰ� 5������ �ٹٲ�
			}
			for(Member temp : Control.memberList) {
				if(id.equals(temp.getId())) {
					if(temp.isUse() == true) {
						System.out.println("�̿����� �ڸ� "+temp.getSeat() + "��");
					}
					else {
						System.out.println("�޼���)) �ڸ��� �������ּ���.");
					}
					if(temp.getTime() == 0) {
						System.out.println("�޼���)) �ð��� �������ּ���.");
					}
					else {
						System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
					}
				}
			}
			System.out.println("�޴�))");
			System.out.println("0)�԰Ÿ�");
			System.out.println("1)�ð��߰� 2)�ڸ����� 3)�ڸ��̵� 4)������ 5)������� 6)���θ޴�(��ǻ������x)");
			System.out.println("--------------------------------------------------------");
			String tesk = Control.scanner.next();
			if(tesk.equals("0")) {
				while(true) {
					System.out.println("�԰Ÿ� �޴�))");
					System.out.println("1)���� 2)���ų��� 3)���ư���");
					String work = Control.scanner.next();
					if(work.equals("1")) {
						if(Control.saleItem.size() == 0) {
							System.out.println("�޼���)) ��ǰ ���� ������ ����");
						}
						else {
							int e = 0;
							System.out.println("| ���� | ��ǰ | ���� |");
							for(Product temp : Control.saleItem) {
								System.out.printf("| %d | %s | %s |\n",(e+1),temp.getName(),Control.moneySet.format(temp.getMoney()));
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
										con.buy(id,itemNum);
									}
			
								}
								catch(Exception a) {
									
								}
							}
						}
					}
					else if(work.equals("2")) {
						System.out.println("Ȯ��");
						con.buylist(id);
					}
					else if(work.equals("3")) {
						System.out.println("�������� ���ư��ϴ�.");
						break;
					}
					else {
						System.out.println("�������� �ʴ� �޴��Դϴ�.");
					}
				}
			}
			else if(tesk.equals("1")) {
				System.out.println("�ð� �߰�))");
				System.out.println("1)1�ð�(60��)  2)2�ð�(120��) ");
				System.out.println("3)5�ð�(300��) 4)�ð��Է�(��)  ");
				
				int insert_Time = 0;
				while(true) {
					try {
						insert_Time = Control.scanner.nextInt();
						break;
					}
					catch(Exception e) {
						System.out.println("�޼���)) ���ڸ� �Է°��� �մϴ�.");
					}
				}
				
				if(insert_Time <= 0) {
					System.out.println("�޼���)) �߸��� �Է��Դϴ�.");
				}
				else if(insert_Time == 1) {
					System.out.println("�޼���)) 1�ð��� �߰��Ͽ����ϴ�.");
					con.addTime(id,insert_Time);
				}
				else if(insert_Time == 2) {
					System.out.println("�޼���)) 2�ð��� �߰��Ͽ����ϴ�.");
					con.addTime(id,insert_Time);
				}
				else if(insert_Time == 3) {
					System.out.println("�޼���)) 3�ð��� �߰��Ͽ����ϴ�.");
					con.addTime(id,insert_Time);
				}
				else if(insert_Time == 4) {
					System.out.println("�޼���)) ����� �ð��� �Է��ϼ���");
					System.out.println("�Է� : ");
					int insert_Time2 = 0;
					while(true) {
						try {
							insert_Time2 = Control.scanner.nextInt();
							if(insert_Time2 < 60) {
								System.out.println("�޼���)) �ּ� 1�ð�(60��) �̻� �Է°��� �մϴ�.");
							}
							else if(insert_Time > 1000) {
								System.out.println("�޼���)) 1000�� ���ϸ� �����մϴ�.");
							}
							else {
								break;
							}
							
						}
						catch(Exception e) {
							System.out.println("�޼���)) ���ڸ� �Է°��� �մϴ�.");
						}
					}
					con.addTime(id,insert_Time2);
				}
			
			}
			else if(tesk.equals("2")) {
				for(Member temp : Control.memberList) {
					if(temp.getId().equals(id) && temp.isUse() == true) {
						System.out.println("�޼���)) �̹� PC�� �̿����Դϴ�.");
						break;
					}
					else if(temp.getId().equals(id) && temp.getTime() == 0) {
						System.out.println("�޼���)) �̿�ð��� ���� �������ּ���.");
						break;
					}
					else {
						con.startPC(id);
						break;
					}
				}
			}
			else if(tesk.equals("3")) {
				for(Member temp : Control.memberList) {
					if(temp.getId().equals(id) && temp.isUse() == false) {
						System.out.println("�޼���)) ���� PC�� �̿��ϰ� ���� �ʽ��ϴ�.");
						break;
					}
					else {
						con.ChangePC(id);
						break;
					}
				}
			}
			else if(tesk.equals("4")) {
				con.myinfo(id);
			}
			else if(tesk.equals("5")) {
				System.out.println("�޼���)) ������� �մϴ�.");
				con.endPC(id);
				break;
			}
			else if(tesk.equals("6")) {
				System.out.println("�޼���)) ���θ޴��� ���ư��ϴ�.");
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
	
	public void adminMenu() {
		Control con = new Control();
		
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("���� �ڸ�))");
			//����� �ڸ��迭�� ������
			for(int i = 0; i < Control.PC.length; i++) {
				System.out.print(Control.PC[i]);
				if(i%5==0)System.out.println();
				//0�� �����ϰ� 5������ �ٹٲ�
			}
			System.out.println("������ �޴�))");
			System.out.println("0)��ǰ�߰� 6)���Ȯ�� 7)ǰ�����");
			System.out.println("1)�����α׾ƿ� 2)ȸ����� 3)�ð����� 4)����Ȯ�� 5)�α׾ƿ�");
			
			System.out.println("-------------------------------------------------");
			String tesk = Control.scanner.next();
			if(tesk.equals("0")) {
				con.addItem();
			}
			else if(tesk.equals("1")) {
				con.members();
				System.out.println("�α׾ƿ��� ȸ�� ��ȣ �Է� : ");
				con.changeTime();
			}
			else if(tesk.equals("2")) {
				con.members();
			}
			else if(tesk.equals("3")) {
				con.members();
				System.out.println("������ ȸ�� ��ȣ �Է� : ");
				con.changeTime();
			}
			else if(tesk.equals("4")) {
				System.out.println("ȸ���� ������Ȳ");
				con.sale();
			}
			else if(tesk.equals("5")) {
				System.out.println("�޼���)) �α׾ƿ� �մϴ�.");
				break;
			}
			else if(tesk.equals("6")) {
				con.itemCheckList();
			}
			else if(tesk.equals("7")) {
				con.removeItem();
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
}
