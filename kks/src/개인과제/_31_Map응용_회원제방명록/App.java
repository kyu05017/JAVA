package ���ΰ���._31_Map����_ȸ��������;

public class App {
	
	public static void main(String[] args) {
		Control con = new Control();
		Dao.memberLoad();
		while(true) {
			System.out.println("ȸ���� ����");
			System.out.println("----------------------------------------------------");
			con.read();
			System.out.println("----------------------------------------------------");
			System.out.println("1)�۾��� 2)���� 3)���� 4)����");
			String work = Control.scanner.next();
			if(work.equals("1")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				System.out.println("���� : ");
				String contents = Control.scanner.next();
				
				boolean result = con.create(id, pw,contents);
				if(result) {
					System.out.println("�ۼ��� �Ϸ� �Ǿ����ϴ�.");
				}
			}
			else if(work.equals("2")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				System.out.println("���� : ");
				String contents = Control.scanner.next();
				
				boolean result = con.update(id, pw, contents);
				if(result) {
					System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
				}
				else {
					System.out.println("");
				}
			}	
			else if(work.equals("3")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				
				boolean result = con.delete(id, pw);
				if(result) {
					System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
				}
				else {
					System.out.println("");
				}
			}	
			else if(work.equals("4")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}	
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
		
	}

}
	
