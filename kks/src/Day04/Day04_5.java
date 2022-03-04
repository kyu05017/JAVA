package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {

	public static void main(String[] args) {
		
		// 로또 판별기
			//1. 사용자가 6개 수 입력받기 => 배열저장
				// 1. 1~45 사이 수만 입력 받기 아니면 재입력
				// 2. 중복이면 재입력
			//2. 추첨번호 : 컴퓨터 난수 6개 발생 => 저장 
				//1. 1~ 45 사이
				//2. 중복 x
			//3사용자 추첨번호와 컴ㅍ퓨터 추첨번호 동일 수의 개수
		
		Scanner scanner = new Scanner(System.in);
		
		//준비
		int[] myNumber = new int[6];	//사용자가 선택한 변호 목록
		int[] lottoNumber = new int[6]; //컴퓨터의 난수 번호 목록
		
		for(int i = 0; i < 6; i++) {
			//i 는 01nxj 6미만까지 1씩 증가하면서 6번 반복
			System.out.println("1~45 사이 숫자 입력 : ");
			int inputNumber = scanner.nextInt();
			
			boolean pass = true; //저장되는 조건 변수 
			
			//유효성 검사
			if(inputNumber < 1 || inputNumber > 45) { 
				//로또 번호인 1부터 45중 
				//내가 쓴 숫자가 1보다 작거나 || 45보다 크면
				//if 조건문 실행
				System.out.println("사용할수 없는 숫자입니다.");
				i--; // 반복횟수 초기화;
				pass = false; // 통과변수를 저장하지 않음
			}
			//중복검사
			for(int j = 0 ; j < 6; j++) {
				if(inputNumber == myNumber[j]) {
					System.out.println("중복된 숫자 입니다.");
					i--;
					pass = false;
				}
			}
			if( pass == true) myNumber[i] = inputNumber;
			
		}
		

	}

}
