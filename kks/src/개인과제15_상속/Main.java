package ���ΰ���15_���;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		// cpu ��ü ����
		Cpu myCpu = new Cpu();
		// �Է°�ü ����
		Scanner scanner = new Scanner(System.in);
		// ���ѹݺ� [ ���� ���� �޴��� �Է� ]
		while(true) {
			System.out.println("��ǻ�� �����");
			System.out.println("1)���ͳ� ���� 2)�����۾� 3)����");
			String work = scanner.next();
			
			if(work.equals("1") || work.equals("���ͳ�")) {
				// cpuŬ������ 1�� �μ��� ������ ��ȯ���� boolean
				boolean result = myCpu.cpuRun(1);
				// ������� ���� �̶�� ��ӵ� new cpu�� ��ä
				if(result == false) {
					System.out.println("Cpu�� ��ü�մϴ�.");
					myCpu = new newCpu();
					System.out.println("��ü�Ϸ�");
				}
			}
			else if(work.equals("2") || work.equals("����")) {
				// cpuŬ������ 2�� �μ��� ������ ��ȯ���� boolean
				boolean result = myCpu.cpuRun(2);
				// ������� ���� �̶�� ��ӵ� new cpu�� ��ä
				if(result == false) {
					System.out.println("Cpu�� ��ü�մϴ�.");
					myCpu = new newCpu();
					System.out.println("��ü�Ϸ�");
				}
			}
			else if(work.equals("3") || work.equals("����")) {
				// cpuŬ������ 3�� �μ��� ������ ��ȯ���� boolean
				boolean result = myCpu.cpuRun(3);
				// ������� ���� �̶�� ��ӵ� new cpu�� ��ä
				if(result == false) {
					System.out.println("Cpu�� ��ü�մϴ�.");
					myCpu = new newCpu();
					System.out.println("��ü�Ϸ�");
				}
			}
			else {
				System.out.println("��ǻ�� ����");
				break;
			}
		}
	}
}
