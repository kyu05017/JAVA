package Day14;

import java.util.Scanner;

public class Day14_멀티플레이어 {
	
	public static void main(String[] args) {
		
		// 예제 [ 1. 음악재생/중지 2. 영상재생/중지 ] 
			// 조건 : 소리 or 영상 
		
		Scanner scanner = new Scanner(System.in);
		
		boolean soundsw = true;
		boolean moviesw = true;
		
		while(true) {
			
			System.out.println("1소리재생 2 영상재생");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				Sound sound = new Sound();
				
				if(soundsw) {
					sound.soundstop(true); // 소리 실행
					sound.start();			// 스레드 실행
					//sound.stop = false;
						// 직접접근시 > 바로 종료
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
					movie.Moviestop(true); // 소리 실행
					movie.start();			// 스레드 실행
					//sound.stop = false;
						// 직접접근시 > 바로 종료
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
