package ���ΰ���._20_PC��_ver2;

public class Main {
	
	public static void main(String[] args) {
		Control con = new Control();
		
		while(true) {
			
			System.out.println("-------------------------------------------------");
			System.out.println("�����ڸ�))");
			
			for(int i = 0; i < Control.PC.length; i++) {
				System.out.print(Control.PC[i]);
				if(i%5==0)System.out.println();
			}
			System.out.println();
			System.out.println("�ڹ� PC��))");
			System.out.println("1)ȸ������ 2)�α��� 3)���̵�ã�� 4)��й�ȣã�� 5)����");
			System.out.println("-------------------------------------------------");
			
			String tesk = Control.scanner.next();
			
			if(tesk.equals("1")) {
				con.signUp();
			}
			else if(tesk.equals("2")) {
				String result = con.logIn();
				
				if(result.equals("admin")) {
					System.out.println("�޼���)) ������ �α���");
				}
				else if(result.equals("false")) {
					System.out.println("�޼���)) �α��ο� ���� �߽��ϴ�.");
				}
				else {
					System.out.printf("�޼���)) %s�� �湮�� �ּż� �������ϴ�.\n",result);
				}
			}
			else if(tesk.equals("3")) {
				
			}
			else if(tesk.equals("4")) {
				
			}
			else if(tesk.equals("5")) {
				System.out.println("���α׷� ����))");
				System.out.println("������ ��й�ȣ �Է� : ");
				String admin_Pw = Control.scanner.next();
				boolean exit = false;
				for(Member temp : Control.memberList) {
					if(admin_Pw.equals(temp.getPw())) {
						System.out.println("�޼���)) �ý����� ���� �մϴ�.");
						exit = true;
					}
					else {
						System.out.println("�޼���)) �����ڸ� �̿밡���մϴ�.");
						exit = false;
					}
				}
				if(exit) {
					break;
				}
			}
			else {
				System.out.println("");
			}
		}
	}
	
	
	
}
