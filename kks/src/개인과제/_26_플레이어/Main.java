package 개인과제._26_플레이어;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		boolean soundsw = true;
		boolean moviesw = true;
		while(true) {
			
			System.out.println("1소리재생 2 영상재생");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				Sound sound = new Sound();
				
				if(soundsw) {
					sound.soundstop(true);
					sound.start();
					soundsw = false;
				}
				else {
					sound.soundstop(false);
					soundsw = true;
				}
				
			}
			else if( ch == 2) {
				Movie movie = new Movie();
				if(moviesw) {
					movie.Moviestop(true); 
					movie.start();	
					moviesw = false;
				}
				else {
					movie.Moviestop(false);
					moviesw = true;
				}
			}
			else if( ch == 3) {
				System.out.println("종료");
				scanner.close();
				break;
			}
		}
	}
}