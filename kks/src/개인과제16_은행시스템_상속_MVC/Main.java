package ���ΰ���16_����ý���_���_MVC;

import java.util.Scanner;


public class Main {
	// ����������΃E [ ��� ]
				// ����[super]
				// ��������[sub], ��������[sub], �ϳ�����[sub]
				
				// �� ��� : 1. ���»���/ 2.�Ա� / 3. ��� /4.��ü/ 5.�� ���� ��� / 6.����
		
		// main �ۿ� ���� �ϴ� ����
			// ��� Ŭ�������� ����ϱ� ���� static ���
			// static ������ ���α׷� ���۽� �޸� �Ҵ� > ������ ���� �޸� ����
		public static Bank[] banks = new Bank[1000];
		
		public static void main(String[] args) {
			Main aa = new Main();
			aa.menu();
		}
		void menu() {
			Scanner scanner = new Scanner(System.in);
			while(true) {
				
				Controller controler = new Controller();
				System.out.println("----------------------�޴�----------------------");
				System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.�� ���� 6.���� 7.�α׾ƿ�");
				System.out.print("�޴� ���� : \n");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("���»��� ������))");
					System.out.println("��й�ȣ �Է� : ");
					String pw = scanner.next();
					System.out.println("������ �Է�	  : ");
					String name = scanner.next();
					System.out.println("���� ���(1.�������� 2.�������� 3.��������)");
					System.out.print("���༱�� : \n"); 
					int bankcompanynum = scanner.nextInt();
					String result  = controler.resregistration(pw, name, bankcompanynum);
					
					if(result != null) {
						System.out.println("�˸�)) ���� ������ �Ϸ� �Ǿ����ϴ�.");
						System.out.println("���¹�ȣ�� "+ result + "�Դϴ�.");
					}
					else {System.out.println("�˸�)) ���� ��Ͽ� �����߽��ϴ�.");}
				}
				
				else if(ch == 2) {
					
					System.out.println("�Ա� ������))");
					System.out.println("���¹�ȣ �Է� : ");
					String bknum = scanner.next();
					System.out.println("�Ա��� �ݾ� �Է� : ");
					int putmoney = scanner.nextInt();
					int inmoney = controler.inmoney(bknum,putmoney);
					
					if(inmoney == 0) {
						System.out.println("�˸�)) "+putmoney+"���� "+bknum+"���·� �Ա��� �Ϸ� �Ǿ����ϴ�.");
					}
					else if(inmoney == 2){
						System.out.println("�˸�)) ���¹�ȣ �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
					}
					else {System.out.println("�˸�)) �Աݿ� ���� �߽��ϴ�.");}
				}
				
				else if(ch == 3) {
					
					System.out.println("��� ������))");
					System.out.println("���¹�ȣ �Է� : ");
					String bknum = scanner.next();
					System.out.println("��й�ȣ �Է� : ");
					String pw = scanner.next();
					System.out.println("����� �ݾ� �Է� : ");
					
					int putmoney = scanner.nextInt();
					int outmoney = controler.outmoney(bknum,pw,putmoney);
					if(outmoney == 0) {
						System.out.println("�˸�)) "+putmoney+"���� "+bknum+"���¿��� ����� �Ϸ� �Ǿ����ϴ�.");
					}
					else if(outmoney == 2){
						System.out.println("�˸�)) ���¹�ȣ �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
					}
					else if(outmoney == 3){
						System.out.println("�˸�)) �ܾ��� �����Ͽ� ��ݿ� �����߽��ϴ�.");
					}
					else {System.out.println("�˸�)) ��ݿ� ���� �߽��ϴ�.");}
				}
				
				else if(ch == 4) {
					
					System.out.println("��ü ������))");
					System.out.println("���¹�ȣ �Է� : ");
					String bknum = scanner.next();
					System.out.println("��й�ȣ �Է� : ");
					String pw = scanner.next();
					System.out.println("�޴� ����� ���¹�ȣ �Է� : ");
					String bknum2 = scanner.next();
					System.out.println("��ü�� �ݾ� �Է� : ");
					int putmoney = scanner.nextInt();
					int reslut = controler.sendmoney(bknum,pw,bknum2,putmoney);
					
					if(reslut == 2) {
						System.out.println("���¹�ȣ "+ bknum2+ "�� "+putmoney+"���� ��ü �߽��ϴ�.");
					}
					else if(reslut == 4) {
						System.out.println("�˸�)) ���¹�ȣ Ȥ�� ��й�ȣ�� �߸��Է��߽��ϴ�.");
					}
					else if(reslut == 1) {
						System.out.println("�˸�)) ���¿� �ܾ��� �����Ͽ� ��ü�� �����߽��ϴ�.");
					}
					else {
						System.out.println("�˸�)) ��ü�� �����߽��ϴ�.");
					}
				}
				else if(ch == 5) {
					System.out.println("�� ���� ��� ������))");
					System.out.println("������ �Է� : ");
					String name = scanner.next();
					System.out.println("����\t���¹�ȣ\t�ܾ�\t�����");
					Bank[] mybanklist = controler.mylist(name);
					
					int i = 1;
					for(Bank temp : mybanklist) {
						if(temp != null) {
						System.out.printf("%d\t%s\t%d��\t%d��\n",i,temp.getBanknum(),temp.getMymoney(),temp.getLoanmoney());
						i++;
						}
					}
				}
				
				else if(ch == 6) {
					
					System.out.println("���� ������))");
					System.out.println("1)���� 2)��ȯ");
					int ch2 = scanner.nextInt();
					
					if(ch2 == 1) {
						System.out.println("����))");
						System.out.println("���¹�ȣ �Է� : ");
						String bnum = scanner.next();
						System.out.println("��й�ȣ �Է� : ");
						String pw = scanner.next();
						System.out.println("���� ���� �ݾ� �Է� (������ 10%)");
						int loan = scanner.nextInt();
						boolean result = controler.loanmoney(bnum,pw,loan);
						if(result) {
							System.out.println("�˸�)) ������ ���� �Ϸ�Ǿ����ϴ�.");
							System.out.println(bnum+"���¿� "+loan+"���� �ԱݵǾ����ϴ�. ( ���� 10% )");
						}
						else {
							System.out.println("�˸�)) ������ �����Ǿ����ϴ�.");
						}
					}
					else if(ch2 == 2) {
						System.out.println("��ȯ))");
						System.out.println("���¹�ȣ �Է� : ");
						String bnum = scanner.next();
						System.out.println("��й�ȣ �Է� : ");
						String pw = scanner.next();
						
						for(Bank temp : Main.banks) {
							if(temp!=null && bnum.equals(temp.getBanknum()) && pw.equals(temp.getBankpw())) {
								System.out.println("����� ��ȯ �ݾ��� "+temp.getLoanmoney()+"�� �Դϴ�.");
							}
						}
						System.out.println("1)��ȯ 2) ���ư���");
						int ch3 = scanner.nextInt();
						if(ch3 == 1) {
							boolean result = controler.outloan(bnum,pw);
						
							if(result) {
								System.out.println("�˸�)) ��ȯ�� �Ϸ��߽��ϴ�.");
							}
							else {
								System.out.println("�˸�)) ��ȯ�� �����߽��ϴ�.");
							}
						}
						else if(ch3 == 2) {
							System.out.println("�˸�)) �������� ���ư��ϴ�.");
						}
						else {
							System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
						}
						
					}
					else {
						System.out.println("�˸�)))�߸��� �Է��Դϴ�.");
					}
					
				}
				else if(ch == 7) {
					System.out.println("�˸�)) ���α׷��� �����߽��ϴ�.");
					break;
				}
				else {System.out.println("�˸�))�߸��� �Է�");}
			}
		}
	}// m c e
