package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day10_6 {
	
	// �ֱ����ġ 	: �޸� : RAM ���α׷� ����ÿ��� ���� �޸�
	// ���������ġ : HDD,SDD,USB,CD : ���α׷� ���� ���� [��������]
	// ����ó�� 	: �ڹٳ� �޸𸮸� --> ��ǻ��[pc]
	// DBó�� 	: �ڹٳ� �޸𸮸� --> DB ������[pc] 
		// ��Ʈ��(Stream) : ���α׷��� �ܺ�[Ű����,�Ĥ���,��Ʈ��ũ��] ���
			//��Ŵ��� : byte
 		// Fileoutputstream =  �������
			// ��ü��.writer(����Ʈ��);
		// fileinputstream = ���� �Է�
			// ��ü��.read(����Ʈ�迭);
		// String Ŭ����
			// ���ڿ�.equlas() : ���ڿ� �� �޼ҵ�
			// ���ڿ�.getBytes() : ���ڿ� > ����Ʈ�� ��ȯ
			// new String (  ����Ʈ �迭 ) : ����Ʈ�迭 > ���ڿ�
	
	public static void main(String[] args) throws IOException   {
										// ������ ���� ó���� �ѱ�
		Scanner scanner = new Scanner(System.in);
		String aa = scanner.next();
		// ������� [ ���� - > �ڹ� ]
		FileOutputStream fileOutputStream = new FileOutputStream("D:/KKS/�ڹ�/"+aa+".txt");
		FileOutputStream ������� = new FileOutputStream("D:/KKS/�ڹ�/a.txt");
		
		String contents = "�ڹٿ��� �Էµ� ������";
		�������.write(contents.getBytes() );
		
		String contents2 = "Hello, world";
		fileOutputStream.write(contents2.getBytes() );

		// �����Է� [ �ڹ� - > �Է� ]
		FileInputStream �����Է� = new FileInputStream("D:/KKS/�ڹ�/a.txt");
		FileInputStream fileInputStream = new FileInputStream("D:/KKS/�ڹ�/"+aa+".txt");
		//FileInputStream : ��������� Ŭ����
		// ���ϰ��/���ϸ�.Ȯ����  // txt : �޸���
		byte[] bytes = new byte[1000];
		byte[] bytes2 = new byte[1000];
		�����Է�.read(bytes);
		fileInputStream.read(bytes2);
		System.out.println("���ϳ��� : " + new String(bytes));
		System.out.println("���ϳ��� : " + new String(bytes2));
		
		//�����ۼ�
		
	}
}
