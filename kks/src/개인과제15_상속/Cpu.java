package ���ΰ���15_���;

import java.util.Scanner;

public class Cpu {
	
	public int temperature = 0;
	
	public Cpu() {
		
	}

	public Cpu(int temperature) {
		this.temperature = temperature;
	}
	
	public boolean cpuRun(int work) throws InterruptedException {
		
		System.out.println("Cpu ���� �۵��� 1)���� 5)�ٸ��۾� [�ð����� 0]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		while(true) {
			if(temperature > 100) {
				System.out.println("Cpu ����");
				return false;
			}
			if(work == 1) {
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu �µ���� +5��");
			}
			else if(work == 2) {
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu �µ���� +5��");
			}
			else if(work == 3) {
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("cpu �µ���� +20��");
			}
			if(ch.equals("5")) {
				System.out.println("����ȭ������ ���ư��ϴ�.");
				return true;
			}
			//temperature -= 10;
			Thread.sleep(1000);
		}
	}
}
