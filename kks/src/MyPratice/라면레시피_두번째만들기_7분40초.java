package MyPratice;

import java.util.Scanner;


public class ��鷹����_�ι�°�����_7��40�� {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		System.out.println("��� ���̱�");
		System.out.println("���� ���� �ֽ��ϱ�?");
		String tesk1 = scanner.next();
		
		if(tesk1.equals("��")) {
			System.out.println("��鿡 ���� �ֽ��ϴ�");
			System.out.println("�󸶸�ŭ�� ���� �ֽ��ϱ�?");
			bowl.water = scanner.next() + "ml";
			
			System.out.printf("%s ��ŭ�� ���� �־����ϴ�.",bowl.water);
			System.out.print("���� ���� �ֽ��ϴ�. ��� ������ �ְڽ��ϱ� (��/�ƴϿ�)");
			String tesk2 = scanner.next();
			if(tesk2.equals("��")) {
				bowl.ramen = "����";
				bowl.soup = "����";
				System.out.println("����� ���Ǵ� �;� ���ϴ�.");
				System.out.println("����� �ְڽ��ϱ�? (��/�ƴϿ�");
				String tesk3 = scanner.next();
				if(tesk3.equals("��")) {
					System.out.println("����� �ϼ��Ǿ����ϴ�.");
					System.out.println("���� ��� ��, ����, �Ǵ���, ���");
				}
				else {
					System.out.println("����� �ϼ��Ǿ����ϴ�.");
					System.out.println("���� ��� ��, ����, �Ǵ���");
				}
			}
			else {
				System.out.println("���� �� ��� Ÿ���Ƚ��ϴ�");
				bowl.water = null;
			}
		}
		else {
			System.out.println("��� ���̱⸦ �����մϴ�.");
		}
	}

}
