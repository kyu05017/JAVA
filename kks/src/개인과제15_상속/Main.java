package ���ΰ���15_���;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Cpu myCpu = new Cpu();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("��ǻ�� �����");
			System.out.println("1)���ͳ� ���� 2)�����۾� 3)����");
			String work = scanner.next();
			
			if(work.equals("1") || work.equals("���ͳ�")) {
				boolean result = myCpu.cpuRun(1);
				
				if(result == false) {
					System.out.println("Cpu�� ��ü�մϴ�.");
					myCpu = new newCpu();
					System.out.println("��ü�Ϸ�");
				}
			}
			else if(work.equals("2") || work.equals("����")) {
				boolean result = myCpu.cpuRun(2);
				if(result == false) {
					System.out.println("Cpu�� ��ü�մϴ�.");
					myCpu = new newCpu();
					System.out.println("��ü�Ϸ�");
				}
			}
			else if(work.equals("3") || work.equals("����")) {
				boolean result = myCpu.cpuRun(3);
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
