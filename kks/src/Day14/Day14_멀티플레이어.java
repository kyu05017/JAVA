package Day14;

import java.util.Scanner;

public class Day14_��Ƽ�÷��̾� {
	
	public static void main(String[] args) {
		
		// ���� [ 1. �������/���� 2. �������/���� ] 
			// ���� : �Ҹ� or ���� 
		
		Scanner scanner = new Scanner(System.in);
		
		boolean soundsw = true;
		boolean moviesw = true;
		
		while(true) {
			
			System.out.println("1�Ҹ���� 2 �������");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				Sound sound = new Sound();
				
				if(soundsw) {
					sound.soundstop(true); // �Ҹ� ����
					sound.start();			// ������ ����
					//sound.stop = false;
						// �������ٽ� > �ٷ� ����
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
					movie.Moviestop(true); // �Ҹ� ����
					movie.start();			// ������ ����
					//sound.stop = false;
						// �������ٽ� > �ٷ� ����
					moviesw = false;
				}
				else {
					movie.Moviestop(false);
					moviesw = true;
				}
			}
			else if( ch == 3) {
				System.out.println("����");
				scanner.close();
				break;
			}
		}
	}
}
