package 개인연습.백준;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의_개수 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String words = scanner.nextLine();
		
		scanner.close();
		
		StringTokenizer st = new StringTokenizer(words," ");
		
		System.out.println(st.countTokens());
		
	}
}
