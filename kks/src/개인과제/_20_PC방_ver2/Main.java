package ���ΰ���._20_PC��_ver2;

public class Main {
	
	public static void main(String[] args) {
		Control con = new Control();
		Main main = new Main();
		DB.memberLoad();
		
		while(true) {
			
			System.out.println("-------------------------------------------------");
			System.out.println("�����ڸ�))");
			
			for(int i = 0; i < Control.PC.length; i++) {
				System.out.print(Control.PC[i]);
				if(i%5==0)System.out.println();
			}
			for(Member temp : Control.memberList) {
				System.out.println(temp.getId());
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
				
			}
			else if(tesk.equals("4")) {
				
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
				System.out.println("");
			}
		}
	}
	
	public void memberMenu(String id) {
		
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
			for(Member temp : Control.memberList) {
				if(id.equals(temp.getId())) {
					
					System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
				}
			}
			System.out.println("�޴�))");
			System.out.println("1)�ð��߰� 2)�ڸ����� 3)�ڸ��̵� 4)�԰Ÿ��ֹ� 5)�α׾ƿ� 6)���θ޴�(��ǻ������x)");
			String tesk = Control.scanner.next();
			
			if(tesk.equals("1")) {
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
				
			}
			else if(tesk.equals("3")) {
				
			}
			else if(tesk.equals("4")) {
	
			}
			else if(tesk.equals("5")) {
				System.out.println("�޼���)) �α׾ƿ� �մϴ�.");
				break;
			}
			else if(tesk.equals("6")) {
				System.out.println("�޼���)) ���θ޴��� ���ư��ϴ�.");
				break;
			}	
			
		}
	}
	
	public void adminMenu() {
		
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
			System.out.println("1)�����α׾ƿ� 2)ȸ����� 3)�ð����� 4)����Ȯ�� 5)�α׾ƿ�");
			String tesk = Control.scanner.next();
			
			if(tesk.equals("1")) {
				
			}
			else if(tesk.equals("2")) {
				
			}
			else if(tesk.equals("3")) {
				
			}
			else if(tesk.equals("4")) {
	
			}
			else if(tesk.equals("5")) {
				System.out.println("�޼���)) �α׾ƿ� �մϴ�.");
				break;
			}		
			
		}
	}
	
	
	
}
