package Day01_to_Day21.Day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Day01_1_buffred {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
		String A = br.readLine();
		String B = br.readLine();
		
		System.out.println(A);
		bw.write(B + "\n");
		bw.flush();
		bw.close();
		
	}
	
}
