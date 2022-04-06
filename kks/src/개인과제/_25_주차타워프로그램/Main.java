package ���ΰ���._25_����Ÿ�����α׷�;

import java.text.DecimalFormat;



public class Main {
	
	public static void main(String[] args) {
		
		Control con = new Control();
		DB.inCarLoad();
		DB.daysaleLode();
		
		while(true) {
			
			try {
				System.out.println("���� �޴�))");
				 //���������� ����
				for(Car temp : Control.carlist){
					if(temp != null) {						
						Control.tower[temp.getParking()] = "["+temp.getCarNum()+"]";
					}
				}
				
				for(int i = 0; i < Control.tower.length; i++) {
					 System.out.print(Control.tower[i]);
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
				System.out.println("1)���� 2)���� 3)����Ȯ�� 4)����Ȯ�� 5)����");
				String ch = Control.scanner.next();
				//�����԰� �޴�
				if(ch.equals("1") || ch.equals("����")) {
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���. (�� 4�ڸ��� �Է�)");
					int carNum = Control.scanner.nextInt();
					if(carNum > 10000) {
						System.out.println("�޼���)) �ùٸ��� ���� ��ȣ�Դϴ�.");
					}
					else {
						System.out.println("������ ������ ��ġ�� �Է��ϼ���. (0 ~ 11)");
						int parkNum = Control.scanner.nextInt();
						
						if(!Control.tower[parkNum].equals("[    ]")) {
							System.out.println("�̹� ������� ���������Դϴ�.");
						}
						else {
							DecimalFormat df = new DecimalFormat("0000"); 
							String setcarnum = df.format(carNum);
							Control.tower[parkNum] = "["+setcarnum+"]";
							int num = con.CarIn(setcarnum,parkNum);
							
							if(num == 20) {
								System.out.println(setcarnum+" ������ ���� �԰� �Ǿ����ϴ�.");
							}
							else {
								System.out.println("������ �����԰� ���� �ʾҽ��ϴ�.");
							}
						}
					}
				}
				//���� ��� �޴�
				else if(ch.equals("2") || ch.equals("����")) {
	
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���. (�� 4�ڸ��� �Է�)");
					int carNum = Control.scanner.nextInt();
					System.out.println("������ ������ ��ġ�� �Է��ϼ���. (0 ~ 11)");
					int parkNum = Control.scanner.nextInt();
					DecimalFormat df = new DecimalFormat("0000"); 
					String setcarnum = df.format(carNum);
					boolean pass = true;
					for(Car temp : Control.carlist) {
						if(temp != null && temp.getCarNum().equals(setcarnum)) {
							int aa = Integer.parseInt(temp.getCarNum());
							if(carNum != aa) {
								System.out.println("�������� �ʴ� �����Դϴ�.");
								pass = false;
								break;
							}
						}
					}
					if(Control.tower[parkNum].equals("[    ]")) {
						System.out.println("���� ����ִ� �������� �Դϴ�.");
						pass = false;
					}
					if(pass) {
						con.CarOut(setcarnum);
						Control.tower[parkNum] = "[    ]";
						
					}
					else {
						System.out.println("�������� ���߽��ϴ�.");
					}
				
				}
				//����Ȯ�� �޴�
				else if(ch.equals("3") || ch.equals("����Ȯ��")) {
					
					System.out.println("��¥ �˻�");
					System.out.println("���� : "); 
					int year = Control.scanner.nextInt();
					System.out.println("��  : "); 
					int month = Control.scanner.nextInt();	
					
					if(year > 2100 || month > 13 ) {
						System.out.println("���� Ȥ�� ���Է��� �߸��Ǿ����ϴ�.");
					}
					else {
						con.salelist(year,month);
					}
				}
				//���� Ȯ�� �޴�
				else if(ch.equals("4") || ch.equals("���� Ȯ��")) {
					System.out.println("Ȯ���� ���� ��ȣ�� �Է��ϼ���. (�� 4�ڸ��� �Է�)");
					String carNum = Control.scanner.next();
					System.out.println("���ڵ� ����)) " + carNum);
					int result = con.CarList(carNum);
					
					if(result == 0) {
						System.out.println("���");
					}
					else if(result == 1) {
						System.out.println("�������� �ʴ� �����Դϴ�.");
					}
				}
				else if(ch.equals("5") || ch.equals("����")) {
					System.out.println("���α׷��� ���� �մϴ�.");
					Control.scanner.close();
					break;
				}
				else {
					 System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
