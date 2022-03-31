package 개인연습.백준;

import java.util.Scanner;

public class 더하기싸이클 {

	public static void main(String[] args) {
		
		//입력객체
		Scanner scanner = new Scanner(System.in);
		//입력받는 변수
		int init = scanner.nextInt();
		//입력받는 변수를 N에 대입한다
		int N = init;
		//카운트 횟수를 초기화
		int count = 0;
		 
		while(true) {
			// N이 26일경우 
			// 26 나머지10은 6에 곱하기 10을 하면 60이 되고
			// 26 나누기 10인 2와 26에 10나머지인 6을 더해 8을 구하고 10이상일 경우 10의 나머지를 구하여
			// 1의 자리로 만들어 준다.
			//고로 나머지를 더해 86을 만들고 if값인 N == init값이랑 맞지 않기에 종료하지 않고
			//count를 증가시켜 반복회수를 입력한다
			//cont 출력으로 반복횟수를 출력
			N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
			
			count++;	// 사이클 수 증가
			
			if(N == init) {	// 초기값과 같아진다면 break;
				break;
			}
		}
		System.out.println(count);
	}
}