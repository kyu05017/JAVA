package ���ΰ���01_2���;

import java.util.Scanner;

public class ��鸸���_5��° {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		while(true) {
			System.out.println("   ��� �����");
			System.out.println("-----------------");
			System.out.println("����� ���Դϱ�?");
			int ch = scanner.nextInt();
			if (ch == 1	) {
				System.out.println("����� ���Դϴ�.");
				System.out.println("���� �ֽ��ϴ� �󸶸�ŭ�� ���� �ְڽ��ϱ�?");
				bowl.water = scanner.next();
				
				System.out.printf("%s ������ ���� �־����ϴ�.",bowl.water);
				System.out.println("����� ���� �ֽ��ϴ�. ��� ������ �ְڽ��ϱ�?");
				System.out.println("��/�ƴϿ�");
				String tesk1 = scanner.next();
				if(tesk1.equals("��")) {
					System.out.println("����� �;� ���ϴ�.");
					System.out.println("����� �ֽ��ϱ�?");
					bowl.ramen = "����";
					bowl.soup = "����";
					String tesk2 = scanner.next();
					
					if(tesk2.equals("��")) {
						System.out.println("����� �־����ϴ�.");
						bowl.egg = "����";
					}
					else {
						System.out.println("����� ���� �ʾҽ��ϴ�.");
						bowl.egg = "����";
					}
					if (bowl.egg == null) {
						System.out.println("����� �ϼ��Ǿ����ϴ�.");
						System.out.printf("���) �� %s �� %s ���� %s ��� %s \n" ,bowl.water,bowl.ramen
								,bowl.soup,bowl.egg);
						bowl = null;
					}
					else {
						System.out.println("����� �ϼ��Ǿ����ϴ�.");
						System.out.printf("���) �� %s �� %s ���� %s ��� %s \n" ,bowl.water+"ml",bowl.ramen
								,bowl.soup,bowl.egg);
						bowl = null;
					}
				}
				else {
					System.out.println("���� Ÿ���Ƚ��ϴ�.");
					bowl.water = null;
				}
				
			}
			else {
				System.out.println("�����̱⸦ �����߽��ϴ�.");
				break;
			}
		}
		
	}

}