package ���ΰ���._15_�������;

import java.util.Scanner;

public class newCpu extends Cpu{
// 			Ŭ������ ��� �θ� Ŭ����
	
	// �������
	public newCpu() {
		
	}

	// Ǯ������
	public newCpu(int temperature) {
		super(temperature);
	}

	// �޼ҵ带 ������
	@Override
	//�޼ҵ� �μ� o ��ȯ o ����ó��
	public boolean cpuRun(int work) throws InterruptedException {
		System.out.println("newCpu ���� �۵��� 1)���� 5)�ٸ��۾� [�ð����� 10]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		// ���� �ݺ� - ���� ���� cpu ����
		while(true) {
			// �µ������� 1000�̻��̸� ����
			if(temperature > 1000) {
				System.out.println("Cpu ����");
				return false;
			}
			if(work == 1) {
				// 1�ʸ��� 5�� ����
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 2) {
				// 1�ʸ��� 5�� ����
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 3) {
				// 1�ʸ��� 20�� ����
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("�µ����");
			}
			if(ch.equals("5")) {
				System.out.println("����ȭ������ ���ư��ϴ�.");
				return true;
			}
			// ������ �� 0.8�� ���� 10�� -�ؼ� ���峪�� �ʰ���
			temperature -= 10;
			Thread.sleep(800);
		}
	}
}
