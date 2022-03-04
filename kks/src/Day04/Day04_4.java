package Day04;

public class Day04_4 {// c s

	public static void main(String[] args) {// m s
		
		// 데이터 저장 1개 => 변수
		// 배열 [ 특정(인덱스) 기준으로 나열 ]
			// 1.index [인덱스] : 저장되는 순서 번호[0번 시작~]
			// 2. [ ] : 대괄호를 사용한다
			// 3. 동일한 자료형을 여러 변수를 관리
		
		//선언 
			// 1. 자료형[] 배열명;			2.자료형 배열명[];
		//데이터 호출
			//1. 배열명[인덱스번호] : 해당 인데스번호의 데이터 호출
			
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
		
	}// m e

}// c e
