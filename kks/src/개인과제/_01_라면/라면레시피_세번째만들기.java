package ���ΰ���._01_���;

import java.util.Scanner;

public class ��鷹����_����°����� {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		System.out.println("��鸸���");
		
		while(true) {
			
			System.out.println("����� ����ϴ�");
			System.out.println("1) ��� ���̱�, 2) ����");
			String tesk1 = scanner.next();
			
			if(tesk1.equals("1")) {
				System.out.println("���� ���� �ֽ��ϴ�.");
				System.out.println("�󸶸�ŭ�� ���� �ֽ��ϱ�?");
				bowl.water = scanner.next()+"ml";
				System.out.printf("%s ��ŭ�� ���� �־����ϴ�.",bowl.water);
				
				System.out.println("���� ���� �����߽��ϴ�.");
				System.out.println("��� ������ �ֽ��ϴ�. (��/�ƴϿ�)");
				String tesk2 = scanner.next();
				if(tesk2.equals("��")) {
					System.out.println("����� �;�ϴ� ����� �������?(��/�ƴϿ�");
					String eggtesk = scanner.next();
					bowl.ramen = "����";
					bowl.soup = "����";
					if(eggtesk.equals("sp")) {
						bowl.egg = "����";
					}
					else {
						System.out.println("����� ���� �ʾҽ��ϴ�.");
					}
					System.out.println("����� �ϼ��Ǿ����ϴ�.");
					
					if(bowl.egg == null) {
						System.out.println("���) ��,����");
					}
					else {
						System.out.println("���) ��,����,���");
					}
					
				}
				else {
					System.out.println("���� Ÿ���Ƚ��ϴ�.");
					bowl.water = null;
				}
			}
			else if(tesk1.equals("2")) {
				System.out.println("��� ���̱⸦ �����߽��ϴ�.");
			}
			else {
				System.out.println("����� ������ �ʽ��ϴ�.");
				break;
			}
		}
		
	}
}
