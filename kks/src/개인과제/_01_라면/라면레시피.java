package ���ΰ���._01_���;

import java.util.Scanner;

public class ��鷹���� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Bowl bowl = new Bowl();
		
		while(true) {
			System.out.println("��� ������");
			
			System.out.println("����� ���Դϴ�.");
			System.out.println("���� ���� ���� �Է��ϼ���");
			bowl.water = scanner.next();
			
			System.out.printf("%s ��ŭ�� ���� �־����ϴ�." , bowl.water);
			
			System.out.println("���� �����ϴ�. ��� ������ �������?");
			System.out.println("��/�ƴϿ�");
			String tesk = scanner.next();
			if(tesk.equals("��")) {
				System.out.println("����� ���� �ϼ� �Ǿ����ϴ�");
				bowl.ramen = "����";
				bowl.soup = "����";
				System.out.println("����� �������?");
				System.out.println("��/ �ƴϿ�");
				String eggtesk = scanner.next();
				
				if(eggtesk.equals("��")) {
					System.out.println("����� �־����ϴ�.");
					bowl.egg = "����";
				}
				else {
					System.out.println(" ����� ���� �ʾҽ��ϴ�.");
				}
				if(bowl.egg == null) {
					System.out.println("����� �ϼ��Ǿ����ϴ�.");
					System.out.printf("��� �� %s �� %s ���� %s",bowl.water,bowl.ramen , bowl.soup);
					bowl = null;
				}
				else {
					System.out.println("����� �ϼ��Ǿ����ϴ�.");
					System.out.printf("���) �� %s �� %s ���� %s ���",bowl.water,bowl.ramen,bowl.soup,bowl.egg);
					bowl =null;
				}
			}
			else {
				System.out.println("���� �����ϴ� ");
				bowl.water = null;
			}
		}
	}
}
