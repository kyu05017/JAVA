package ���ΰ���._07_ƽ����;

import java.util.Random;
import java.util.Scanner;

public class �ټ���° {
	public static void main(String[] args) {
		
		//�Է°� ���� Ŭ���� ����
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//���� �غ�
		// ������ ��ŭ�� ������ ����
		String[] pad = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		// �¸��Ұ���� ������ �̸� ���� �ʱ�ȭ
		String win = "";
		// ���� ���� �̸� ����
		String my = "[o]";
		// ��ǻ���� ���� �̸� ����
		String com = "[x]";
		//��ǻ���� ��Ƚ���� ����
		int count = 0;
		
		while(true) {//���� �ݺ� = ���������� ���� �ºΰ� ����
			for(int i =0; i < pad.length; i++) {
				//i�� = �϶� ���� �е��� ����ŭ���� 1������ �ݺ�
				System.out.print(pad[i]);
				//�����е带 ǥ��
				if(i%3==2)System.out.println();
				//i�� 3���� ���� �������� 2�϶� �ٹٲ�
			}
			while(true) {//���� �ݺ� = �������� �ڸ�������
				System.out.println("�ڸ� ����");
				int p = scanner.nextInt();//��ġ�� ������ �Է�
				if(pad[p].equals("[ ]")) {//��ĭ�� ������ �� ���� �����ϰ� ����
					pad[p] = my;
					break;
				}
				else {//�ƴ϶�� ���޼��� ���
					System.out.println("�̹� ������ �ڸ� �Դϴ�.");
				}
			}
			while(true) {//���ѹݺ� - �������� ��ǻ�Ͱ� ���� �������
				int cp = random.nextInt(9);
				if(pad[cp].equals("[ ]")) {//��ĭ�� ������ ��ǻ�� ���� �����ϰ� ����
					pad[cp] = com;
					count++;//��ǻ�� ��Ƚ�� ����
					break;
				}
			}
			//�����϶��� �¸�
			//i�� 6���� ���ų� ������ ���� ���� 
			for(int i = 0; i <= 6; i++) {
				//�е��� i�� 0�ϰ�� 1�� 2�� �����ϸ� �¸��� ����
				if(pad[i].equals(pad[i+1]) && pad[i+1].equals(pad[i+2])) {
					win = pad[i];
				}
			}
			//�����϶� �¸�
			//i�� 2���� ���ų� ������ ���� ���� 
			for(int i =0; i <=2; i++) {
				//�е��� i�� 0�ϰ�� 3�� 6�� �����ϸ� �¸��� ����
				if(pad[i].equals(pad[i+3]) && pad[i+3].equals(pad[i+6])) {
					win = pad[i];
				}
			}
			//�е��� 0 �� 4 �׸��� 8�� �����ϴٸ� �¸��� ����
			if(pad[0].equals(pad[4]) && pad[4].equals(pad[8])) {
				win = pad[0];
			}
			//�е��� 2�� 4 �׸��� 6�� �����ϴٸ� �¸��� ����
			if(pad[2].equals(pad[4]) && pad[4].equals(pad[6])) {
				win = pad[2];
			}
			//boolean ���� ����
			boolean draw = false;
			//��ǻ���� �ϼ��� 4�� �Ǿ����� ������ �¸��ϰų� ������ �ʾ�����
			// draw���� ������
			if(count == 4) {
				draw = true;
			}
			
			//win�� ������ ������ �����¸� �� ����
			if(win.equals(my)) {
				System.out.println("�÷��̾� �¸�");
				break;
			}
			//win�� ��ǻ�� ���� ������ ��ǻ�� �¸� �� ����
			if(win.equals(com)) {
				System.out.println("��ǻ�� �¸�");
				break;
			}
			//draw���� ���̶�� ���º� �� ����
			if(draw) {
				System.out.println("���º�");
				break;
			}
		}
		//����� �������� ������
		for(int i = 0; i < pad.length; i++) {
			System.out.print(pad[i]);
			if(i%3==2)System.out.println();
		}
	}
}

