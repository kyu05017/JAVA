package �򰡿���_17��;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ����1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//������
		int[] students = new int[100];
		String[] nam = new String[students.length];
		int[] kor = new int[students.length];
		int[] eng = new int[students.length];
		int[] mat = new int[students.length];
		int[] tot = new int[students.length];
		double[] avg = new double[students.length];
		int[] rank = new int[students.length];
		
 		try {
			while(true) {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("\t��\t��\tǥ");
				System.out.println("-------------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				//����ǥ ������ ��
				for(int i = 0; i< students.length;i++) {
					if(nam[i] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",i+1,nam[i],kor[i],eng[i],mat[i],tot[i],avg[i]);
					}
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

					for(int i = 0; i < students.length; i++) {
						if(nam[i] == null) {
							students[i] = i;
							nam[i] = name;
							kor[i] = korean;
							eng[i] = english;
							mat[i] = math;
							tot[i] = (kor[i]+eng[i]+mat[i]);
							avg[i] = (kor[i]+eng[i]+mat[i])/3;
							rank[i] = 1;
							System.out.println("�л���� �Ϸ�~!");
							break;
						}
					}
				}
				else if (ch == 2) {
					System.out.println("�л�����)");
					System.out.println("�л� �̸� :");
					String name = scanner.next();
					
					for(int i = 0; i < students.length;i++) {
						if(nam[i] != null && nam[i].equals(name)){
							nam[i] = null;
							kor[i] = 0;
							eng[i] = 0;
							mat[i] = 0;
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
