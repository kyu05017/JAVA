package MyPractice01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import Day11.Board_MainContents;

public class ����_11ȸ��_12ȸ�� {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Board_MainContents> boardlist = new ArrayList<>();
		try { // ������ �鿩��
			FileInputStream inputStream = new FileInputStream("D:/KKS/�ڹ�/a.txt");
			
			byte[] bytes = new byte[1024]; // 1 . ����Ʈ �迭 ����
			inputStream.read(bytes); // 2. ��� ����Ʈ�� �о�ͼ� ����Ʈ���� ���� 
			String file = new String(bytes); // 3. ����Ʈ�� ���ڿ��� ��ȯ
			String[]list = file.split("\n"); // 4. ���ڿ� �ڸ���
			
			for(String temp : list) { // �迭�� �ϳ� �� ������
				String[] filed = temp.split(",");// 5. ���ڿ� �ڸ��� 
			}
			
		}
		catch(Exception e) {
			
		}
		try { //������ ������
			FileOutputStream outputStream = new FileOutputStream("D:/KKS/�ڹ�/a.txt");
			// 2. ���Ͽ� �ۼ��� ���� [ ���پ� ]
			for(Board_MainContents temp : boardlist) {
				String contents = temp.getTitle() +","+temp.getContens()+","+temp.getPassword()+","+temp.getWriter()+","+temp.getViewcount()+","+temp.getDate()+"\n";
				outputStream.write(contents.getBytes());
			}
			
			// 3. ����[���ڿ�] -> ����Ʈ�� ��ȯ [ �ܺ���� > ��Ʈ�� [����Ʈ] ]
			
			// 4. �������� write()
			
			
		}
		catch(Exception e) {
			
		}
		
		// ��ĳ�ʰ� �ƴ� �Է¹��
		byte[] bytes2 = new byte[100];					// ����Ʈ�迭�� ����
		int input2 = System.in.read(bytes2);			//������ �Է��� ����
		String input2_1 = new String(bytes2,0,input2-2);//�Է¹��� ���� ���ڿ��� ���� ���Ϳ� Ŀ���� �Ű���
		
		System.out.println(input2_1);
		
		try {
			String str = "�ȳ��ϼ���";
			// 1. ���ڵ�Ÿ�� [ ���ڵ�/ ���ڵ�] : ��ȯ ���
			// 1. EUC_KR [ �ѱ� / ���� : �ѱ� 2����Ʈ ]
			byte[] bytes21 = str.getBytes("EUC_KR"); // �Ϲ� ���� �߻�
			System.out.println("EUC_KR ����: "+bytes21.length);
			String str2 = new String(bytes21,"EUC_KR");
			System.out.println("����Ʈ�� -> ���ڿ�: "+str2);
			
			// 2. UFT-8 [ ������ ��� : �ѱ� 3����Ʈ ]
			byte[] bytes3 = str.getBytes("UTF8"); // �Ϲ� ���� �߻�
			System.out.println("UTF8 ����: "+bytes3.length);
			String str3 = new String(bytes3,"UTF8");
			System.out.println("����Ʈ�� -> ���ڿ� : "+str3);
			
		} catch (Exception e) {

		}
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		
		if(subject.indexOf("�ڹ�") != -1) { // �ε����� 0������ ���� [ -1 �ε����� ���� ]
			System.out.println("�ڹٿ� ���õ� å�Դϴ�.");
		}
		else {
			System.out.println("�ڹٿ� ���� ����.");
		}
		
		String ssn3 = "880815-1234567";
		//substring()
		String firstnum = ssn3.substring(0,6); // ���� �δ콺 ~ ���ε���
		System.out.println(firstnum);
		String num2 = ssn3.substring(7); // �ε��� ��ó~ ������
		System.out.println(num2);
		
		//slpit
			//"880815-1234567" "-" �������� �ڸ��� 2���� -> �ſ���ȯ
			// [0] : 880815 [1]: 1234567
		System.out.println("�պκ� "+ ssn3.split("-")[0]);
		System.out.println("�޺κ� "+ ssn3.split("-")[1]);
		
	}
}
