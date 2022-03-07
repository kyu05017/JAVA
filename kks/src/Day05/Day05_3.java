package Day05;

import java.util.Scanner;

public class Day05_3 {//c s
	
	//p.181 문제풀이
		// 1. 
		// 2.
		// 3. (2) : 객체비교시 .equals 사용
		// 4. (2) : 길이가 없을경우 대입 불가
		// 5. (3) : boolean 초기값은 false
		// 6. 3 , 5
	

	public static void main(String[] args) {//m s
		
		// 7.
	
		
		int max = 0;// 최대값을 저장하는 변수역할
		int[] array = {1, 5, 3, 8, 2};// 선언과 동시에 초기화 선언
		
		for(int i = 0; i < array.length/* == 5*/; i++) {
			// i는 0부터 array의 길이까지 1씩 증가하며 반복
			if(max < array[i])max = array[i];
			// 만약에 max보다 i번째 인데스의 값이 더 크면 배열의 값을 max에 대입
		}
		System.out.println("max: " + max);
		
		
		// 8.
		int[][] array2= {{85, 86}, {83, 82, 86}, {78, 83, 93, 84, 88},};
		int sum = 0;
		double avg = 0.0;
		int count = 0; //칸 개수 저장
		
		//2차원 배열 모든 데이터 호출
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				sum += array2[i][j]; 
				
			}
			count += array2[i].length; //열 길이의 누접합계
		}
		avg = sum/count;
		System.out.println("sum : " + sum);
		System.out.println("avg : "+ avg);
		
		
		// 9.
		boolean run = true;
		int studentNum = 0; // 학생 수 선언
		int[] score = null; // 점수 배열 선언 // 메모리할당 x
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택 => ");
			
			int select = scanner.nextInt();
			
			if(select==1) {// 학생 수 입력
				System.out.println();
				System.out.println("학생수");
				studentNum = scanner.nextInt();
				score = new int[studentNum];
				//입력받은 학생수만큼 배열길이를 선언
				//호출과 선언을 헷갈리지 말자
			}
			else if(select==2) {// 학생 점수 입력
				for(int i =0; i < score.length; i++) {
					System.out.println();
					System.out.printf(" scroe[%d] : \n ",i ,score[i]);
					score[i] = scanner.nextInt();
				}
			}
			else if(select==3) { // 학생 점수 출력
				for(int i = 0; i < score.length; i++) {
					System.out.printf(" scroe[%d] : %d \n ",i ,score[i]);
				}
			}
			else if(select==4) { // 평균 구하기
				int sum2 = 0; //총합계
				int max2 = 0; //최고 점수
				double avg2 = 0.0; // 평균점수
				for(int i = 0; i < score.length; i++) {
					sum2 += score[i];
					avg2 = sum2/score.length;
					if(max2 < score[i]) max2 = score[i];
				}
				System.out.printf(" 최고값 : %d \n",max2);
				System.out.printf(" 평균값 : %.2f",avg2);
				System.out.println();
			}
			else if(select==5) {
				run = false; //break;
			}
		}//while end
		System.err.println("알림) 프로그램 종료");
	}//m e
}//c e
