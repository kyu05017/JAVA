package ���ΰ���15_���;

import java.util.Scanner;

public class newCpu extends Cpu{

	public newCpu() {
		
	}

	public newCpu(int temperature) {
		super(temperature);
	}

	@Override
	public boolean cpuRun(int work) throws InterruptedException {
		System.out.println("newCpu ���� �۵��� 1)���� 5)�ٸ��۾� [�ð����� 10]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		while(true) {
			if(temperature > 1000) {
				System.out.println("Cpu ����");
				return false;
			}
			if(work == 1) {
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 2) {
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 3) {
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("�µ����");
			}
			if(ch.equals("5")) {
				System.out.println("����ȭ������ ���ư��ϴ�.");
				return true;
			}
			temperature -= 10;
			Thread.sleep(1000);
		}
	}
}
