package MyPratice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buffred¿¬½À3 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = br.readLine();
		int B = Integer.parseInt(br.readLine());

		bw.write(A+"\n");
		bw.write(B+"\n");
		
		bw.close();
	}

}
