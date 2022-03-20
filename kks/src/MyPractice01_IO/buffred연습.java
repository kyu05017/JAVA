package MyPractice01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffred¿¬½À {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String A = reader.readLine();
		
		System.out.println(A);
		
		

	}

}
