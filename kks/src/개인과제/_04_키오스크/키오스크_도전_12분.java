package ���ΰ���._04_Ű����ũ;

import java.util.Scanner;

public class Ű����ũ_����_12�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int buyCoke =0;
		int buyWhan = 0;
		int buycider = 0;
		int CokeItem = 10;
		int whanItem = 10;
		int ciderItem = 10;
		
		while(true) {
			System.out.println("------���Ǳ�-----");
			System.out.println("�����Ͻ� ���Ḧ ������");
			System.out.println("(1) �ݶ�(300��) (2)ȯŸ(200��) (3)���̴�(100��)");
			System.out.println("(4) ����");
			int ch = scanner.nextInt();
			
			if (ch == 1) {
				System.out.println("�ݶ� ��ٱ��Ͽ� �߰��߽��ϴ�");
				buyCoke +=1;
				CokeItem -=1;
			}
			else if(ch ==2) {
				System.out.println("ȯŸ�� ��ٱ��Ͽ� �߰��߽��ϴ�.");
				buyWhan += 1;
				whanItem -=1;
			}
			else if(ch==3) {
				System.out.println("���̴ٸ� ��ٱ��Ͽ� �߰��߽��ϴ�.");
				buycider +=1;
				ciderItem -= 1;
			}
			else if(ch==4) {
				System.out.println("-----��ٱ���-----");
				System.out.println("ǰ��\t����\t����");
				if(buyCoke!=0)System.out.printf("�ݶ�\t%d\t%d",buyCoke,(buyCoke*300));
				if(buyWhan!=0)System.out.printf("ȯŸ\t%d\t%d",buyWhan,(buyWhan*200));
				if(buycider!=0)System.out.printf("���̴�\t%d\t%d",buycider,(buycider*100));
				int total = (buyCoke*300) + (buyWhan*200) + (buycider*100);
				System.out.println("�����Ͻ� �ݾ�" + total +"��");
				System.out.println("(1)���� (2)�������");
				int ch2 = scanner.nextInt();
				if(ch2 == 1) {
					while(true) {
						System.out.println("���� �ݾ��� �Է��ϼ���");
						int money = scanner.nextInt();
						
						if(money >= total) {
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
							buyCoke = 0; buyWhan = 0; buycider = 0;
							break;
						}
						else if(money < total){
						System.out.println("���� �ݾ��� �����մϴ�.");
						}
						else {
							System.out.println("�߸��� �Է��Դϴ�.");
						}
					}
				}
				else if(ch == 2) {
					System.out.println("������ ����ϼ̽��ϴ�.");
					ciderItem += buycider;whanItem += buyWhan;CokeItem +=buyCoke;
					break;
				}
			}
			else {
				System.out.println("�������� �ʴ� ��� �Դϴ�.");
			}
		}
	}

}
