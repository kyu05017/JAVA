package ���ΰ���._06_�ζ��Ǻ���;

import java.util.Random;		//������ü ����Ʈ
import java.util.Scanner;		//�ӷ°�ü ����Ʈ

public class �ζ��Ǻ���_5 { //Ŭ����
	public static void main(String[] args) {//���� �޼ҵ�
		
		Scanner scanner = new Scanner(System.in);	//�Է°�ü
		Random random = new Random();				//������ü
		
		int[] mynum = new int[6];		//����ȣ �迭 ���� �迭�� ���̴� 6��
		int[] comnum = new int[6];		//�ζǹ�ȣ �迭 ���� �迭�� ���̴� 6��
		
		//i�� 0�϶� 6���� 1�� �����ϸ� �ݺ�
		for(int i = 0; i < 6; i++) {
			System.out.println("1~45 ���� ���� �Է�");
			//��ȣ �Է¹���
			int num = scanner.nextInt();
			//�Ǵܿ� ���� ����ġ ����
			boolean pass = true;
			
			//�Է¹������� 1���� �۰ų� 45���� ũ��
			if(num < 1 || num > 45) {
				System.out.println("�߸��� �Է��Դϴ�.");
				i--;	//��ȸ�� �ʱ�ȭ��Ŵ
				pass = false;//���������� �����ϴ°� ����
			}
			//j�� 0�϶� 6���� 1�� �����ϸ� �ݺ�
			for(int j = 0; j < 6;j++) {
				//�Է¹������� �迭�� ����ȼ��� �������
				if(num == mynum[j]) {
					System.out.println("�̹� ������ ���� �Դϴ�.");
					i--;	//��ȸ�� �ʱ�ȭ��Ŵ
					pass = false;//���������� �����ϴ°� ����
				}
			}
			//���̶�� �迭�� �Է¹������ڸ� ����
			if(pass == true ) {
				mynum[i] = num;
			}
		}
		
		System.out.println("����� �����Ѽ���");
		//�迭���ڸ��� �ӽø� ����
		for(int temp : mynum) {
			System.out.print(temp + "\t");
		}
		
		//i�� 0�϶� �迭�� ���� 6���� 1�� �����ϸ� �ݺ�
		for(int i = 0; i < comnum.length;i++) {
			//1~45������ ��������
			int ch=random.nextInt(45)+1;
			//����ġ ����
			boolean pass2 = true;
			
			//�ӽú���  temp�� �迭�� ���� ��ŭ �ݺ�
			for(int temp : comnum) {
				//������ ������ �迭�� ���� ���� ���
				if(ch == temp) {
					i--; // ��ȣ�� �ʱ�ȭ
					pass2 = false; //�������� ��ȯ
				}
			}
			//pass2�� ���̶�� �ζ� �迭�� ������ �Է�
			if(pass2 == true) {
				comnum[i] = ch;
			}
		}
		
		
		// ���� �ϳ��� ����
		int i =0;
		//temp1 �� ����� ������ �迭 �ӽú����� ��ŭ �ݺ�
		for(int temp1 : mynum) {
			//temp2�� ����� �ζ� ������ �ӽú��� ��ŭ �ݺ�
			for(int temp2 : comnum) {
				if(temp1 == temp2) {//�ΰ��� �ӽú����� �������� �������
					i++;// ����Ƚ���� �ݺ�����ŭ �߰���
				}
			}
		}
		System.out.println("����� ������ ����"+i);
		
		
		
	}
}
