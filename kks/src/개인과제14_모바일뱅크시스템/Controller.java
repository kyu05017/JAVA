package ���ΰ���14_����Ϲ�ũ�ý���;

import java.util.Scanner;

import �����_��ũ_�ý���.Bankbook;
import �����_��ũ_�ý���.Day08_5;
import �����_��ũ_�ý���.Member;

public class Controller {
	
	static Account[] accountlist = new Account[1000];
	static Bank_Book[] banklist = new Bank_Book[1000];
	static Loan_System[] loanlist = new Loan_System[1000];
	
/////////////////////////////////////////////////////////////////////////////////////////
	
	boolean registration(String id,String pw,String name,String phone) {
		
		Account account = new Account(name, id, pw, phone);
		int i = 0;
		for(Account temp : accountlist) {
			if(temp == null) {
				accountlist[i] = account;
				return true;
			}
			i++;
		}
		return false;
	}
	
	String login(String id, String pw) {
		
		for(Account temp : accountlist) {
			
			if(temp != null && id.equals("admin") && temp.getPw().equals(pw)) {
				return "admin";
			}
			else if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
				return temp.getId();
			}
		}
		return "����";
	}
	
	String findid(String name, String phone) {
		
		for(Account temp : accountlist) {
			
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "����";
	}
	
	String findpw(String id, String phone) {
		
		for(Account temp : accountlist) {

			if(temp != null && temp.getId().equals(id) && temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "����";
	}
	
/////////////////////////////////////////////////////////////////////////////////////////
	
	boolean bankregistration(String id, int bnum, String pw) {
		
		Bank_Book bank = new Bank_Book(bnum, 0, pw, id, 0);
		
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp == null) {
				banklist[i] = bank;
				return true;
			}
			i++;
		}
		
		return false;
	}
	
	boolean inmoney(String id, int bnum, String pw, int money) {
		
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp != null &&temp.getBanknum() == bnum && temp.getBankpw().equals(pw) && temp.getUsername().equals(id)) {
				
				banklist[i].setNowmoney(+money);
				return true;
			}
			i++;
		}

		return false;
	}
	
	boolean outmoney(String id, int bnum, String pw, int money) {
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp != null &&temp.getBanknum() == bnum && temp.getBankpw().equals(pw) && temp.getUsername().equals(id)) {
				
				banklist[i].setNowmoney(-money);
				return true;
			}
			i++;
		}

		return false;
	}
	
	void bankbooklsit(String id) {
		
		for(Bank_Book temp : banklist) {
			if(temp != null && temp.getUsername().equals(id)) {
				System.out.println(temp.getBanknum() + "\t"+ temp.getNowmoney()+"\t"+temp.getLoanm());
			}
		}
	}
	
	void sendmoney(String id, int bnum, String pw) { 
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp.getBanknum() == bnum && temp.getBankpw().equals(pw)) {
				System.out.print("�����Ǻ� ���¹�ȣ  : "); 
				int bnum2 = scanner.nextInt();
				int j = 0;
				for(Bank_Book temp2 : banklist) {
					if(temp2 != null && temp2.getBanknum() == bnum2) {
						System.out.print("��ü�� �ݾ��� �Է��ϼ���. : ");
						int money2 = scanner.nextInt();
						if(temp.getNowmoney() < money2) {
							System.out.println("�˸�)) �ܾ��� �����Ͽ� ��ü�� �����߽��ϴ�.");
						}
						else {
							banklist[j].setNowmoney(+money2);
							banklist[i].setNowmoney(-money2) ;
							System.out.println("���¹�ȣ "+bnum+"�� "+money2+"���� ��ü �߽��ϴ�.");
							return;
						}
					}
					j++;
				}
			}
			i++;
		}
		
	}
	
	void findbankpw(String id, int bnum, String phone) {
		
		for(Bank_Book temp : banklist) {
			if(temp != null && temp.getBanknum() == bnum && temp.getUsername().equals(id)) {
				for(Account temp2 : accountlist) {
					if(temp2 != null && temp2.getPhone().equals(phone)) {
						System.out.println("ȸ�����ǰ��� ��й�ȣ�� "+ temp.getBankpw()+ "�Դϴ�");
						return;
					}
				}
			}
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////////	
	
	void newloan() {
		
	}
	
	void loanlsit() {
		
	}
	
	void removeloan() {
		
	}
	
	void myloan() {
		
	}
	
	void outloan() {
		
	}
	
	void inloan() {
		
	}
}
