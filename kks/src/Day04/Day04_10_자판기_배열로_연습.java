package Day04;

import java.util.Scanner;

public class Day04_10_���Ǳ�_�迭��_���� {// c s

	public static void main(String[] args) {// m s
		
		//1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
		//1.�޴��ǿ��� ��ǰ�� �����ϸ� ��ٱ��Ͽ� �ֱ�
		//2.���� �����ϸ� �˸�(�������)
			//2. �ʱ� ��� [ ��ǰ �� 10���� ]
			//3. ������ �ݾ��� �Է¹޾� ������ ��ŭ ������ �ܵ� ���
		//1. ������ �ݾ׺��� ���ž��� �� ũ�� ���� ��� [ ���� �����ϸ� ]
		//2.
		
		Scanner scanner = new Scanner(System.in);
		String[] menu = {"�ݶ�", "ȯŸ", "���̴�", "����", "�������", "����߰�"};
		int[] item = new int[3];
		int[] itemNum = {10, 10, 10};
		int[] prize = {300,200,100};
		int pw = 1234;
		
		while(true) {
			
			System.out.println("------------------------(���Ǳ�)------------------------");
			System.out.println(" "+menu[0]+"(300��) "+menu[1]+"(200��) "+menu[2]+"(100��)  "+menu[3]+"  "+menu[4]+"  "+menu[5]);
			System.out.println("------------------------------------------------------");
			
			String work = scanner.nextLine();
			
			if(work.equals("�ݶ�") || work.equals("1")) {
				if(itemNum[0] == 0) {
					System.out.println("�˸�) "+menu[0]+"  ��� �����մϴ�.");
				}
				else {
					System.out.println("��ٱ��Ͽ� "+menu[0]+"�� �߰��ϼ̽��ϴ�.");
					item[0] += 1;
					itemNum[0] -= 1;
				}
			}
			if(work.equals("ȯŸ") || work.equals("2")) {
				if(itemNum[1] == 0) {
					System.out.println("�˸�) "+menu[1]+" ��� �����մϴ�.");
				}
				else {
					System.out.println("��ٱ��Ͽ� "+menu[1]+"�� �߰��ϼ̽��ϴ�.");
					item[1] += 1;
					itemNum[1] -= 1;
				}
			}
			if(work.equals("���̴�") || work.equals("3")) {
				if(itemNum[2] == 0) {
					System.out.println("�˸�) "+menu[2]+" ��� �����մϴ�.");
				}
				else {
					System.out.println("��ٱ��Ͽ� "+menu[2]+"�� �߰��ϼ̽��ϴ�.");
					item[2] += 1;
					itemNum[2] -= 1;
				}
			}
			if(work.equals("����") || work.equals("4")) {
				System.out.println("------------��ٱ���------------");
				System.out.println("ǰ��\t����\t  �ݾ�\t");
				if(item[0] != 0)System.out.println(menu[0] +"     \t"+ item[0] +"         "+ (item[0]*prize[0]));
				if(item[1] != 0)System.out.println(menu[1] +"     \t"+ item[1] +"         "+ (item[1]*prize[1]));
				if(item[2] != 0)System.out.println(menu[2] +"  \t"+ item[2] +"         "+ (item[2]*prize[2]));
				System.out.println("1.����     2.�������");
				
				String pay = scanner.nextLine();
				if(pay.equals("����") || pay.equals("1")) {
					int totalPay = (item[0]*prize[0])+(item[1]*prize[1])+(item[2]*prize[2]);
					System.out.println("------------����â------------");
					System.out.println("�Ѱ��� �ݾ��� " + totalPay+"�� �Դϴ�.");
					System.out.println("���� �޾��� �Է��ϼ���.");
					while(true) {
						int payMoney = scanner.nextInt();
						if(payMoney < totalPay) {
							System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է����ּ���.");
							System.out.println("������Ҵ� 2���� �Է����ּ���.");
							if(payMoney == 2) {
								System.out.println("������ ����߽��ϴ�.");
								itemNum[0] += item[0];
								itemNum[1] += item[1];
								itemNum[2] += item[2];
								item[0] = 0;
								item[1] = 0;
								item[2] = 0;
								break;
							}
						}
						else {
							int change = payMoney - totalPay;
							if (change == 0) {
								System.out.println("������ �Ϸ� �Ǿ����ϴ�. �����մϴ�.");
								
								item[0] = 0;
								item[1] = 0;
								item[2] = 0;
								break;
							} 
							else {
								System.out.println("������ �Ϸ� �Ǿ����ϴ�. �Ž������� " + change +"���Դϴ�. �����մϴ�.");
								
								item[0] = 0;
								item[1] = 0;
								item[2] = 0;
								break;
							}
						}
					}
				}	
				if(pay.equals("���") || pay.equals("2") || pay.equals("�������")) {
					System.out.println("������ ����߽��ϴ�.");
					itemNum[0] += item[0];
					itemNum[1] += item[1];
					itemNum[2] += item[2];
					item[0] = 0;
					item[1] = 0;
					item[2] = 0;
				}
			}
			if(work.equals("���") || work.equals("5")) {
				System.out.println("�������");
				System.out.println("1)"+menu[0]+" :" + itemNum[0]+"��");
				System.out.println("2)"+menu[1]+" :" + itemNum[1]+"��");
				System.out.println("3)"+menu[2]+":" + itemNum[2]+"��");
			}
			if(work.equals("�߰�") || work.equals("6")) {
				System.out.println("������ ��й�ȣ �Է�");
				int inputPw = scanner.nextInt();
				int plusItem;
				
				if (pw == inputPw) {
					while(true) {
						System.out.println("�߰��� ǰ�� ���� 4)����");
						System.out.println("1)"+menu[0]+" :" + itemNum[0]+"��");
						System.out.println("2)"+menu[1]+" :" +  itemNum[1]+"��");
						System.out.println("3)"+menu[2]+":" +  itemNum[2]+"��");
						String work2 = scanner.nextLine();
						if(work2.equals("�ݶ�") || work2.equals("1")) {
							System.out.println(menu[0]+"�� ��� �߰� �մϴ�");
							System.out.println("�߰��� ������ �Է��ϼ���");
							plusItem = scanner.nextInt();
							itemNum[0] += plusItem;
							System.out.println("�߰������");
							System.out.println(menu[0]+"��" + plusItem+"�� ��ŭ �߰� �Ǿ����ϴ�.");
						}
						else if(work2.equals("ȯŸ") || work2.equals("2")) {
							System.out.println(menu[1]+"�� ��� �߰� �մϴ�");
							System.out.println("�߰��� ������ �Է��ϼ���");
							plusItem = scanner.nextInt();
							itemNum[1] += plusItem;
							System.out.println("�߰������");
							System.out.println(menu[1]+"��" + plusItem+"�� ��ŭ �߰� �Ǿ����ϴ�.");
						}
						else if(work2.equals("���̴�") || work2.equals("3")) {
							System.out.println(menu[2]+"�� ��� �߰� �մϴ�");
							System.out.println("�߰��� ������ �Է��ϼ���");
							plusItem = scanner.nextInt();
							itemNum[2] += plusItem;
							System.out.println("�߰������");
							System.out.println(menu[2]+"��" + plusItem+"�� ��ŭ �߰� �Ǿ����ϴ�.");
						}
						else if(work2.equals("����") || work2.equals("4")) {
							System.out.println("�޴��� ���ư��ϴ�");
							break;
						}
					}
				}
				else {
					System.out.println("������ ������ �����ϴ�.");
				}
			}
		}
	}//m e
}//c e
