package ���ΰ���._31_Map����_ȸ��������;

public class App {
	
	public static void main(String[] args) {
		
		Control con = new Control();
		App app = new App();
		while(true) {
			System.out.println("ȸ���� ����");
			System.out.println("----------------------------------------------------");
			for(Dto_Member temp : Control.list.keySet()) {
				if(temp != null) {
					System.out.println(temp.getId() + "�� "+ Control.list.get(temp).getContents()+" | " + Control.list.get(temp).getDate());
				}
			}
			System.out.println("----------------------------------------------------");
			System.out.println();
			System.out.println("1)�۾��� 2)�ۻ��� 3)����");
			String work = Control.scanner.next();
			if(work.equals("1")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				System.out.println("���� : ");
				
				boolean result = con.singup(id, pw);
				if(result) {
					System.out.println("�ۼ��� �Ϸ� �Ǿ����ϴ�.");
				}
			}
			else if(work.equals("2")) {
				System.out.println("�α���");
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				
				String result = con.singin(id, pw);
				
				if(result.equals("false1")) {
					System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
				}
				else if(result.equals("false2")) {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				else {
					System.out.println(result+"�� �湮�� ȯ���մϴ�.");
					app.member_menu(result);
				}
			}
			else if(work.equals("3")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}	
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
		
	}
}
	
