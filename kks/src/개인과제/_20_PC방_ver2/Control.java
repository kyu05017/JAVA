package ���ΰ���._20_PC��_ver2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Control {
	
	static ArrayList<Member> memberList = new ArrayList<>();
	static String[] PC = {"[ī����]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
	static Scanner scanner = new Scanner(System.in);
	
	public void signUp() {
		
		while(true) {

			String id = null;
			boolean pass1 = true;
			System.out.println("ȸ������))");
			while(true) {
				System.out.print("ID : \n");
				id = scanner.next();
				
				for(int i = 0; i < memberList.size(); i++) {
					System.out.println("�׽�Ʈ2");
					if(id.equals(memberList.get(i).getId())) {
						System.out.println("������ ���̵� �����մϴ�.");
						pass1 = false;
						break;
					}
					else {
						System.out.println("���̵�Ȯ��))");
						System.out.println(id+" ���̵� ����մϴ�.");
						System.out.println("1)�� 2)�ƴϿ�");
						String work = scanner.next();
						
						if(work.equals("1")) {
							System.out.println("�׽�Ʈ");
							pass1 = true;
							break;
						}
						else if(work.equals("2")) {
							System.out.println("�޼���)) ���̵� �Է����ּ���");
							pass1 = false;
							break;
						}
					}
				}
				if(pass1) {break;}
			}
			
			String pw = null;
			boolean pass2 = true;

			while(true) {
				
				System.out.print("PW : \n");
				pw = scanner.next();
				
				Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
				Matcher passMatcher1 = passPattern1.matcher(pw);
				
				if(!passMatcher1.find()){
					System.out.println("�޼���)) ��й�ȣ�� ������ Ư������ ���ڸ� �����ϸ� 8�� �̻��̾�� �մϴ�.");
					pass2 = false;
				}
				Pattern passPattern2 = Pattern.compile("(\\w)\\1\\1\\1");
				Matcher passMatcher2 = passPattern2.matcher(pw);
				  
				if(passMatcher2.find()){
					System.out.println("�޼���)) ��й�ȣ�� ������ ���ڸ� �����ϰ� �����ؼ� ����� �� �����ϴ�.");
					pass2 = false;
				}
				
				if(pw.contains(id)){
				    System.out.println("�޼���)) ���̵� ��й�ȣ�� ���ԵǾ��ֽ��ϴ�.");
				    pass2 = false;
				}
				
				if(pw.contains(" ")){
				    System.out.println("�޼���)) ��й�ȣ�� ������ ���ԵǾ��ֽ��ϴ�.");
				    pass2 = false;
				}
				
				if(pass2) {
					break;
				}
				
			}
			if(id.equals("admin")) {
				Member admin = new Member(id, pw, null, null, 0, 0, true);
				System.out.println("�޼���) ������ �������� �Ϸ�");
				memberList.add(admin);
				DB.memberSave();
				break;
			}
			else {
			
				String name = null;
				boolean pass3 = true;
				
				while(true) {
				
					System.out.print("Name : \n");
					name = scanner.next();
					
					String regExp_symbol = "(.*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*)";
					Pattern pattern_symbol = Pattern.compile(regExp_symbol);
					Matcher matcher_symbol = pattern_symbol.matcher(name);
					
					if(matcher_symbol.find()){
						System.out.println("�޼���)) �̸��� Ư�����ڸ� �����Ҽ� �����ϴ�.");
						pass3 = false;
					}
					
					if(name.contains(" ")){
					    System.out.println("�޼���)) �̸��� ������ ���ԵǾ��ֽ��ϴ�.");
					    pass3 = false;
					}
					
					if(pass3) {
						break;
					}
				}
				
				String phone = null;
				boolean pass4 = true;
				while(true) {
					
					System.out.print("Phone : \n");
					phone = scanner.next();
					
					Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
					Matcher matcher = pattern.matcher(phone);
					if(phone.contains("-")) {
						if(phone.length() == 13) {}
						else {
							System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.1");
							pass4 = false;
						}
					}
					else {
						if(phone.length() == 11) {}
						else {
							System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.2");
							pass4 = false;
						}
					}
					if (matcher.matches()) {
				    		pass4 = true;
				    } 
				    else if(!matcher.matches() &&  phone.length() == 11){
				    	String str1 = phone.substring(0, 3);
			            String str2 = phone.substring(3, 7);
			            String str3 = phone.substring(7, 11);
			            phone = str1+"-"+str2+"-"+str3;
				    	pass4 = true;
				    }
				    
				    if(pass4){
				    	break;
				    }
				}
				System.out.println("�޼���)) ȸ�������� �Ϸ� �Ǿ����ϴ�.");
				System.out.println("ȸ������))");
				System.out.println("ID : " + id);
				System.out.println("PW : " + pw);
				System.out.println("Name : " + name);
				System.out.println("Phone : "+ phone);
				Member member = new Member(id, pw, name, phone, 0, 0, false);
				memberList.add(member);
				DB.memberSave();
				break;
			}
			
		}
	}
	
	public String logIn() {
		
		System.out.println("�α���))");
		System.out.println("ID : ");
		String id = scanner.next();
		System.out.println("PW : ");
		String pw = scanner.next();
		
		for(Member temp : memberList) {
			if(id.equals("admin") && pw.equals(temp.getPw())) {
				return "admin";
			}
			else if(id.equals(temp.getId()) && pw.equals(temp.getPw())) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public void addTime(String id, int time) {
	
		for(Member temp : memberList) {
			if(id.equals(temp.getId())) {
				if(time == 1) {
					System.out.println("�޼���)) 1�ð� �߰��Ǿ����ϴ�.");
					temp.setTime(temp.getTime() + 60);
					System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
				}
				else if(time == 2) {
					System.out.println("�޼���)) 2�ð� �߰��Ǿ����ϴ�.");
					temp.setTime(temp.getTime() + 120);
					System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
				}
				else if(time == 3) {
					System.out.println("�޼���)) 5�ð� �߰��Ǿ����ϴ�.");
					temp.setTime(temp.getTime() + 300);
					System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
				}
				else {
					System.out.printf("�޼���)) %d�ð� �߰��Ǿ����ϴ�.\n",time);
					temp.setTime(temp.getTime() + time);
					System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
				}
			}
		}
		DB.memberSave();
	}
	
}
