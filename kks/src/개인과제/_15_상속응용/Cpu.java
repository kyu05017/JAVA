package ���ΰ���._15_�������;

import java.util.Scanner;

public class Cpu {
	// �ʵ� = �µ�
	public int temperature;
	
	//������ - ����
	public Cpu() {
		
	}

	//������ - Ǯ������
	public Cpu(int temperature) {
		this.temperature = temperature;
	}
	
	//�޼ҵ� �μ� o ��ȯ o ����ó��
	public boolean cpuRun(int work) throws InterruptedException {
		
		System.out.println("Cpu ���� �۵��� 1)���� 5)�ٸ��۾� [�ð����� 0]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		// ���� �ݺ� - ���� ���� cpu ����
		while(true) {
			// �µ��� 100�� �Ǹ� ���� �ݺ��� ����
			if(temperature > 100) {
				System.out.println("Cpu ����");
				return false;
			}
			if(work == 1) {
				// 1�ʸ��� 5�� ����
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu �µ���� +5��");
			}
			else if(work == 2) {
				// 1�ʸ��� 5�� ����
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu �µ���� +5��");
			}
			else if(work == 3) {
				// 1�ʸ��� 20�� ����
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("cpu �µ���� +20��");
			}
			if(ch.equals("5")) {
				System.out.println("����ȭ������ ���ư��ϴ�.");
				return true;
			}
			// 1�ʰ� ������ ����
			Thread.sleep(1000);
		}
	}
}
