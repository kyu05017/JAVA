package MyPractice01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 여러가지_입출력 {
	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		
		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 문자열
		
		// 스캐너를 이용한 입력
		String c = scanner.next();
		// 버프리드를 이용한 입력
		String a = br.readLine();
		
		//시스템 in을 이용한 입렵
		byte[] bytes = new byte[1024];
		int b_input = System.in.read(bytes);
		String str_b = new String(bytes,0,b_input-2);

		System.out.println("버프리드 문자열 a : " + a);
		System.out.println("시스템인 문자열 b : " + str_b);
		System.out.println("스캐너  문자열 c : " + c);
		
		//정수형
		//버프리드를 이용한 정수 입력
		
		int c2 = scanner.nextInt();
		
		String a_2 = br.readLine();
		
		int a2_int = Integer.parseInt(a_2);
		
		
		int b2_input = System.in.read(bytes);
		String str_b2 = new String(bytes,0,b2_input-2);
		int in_b2 = Integer.parseInt(str_b2);
		

		
		System.out.println("버프리드 정수형 : " + a2_int);
		System.out.println("시스템인 정수형 : " + in_b2);
		System.out.println("스캐너  정수형 : " + c2);
		
		
		
		String Z = br.readLine();
		bw.write("버프라이트로 출력 : "+Z+"\n");
		bw.flush();
		bw.close();
		scanner.close();
		
		
	}
}
