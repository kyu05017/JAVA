package ���α׷��־��Ȱ��.�򰡿���_17��;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Students[] studentlist = new Students[100];
		try {
			while(true) {
				System.out.println("----------------------------------------------------------------");
				System.out.println("\t��\t��\tǥ");
				System.out.println("----------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				for(int i = 0; i < studentlist.length; i++) {
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
				int h = 0;
				for(Students temp : studentlist) {
					if(temp != null) {
						System.out.printf("%d\t%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								(h+1),temp.getName(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTotal(),temp.getAve(),(h+1));
					}
					h++;
				}
				System.out.println("----------------------------------------------------------------");
				System.out.println("1)�л���� 2)�л�����");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("�л����))");
					System.out.println("�л��̸� : ");
					String name = scanner.next();
					System.out.print("�������� : \n");
					int kor = scanner.nextInt();
					System.out.print("�������� : \n");
					int eng = scanner.nextInt();
					System.out.print("�������� : \n");
					int math = scanner.nextInt();
					int total = kor + eng + math;
					double avg = total/3;					
					
					Students students = new Students(name, kor, eng, math, total, avg);
					
					for(int i = 0; i < studentlist.length; i++) {
						if(studentlist[i] == null) {
							studentlist[i] = students;
							break;
						}
					}
					
				}
				else if(ch == 2) {
					System.out.println("�л�����))");
					System.out.print("������ �л���ȣ : \n");
					int num = scanner.nextInt();
					
					for(int i = num -1 ; i <studentlist.length; i++) {
						if(i == studentlist.length -1 ) {
							studentlist[studentlist.length -1] = null;
						}
						else {
							studentlist[i] = studentlist[i+1];
						}
					}
					
				}
				else {
					System.out.println("�޼���) �������� �ʴ� �޴� �Դϴ�.");
				}
			
			}
		}
		catch(Exception e) {
			System.out.println("�޼���)) ����");
			scanner = new Scanner(System.in);
		}
	}

}
