package 개인과제._13_회원제도서프로그램;

public class Member_tesk_3 {
	
	int member_Number;
	String id;
	String password;
	String name; 
	String phone;
	
	public Member_tesk_3() {

	}

	public Member_tesk_3(int member_Number, String id, String password, String name, String phone) {
		this.member_Number = member_Number;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	int registration(String id, String password, String name, String phone) {
		
		boolean pass = true;
		
		for(Member_tesk_3 temp : Main_3.memberlist) {
			if(temp != null && temp.id.equals(id)) {
				pass = false;
				return 5;
			}
		}
		int num = 0;
		int i = 0;
		for(Member_tesk_3 temp : Main_3.memberlist) {
			if(temp == null) {
				if(i == 0) {
					num = 1;
					break;
				}
				else {
					num = Main_3.memberlist[i-1].member_Number + 1;
					break;
				}
			}
			i++;
		}
		
		Member_tesk_3 account = new Member_tesk_3(num, id, password, name, phone);
		
		int j = 0;
		for(Member_tesk_3 temp : Main_3.memberlist) {
			if(temp == null) {
				Main_3.memberlist[i] = account;
				return 1;
			}
		}
		return 0;
	}
	
	String signIn(String id, String password) {
		
		for(Member_tesk_3 temp : Main_3.memberlist) {
			if(temp != null && id.equals("admin") && temp.password.equals(password)) {
				return "admin";
			}
			else if(temp != null && temp.id.equals(id) && temp.password.equals(password)) {
				return temp.id;
			}
		}
		return null;
	}
	
	String findId(String name, String phone) {
		
		for(Member_tesk_3 temp : Main_3.memberlist) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
				return temp.id;
			}
		}
		return null;
	}
	
	String findPassword(String id, String phone) {
		
		for(Member_tesk_3 temp : Main_3.memberlist) {
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
				return temp.password;
			}
		}
		return null;
	}
}
