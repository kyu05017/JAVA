package ���ΰ���._02_����������;

import java.util.Scanner;

public class �ѿ���_����ڵ� {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// �Է°�ü ����
		
		Elevator elevator = new Elevator(10);// ó�� �⺻�� 10 ���� ���� => 10��
		
		while (true) {
			System.out.println("-----------------------------------����������-------------------------------------------");
			System.out.println("��������Դϱ�? 1~20: "); int ȣ������ = scanner.nextInt(); // ���� ���� �Է¹ޱ�
			
			boolean �������� = false; // ���� ���� ����
			if(elevator.���� != ȣ������ && ȣ������ > 0 && ȣ������ <= 20) {// ���������� �ƴϸ�
				if(ȣ������ < elevator.����) {// ȣ������ ���� ������ġ�� ������
					while(true) {// ���� ���� ����
						elevator.����--;// ������ �������鼭 �ϳ��� ��������
						System.out.println(elevator.���� + "��");
						if(ȣ������ == elevator.����) { // ������ �������̵Ǹ�
							System.out.println("����");
							�������� = true;			// ������ ���������� ���������� �������� true;
							break; 					// ����
						}// �������̸� end
					}// �������� end	
				}else {// ȣ������ ���� �������� ������
					while(true) {// ���� ���� ����
						elevator.����++;// ������ �ö󰡸鼭 �ϳ��� �÷���
						System.out.println(elevator.���� + "��");
						if(ȣ������ == elevator.����) { // ������ �������̵Ǹ�
							System.out.println("����");
							�������� = true;			// ������ ���������� ���������� �������� true;
							break; 					// ����
						}// �������̸� end
					}// �������� end
				}					
				
			}else if(elevator.���� == ȣ������) { // ������������
				System.out.println("���� ���Դϴ�");
				�������� = true;
			}
			else { // �������� �����
				System.out.println("����)) 1~20�� ���� �Է����ּ���");
			}
			
			
			if(�������� == true){ // ������ ������
				System.out.println("������ ���ڽ��ϱ�?: "); int �������� = scanner.nextInt(); // �������� �Է¹ޱ�
				if(�������� >= 1 && �������� <= 20) {// ���־��϶�
					if(elevator.���� < ��������) {// ������������ ���������� ������
						System.out.println("�ö󰩴ϴ�");
						while(true) { // ���� �������� 
							elevator.����++; // ���� ������ �ö󰡱�
							System.out.println(elevator.���� + "��");
							if(elevator.���� == ��������) {//������ ����������
								System.out.println("�����߽��ϴ�");
								break;// �ݺ��� ����
							}
						} //while end
					}else if(elevator.���� > ��������) {//������������ ���������� ������
						System.out.println("�������ϴ�");
						while(true) { // ���� �������� 
							elevator.����--; // ���� ������ �ö󰡱�
							System.out.println(elevator.���� + "��");
							if(elevator.���� == ��������) {//������ ����������
								System.out.println("�����߽��ϴ�");
								break;// �ݺ��� ����
							}		
						}
					}
				}else {// �������� ���ְ� ����������
					System.out.println("����)) 1~20�� ���� �Է����ּ���");
				}
				
				
			}
			System.out.println("���翤�� ����: " + elevator.����);
		}// while
	}// me
}// cs

