package Team_0323;

import java.text.DecimalFormat;
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
		//��üȭ
		Member member = new Member( id, pw, name, phone,false);
		//ȸ������ ����
		memberlist.add(member);
		
		db.memberSave();
		return 1;
	}
	
	public String login(String id,String pw) {
		
		db.memberLoad();
		
		//�α��� �ߺ�üũ
		for(Member temp : memberlist) {
			if(temp!=null) {
				if(id.equals("admin") && temp.getPw().equals(pw)) {
					return "admin";
				}
				else if(temp.getId().equals(id)&&temp.getPw().equals(pw)) {
					return temp.getId(); //�α��μ��� ����Ʈ���ִ� ���̵� ����
				}
				
			}
			
		}
		return "false";
	}
	
	
	public String findid(String name, String phone) {//���̵�ã��

		for(Member temp : memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public String findpw(String id,String phone) {
		for(Member temp : memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
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
				System.out.println("1)��й�ȣ ����  2)ȸ�� Ż��  3)�ڷΰ���");
				String work = scanner.next();
				
				if(work.equals("1")) {
					changepw(id);
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
	
	public void changepw(String id) {
		System.out.println("��й�ȣ ����)) ");
		System.out.println("��й�ȣ : ");
		String pw = scanner.next();
		String new_pw = null;
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				while(true) {
					int pass = 0;
					System.out.println(" ������ ��й�ȣ �Է� : "); 
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
				break;
			}
		}
	}
	
	public void singOut(String id) {
		
	}
	
	//��ȭ�ý���///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//������ �ý���/////////////////////////////////////////////////////////////////////////
	
	public void moive_register () {}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
