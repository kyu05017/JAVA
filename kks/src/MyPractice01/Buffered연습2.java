package MyPractice01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buffered����2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//��ü����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//�Է¹���
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		//���
		bw.write(A+"\n");
		bw.write(B+"\n");
		
		//�ݾ������
		bw.close();
	}

}
