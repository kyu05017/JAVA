package �����_��ũ_�ý���;

import java.util.Scanner;

public class Day08_5 {
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Bankbook[] bankbooks = new Bankbook[100];	
	static Loan[] loanlist = new Loan[100];
	public static void main(String[] args) {
		
		Day08_5 mobilebank = new Day08_5();
		mobilebank.menu();
	}
	
	void menu() {
		Member member = new Member();
		while(true) { // ���ѷ��� [�������� x]
			System.out.println("-------------����� ��ũ ���α׷�-------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			int ch = scanner.nextInt();
			if(ch == 1) {
				member.registration();
			}
			else if(ch==2) {
				String result = member.login();
				
				if(result == null) {
					System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
				}
				else if(result.equals("admin")){ // 2. ������ �޴� �޼ҵ� ȣ��
					System.out.println("�˸�) �����ڷ� �α��� �ϼ̽��ϴ�.");
					adminmenu("admin"); // ���� �޼ҵ� ȣ��
				}
				else { // 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println("�˸�) �ȳ��ϼ���~"+result+"��");
					membermenu(result); // �μ�1�� [�α��� ������ id]
				}  	
			}
			else if(ch==3) {
				member.findid();
			}
			else if(ch==4) {
				member.findpw();
			}
			else {
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
		}
	}
	
	void membermenu(String loginid) {
		Day08_5 mobilebank = new Day08_5();
		while(true) { // ���ѷ��� [ �������� : �α׾ƿ� ]
			Bankbook bankbook = new Bankbook();
			System.out.println("------------------ȸ�� �޴�---------------");
			System.out.println("1.���»��� 2.���¸�� 3.�Ա� 4.��� 5.��ü 6.���� 7.���º�й�ȣã�� 8.�α׾ƿ�");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				bankbook.bankregistration(loginid);
			}
			else if(ch==2) {
				bankbook.bankbooklsit(loginid);
			}
			else if(ch==3) {
				bankbook.inmoney(loginid);
			}
			else if(ch==4) {
				bankbook.outmoney(loginid);
			}
			else if(ch==5) {
				bankbook.sendmoney(loginid);
			}
			else if(ch==6) {
				mobilebank.loanmenu(loginid);
			}
			else if(ch==7) {
				bankbook.findbankpw(loginid);
			}
			else if(ch==8) {
				System.out.println("�˸�)) �α׾ƿ� �Ǿ����ϴ�.");
				return;
			}
			else System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
					
		} // while end
		
		
	} // �Ϲ�ȸ�� �޴� ����
	//////////////////////////////////////////////////////////////////////////////////////////
	void loanmenu(String x) {
		while(true) {
			Loan loan = new Loan();
			System.out.println("------------------ȸ�� �޴�---------------");
			System.out.println("1.�����ǰ��� 2.����Ȯ�� 3.�ڷΰ���");
			int ch = scanner.nextInt();
			if(ch == 1) {
				loan.loanlsit(x);
			}
			else if(ch == 2) {
				loan.myloan(x);
			}
			else if(ch==3) {
				System.out.println("�˸�)) ���� �������� �̵��մϴ�");
				break;
			}
			else {
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// 3.������ �޴� �޼ҵ�
	void adminmenu(String loginid) {
		while(true) {
			Loan loan = new Loan();
			System.out.println("------------------������ �޴�---------------");
			System.out.println("1.�����ǰ��� 2.�����ǰ���� 3.�α׾ƿ�");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				loan.newloan(loginid);
			}
			else if(ch==2) {
				loan.removeloan(loginid);
			}
			else if(ch==3) {
				System.out.println("�˸�)) �α׾ƿ� �Ǿ����ϴ�.");
				return;
			}
			else System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
		} // while end
	}
	
}
