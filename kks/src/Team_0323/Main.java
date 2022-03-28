package Team_0323;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Main main = new Main();
			Controller con = new Controller();
			
			DB db = new DB();
			db.memberLoad();
			db.movieLoad();
			db.ticketLoad();
			
			while(true) {
				try {
					////�󿵿�ȭ���////
					Date date = new Date();
					SimpleDateFormat nowdate = new SimpleDateFormat("yyyy - MM - dd HH : mm");
					String nowInTime = nowdate.format(date);
					System.out.println("E.zen ��ȭ�� Ȩ������))");
					System.out.println("--------------------------------------------------------");
					System.out.println("|\t���� �ð� : "+ nowInTime+ "\t\t|");
					System.out.println("--------------------------------------------------------");
					System.out.printf("|\t%s\t\t| %s | %s | %s\n","����","���� �ð�","���� �ð�","����");
					System.out.println("--------------------------------------------------------");
					for(Movie movie : Controller.movielist) {

						String[] new_intime = movie.getIntime().split(":");
						String[] new_runtime = movie.getRuntime().split(":");
						int intime_hour = Integer.parseInt(new_intime[0]);
						int intime_min = Integer.parseInt(new_intime[1]);
						int runtime_hour = Integer.parseInt(new_runtime[0]);
						int runtime_min = Integer.parseInt(new_runtime[1]);
						int outhour = (intime_hour+runtime_hour);
						int outmin = (intime_min+runtime_min);
						if(outmin > 60) {
							outmin -= 60;
							outhour += 1;
						}
						DecimalFormat df = new DecimalFormat("00");
						String out1 = df.format(outhour);
						String out2 = df.format(outmin);
						String outtime = out1+":"+out2;
						
						DecimalFormat df2 = new DecimalFormat("#,##0��");
						String new_money = df2.format(movie.getMoney());
						
						System.out.printf("|\t%s\t\t| %s | %s | %s |\n", movie.getTitle(), movie.getIntime(),outtime,new_money);
					}
					System.out.println("--------------------------------------------------------");
					System.out.println("�޴�)) ");
					System.out.println("1.ȸ������ 2.�α��� 3.��ȸ������ 4.���̵�ã�� 5.��й�ȣã�� 6.����"); 
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
					else if(ch.equals("3") || ch.equals("��ȸ������")){
						System.out.println("�޼���)) ���α׷��� ���� �մϴ�.");
					}
					else if(ch.equals("4") || ch.equals("���̵�ã��")) {
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
					else if(ch.equals("5") || ch.equals("��й�ȣã��")){
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
					else if(ch.equals("6") || ch.equals("����")){
						System.out.println("�޼���)) ���α׷��� ���� �մϴ�.");
						break;
					}
					else {System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
					}
				}
				catch(Exception e) {}
			}
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
				Date date = new Date();
				SimpleDateFormat nowdate = new SimpleDateFormat("HH : mm");
				String nowTime = nowdate.format(date);
				
				System.out.println("-------------���� ������ ��ȭ-----------");
				System.out.println("��ȣ\t��ȭ����\t\t��ȭ�󿵽ð�");
				int i=0;
				for(Movie movie : Controller.movielist) {
					System.out.printf("%d\t%s\t\t%s \n",(i), movie.getTitle(),movie.getIntime());
					i++;
				}
				System.out.println("-------------------------------------");
				System.out.println("��ȭ����: "); 
				int index = scanner.nextInt();

				String[] thistime = Controller.movielist.get(index).getIntime().split(":");
				
				System.out.println("-------------------------------------");
				
				for(Ticket ticket : Controller.ticketlist) {
					if(Controller.movielist.get(index).getTitle().equals(ticket.getT_title())) {
						Controller.theater[ticket.getT_seat()] = "[ X  ]";
					}
				}
				for(int a=0; a<Controller.theater.length; a++) {
					System.out.print(Controller.theater[a]);
					 if(a%10==9) {
						 if(a==9) {
							 System.out.println("A��");
						 }
						 if(a==19) {
							 System.out.println("B��");
						 }
						 if(a==29) {
							 System.out.println("C��");
						 }
						 if(a==39) {
							 System.out.println("D��");
						 }
						 if(a==49) {
							 System.out.println("E��");
						 }
					 }
				}
				System.out.println("-------------------------------------");
				System.out.println("�¼�����: "); 
				int seat = scanner.nextInt();
				boolean pass = true;
				String Tseat = null;
				for(int p=0; p<Controller.theater.length;p++) {
					if(Controller.theater[seat].equals("[ X  ]") || Controller.theater[seat].equals("[ R  ]")) {
						System.err.println("�̹� ���õ� �¼��Դϴ�.");
						pass = false;
						break;
					}
					else {
						Controller.theater[seat] = "[ X  ]";
						if(seat<=9) {
							Tseat = "A��"+seat+"��";
							System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
							break;
						}
						else if(seat<=19) {
							Tseat = "B��"+seat+"��";
							System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
							break;
						}
						else if(seat<=29) {
							Tseat = "C��"+seat+"��";
							System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
							break;
						}
						else if(seat<=39) {
							Tseat = "D��"+seat+"��";
							System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
							break;
						}
						else if(seat<=49) {
							Tseat = "E��"+seat+"��";
							System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
							break;
						}
						else {System.err.println("�޼���)) �ش� �¼��� �����ϴ�.");
						}
					}
				}
				if(pass) {
					con.reserve(id,Controller.movielist.get(index).getTitle(),Controller.movielist.get(index).getIntime(),
						Controller.movielist.get(index).getRuntime(),Controller.movielist.get(index).getMoney(),seat);
				}
			}
			else if(ch.equals("2")||ch.equals("�������")){
				
				System.out.println("-------------���� ��ȭ-----------");
				System.out.println("��ȣ\t��ȭ����\t\t��ȭ�󿵽ð�\t�ڸ�\t���Ź�ȣ");
				
				int i=0;
				for(Ticket ticket  : Controller.ticketlist) {
					if(ticket.getT_id().equals(id)) {
					System.out.printf("%d\t%s\t\t%s\t\t%d\t%d \n",(i+1), ticket.getT_title(),ticket.getT_intime(),ticket.getT_seat(),ticket.getT_num());
					}
					i++;
				}
				System.out.println("-------------------------------------");
				System.out.println("��ȭ����: "); 
				int index = scanner.nextInt();
				index -= 1;
				if(index < Controller.ticketlist.size()){
					for(Ticket temp :Controller.ticketlist) {
					
						if(temp.getT_id().equals(id)&&temp.getT_title().equals(Controller.ticketlist.get(index).getT_title())&&temp.getT_seat() == Controller.ticketlist.get(index).getT_seat()) {
							con.cancle(index);
							break;
						}
					
					}
				}
				else {
					System.out.println("���¹�ȣ");
				}
			}
			else if(ch.equals("3")||ch.equals("����Ȯ��")) {
				
				System.out.println("-------------���� ��ȭ-----------");
				System.out.println("��ȣ\t��ȭ����\t\t��ȭ�󿵽ð�\t�ڸ�\t���Ź�ȣ");
				
				int i=0;
				for(Ticket ticket  : Controller.ticketlist) {
					if(ticket.getT_id().equals(id)) {
					System.out.printf("%d\t%s\t\t%s\t\t%d\t%d \n",(i+1), ticket.getT_title(),ticket.getT_intime(),ticket.getT_seat(),ticket.getT_num());
					}
					i++;
				}
				System.out.println("-------------------------------------");
				System.out.println("1.�ڷΰ���"); 
				String confirm = scanner.next();
				
				if(confirm.equals("1") || confirm.equals("�ڷΰ���") || confirm.equals("�ڷ�")) {
					System.out.println("���� �޴��� �̵��մϴ�.");
				}
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
			System.out.println("1.��ȭ��� 2.��ȭ���� 3.����Ȯ�� 4.ȸ����� 5.�α׾ƿ�"); 
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
				System.out.println("��ȭ ����))");
				System.out.println("���� ��ȭ ���))----------------------------------");
				int i = 0;
				for(Movie temp : Controller.movielist) {
					System.out.println((i+1)+temp.getTitle());
					i++;
				}
				System.out.println("----------------------------------------------");
				System.out.println("��ȣ�Է� : ");
				int num = 0;
				while(true) {
					boolean pass = true;
					try {
						num = scanner.nextInt();
						
					}
					catch(Exception e) {
						System.out.println("�޼���)) �߸��� �Է�");
						pass = false;
					}
					if(pass) {
						break;
					}
				}
				con.movie_remove(num);
			}
			else if(ch.equals("3")||ch.equals("����Ȯ��")) {
				System.out.println("");
			}
			else if(ch.equals("4")||ch.equals("ȸ�����")) {
				for(Member temp : Controller.memberlist) {
					System.out.println(temp.getId());
				}
			}
			else if(ch.equals("5")||ch.equals("���Ÿ��")) {
				
				System.out.println("-------------���� ������ ��ȭ-----------");
				System.out.println("��ȣ\t��ȭ����\t\t��ȭ�󿵽ð�");
				int i=0;
				for(Movie movie : Controller.movielist) {
					System.out.printf("%d\t%s\t\t%s \n",(i), movie.getTitle(),movie.getIntime());
					i++;
				}
				System.out.println("-------------------------------------");
				System.out.println("��ȭ����: "); 
				
				int index = scanner.nextInt();
				for(Ticket ticket : Controller.ticketlist) {
					if(Controller.movielist.get(index).getTitle().equals(ticket.getT_title())) {
						Controller.theater[ticket.getT_seat()] = "[ X  ]";
					}
				}
				for(int a=0; a<Controller.theater.length; a++) {
					System.out.print(Controller.theater[a]);
					 if(a%10==9) {
						 if(a==9) {
							 System.out.println("A��");
						 }
						 if(a==19) {
							 System.out.println("B��");
						 }
						 if(a==29) {
							 System.out.println("C��");
						 }
						 if(a==39) {
							 System.out.println("D��");
						 }
						 if(a==49) {
							 System.out.println("E��");
						 }
					 }
				}
				
			}
			else if(ch.equals("6")||ch.equals("�α׾ƿ�")) {
				System.out.println("�޼���)) �α׾ƿ� �߽��ϴ�.");
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
}