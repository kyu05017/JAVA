package Day04;

import java.util.Scanner;

public class Day04_7_�迭�����غ��� {

	public static void main(String[] args) {
		
		String[] ���� = {"���","�ٳ���","������","����"};
		int[] ��ȣ = {1,2,3,4,5,6,7,8,9,10};
		
		int[] ���ڹ迭 = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է�1");
		int ����1 = scanner.nextInt();
		System.out.println("�Է�2");
		int ����2 = scanner.nextInt();
		System.out.println("�Է�3");
		int ����3 = scanner.nextInt();
		
		���ڹ迭[0] = ����1;
		���ڹ迭[1] = ����2;
		���ڹ迭[2] = ����3;
		
		System.out.println("���?");
		System.out.println("1. ���� 2.��ȣǥ 3.�Էµȼ���");
		int input = scanner.nextInt();
		
		if(input == 1) {
			System.out.println(����[0]);
			System.out.println(����[1]);
			System.out.println(����[2]);
			System.out.println(����[3]);
		}
		else if( input == 2) {
			System.out.println(��ȣ[0]);
			System.out.println(��ȣ[1]);
			System.out.println(��ȣ[2]);
			System.out.println(��ȣ[3]);
			System.out.println(��ȣ[4]);
			System.out.println(��ȣ[5]);
			System.out.println(��ȣ[6]);
			System.out.println(��ȣ[7]);
			System.out.println(��ȣ[8]);
			System.out.println(��ȣ[9]);			
		}
		else if(input == 3) {
			System.out.println(���ڹ迭[0]);
			System.out.println(���ڹ迭[1]);
			System.out.println(���ڹ迭[2]);
		}
	}

}
