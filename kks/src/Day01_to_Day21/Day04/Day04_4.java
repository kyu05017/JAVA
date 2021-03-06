package Day01_to_Day21.Day04;

public class Day04_4 {// c s

	public static void main(String[] args) {// m s
		
		// 데이터 저장 1개 => 변수
		// 배열 [ 특정(인덱스) 기준으로 나열 ]
			//* 동일한 자료형 여러개 변수를 저장 / 관리
			// 1.index [인덱스] : 저장되는 순서 번호[0번 시작~]
			// 2. [ ] : 대괄호를 사용한다
			// 3. 동일한 자료형을 여러 변수를 관리
		
		//선언 
			// 1. 자료형[] 배열명;			
			// 2. 자료형 배열명[];
			// 3. 자료형[] 배열명 = { 데이터1, 데이터2, 데이터~~~~~}
			// 4. 자료형[] 배열면 = new 자료형[길이]
				// 길이는 배열내 저장할 변수의 개수
		
		//데이터 호출
			//* 배열명 : 배열 메모리 주소값
			//1. 배열명[인덱스번호] : 해당 인데스번호의 데이터 호출
		
		// 배열의 길이
			//1. 배열명.length : 배열내 총길이[ 변수의 개수]
		
		//for 과 배열 활용
			// for ( 자료형 임시변수 : 배열명 ) { }
			// 배열내 0번 인덱스부터 끝 인덱스까지 하나씩 임시변수에 대입 반복처리
		
		//예제1)
		
		int[] score = { 83, 90, 87 };
			//1. int[]  :int 형 데이터 여러개를 저장할수 있는 배열선언
			// 2. score : 배열이름 [ 아무거나 ]
			// 3. { 데이터1, 데이터2, 데이터3~~~~} : 배열에 값을 추가
		//*83, 90, 87 이라는 int 형 데이터 3개를 저장하는 배열 선언
			//83 => 0번 인덱스에 저장
			//90 => 1번 인덱스에 저장
			//87 => 2번 인덱스에 저장
		
		//배열 출력
		System.out.println("score "+ score);//배열이름 호출 => 메모리 주소값
		System.out.println("score [0] " + score[0]);
		System.out.println("score [1] " + score[1]);
		System.out.println("scroe [2] " + score[2]);
		
		System.out.println();
		
		//  반복문과 배열의 활용
		int sum = 0; // 초기화
		for(int i = 0;i<3;i++) {
			//i는 0부터 2까지 증가 
			System.out.println("score ["+i+"] " + score[i]);
			sum += score[i];// 배열명 [인덱스번호]
		}
		System.out.println();
		System.out.println("총합 " + sum);
		double ave = (double) sum / 3;
		System.out.println("평균 " + ave);
		System.out.println();
		
		//예제2)
		int[] 정수배열1 = new int[3];
			// int[]	: int형 배열 선언
			// 정수배열1	: 배열이름[아무거나]
			// new		: 메모리 할당 ( 객체 , 배열에서 사용)
			// int[3]	: 자료형[길이] : 저장개수
		//int형 변수 3개를 저장할수 있는 배열 선언[메모리 할당]
		
		//데이터를 넣기전
		for(int i = 0; i < 3; i++) {
			System.out.println(정수배열1[i]);
		}
		//데이터 넣기
		정수배열1[0] = 100;
		정수배열1[1] = 93;
		정수배열1[2] = 20;
		
		System.out.println();
		
		//데이터를 넣기후
		for(int i = 0; i < 정수배열1.length; i++) {
			//* i는 0부터 [정수배열1]의 길이 미만까지 1씩 증가하면서 반복처리
			System.out.println(정수배열1[i]);
		}
		
		System.out.println();
		
		// for문 활용
			// 배열자료형 변수명 : 배열명
		for(int temp : 정수배열1) { // 임시변수 : 배열명
			//* 배열내 인덱스 0번부터 끝까지 하나씩 데이터를 temp에 저장 반복
				//1. 정수배열1[0] => temp 저장
				//2. 정수배열1[1] => temp 저장
				//3. 정수배열1[2] => temp 저장
			System.err.println(temp);
		}
		
		
	}// m e

}// c e
