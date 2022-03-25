package Team_0323;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Controller {
	
	// ȸ������Ʈ
	static ArrayList<Member> memberlist = new ArrayList<>();
	// ��ȭ����Ʈ
	static ArrayList<Movie> movielist = new ArrayList<>();
	
	static String[] theater = {	"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",};
	
	Scanner scanner = new Scanner(System.in);
	DB db = new DB();
	//ȸ�� �ý��� ////////////////////////////////////////////////////////////////////////
	
	public int sign (String id, String pw,String name, String phone) {
		
		Member member = new Member( id, pw, name, phone,false);
		memberlist.add(member);
		db.memberSave();
		return 1;
	}
	
	public String login(String id,String pw) {
		

		for(Member temp : memberlist) {
			if(temp!=null) {
				if(id.equals("admin") && temp.getPw().equals(pw)) {
					return "admin";
				}
				else if(temp.getId().equals(id)&&temp.getPw().equals(pw)) {
					return temp.getId();
				}
				
			}
			
		}
		return "false";
	}
	
	
	public String findid(String name, String phone) {//���̵�ã��

		for(Member temp : memberlist) {
			if(temp!=null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public String findpw(String id,String phone) {
		for(Member temp : memberlist) {
			if(temp!=null && temp.getId().equals(id) && temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "false";
	}
	
	public void memberInfo(String id) {
		System.out.println("ȸ�� ����))");
		for(Member temp : memberlist) {
			if(temp.getId().equals(id)) {
				System.out.println("-------------------------------");
				System.out.println("���̵� : " + temp.getId());
				System.out.println("�̸�  : " + temp.getName());
				System.out.println("��ȣ  : " + temp.getPhone());
				System.out.println("-------------------------------");
				System.out.println("1)��й�ȣ ����  2)ȸ��Ż��  3)�ڷΰ���");
				String work = scanner.next();
				
				if(work.equals("1")) {
					boolean result = changepw(id);
					if(result) {
						System.out.println("�޼���)) ��й�ȣ ����Ϸ�");
					}
					else {
						System.out.println("�޼���)) ��к�ȣ �������");
					}
				}
				else if(work.equals("2")) {
					singOut(id);
				}
				else if(work.equals("3")) {
					System.out.println("�޼���)) �������� ���ư��ϴ�.");
				}
				
			}
				
		}
		
		
	}
	
	public boolean changepw(String id) {
		
		System.out.println("��й�ȣ ����)) ");
		System.out.println("��й�ȣ : ");
		String pw = scanner.next();
		String new_pw = null;
		
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				while(true) {
					int pass = 0;
					System.out.println("������ ��й�ȣ �Է� : "); 
					new_pw = scanner.next();
					if(new_pw.length() < 7) {
						System.out.println("�޼���)) ��й�ȣ�� ���̴� 8�ڸ� �̻��̿��� �մϴ�.");
						pass = 0;
					}
					else {
						pass = 1;
					}
					if(pass == 1) {
						break;
					}
				}
				temp.setPw(new_pw);
				db.memberSave();
				return true;
			}
		}
		return false;
	}

	public void singOut(String id)  {
		System.out.println("ȸ�� Ż��))");
		System.out.println("��й�ȣ �Է� : ");
		String pw = scanner.next();
		
		for(Member temp : memberlist) {
	
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				System.out.println("�޼���)) ���� Ż���Ͻðڽ��ϱ�?");
				System.out.println("1)��     2)�ƴϿ�");
				String work = scanner.next();
				if(work.equals("1") || work.equals("��")) {
					memberlist.remove(temp);
					break;
				}
				else if (work.equals("2") || work.equals("�ƴϿ�")) {
					System.out.println("���� �޴��� ���ư��ϴ�.");
					break;
				}
				
			}
		}
		db.memberSave();
		return ;
	}
	
	//��ȭ�ý���///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//������ �ý���/////////////////////////////////////////////////////////////////////////
	
	public void moive_register (String title, String intime, String runtime) {

		String [] startTime = intime.split(":");
		
		int startHour = Integer.parseInt(startTime[0]);

		int money = 0;
		
		if (startHour <= 10) {
			money = 5000;
		}else {
			money = 7000;
		}
		Movie movie = new Movie(title, intime, runtime , money);
		movielist.add(movie);
		db.movieSave();
		System.out.println("��ȭ ���� �Ϸ�");
		
	}

	
	public void movie_remove (int num) {
		
		System.out.println("�޼���)) ���� �����Ͻðڽ��ϱ�?");
		System.out.println("1)��  2)�ƴϿ�");
		String work = scanner.next();
		
		if(work.equals("1") || work.equals("��")) {
			num -= 1;
			movielist.remove(num);
		}
		else if(work.equals("2") || work.equals("�ƴϿ�")) {
			
		}
		db.movieSave();
	}
	
	public void sale() {}
	
	
	
}
