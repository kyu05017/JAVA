package ���ο���.����;

import java.util.Scanner;
import java.util.StringTokenizer;

public class �ܾ���_���� {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String words = scanner.nextLine();
		
		scanner.close();
		
		StringTokenizer st = new StringTokenizer(words," ");
		
		System.out.println(st.countTokens());
		
	}
}
