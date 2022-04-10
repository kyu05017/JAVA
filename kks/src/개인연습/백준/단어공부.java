package 개인연습.백준;

import java.util.Scanner;

public class 단어공부 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[26];
		String word = scanner.next();
		
		for(int i = 0; i < word.length(); i++) {
			if('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				arr[word.charAt(i) - 'A']++;
			}
			else {
				arr[word.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		
	}
}
