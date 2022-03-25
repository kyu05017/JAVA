package Team_0323;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	
	// ȸ������Ʈ
	static ArrayList<Member> memberlist = new ArrayList<>();
	// ��ȭ����Ʈ
	static ArrayList<Movie> movielist = new ArrayList<>();
	
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

		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public String findpw(String id,String phone) {
		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "false";
	}
	
	public void changepw() {}
	
	//��ȭ�ý���///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//������ �ý���/////////////////////////////////////////////////////////////////////////
	
	public void moive_register () {}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
