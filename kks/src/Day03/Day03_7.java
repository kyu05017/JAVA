package Day03;

import java.util.Scanner;

public class Day03_7 {//cs

	public static void main(String[] args) //ms
	
	{
		boolean run = true; //���� ���� ���� / true = ���� false = ����
		int balance = 0; // ���ݾ� [ ����ȿ� �ִ� �ݾ�]		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("|1.���� | 2.��� | 3.�ܰ� | 4.����");		
			System.out.println("-----------------------------");
			System.out.print("���� >");
			
			int put = scanner.nextInt();
			
			if(put==1) { //�Է°��� 1�̸� ����
				System.out.println(" ���ݾ� : "); int ���ݾ� = scanner.nextInt();
				balance += ���ݾ�; //�Է¹��� ���ݾ��� ���忡 �߰�
			}
			else if(put==2) { // �Է��� ���� 2�� ����
				System.out.println("��ݾ� : "); int ��ݾ� = scanner.nextInt();		
				//��ݾ��� ���ݾ� ���� �� ũ�� �ܾ׺���
				if(��ݾ� > balance) {
					System.out.println("�ܾ׺���");
				} 
				else {//�ƴϸ� ���
					balance -= ��ݾ�;
				}
				
			}
			else if(put==3 ) { // �Է��� ���� 3�̸� ����
				
			} 
			else if(put==4) { // �߷��� ���� 4�Ӹ�
				break;
			}
			else {
				System.out.println("�˼� ���� ��ȣ �Դϴ�.");
			
			}
		}

	}

}
