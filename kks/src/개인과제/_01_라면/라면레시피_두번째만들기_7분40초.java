package ���ΰ���._01_���;

import java.util.Scanner;


public class ��鷹����_�ι�°�����_7��40�� { //c s

	public static void main(String[] args) {//m s
		
		//�Է°�ü ����
		Scanner scanner= new Scanner(System.in);
		//bolw Ŭ���� ����
		Bowl bowl = new Bowl();
		
		System.out.println("��� ���̱�");
		System.out.println("���� ���� �ֽ��ϱ�?");
		//tesk1�� �Է¹޴� ���ڿ��� �����ؼ� �Է¹ޱ�
		String tesk1 = scanner.next();
		
		//"��"�� ��� ���� ����
		if(tesk1.equals("��")) {
			System.out.println("��鿡 ���� �ֽ��ϴ�");
			System.out.println("�󸶸�ŭ�� ���� �ֽ��ϱ�?");
			//�Է¹��� ���� ��� "ml"�� bowl.water�� ����
			bowl.water = scanner.next() + "ml";
			
			//�Է¹��� ���� ���� ǥ������
			System.out.printf("%s ��ŭ�� ���� �־����ϴ�.",bowl.water);
			System.out.print("���� ���� �ֽ��ϴ�. ��� ������ �ְڽ��ϱ� (��/�ƴϿ�)");
			String tesk2 = scanner.next();
			if(tesk2.equals("��")) {
				bowl.ramen = "����";
				bowl.soup = "����";
				System.out.println("����� ���Ǵ� �;� ���ϴ�.");
				System.out.println("����� �ְڽ��ϱ�? (��/�ƴϿ�");
				String tesk3 = scanner.next();
				
				//����� ������� ��� ����
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
				//���� ���� ���� �ٽ� �����
				bowl.water = null;
			}
		}
		else {
			System.out.println("��� ���̱⸦ �����մϴ�.");
		}
	}

}
