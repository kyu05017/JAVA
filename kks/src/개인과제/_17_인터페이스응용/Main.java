package ���ΰ���._17_�������̽�����;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		Remote rc;
		boolean tv_power = false;
		boolean tv_option = false;
		boolean Air_conditioner_power = false;
		boolean Air_conditioner_option = false;
		boolean Air_cleaner_power = false;
		boolean Air_cleaner_option = false;
		boolean DoorLock_power = false;
		boolean Gas_valve_power = false;
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
					if(tv_power) {
						System.out.print("\t ���� ����");
					}
					else {
						System.out.print("\t ���� ����");
					}
					if(tv_option) {
						System.out.print("\t ���Ұ�  \n");
					}
					else {
						System.out.print("\t ���ҰŲ�  \n");
					}
					System.out.println("1)���� 2)����ä�� 3)����ä�� 4)������ 5)�����ٿ� 6)���Ұ� 7)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(tv_power) {
							boolean result = rc.turnOff(tv_power);
							tv_power = result;
						}
						else if(tv_power == false){
							boolean result = rc.turnOn(tv_power);
							tv_power = result;
						}
					}
					if(tv_power) {
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
							tv_option = false;
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
							tv_option = false;
						}
						else if(work2.equals("6") || work2.equals("���Ұ�")) {
							if(tv_option) {
								boolean result = rc.optionOff(tv_option);
								tv_option = result;
							}
							else if(tv_option == false){
								boolean result = rc.optionOn(tv_option);
								tv_option = result;
							}
						}
					}
					else {
						System.out.println("�޼���)) ������ ���ּ���.");
					}
					if(work2.equals("7") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");

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
					if(Air_conditioner_power) {
						System.out.print("\t ���� ����");
					}
					else {
						System.out.print("\t ���� ����");
					}
					if(Air_conditioner_option) {
						System.out.print("\t ��ǳ���  \n");
					}
					else {
						System.out.printf("\t ��� %d'C ǳ�� %d  \n",ch,vol);
					}
					System.out.println("1)���� 2)�µ��� 3)�µ��� 4)ǳ���� 5)ǳ���� 6)��ǳ 7)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(Air_conditioner_power) {
							boolean result = rc.turnOff(Air_conditioner_power);
							Air_conditioner_power = result;
						}
						else if(Air_conditioner_power == false){
							boolean result = rc.turnOn(Air_conditioner_power);
							Air_conditioner_power = result;
							vol = 1;
						}
						
					}
					if(Air_conditioner_power) {
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
							Air_conditioner_option = false;
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
							Air_conditioner_option = false;
						}
						else if(work2.equals("6") || work2.equals("��ǳ")) {
							if(Air_conditioner_option) {
								boolean result = rc.optionOff(Air_conditioner_option);
								Air_conditioner_option = result;
							}
							else if(Air_conditioner_option == false){
								boolean result = rc.optionOn(Air_conditioner_option);
								Air_conditioner_option = result;
							}						}
					}
					else {
						System.out.println("�޼���)) ������ ���ּ���.");
					}
					if(work2.equals("7") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
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
					if(Air_cleaner_power) {
						System.out.print("\t ���� ����");
					}
					else {
						System.out.print("\t ���� ����");
					}
					if(Air_cleaner_option) {
						System.out.print("\t �ڵ����  \n");
					}
					else {
						System.out.printf("\t ǳ�� %d  \n",ch);
					}
					System.out.println("1)���� 2)ǳ���� 3)ǳ���� 4)�ڵ� 5)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(Air_cleaner_power) {
							boolean result = rc.turnOff(Air_cleaner_power);
							Air_cleaner_power = result;
						}
						else if(Air_cleaner_power == false){
							boolean result = rc.turnOn(Air_cleaner_power);
							Air_cleaner_power = result;
							vol = 1;
						}
						
					}
					if(Air_cleaner_power) {
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
							if(Air_cleaner_option) {
								boolean result = rc.optionOff(Air_cleaner_option);
								Air_cleaner_option = result;
							}
							else if(Air_cleaner_option == false){
								boolean result = rc.optionOn(Air_cleaner_option);
								Air_cleaner_option = result;
							}						
						}
					}
					else {
						System.out.println("�޼���)) ������ ���ּ���.");
					}
					if(work2.equals("5") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
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
					if(DoorLock_power) {
						System.out.print("\t ����� ��� \n");
					}
					else {
						System.out.print("\t ����� ���� \n");
					}
					
					System.out.println("1)������ 2)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(DoorLock_power) {
							boolean result = rc.turnOff(DoorLock_power);
							DoorLock_power = result;
						}
						else if(DoorLock_power == false){
							boolean result2 = rc.turnOn(DoorLock_power);
							DoorLock_power = result2;
							Thread.sleep(5000);
							boolean result = rc.turnOff(DoorLock_power);
							DoorLock_power = result;
						}
						
					}
					if(work2.equals("5") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
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
					if(Gas_valve_power) {
						System.out.print("\t �������� ���� \n");
					}
					else {
						System.out.print("\t �������� ��� \n");
					}
					
					System.out.println("1)�������� 2)���θ޴�");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("����")) {
						if(Gas_valve_power) {
							boolean result = rc.turnOff(Gas_valve_power);
							Gas_valve_power = result;
						}
						else if(Gas_valve_power == false){
							boolean result2 = rc.turnOn(Gas_valve_power);
							Gas_valve_power = result2;
						}
						
					}
					if(work2.equals("5") || work2.equals("���θ޴�")) {
						System.out.println("�޼���)) �޴��� ���ư��ϴ�.");
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
