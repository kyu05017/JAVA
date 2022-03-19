package Team2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] tower = { "[    ]","[    ]","[    ]","[    ]",
	 			"[    ]","[    ]","[    ]","[    ]",
	 			"[    ]","[    ]","[    ]","[    ]",};
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		con.inCarLoad();
		while(true) {
			try {
				System.out.println("���� �޴�))");
				 //���������� ����
				for(Car temp : Controller.carlist){
					if(temp != null) {
						tower[temp.getParking()] = "["+temp.getCarNum()+"]";
					}
				}
				for(int i = 0; i < tower.length; i++) {
					 System.out.print(tower[i]);
					 if(i%4==3) {
						 if(i==3) {
							 System.out.println("1��");
						 }
						 if(i==7) {
							 System.out.println("2��");
						 }
						 if(i==11) {
							 System.out.println("3��");
						 }
					 }
				 }
				
				//�޴�
				System.out.println();
				System.out.println("1)���� 2)���� 3)����Ȯ�� 4)����Ȯ��");
				String ch = scanner.next();
				//�����԰� �޴�
				if(ch.equals("1") || ch.equals("����")) {
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���. (�� 4�ڸ��� �Է�)");
					String carNum = scanner.next();
					System.out.println("������ ������ ��ġ�� �Է��ϼ���. (0 ~ 11)");
					int parkNum = scanner.nextInt();
					tower[parkNum] = "["+carNum+"]";
					int num = con.CarIn(carNum,parkNum);
					if(num == 50) {
						System.out.println("�̹� �԰�� �����Դϴ�.");
					}
					else if(num == 20) {
						System.out.println(carNum+" ������ ���� �԰� �Ǿ����ϴ�.");
					}
					else if(num == 40) {
						System.out.println(carNum+" �̹� ���� �Ǿ��ִ� �ڸ� �Դϴ�.");
					}
					else if(num == 0) {
						System.out.println("������ ���� �԰� ���� �ʾҽ��ϴ�.");
					}
				}
				//���� ��� �޴�
				else if(ch.equals("2") || ch.equals("����")) {
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���. (�� 4�ڸ��� �Է�)");
					String carNum = scanner.next();
					System.out.println("������ ������ ��ġ�� �Է��ϼ���. (0 ~ 11)");
					int parkNum = scanner.nextInt();
					tower[parkNum] = "[    ]";
					con.CarOut(carNum);
				}
				//����Ȯ�� �޴�
				else if(ch.equals("3") || ch.equals("����Ȯ��")) {
					System.out.println("��¥ �˻�");
					System.out.println("���� : "); int year = scanner.nextInt();
					System.out.println("��  : "); int month = scanner.nextInt();	
					con.sales(year,month);
				}
				//���� Ȯ�� �޴�
				else if(ch.equals("4") || ch.equals("���� Ȯ��")) {
					System.out.println("Ȯ���� ���� ��ȣ�� �Է��ϼ���. (�� 4�ڸ��� �Է�)");
					String carNum = scanner.next();
					System.out.println("���ڵ� ����)) " + carNum);
					con.CarList(carNum);
				}
				else {
					 System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
				}
				
				
				
				
				
				
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

		
		
	}// m e
} // c e
