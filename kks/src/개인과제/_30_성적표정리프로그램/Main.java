package ���ΰ���._30_����ǥ�������α׷�;

public class Main {
	public static void main(String[] args) {
		Control con = new Control();
		Control.Load();
		
		while(true) {
			System.out.println("����ǥ ���� ���α׷�))");
			System.out.println("----------------------------------------");
			for(Student temp : Control.scoreslsit) {
				System.out.println(temp.getName() +" | "+ temp.getScore()+ "��");
			}
			System.out.println("----------------------------------------");
			System.out.println("1)������� 2)���� 3)����л������ 4)����");
			String work = Control.scanner.next();
			if(work.equals("1")) {
				System.out.println("�̸� : ");
				String name = Control.scanner.next();
				System.out.println("���� : ");
				int score = 0;
				try {
					score = Control.scanner.nextInt();
				}
				catch (Exception e) {
					System.out.println("������ ���ڸ� �Է°����մϴ�.");
				}
				System.out.println(name + " | " + score);
				
				boolean result = con.addscore(name, score);
				if(result) {
					System.out.println("����Ϸ�");
				}
			}
			else if(work.equals("2")) {
				System.out.println("�̸� : ");
				String name = Control.scanner.next();
				for(Student temp : Control.scoreslsit) {
					if(temp.getName().equals(name)) {
						boolean result = con.delete_score(name);
						if(result) {
							System.out.println("�����Ϸ�");
							break;
						}						
					}
					else {
						System.out.println("�������� �ʴ� �л��Դϴ�.");
					}
				}
				boolean result = con.delete_score(name);
				if(result) {
					System.out.println("�����Ϸ�");
				}
				
			}
			else if(work.equals("3")) {
				System.out.println("����� �ʱ�ȭ �մϴ�.");
				Control.scoreslsit.clear();
				Control.Save();
			}
			else if(work.equals("4")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
