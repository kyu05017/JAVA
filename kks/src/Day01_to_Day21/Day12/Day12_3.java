package Day01_to_Day21.Day12;

import java.io.IOException;

public class Day12_3 {
	
	public static void main(String[] args) throws IOException {
		
		// ���� �˻� ���α׷� 
			// [����]
			// 1. �Է¹ޱ� [ System.in.read() ]
			// 2. String �迭�� �̿��� �������� ������ ����
			
		
		String[] books = {"�ȴ�! ���̹� �÷α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������",
			"Tucker�� Go ��� ���α׷���" , "ȥ�� �����ϴ� C ���"	
		};
		// 3. �˻����, �������
			// �˻���� : Ư�� ���ڸ� �Է¹޾� ������ ��ȯ�� ���ڰ� ������ ���� ���
			// "���" �˻� -> "Tucker�� Go ��� ���α׷���" / "ȥ�� �����ϴ� C ���"	
			// '����' ���� -> ������ ������ �Ϻ� �Է¹޾� > ���Ե� ��������ؼ� ��ȣ �����Ŀ�
				// ������ �������� �Ϻ� ����/ ���ο� ���� �Է¹޾� - �����Ϸ�

		
		while(true) {
			System.out.println("����");
			
			for(String temp : books) {
				System.out.println(temp);
			}
			System.out.println("1)�����˻� 2)��������");
			
			
			byte[] bytes1 = new byte[100];
			int input = System.in.read(bytes1);
			String input1 = new String(bytes1,0,input-2);
			
			if(input1.equals("1")) {
				System.out.println("�����˻�)");
				System.out.println("������ �Է� : ");
				byte[] bytes2 = new byte[100];
				int input2 = System.in.read(bytes2);
				String search = new String(bytes2,0,input2-2);
				System.out.println("�˻��� �ܾ� : "+ search);
				// 1�� ���
				/*
				for(String temp : books) {
					if(temp.indexOf(search) != -1) {
						// indexOf �޼ҵ� -1 ��ȯ�Ǵ� ���� ������ �ܾ ������� [ �˻� x]
						System.out.println(temp);
					}
				}
				*/
				// 2�� ���
				for(String temp : books) {
					if(temp.contains(search)) { // contains("ã������") : ���ڿ��� ã�����ڰ� �ִ�true/ ����false �� �Ǵ�
						System.out.println(temp);
					}
				}

			}
			else if(input1.equals("2")) {
				System.out.println("��������)");
				System.out.println("������ �Է�[�Ϻ�] : ");
				byte[] bytes2 = new byte[100];
				int input2 = System.in.read(bytes2);
				String input2_1 = new String(bytes2,0,input2-2);
				int i = 0;
				for(String temp : books) {
					if(temp.indexOf(input2_1) != -1) {
						// indexOf �޼ҵ� -1 ��ȯ�Ǵ� ���� ������ �ܾ ������� [ �˻� x]
						System.out.println("������ȣ "+(i)+" �����"+temp);
					}
					i++;
				}
				
				System.out.println("������ȣ ���� : ");
				byte[] bytes3 = new byte[100];
				int input3 = System.in.read(bytes3);
				String input2_2 = new String(bytes3,0,input3-2);
				int bNo = Integer.parseInt(input2_2);
				System.out.println(" ���� ���� : ");
				int input4 = System.in.read(bytes3);
				String input2_4 = new String(bytes3,0,input4-2);
				System.out.println(" �ٲ� ���� : ");
				int input5 = System.in.read(bytes3);
				String input2_5 = new String(bytes3,0,input5-2);
				
				books[bNo] = books[bNo].replace(input2_4, input2_5);
				System.out.println(books[bNo]);
				
				

			}
			
			
			
			
		}
		
		
		
	}
}
