package 개인과제13_회원제도서프로그램;

public class Account {
	
	int number;
	String id;
 	String pw;
	String name;
	String phone;
	
	
	public Account() {
		
	}

	public Account(int number,String id, String pw, String name, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	
	int registration(String id, String pw, String name, String phone) {
		
		boolean pass = true;
		
		for(Account temp : Main.accountlist) {
			if(temp != null && temp.id.equals(id)) {
				pass = false;
				return 50;
			}
		}
		
		
		int num = 0;
		int i = 1;
		for(Account temp : Main.accountlist) {
			if(temp == null) {
				if(i == 0) {
					num = 1;
				}
				else {
					num = Main.accountlist[i-1].number +1;
					break;
				}
			}
			i++;
		}
		
		Account memberSave = new Account(num, id, pw, name, phone);
		
		int j = 0;
		for(Account temp : Main.accountlist) {
			if(temp == null) {
				Main.accountlist[i] = memberSave;
				return 1;
			}
			j++;
		}
		
		return 0;
	}
	
	String login(String id, String pw) {
		
		for(Account temp : Main.accountlist) {
			if(temp != null && id.equals("admin") && temp.pw.equals(pw)) {
				return "admin";
			}
			else if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				return temp.id;
			}
		}
		return null;
		
	}
	
	String findId(String name, String phone) {
		for(Account temp : Main.accountlist) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
				return temp.id;
			}
		}
		return "false";
		
	}
	
	
	String findPw(String id, String phone) {
		for(Account temp : Main.accountlist) {
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
				return temp.pw;
			}
		}
		return "false";
		
	}
	
}
