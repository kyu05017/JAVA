package ���ΰ���01_2���;

import java.util.Scanner;

public class ��鷹����_ù��°�����_17��8�� {//c s

	public static void main(String[] args) {//m s
		
		/*
		 * 
		 * ��鷹����
		 * �ʿ��� ��� ��550ml, �Ǵ��⽺��, �и�����, ���
		 * ���� ������ ��, �Ǵ��� ����, �и����� ,��� �ֱ�
		 * �׸��� �ű�ⳡ
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����̱�");
		
		
		Bowl bowl = new Bowl();
		
		System.out.println("���� ���� �ְڴϱ�?(��/�ƴϿ�)");
		String tesk = scanner.next();
		
		if(tesk.equals("��")) {
			System.out.println("���� ���� �󸶳� �ְڽ��ϱ�?");
			bowl.water =scanner.next()+"ml" ;
			
			
				System.out.printf("%s ��ŭ�� ���� �־����ϴ�.",bowl.water);
				System.out.println("���� �����ϴ�. ��� ������ �ְڽ��ϱ�?(��/�ƴϿ�)");
				String ramentesk = scanner.next();
				
				if(ramentesk.equals("��")) {
					bowl.ramen = "����";
					bowl.soup = "����";
					bowl.soup2 = "����";
					
					System.out.println("����� ���Ǵ� �Ǿ�ϴ�. ����� �ְڽ��ϱ�? (��/�ƴϿ�)");
					String eggtesk = scanner.next();
					if(eggtesk.equals("��")) {
						System.out.println("����� �ϼ� �Ǿ����ϴ�. ��Ḧ ������ (���)�� �Է��ϼ���");
						bowl.egg = "����";
						String item = scanner.next();
						if(item.equals("���")) {
							if(bowl.egg != null) {
								System.out.printf("�� ���) ��,�Ǵ���,����,��� ");
							}
						}
					}
					else {
						System.out.println("����� �ϼ� �Ǿ����ϴ�. ��Ḧ ������ (���)�� �Է��ϼ���");
						String item = scanner.next();
						if(item.equals("���")) {
							if(bowl.egg == null) {
								System.out.printf("�� ���) ��,�Ǵ���,���� ");
							}
						}
					}
				}
				else {
					System.out.println("����  ���� ������ ���� �����ϴ�.");
					bowl.water = null;
				}
			}
			else {
				System.out.println("���� ��������");
			}
	}//m e

}//c e