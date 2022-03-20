package MyPractice01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buffered연습2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//객체선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//입력받음
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		//출력
		bw.write(A+"\n");
		bw.write(B+"\n");
		
		//닫아줘야함
		bw.close();
	}

}
