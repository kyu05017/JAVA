package ���ΰ���._22_�����˻����α׷�;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException{
			
	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] books = {"�ȴ�! ���̹� �÷α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������",
			"Tucker�� Go ��� ���α׷���" , "ȥ�� �����ϴ� C ���"};
		byte[] bytes = new byte[100];
		
			
		while(true) {
			bw.write("\n");
			bw.write("����)) ���\n");
			bw.write("\n");
			for(String temp : books) {
				bw.write(temp+"\n");bw.flush();
			}
			bw.write("\n");
			bw.write("1)�����˻� 2)�������� 3)����\n");bw.flush();
			
			int input = System.in.read(bytes);
			String input1 = new String(bytes,0,input-2);
			
			if(input1.equals("1")) {
				bw.write("�����˻�) \n");
				bw.write("������ �Է� : \n");
				bw.flush();
				int input2 = System.in.read(bytes);
				String search = new String(bytes,0,input2-2);
				bw.write("�˻��� �ܾ� : "+ search+"\n");
	
				for(String temp : books) {
					if(temp.contains(search)) { 
						bw.write(temp+"\n");
					}
				}
				bw.flush();
			}
			else if(input1.equals("2")) {
				bw.write("��������) \n");
				bw.write("������ �Է�[�Ϻ�] : \n");
				bw.flush();
				int input2 = System.in.read(bytes);
				String input2_1 = new String(bytes,0,input2-2);
				int i = 0;
				for(String temp : books) {
					if(temp.indexOf(input2_1) != -1) {
						bw.write("������ȣ "+(i)+" �����"+temp+"\n");
					}
					i++;
				}
				bw.flush();
				bw.write("������ȣ ���� : \n");
				bw.flush();
				int input3 = System.in.read(bytes);
				String input2_2 = new String(bytes,0,input3-2);
				int bNo = Integer.parseInt(input2_2);
				bw.write("���� ���� : \n");
				bw.flush();
				int input4 = System.in.read(bytes);
				String input2_4 = new String(bytes,0,input4-2);
				bw.write("�ٲ� ���� : \n");
				bw.flush();
				int input5 = System.in.read(bytes);
				String input2_5 = new String(bytes,0,input5-2);
				
				books[bNo] = books[bNo].replace(input2_4, input2_5);
				bw.write(books[bNo]+"\n");
				bw.flush();
			}
			else if(input1.equals("3")) {
				bw.write("�޼���)) ���α׷��� �����մϴ�.");
				bw.flush();
				bw.close();
				break;
			}
			else {
				bw.write("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
				bw.flush();
			}
		}
	}
}
