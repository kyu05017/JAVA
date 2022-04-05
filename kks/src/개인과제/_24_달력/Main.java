package 개인과제._24_달력;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Calen.bw.write("달력 프로그램))\n");
		Calen.bw.write("연도 : \n"); 
		Calen.bw.flush();
		int year = Calen.scanner.nextInt();
		Calen.bw.write("월 : \n");	
		Calen.bw.flush();
		int month = Calen.scanner.nextInt();
		
		Calen.Cal( year , month );
		
	}
}
