package Day01_to_Day21.Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1 {
	
	public static void main(String[] args) throws IOException {
		
		// p. 496 String Class
			// String ���ڿ�
			// 1. java.lang ��Ű�� [import]�Ҽ�
			// 2. ��ü�ε� �ڵ� ���ͷ� [ ��ü�� �ڵ� ���� ]
		
		//String name1 = new String("�̸�"); ���� ��ǻ� ���� String name1 = "�̸�" // �ڵ� ��ü ����
		
			// 3. 13���� ������ [ ���ڿ� , ����Ʈ�� �� ]
		//String name3 = new String
			// 4. �ܺ�[ ����, ��Ʈ��ũ ��]�� ���� �����ʹ� ���� ����Ʈ�� 
		
		// ����Ʈ -> ���� ��ȯ ���� ����
			// 1. ����Ʈ > +- 127
			// 2. �ƽ�Ű���ڵ� => 0 or 1  ���յ� 7�ڸ� => 0101011 => 2�� 7�� => 128���� ����
				// ����Ʈ -> �ƽ�Ű �ڵ� [ ���� / Ư������ 1����Ʈ, �ѱ� 2����Ʈ]
		
			// ���� : 0 or 1 
			// 7�ڸ� ����  : �ƽ�Ű�ڵ� [1000001 == 65 == A ]
		
		
		byte[]bytes = {72,101,108,108,111,32,74,97,118,97};
					//H	  e   l    l   o ����  J  a  v  a
		//����Ʈ �迭�� ���ڿ��� ��ȯ 
		String str1 = new String(bytes);
		//Ȯ��
		System.out.println("����Ʈ �迭  "+str1);
		
		// 4. Ư�� ��ġ���� ��ȯ
		String str2 = new String(bytes,5,5);
		
		System.out.println("5��° �ε������� 5���� ��ȯ"+str2);
		// * 
		// p.498 ����2
			// System.out : �ý���Ŭ������ ����ʵ�
			// System.in  : �ý���Ŭ������ �Է��ʵ�
		byte[] bytes2 = new byte[100];
		
		System.out.print("�Է� :");// ����ʵ峻 print �޼ҵ�
		// �޼ҵ� ȣ���ϴ� ���
			// 1. ��ü�� �����Ŀ� . �����ڸ� �̿��� �޼ҵ� ȣ��
			// 2. static �ʵ� / �޼ҵ�� ��ü����; Ŭ������.�ʵ�/�޼ҵ�

		int readByteNo = System.in.read(bytes2);
			// �ܺ���� : �ڹ����α׷���[ Ű����, ����, ��Ʈ��ũ �� ] ����� �Ϲݿ���
		
		// Ű���� �Է� ------> ��Ʈ��[ ����Ʈ ���] ------> ��ǻ��
		
		String str3 = new String(bytes2,0,readByteNo-2);
		System.out.println("�Է¹��� ����Ʈ : "+Arrays.toString(bytes2));
		// �����
		//[98, 13, 10,..........
		// b, ����, ĳ�������� : Ŀ���� �ٽ� ������ ������
		
		System.out.println("�Է¹��� ����Ʈ > ���ڿ� : "+ str3);
		
		
			//Scanner Ŭ���� [ system.in] ���� ���� �Է� ���� ����Ʈ�� ��ü�� ����
		Scanner scanner = new Scanner(System.in);
			
		scanner.next(); // ����Ʈ > ���ڿ� ��ȯ
		scanner.nextInt(); //����Ʈ > ������  ��ȯ
		scanner.nextDouble(); // ����Ʈ�� �Ǽ������� ��ȯ
		
		
	}
	
}
