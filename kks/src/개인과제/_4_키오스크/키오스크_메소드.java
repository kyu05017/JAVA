package ���ΰ���._4_Ű����ũ;

import java.util.Scanner;

import Day07.Day07_5_bookApplication;

public class Ű����ũ_�޼ҵ� {

	static Scanner scanner = new Scanner(System.in);
	static Ű����ũ_�޼ҵ� appAplication = new Ű����ũ_�޼ҵ�();
	static Ű����ũ�޴� keymenu = new Ű����ũ�޴�();
	
	public static void main(String[] args) {
		
		
		
		appAplication.menu();
	}
	
	void menu() {
		while(true) {
			System.out.println("------���Ǳ�------");
			System.out.println("������ �׸� ����");
			System.out.println("1�ݶ�300�� 2ȯŸ200�� 3���̴�300��");
			System.out.println("4����");
			int ch = scanner.nextInt();
			if(ch == 1) {
				keymenu.bc();
			}
			else if(ch == 2) {
				keymenu.bw();
			}
			else if(ch == 3) {
				keymenu.buyci();
			}
			else if(ch == 4) {
				int result = (keymenu.buycoke*300)+(keymenu.buywhan*200)+(keymenu.buycider*100);
				appAplication.pay(keymenu.buycoke,keymenu.buywhan,keymenu.buycider,result);
			}
			else {
				System.out.println("�˸�)) �غ�Ǿ����� ���� �޴� �Դϴ�.");
			}
		}
	}
	
	void pay(int x,int y,int z,int total) {
		System.out.println("------����â-------");
		System.out.println("ǰ��\t����\t����");
		if(x != 0)System.out.printf("�ݶ�\t%d\t%d\n",x,x*300);
		if(y != 0)System.out.printf("ȯŸ\t%d\t%d\n",y,y*200);
		if(z !=0 )System.out.printf("���̴�\t%d\t%d\n",z,z*100);
		System.out.println("�� ���� �ݾ� " + total + "��");
		System.out.println("1���� 2�������");
		int ch2 = scanner.nextInt();
		if(ch2 == 1) {
			while(true) {
				System.out.println("�����ݾ��� �Է��ϼ���");
				int money =scanner.nextInt();
				
				if(money >= total) {
					System.out.println("������ �Ϸ� �Ǿ����ϴ�");
					keymenu.cokeitem -= x;
					keymenu.whanitem -= y;
					keymenu.cideritem -= z;
					keymenu.buycoke = 0; keymenu.buywhan =0; keymenu.buycider = 0;
					
					
					break;
				}
				else if ( money < total) {
					System.out.println("�����ݾ��� �����մϴ�");
				}
			}
		}
		else if( ch2 == 2) {
			System.out.println("������ ����߽��ϴ�.");
			keymenu.cokeitem -= x;
			keymenu.whanitem -= y;
			keymenu.cideritem -= z;
			keymenu.buycoke = 0; keymenu.buywhan =0; keymenu.buycider = 0;
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}

