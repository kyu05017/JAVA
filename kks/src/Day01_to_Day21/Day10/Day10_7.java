package Day01_to_Day21.Day10;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7 {
	
	// ��� : ����Ŭ���� 
	// Ŭ���� : ����Ŭ���� : �Ե��̶�, �Ƶ�����
	// �������̽� : Ű����ũ
	// ����ó�� : ���
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		ArrayList<Goods> itemlist = new ArrayList<>();
		kiosk mcdonald = new Mcdonald();
		kiosk lotteria  = new LotteRia("���缮",itemlist);
		// �����Է� ��ü
		try { // ����ó�� try { } ������ �߻��Ұ� ���� �ڵ带 ���� [����]
			// 1. ���� �Է°�ü
			FileInputStream inputStream = new FileInputStream("D:/KKS/�ڹ�/�Ե��������.txt");
			//2. ���� �о���� [ ���� --> ��Ʈ��[����Ʈ�迭] ==> �ڹ� ]
			// 1. ����Ʈ �迭����
			byte[] bytes = new byte[1024*10];
			// 2. �о�ͼ� �迭 ���� 
			inputStream.read(bytes);
			// 3. �к�[ , : �ʵ� ���� \n : ��ü ] 
			String file = new String(bytes);
				// String ���� �޼ҵ� split("����")
			String[]list = file.split("\n");
			for(String temp : list) {
				String[] filed = temp.split(",");
				Goods goods = new Goods(filed[0],Integer.parseInt(filed[1]),Integer.parseInt(filed[2]));
									//	 ���ڿ� >>>> ������ [ ��ȯ ] Integer.parseInt("���ڿ�") -> ������ ��ȯ��
				//����Ʈ ����
				itemlist.add(goods);
			}
			
			
		} catch (Exception e) {} // catch :  ���� ��� => Exception Ŭ������ ��ü�� ����
		while(true) {
			System.out.println("�޴���))");
			lotteria.itemlist();
			System.out.println("�޴� ����))");
			int ch = scanner.nextInt();
			if(ch == -1) {
				lotteria.additem();
			}
			else if(ch == -2) {
				
			}
			else if(ch == 1) {
				lotteria.itemlist();
			}
			else if(ch == 2) {
				lotteria.basket();
			}
			
		}
	}
}
