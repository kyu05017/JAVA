package ���ΰ���._30_����ǥ�������α׷�;

public class Main {
	public static void main(String[] args) {
		Control con = new Control();
		DB.in_Custommer_Load();
		
		while(true) {
			System.out.println("����ǥ ���� ���α׷�))");
			System.out.println("----------------------------------------");
			for(Student temp : con.scoreslsit) {
				System.out.println(temp.getName() +" | "+ temp.getScore()+ "��");
			}
			System.out.println("----------------------------------------");
			System.out.println("1)������� 2)����");
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
				boolean result = con.addscore(name, score);
				if(result) {
					System.out.println("����Ϸ�");
				}
			}
			else if(work.equals("2")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
