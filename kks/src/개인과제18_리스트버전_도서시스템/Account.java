package 개인과제18_리스트버전_도서시스템;

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
		
		for(Account temp : Main.accountsList) {
			if(temp != null && temp.id.equals(id)) {
				pass = false;
				return 50;
			}
		}
		
		
		int num = 0;
		int i = 1;
		for(Account temp : Main.accountsList) {
			if(temp == null) {
				if(i == 0) {
					num = 1;
				}
				else {
					num = Main.accountsList.get(i).number +1;
					break;
				}
			}
			i++;
		}
		
		Account memberSave = new Account(num, id, pw, name, phone);
		
		System.out.println(num);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		System.out.println(phone);
		
		Main.accountsList.add(memberSave);

		
		return 0;
	}
	
	String login(String id, String pw) {
		
		for(Account temp : Main.accountsList) {
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
		for(Account temp : Main.accountsList) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
				return temp.id;
			}
		}
		return "false";
		
	}
	
	
	String findPw(String id, String phone) {
		for(Account temp : Main.accountsList) {
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
				return temp.pw;
			}
		}
		return "false";
		
	}
	
}
