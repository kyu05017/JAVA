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
				if(inputNumber == myNumber[j]) { //입력된숫자가 저장된 숫자와 같을 경우
					System.out.println("중복된 숫자 입니다.");
					i--; // 반복횟수 초기화
					pass = false; // 통과변수를 저장하지 않음.
				}
			}
			if(pass == true) myNumber[i] = inputNumber; //저장
		}
		//입력한 정보값을 보여줌
		System.out.println("사용자가 입력한 번호");
		for(int temp : myNumber) {
			//임시변수 선언 : 배열의 숫자만큼 반복
			System.out.println(temp+"\t");
		}
		//로또 번호 생성
		for(int j = 0; j < 6; j++) {//for2 s
			
			Random random = new Random();
			int lotto = random.nextInt(45)+1;
			
			boolean pass2 = true;
			for(int temp : lottoNumber) {
				if(lotto == temp) {
					j--;
					pass2 = false;
				}
			}
			if(pass2 == true) {
				lottoNumber[j] = lotto;
			}
		}// for2 e
		System.out.print("\n \t추첨번호\t: ");
		// * 배열내 모든 인덱스 출력 
		for( int temp : lottoNumber ) {
			System.out.print( temp +"\t");
		}
		// 3. 비교 = 두 배열간 동일한 수 찾기 
		// 사용자 번호 : 3 5 7 1 10 21
		// 추첨 번호  : 5 7 1 34 42 40 
			// i = 0 
				// j = 0 1 2 3 4 5
			// i = 1 
				// j = 0 1 2 3 4 5 
			// ~~~~~
			// i = 5
				// j = 0 1 2 3 4 5
		int sameNum = 0;
		
//		// 방법1 
//		for( int i = 0 ; i<사용자번호.length ; i++ ) {
//			// i 비교 기준점 
//			for( int j = 0 ; j<추첨번호.length ; j++ ) {
//				// j 비교 대상
//				if( 사용자번호[i] == 추첨번호[j] ){
//					// 사용자 배열내 i번째 인덱스 와 
//					// 컴퓨터 배열내 j번째 인덱스 의 수 가 동일하면
//					동일한수++; 
//				}
//			}
//		}
		
		// 방법2 
		for( int 비교기준 : myNumber ) {
			// 사용자번호 배열내 하나씩 비교기준 대입 
			for( int 비교대상 : lottoNumber ) {
				// 추첨번호 배열내 하나씩 비교대상 대입
				if( 비교기준 == 비교대상) sameNum++;
				// 만약에 비교기준과 비교대상이 동일하면 동일한수 1증가
			}
		}
		
		System.out.println(" \n동일한 수 : " + sameNum );
		
	}//m e
}//c e
