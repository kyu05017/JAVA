package ���α׷��־��Ȱ��.�򰡿���_17��;

import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Students[] studentlist = new Students[100];
		try {
			while(true) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("\t��\t��\tǥ");
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				//����ǥ ǥ��
				for(int i = 0; i <studentlist.length; i++) {
					for(int j = 0; j < studentlist.length; j++) {
						if(studentlist[i] != null && studentlist[j] != null) {
							if(studentlist[i].getTotal() > studentlist[j].getTotal()) {
								Students[] temp = new Students[1];
								temp[0] = studentlist[i];
								studentlist[i] = studentlist[j];
								studentlist[j] = temp[0];
								
							}
						}
					}
				}
				int i = 0;
				for(Students temp : studentlist) {
					if(temp != null) {
						System.out.printf("%d\t%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								(i+1),temp.getName(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTotal(),temp.getAve(),(i+1));
					}
					i++;
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("1)�л���� 2)�л�����");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("�л����))");
					System.out.println("�л���ȣ : \n");
					int num = scanner.nextInt();
					System.out.print("�л��̸� : \n");
					String name = scanner.next();
					System.out.print("�������� : \n");
					int kor = scanner.nextInt();
					System.out.print("�������� : \n");
					int eng = scanner.nextInt();
					System.out.print("�������� : \n");
					int math = scanner.nextInt();
					int total = kor+eng+math;
					double avg = total/3;
					
					Students students = new Students(name, kor, eng, math, total, avg);
					
					int j = 0;
					for(Students temp : studentlist) {
						if(temp == null) {
							studentlist[j] = students;
							break;
						}
						j++;
					}
				}
				else if(ch == 2) {
					System.out.println("�л�����))");
					System.out.print("������ �л��� ��ȣ : \n");
					int num = scanner.nextInt();
					
					for(int h = num-1;h <studentlist.length;h++) {
						if( h == studentlist.length-1) {
							studentlist[ studentlist.length-1 ] = null;
						}
						else {
							studentlist[h] = studentlist[h+1];
						}
					}
				}
				else {
					System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
				}
			}
		}
		catch(Exception e) {
			System.err.println("�޼���) ����");
			scanner = new Scanner(System.in);
		}
	}

}
