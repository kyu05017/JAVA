package ���α׷��־��Ȱ��_��Լ�;

import java.util.Scanner;

public class ���α׷��־��Ȱ��_��Լ� {
	
	public static void main(String[] args) {
		
		
		
		���α׷��־��Ȱ��_��Լ�_�л�Ŭ����[] studentlist = new ���α׷��־��Ȱ��_��Լ�_�л�Ŭ����[100];//100��
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("--------------------------------------");
				System.out.println(" \t��\t��\tǥ");
				System.out.println("--------------------------------------");
				System.out.println(" ��ȣ  �̸�  ����  ����  ����  ����  ���  ���� ");
				
				for(int i = 0; i <studentlist.length;i++) {
					for(int j = 0; j < studentlist.length;j++) {
						if(studentlist[i] != null && studentlist[j] != null){
							if(studentlist[i].getTotal() > studentlist[j].getTotal()) {
								���α׷��־��Ȱ��_��Լ�_�л�Ŭ����[] temp = new ���α׷��־��Ȱ��_��Լ�_�л�Ŭ����[1];
								temp[0] = studentlist[i];
								studentlist[i] = studentlist[j];
								studentlist[j] = temp[0];
								}
						}
					}
				}
				int h = 0;
				for(���α׷��־��Ȱ��_��Լ�_�л�Ŭ���� temp : studentlist) {
					if(temp != null) {
						System.out.printf("  %d  %s  %d  %d  %d  %d  %.1f   %d\n",
								(h+1),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTotal(),temp.getAve(),(h+1));
					}
					h++;
				}
				/*
				 * 
				 * 
				 * 
				 */
				
				System.out.println("--------------------------------------");
				System.out.println();
				System.out.println("�޴� : 1.�л����� ��� 2.�л����� ����");
				int ch = scanner.nextInt();
				if(ch == 1) {
					System.out.println("�л��߰�)");
					System.out.println("�̸� �Է� :");
					String name = scanner.next();
					System.out.println("�������� : ");
					int korean = scanner.nextInt();
					System.out.println("�������� : ");
					int english = scanner.nextInt();
					System.out.println("�������� : ");
					int math = scanner.nextInt();
					int total = korean+english+math;
					double avg = total/3.0;
					
					���α׷��־��Ȱ��_��Լ�_�л�Ŭ���� students = new ���α׷��־��Ȱ��_��Լ�_�л�Ŭ����(name, korean, english, math, total, avg);
					int j = 0;
					for(���α׷��־��Ȱ��_��Լ�_�л�Ŭ���� temp : studentlist) {
						if(temp == null) {
							studentlist[j] = students;
							break;
						}
						j++;
					}
					
				}
				else if(ch == 2) {
					System.out.println("������ �л� ��ȣ �Է� : ");
					int num = scanner.nextInt();
					for(int i = num-1;i <studentlist.length;i++) {
						if( i == studentlist.length-1) {
							studentlist[ studentlist.length-1 ] = null;
						}
						else {
							studentlist[i] = studentlist[i+1];
						}
					}
				}
			}
			catch(Exception e) {
				System.out.println("�޼���)) ����");
				scanner = new Scanner(System.in);
			}
			
			
		}
		
	}
	
}
