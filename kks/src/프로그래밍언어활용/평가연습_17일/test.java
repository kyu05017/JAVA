package ���α׷��־��Ȱ��.�򰡿���_17��;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		
		
		
		Students[] studentlist = new Students[100];//100��
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("\t��\t��\tǥ");
				System.out.println("-------------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				int i = 0;
				for(Students temp : studentlist) {
					if(temp != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",
								(i+1),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTotal(),temp.getAve());
					}
					i++;
				}
				System.out.println("-------------------------------------------------------------------");
				System.out.println("1)�л���� 2)�л�����");
				int ch = scanner.nextInt();
				if(ch == 1) {
					System.out.println("�л��߰�)");
					System.out.println("�л���ȣ : ");
					int num = scanner.nextInt();
					System.out.println("�̸� �Է� :");
					String name = scanner.next();
					System.out.println("�������� : ");
					int korean = scanner.nextInt();
					System.out.println("�������� : ");
					int english = scanner.nextInt();
					System.out.println("�������� : ");
					int math = scanner.nextInt();
					int total = korean+english+math;
					double avg = total/3;
					
					Students students = new Students(name, korean, english, math, total, avg);
					int j = 0;
					for(Students temp : studentlist) {
						if(temp == null) {
							studentlist[j] = students;
							int h = 0;
							for(Students temp2 : studentlist) {
								if(temp.getTotal() > temp2.getTotal()) {

										studentlist[j] = studentlist[h];
								}	
								h++;
							}

						}
						j++;
					}
				}
				else if(ch == 2) {
					String name = scanner.next();
					int j = 0;
					for(Students temp : studentlist) {
						if(temp != null && name.equals(temp.getName())) {
							studentlist[j-1] = studentlist[j];
							studentlist[j] = null;	
							break;
						}
						j++;
					}
				}
			}
			catch(Exception e) {
				scanner = new Scanner(System.in);
			}
			
			
		}
		
	}
	
}
