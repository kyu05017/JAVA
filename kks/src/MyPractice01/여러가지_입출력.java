package MyPractice01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ��������_����� {
	public static void main(String[] args) throws IOException {
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		
		// ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// ���ڿ�
		
		// ��ĳ�ʸ� �̿��� �Է�
		String c = scanner.next();
		// �������带 �̿��� �Է�
		String a = br.readLine();
		
		//�ý��� in�� �̿��� �Է�
		byte[] bytes = new byte[1024];
		int b_input = System.in.read(bytes);
		String str_b = new String(bytes,0,b_input-2);

		System.out.println("�������� ���ڿ� a : " + a);
		System.out.println("�ý����� ���ڿ� b : " + str_b);
		System.out.println("��ĳ��  ���ڿ� c : " + c);
		
		//������
		//�������带 �̿��� ���� �Է�
		
		int c2 = scanner.nextInt();
		
		String a_2 = br.readLine();
		
		int a2_int = Integer.parseInt(a_2);
		
		
		int b2_input = System.in.read(bytes);
		String str_b2 = new String(bytes,0,b2_input-2);
		int in_b2 = Integer.parseInt(str_b2);
		

		
		System.out.println("�������� ������ : " + a2_int);
		System.out.println("�ý����� ������ : " + in_b2);
		System.out.println("��ĳ��  ������ : " + c2);
		
		
		
		String Z = br.readLine();
		bw.write("��������Ʈ�� ��� : "+Z+"\n");
		bw.flush();
		bw.close();
		scanner.close();
		
		
	}
}
