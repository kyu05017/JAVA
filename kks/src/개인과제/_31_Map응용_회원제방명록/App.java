package ���ΰ���._31_Map����_ȸ��������;

public class App {
	
	public static void main(String[] args) {
		Control con = new Control();
		App app = new App();
		Dao.memberLoad();
		while(true) {
			System.out.println("ȸ���� ����");
			System.out.println("----------------------------------------------------");
			for(Dto_Member temp : Control.list.keySet()) {
				if(temp != null) {
					System.out.println(temp.getId() + "�� "+ Control.list.get(temp).getContents()+" | " + Control.list.get(temp).getDate());
				}
			}
			System.out.println("----------------------------------------------------");
			System.out.println("1)�۾��� 2)����");
			String work = Control.scanner.next();
			if(work.equals("1")) {
				System.out.println("ID : ");
				String id = Control.scanner.next();
				System.out.println("PW : ");
				String pw = Control.scanner.next();
				System.out.println("���� : ");
				String contents = Control.scanner.next();
				
				boolean result = con.singup(id, pw,contents);
				if(result) {
					System.out.println("�ۼ��� �Ϸ� �Ǿ����ϴ�.");
				}
			}
			else if(work.equals("2")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}	
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
		
	}

}
	
