package ���ΰ���_4����_Ű����ũ;

import java.util.Scanner;

public class Ű����ũ_����2_10�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int bc = 0;
		int bw = 0;
		int bci = 0;
		int ci = 10;
		int wi = 10;
		int cidi = 10;
		
		while(true) {
			System.out.println("----*���Ǳ�-----");
			System.out.println("������ �׸� ����");
			System.out.println("1�ݶ�300�� 2ȯŸ200�� 3���̴�300��");
			System.out.println("4����");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("�ݶ� �߰��߽��ϴ�/");
				bc +=1;
				ci -=1;
			}
			else if ( ch == 2 ) {
				System.out.println("ȯŸ�� �߰��߽��ϴ�.");
				bw += 1;
				wi -= 1;
			}
			else if ( ch == 3) {
				System.out.println("���̴ٸ� �߰��߽��ϴ�");
				bci += 1;
				cidi -= 1;
			}
			else if ( ch ==4 ) {
				System.out.println("------����â-------");
				System.out.println("ǰ��\t����\t����");
				if(bc != 0)System.out.printf("�ݶ�\t%d\t%d\n",bc,bc*300);
				if(bw != 0)System.out.printf("ȯŸ\t%d\t%d\n",bw,bw*200);
				if(bci!=0 )System.out.printf("���̴�\t%d\t%d\n",bci,bci*100);
				int total = (bc*300)+(bw*100)+(bci*100);
				System.out.println("�� ���� �ݾ� " + total + "��");
				System.out.println("1���� 2�������");
				int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {
					while(true) {
						System.out.println("�����ݾ��� �Է��ϼ���");
						int money =scanner.nextInt();
						
						if(money >= total) {
							System.out.println("������ �Ϸ� �Ǿ����ϴ�");
							bc = 0; bw =0; bci = 0;
							break;
						}
						else if ( money < total) {
							System.out.println("�����ݾ��� �����մϴ�");
						}
					}
				}
				else if( ch2 == 2) {
					System.out.println("������ ����߽��ϴ�.");
					ci += bc; wi += bw; cidi += bci; 
				}
				else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}

	}

}
