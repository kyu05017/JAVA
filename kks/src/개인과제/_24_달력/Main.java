package ���ΰ���._24_�޷�;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Calen.bw.write("�޷� ���α׷�))\n");
		Calen.bw.write("���� : \n"); 
		Calen.bw.flush();
		int year = Calen.scanner.nextInt();
		Calen.bw.write("�� : \n");	
		Calen.bw.flush();
		int month = Calen.scanner.nextInt();
		
		Calen.Cal( year , month );
		
	}
}
