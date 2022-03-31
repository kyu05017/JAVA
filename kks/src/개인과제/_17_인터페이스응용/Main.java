package ���ΰ���._17_�������̽�����;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		Remote rc;
		boolean power = false;
		boolean option = false;
		int ch = 1;
		int vol = 1;
		
		while(true) {
			System.out.println("IoT ������");
			System.out.println("1)TV 2)������ 3)����û���� 4)������ 5)�������� 6)����");
			
			String work = scanner.next();
			
			if(work.equals("1") || work.equals("TV")) {
				ch = 1;
				vol = 1;
				while(true) {
					
					rc = new Tv();
					System.out.print("Ezen ����Ʈ Ƽ��");
					if(power) {
						System.out.print("\t ���� ����");
					}
					else {
						System.out.print("\t ���� ����");
					}
					if(option) {
						System.out.print("\t ���Ұ�  \n");
					}
					else {
						System.out.print("\t ���ҰŲ�  \n");
					}
					System.out.println("1)���� 2)����ä�� 3)����ä�� 4)������ 5)�����ٿ� 6)���Ұ� 7)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(power) {
							boolean result = rc.turnOff(power);
							power = result;
						}
						else if(power == false){
							boolean result = rc.turnOn(power);
							power = result;
						}
					}
					if(power) {
						if(work2.equals("2") || work2.equals("����ä��")) {
							rc.mainUp();
							ch++;
							if(ch >= 11) {
								ch = 1;
							}
							System.out.println("TV)) ����ä�� " + ch);
						}
						else if(work2.equals("3") || work2.equals("����ä��")) {
							rc.mainDown();
							ch--;
							if(ch == 0) {
								ch = Remote.MAX;
							}
							System.out.println("TV)) ����ä�� " + ch);
						}
						else if(work2.equals("4") || work2.equals("������")) {
							if(vol >= 11) {
								System.out.println("TV)) ���� �ִ� �����Դϴ�.");
							}
							else {
								rc.subUp();
								vol++;
							}
							System.out.println("TV)) ���纼�� " + vol);
							option = false;
						}
						else if(work2.equals("5") || work2.equals("�����ٿ�")) {
							if(vol == 0) {
								System.out.println("TV)) ���� �ּ� �����Դϴ�.");
							}
							else {
								rc.subDown();
								vol--;
							}
							System.out.println("TV)) ���纼�� " + vol);
							option = false;
						}
						else if(work2.equals("6") || work2.equals("���Ұ�")) {
							if(option) {
								boolean result = rc.optionOff(option);
								option = result;
							}
							else if(option == false){
								boolean result = rc.optionOn(option);
								option = result;
							}
						}
					}
					else {
						System.out.println("�޼���)) ������ ���ּ���.");
					}
					if(work2.equals("7") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
						power = false;
						option = false;
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("2") || work.equals("������")) {
				vol = 0;
				ch = 25;
				while(true) {
					rc = new Air_conditioner();
					
					System.out.print("Ezen ��ǳ ������");
					if(power) {
						System.out.print("\t ���� ����");
					}
					else {
						System.out.print("\t ���� ����");
					}
					if(option) {
						System.out.print("\t ��ǳ���  \n");
					}
					else {
						System.out.printf("\t ��� %d'C ǳ�� %d  \n",ch,vol);
					}
					System.out.println("1)���� 2)�µ��� 3)�µ��� 4)ǳ���� 5)ǳ���� 6)��ǳ 7)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(power) {
							boolean result = rc.turnOff(power);
							power = result;
						}
						else if(power == false){
							boolean result = rc.turnOn(power);
							power = result;
							vol = 1;
						}
						
					}
					if(power) {
						if(work2.equals("2") || work2.equals("�µ���")) {
							if(ch >= 30) {
								System.out.println("������)) �ְ� �µ� �Դϴ�.");
							}
							else {
								rc.mainUp();
								ch++;
							}
							System.out.println("������)) ���� �µ� " + ch);
						}
						else if(work2.equals("3") || work2.equals("�µ��ٿ�")) {
							if(ch <= 16) {
								System.out.println("������)) ���� �µ� �Դϴ�.");
							}
							else {
								rc.mainDown();
								ch--;
							}
							System.out.println("������)) ���� �µ� " + ch);
						}
						else if(work2.equals("4") || work2.equals("ǳ����")) {							
							if(vol >= 10) {
								System.out.println("������)) �ְ� ǳ�� �Դϴ�.");
							}
							else {
								vol++;
								rc.subUp();
							}
							System.out.println("������)) ����ǳ�� " + vol);
							option = false;
						}
						else if(work2.equals("5") || work2.equals("ǳ���ٿ�")) {							
							if(vol == 0) {
								System.out.println("������)) ���� ǳ�� �Դϴ�.");
							}
							else {
								vol--;
								rc.subDown();
							}
							System.out.println("������)) ����ǳ�� " + vol);
							option = false;
						}
						else if(work2.equals("6") || work2.equals("��ǳ")) {
							if(option) {
								boolean result = rc.optionOff(option);
								option = result;
							}
							else if(option == false){
								boolean result = rc.optionOn(option);
								option = result;
							}						}
					}
					else {
						System.out.println("�޼���)) ������ ���ּ���.");
					}
					if(work2.equals("7") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
						power = false;
						option = false;
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("3") || work.equals("����û����")) {
				while(true) {
					rc = new Air_cleaner();
					ch = 0;
					System.out.print("Ezen ����û����");
					if(power) {
						System.out.print("\t ���� ����");
					}
					else {
						System.out.print("\t ���� ����");
					}
					if(option) {
						System.out.print("\t �ڵ����  \n");
					}
					else {
						System.out.printf("\t ǳ�� %d  \n",ch);
					}
					System.out.println("1)���� 2)ǳ���� 3)ǳ���� 4)�ڵ� 5)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(power) {
							boolean result = rc.turnOff(power);
							power = result;
						}
						else if(power == false){
							boolean result = rc.turnOn(power);
							power = result;
							vol = 1;
						}
						
					}
					if(power) {
						if(work2.equals("2") || work2.equals("�µ���")) {
							if(ch >= 11) {
								System.out.println("����û����)) �ְ� ǳ�� �Դϴ�.");
							}
							else {
								ch++;
								rc.mainUp();								
							}
							System.out.println("����û����)) ���� ǳ�� " + ch);
						}
						else if(work2.equals("3") || work2.equals("�µ��ٿ�")) {
							if(ch == 1) {
								System.out.println("����û����)) ���� ǳ�� �Դϴ�.");
							}
							else {
								ch--;
								rc.mainDown();
							}
							System.out.println("����û����)) ���� ǳ�� " + ch);
						}
						else if(work2.equals("4") || work2.equals("�ڵ�")) {
							if(option) {
								boolean result = rc.optionOff(option);
								option = result;
							}
							else if(option == false){
								boolean result = rc.optionOn(option);
								option = result;
							}						
						}
					}
					else {
						System.out.println("�޼���)) ������ ���ּ���.");
					}
					if(work2.equals("5") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
						power = false;
						option = false;
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("4") || work.equals("������")) {
				while(true) {
					rc = new DoorLock();
					System.out.print("Ezen �����");
					if(power) {
						System.out.print("\t ����� ��� \n");
					}
					else {
						System.out.print("\t ����� ���� \n");
					}
					
					System.out.println("1)������ 2)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(power) {
							boolean result = rc.turnOff(power);
							power = result;
						}
						else if(power == false){
							boolean result2 = rc.turnOn(power);
							power = result2;
							Thread.sleep(5000);
							boolean result = rc.turnOff(power);
							power = result;
						}
						
					}
					if(work2.equals("5") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
						power = false;
						option = false;
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("5") || work.equals("��������")) {
				
				while(true) {
					rc = new Gas_valve();
					System.out.print("Ezen ��������");
					if(power) {
						System.out.print("\t �������� ���� \n");
					}
					else {
						System.out.print("\t �������� ��� \n");
					}
					
					System.out.println("1)�������� 2)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(power) {
							boolean result = rc.turnOff(power);
							power = result;
						}
						else if(power == false){
							boolean result2 = rc.turnOn(power);
							power = result2;
						}
						
					}
					if(work2.equals("5") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
						power = false;
						option = false;
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("6") || work.equals("����")) {
				System.out.println("�޼���)) �ý����� ���� �մϴ�.");
				break;
			}
		}
	}
}
