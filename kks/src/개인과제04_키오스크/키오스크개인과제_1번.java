package ���ΰ���04_Ű����ũ;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Ű����ũ���ΰ���_1�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int bc = 0;
		int bw = 0;
		int bci = 0;
		int ci = 10;
		int wi = 10;
		int ciit = 10;
		while(true) {
			System.out.println("���Ǳ�");
			System.out.println("1)�ݶ� 2)ȯŸ 3)���̴�");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("�ݶ� �����߽��ϴ�.");
				bc +=1;
			}
			else if(ch==2) {
				System.out.println("ȯŸ�� �����߽��ϴ�.");
				bw += 1;
			}
			else if(ch ==3) {
				System.out.println("���̴ٸ� �����߽��ϴ�.");
				bci += 1;
			}
			else if(ch ==4) {
				System.out.println("���� ������");
				System.out.println("ǰ��\t����\t����");
				if(bc != 0)System.out.printf("�ݶ�\t%d\t%d",bc,bc*300);
				if(bw != 0)System.out.printf("ȯŸ\t%d\t%d",bw,bw*200);
				if(bci!= 0)System.out.printf("���̴�\t%d\t%d",bci,bci*100);
				int total = (bc*300)+(bw*200)+(bci*100);
				System.out.println("�� ����ݾ� : "+ total +"��");
				System.out.println("1)���� 2)���");
				int ch2 = scanner.nextInt();
				if (ch2 ==1) {
					while(true) {
						System.out.println("���� �ݾ��� �Է��ϼ���");
						int money = scanner.nextInt();
						
						if(money < total) {
							System.out.println("������ �����ϼ̽��ϴ�.");
							System.out.println("����)) �ܾ׺���");
						}
						else if(money >= total) {
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
							ci -= bc; wi -= bw; ciit -= bci;
							bc = 0; bw =0 ; bci = 0;
							break;
						}
					}
					
				}
				else if(ch2 == 2) {
					System.out.println("������ ��� �ϼ̽��ϴ�.");
					bc = 0; bw = 0;bci = 0; 
					break;
				}
					
				
				
			}
		}
	}
}
