package Team_0323;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		Controller con = new Controller();
		DB db = new DB();
		
		while(true) {
			try {
				////�󿵿�ȭ���////
				////
				System.out.println("�޴�)) ");
				System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����"); 
				System.out.println("���� : ");
				String ch = scanner.next();
				
				if(ch.equals("1") || ch.equals("ȸ������")) {
					
					db.memberLoad();

					String id = null;
					String pw = null;
					String phone = null;
					int allpass = 0;
					
					while(true) {
						System.out.println("���̵�: "); 
						id = scanner.next();
						int pass = 1;
						for(Member temp : Controller.memberlist) {
							if (temp !=null &&  temp.getId().equals(id)) {
								//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
								System.out.println("�޼���)) ���� ������� ���̵��Դϴ�.");
								pass = 0;
								break; //�Լ����� --->���̵��ߺ����� ȸ������ ����
							}
						}
						if(pass == 1) {
							allpass += 1;
							break;
						}
					}
					
					while(true) {
						int pass = 0;
						System.out.println("��й�ȣ: "); 
						pw = scanner.next();
						if(pw.length() < 8) {
							System.out.println("�޼���)) ��й�ȣ�� ���̴� 8�ڸ� �̻��̿��� �մϴ�.");
							pass = 0;
						}
						else {
							pass = 1;
						}
						if(pass == 1) {
							allpass += 1;
							break;
						}
					}

					System.out.println("�̸�: "); 
					String name = scanner.next();
					
					while(true) {
						int pass = 0;
						System.out.println("��ȭ��ȣ: "); 
						phone = scanner.next();
						
						if(phone.length() >= 12 || phone.length() < 10) {
							System.out.println("�޼���)) �߸��� ������ ��ȣ�Դϴ�.");
							pass = 0;
						}
						else {
							pass = 1;
							for(Member temp : Controller.memberlist) {
								if (temp !=null &&  temp.getPhone().equals(phone)) {
									System.out.println("�޼���)) �̹� ��ϵ� ��ȭ��ȣ�Դϴ�.");
									pass = 0;
									break;
								}
							}
						}
						if(pass == 1) {
							allpass += 1;
							break;
						}
					}
					
					///����
					if(allpass == 3) {
						int result = con.sign(id, pw,name,phone);
						
						if(result == 1) {
							System.out.println("�޼���)) ȸ������ ����");
						}
					}
					else {
					System.out.println("�޼���)) ȸ������ ����");
					}

				}
				else if(ch.equals("2") || ch.equals("�α���")) {
					System.out.println("���̵�: "); 
					String id = scanner.next();
					System.out.println("��й�ȣ: "); 
					String pw = scanner.next();
					
					String result = con.login(id, pw); // ���ϰ� String�̴ϱ� String ���� result����
					
					if(result.equals("admin")) {
						System.out.println("�޼���))������ �α���");
						main.adminmenu();
					}
					else if(result.equals("false")) {
						System.out.println("�޼���)) �α��� ����");
					}
					else { 
						System.out.println("�޼���)) "+result + "�� ȯ�� �մϴ�.");
						main.membermenu(result);
					}

				}
				else if(ch.equals("3") || ch.equals("���̵�ã��")) {
					System.out.println("�̸�: "); 
					String name = scanner.next();
					System.out.println("��ȭ��ȣ: "); 
					String phone = scanner.next();
					
					String result = con.findid(name,phone);
					
					if(result.equals("false")) {
						System.out.println("�޼���)) �������� �ʴ� ȸ���Դϴ�.");
					}
					else {
						System.out.println("�޼���)) ȸ������ ���̵�� "+ result + " �Դϴ�.");
					}
				}
				else if(ch.equals("4") || ch.equals("��й�ȣã��")){
					System.out.println("���̵�: "); 
					String id = scanner.next();
					System.out.println("��ȭ��ȣ: "); 
					String phone = scanner.next();
					
					String result = con.findid(id,phone);
					
					if(result.equals("false")) {
						System.out.println("�޼���)) �������� �ʴ� ȸ���Դϴ�.");
					}
					else {
						System.out.println("�޼���)) ȸ������ ��й�ȣ�� "+ result + " �Դϴ�.");
					}
				}
				else if(ch.equals("5") || ch.equals("����")){
					System.out.println("�޼���)) ���α׷��� ���� �մϴ�.");
					break;
				}
				else {System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
				}
			}
			catch(Exception e) {}
		}
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void membermenu(String id) {
		
		Controller con = new Controller();
		
		while(true) {
			System.out.println("ȸ���޴�))");
			System.out.println("1.���� 2.������� 3.����Ȯ�� 4.ȸ������ 5.�α׾ƿ�"); 
			System.out.println("���� : ");
			String ch = scanner.next();
			
			if(ch.equals("1")||ch.equals("����")) {
				System.out.println("��ȭ����: "); 
				String title = scanner.nextLine();
				//////�ش� ��ȭ�� �󿵽ð� ���//
				System.out.println("��ȭ�ð�: "); 
				String intime = scanner.next();
				////������ ��ȭ�� �󿵰� �¼� ����///
				System.out.println("�¼�����: "); 
				String seat = scanner.next();
			}
			else if(ch.equals("2")||ch.equals("�������")){
				System.out.println("��ȭ����: "); 
				String title = scanner.nextLine();
				//////�ش� ��ȭ�� �󿵽ð� ���//
				System.out.println("��ȭ�ð�: "); 
				String intime = scanner.next();
				//////�������
			}
			else if(ch.equals("3")||ch.equals("����Ȯ��")) {
				////////���Ÿ�� �ڵ�����
				////////////////
				System.out.println("1.������� 2.�ڷΰ���"); 
				String confirm = scanner.next();
			}
			else if(ch.equals("4")||ch.equals("ȸ������")) {
				con.memberInfo(id);
			}
			else if(ch.equals("5")||ch.equals("�α׾ƿ�")) {
				System.out.println("�޼���)) �α׾ƿ� �߽��ϴ�.");
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
	public void adminmenu() {
		
		while(true) {
			System.out.println("������ �޴�))");
			System.out.println("1.��ȭ��� 2.��ȭ���� 3.����Ȯ�� 4.�α׾ƿ�"); 
			System.out.println("���� : ");
			String ch =scanner.next();
			if(ch.equals("1")||ch.equals("��ȭ���")) {
				System.out.println("��ȭ����: "); 
				String title = scanner.nextLine();
				System.out.println("�󿵰�����: "); 
				String screen = scanner.next();
				System.out.println("��ȭ�ð�: "); 
				String intime = scanner.next();
			}
			else if(ch.equals("2")||ch.equals("��ȭ����")){
				System.out.println("��ȭ����: "); 
				String title = scanner.nextLine();
				System.out.println("�󿵰�����: "); 
				String screen = scanner.next();
				System.out.println("��ȭ�ð�: "); 
				String intime = scanner.next();
			}
			else if(ch.equals("3")||ch.equals("����Ȯ��")) {
				System.out.println("");
			}
			else if(ch.equals("4")||ch.equals("�α׾ƿ�")) {
				System.out.println("�޼���)) �α׾ƿ� �߽��ϴ�.");
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
}