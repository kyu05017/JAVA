package �򰡿���_17��;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ����2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] students = new String[100][8];
 		try {
			while(true) {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("\t��\t��\tǥ");
				System.out.println("-------------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				//����ǥ ������ ��
				
				int in = 0;
				for(String[] temp : students) {
					try {
						if(students[in] != null) {
							double avg2 = Double.valueOf(students[in][6]);
							System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%.2f\t%s\n",in+1,students[in][1],students[in][2],students[in][3],students[in][4],students[in][5],avg2,in+1);
						}
					}
					catch(NullPointerException e) {
						System.out.println();
						break;
					}
					in++;
				}
				
				System.out.println("-------------------------------------------------------------------");
				System.out.println("1)�л���� 2)�л�����");
				
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
					double avg = total/3;

					for(int i = 0; i < students.length; i++) {
						if(students[i][0] == null) {
							
							String str_i = String.valueOf(i+1);
							String str_kor = String.valueOf(korean);
							String str_eng = String.valueOf(english);
							String str_mat = String.valueOf(math);
							String str_tot = String.valueOf(total);
							String str_avg = String.valueOf(avg);
							students[i][0] = str_i;
							students[i][1] = name;
							students[i][2] = str_kor;
							students[i][3] = str_eng;
							students[i][4] = str_mat;
							students[i][5] = str_tot;
							students[i][6] = str_avg;
							System.out.println("�л���� �Ϸ�~!");
							for(int j = 0; j< students.length; j++) {
								if(students[i][5] != null && students[j][5] != null && students[j] != null && students[i] != null) {
									int total1 = Integer.parseInt(students[i][5]);
									int total2 = Integer.parseInt(students[j][5]);
									if(total1 > total2) {
										String[] temp = students[i];
										students[i] = students[j];
										students[j] = temp;
									}
								}
							}
							break;
						}
					}
				}
				else if (ch == 2) {
					System.out.println("�л�����)");
					System.out.println("�л� ��ȣ :");
					String num = scanner.next();
					
					for(int i = 0; i < students.length-1;i++) {
						if(students[i][0] != null && students[i][1].equals(num)){
							System.out.println("�л����� �Ϸ�~!");
							students[i] = null;
							if( i == students.length-1) {
								students[ students.length-1 ] = null;
								break;
							}
							else {
								students[i] = students[i+1];
								students[i+1] = null;
								break;
							}

							
							/*
							if( students[i] ) {
								students[i-1 ] = null;
								break;
							}
							else {
								
								students[i] = null;
								break;
							}
							*/
						}
					}
				}
				else {
					System.out.println("�߸��� �Է�");
				}
			}
		}
		catch(InputMismatchException e) {
		System.out.println("���ڸ� �Է� �����մϴ�.");
		}
	}
}