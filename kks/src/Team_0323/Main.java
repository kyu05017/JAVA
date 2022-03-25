package Team_0323;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		Controller con = new Controller();
		DB db = new DB();
		db.memberLoad();
		db.movieLoad();
		
		while(true) {
			try {
				////�󿵿�ȭ���////
				System.out.println("--------------------------------------------------------");
				System.out.println("|    ���� ������ ��ȭ     | ��ȭ���۽ð� |    ��ȭ�����½ð�       |");
				System.out.println("--------------------------------------------------------");
				for(Movie movie : Controller.movielist) {
					
					movie.getIntime();
					movie.getRuntime();
					String[] new_intime = movie.getIntime().split(":");
					String[] new_runtime = movie.getRuntime().split(":");
					int intime_hour = Integer.parseInt(new_intime[0]);
					int intime_min = Integer.parseInt(new_intime[1]);
					int runtime_hour = Integer.parseInt(new_runtime[0]);
					int runtime_min = Integer.parseInt(new_runtime[1]);
					int outhour = (intime_hour+runtime_hour);
					int outmin = (intime_min+runtime_min);
					DecimalFormat df = new DecimalFormat("00");
					String out1 = df.format(outhour);
					String out2 = df.format(outmin);
					String outtime = out1+":"+out2;
					
					System.out.printf("|\t%s\t| %s | %s | \n", movie.getTitle(), movie.getIntime(),outtime);
				}
				for(Member temp : con.memberlist) {
					System.out.println(temp.getId());
				}
				
				System.out.println("�޴�)) ");
				System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����"); 
				System.out.println("���� : ");
				String ch = scanner.next();
				
				if(ch.equals("1") || ch.equals("ȸ������")) {

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
		
		Controller con = new Controller();
		
		while(true) {
			System.out.println("������ �޴�))");
			System.out.println("1.��ȭ��� 2.��ȭ���� 3.����Ȯ�� 4.�α׾ƿ�"); 
			System.out.println("���� : ");
			String ch =scanner.next();
			if(ch.equals("1")||ch.equals("��ȭ���")) {
				
				System.out.println("��ȭ���� : ");		
				String title = scanner.next();
				boolean pass1 = false;
				int hour = 0;
				while(true) {
					System.out.println("���� �ð�: ");	
					hour = scanner.nextInt();
					if(hour > 23) {
						System.out.println("�޼���)) �ٽ� �Է��ϼ���");
						pass1 = false;
					}
					else {
						pass1 = true;
					}
					if(pass1) {
						break;
					}
				}
				DecimalFormat df = new DecimalFormat("00");
				String start_hour = df.format(hour);
				int min = 0;
				boolean pass2 = false;
				while(true) {
					System.out.println("���� ��: ");	
					min = scanner.nextInt();
					if(min > 59) {
						System.out.println("�޼���)) �ٽ� �Է��ϼ���");
						pass2 = false;
					}
					else {
						pass2 = true;
					}
					if(pass2) {
						break;
					}
				}
				df = new DecimalFormat("00");
				String start_min = df.format(min);
				
				String intime = start_hour+":"+start_min;
				boolean moviest_admin = true;
				
				while(moviest_admin) {
					if (intime.length() != 5) {
						System.out.println("�޼���)) �Է¿���");
						System.out.println("���� �ð�: ");	
						start_hour = scanner.next();
						System.out.println("���� ��: ");	
						start_min = scanner.next();
						intime = start_hour+":"+start_min;
					}else {
						moviest_admin = false;
					}
				}
				
				System.out.println("����Ÿ��(��) : ");		
				int time = scanner.nextInt();
				
				int runhour = time/60;
				int runmin = time%60;
				
				df = new DecimalFormat("00");
				String new_runhour = df.format(runhour);
				String new_runmin = df.format(runmin);
				String runtime = new_runhour+":"+new_runmin;
				Boolean movierun_admin = true;
				while(movierun_admin) {
					if (runtime.length() != 5) {
						System.out.println("�ٽ� �Է����ּ���.");
						System.out.println("����Ÿ��(��) : ");		
						time = scanner.nextInt();
						
						runhour = time/60;
						runmin = time%60;
						new_runhour = df.format(runhour);
						new_runmin = df.format(runmin);
						
						runtime = new_runhour+":"+new_runmin;
					}else {
						movierun_admin = false;
					}
				}
				con.moive_register(title, intime, runtime);
				
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