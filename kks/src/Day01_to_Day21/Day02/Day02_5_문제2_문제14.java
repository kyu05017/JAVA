package Day01_to_Day21.Day02;

import java.util.Scanner;

public class Day02_5_문제2_문제14 {
	
	public static void main(String[] args) {
		
		// 문제2 : 지폐 세기 
		/*
		 * [ 입력조건 ] 
		 * 		금액 
		 * [ 조건 ] 
		 * 		십만원 부터 백원 까지의 개수 세기 
		 * [ 출력조건 ]
		 * 		예) 356789 입력시 
		 * 		십만원 3장 
		 * 		만원 5장
		 * 		천원 6장 
		 * 		백원 7개
		 */
		// 1. 입력객체 
		Scanner scanner = new Scanner(System.in);
//		// 2. 입력받은 데이터 -> 변수로 이동 
//		System.out.println("금액 : ");	int 금액 = scanner.nextInt();
//		// 3. 연산 
//		System.out.println(" 입력한 금액 : " + 금액 );
//		System.out.println(" 십만원  : " + (금액/100000) + "장" );
//			
//		//금액 = 금액 - ( 금액/100000 )*100000 ; // 금액에서 십만원 단위 제거
//		금액 -= ( 금액/100000 )*100000 ;
//		System.out.println(" 십만원 제외 : " + 금액 );
//		System.out.println(" 만원 : " + (금액/10000) + "장");
//		
//		금액 -= (금액/10000) * 10000; // 금액에서 만원 단위 제거 
//		System.out.println(" 천원 : " + (금액/1000) + "장");
//		
//		금액 -= (금액/1000) * 1000; // 금액에서 천원 단위 제거 
//		System.out.println(" 백원 : " + (금액/100) + "개");
//		
//		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
//			// 배수찾기 
//				// 값 % 수 했을때 나머지가 0 이면 값은 그 수의 배수 
//		System.out.println(" 문제3) 정수 입력:"); 	int 문제3 = scanner.nextInt(); // 하나의 정수를 입력받기 
//		System.out.println(" 입력한 정수는 7의 배수 판단 : " + ( 문제3%7 == 0 ) );
//		
//		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
//			// 홀짝 찾기 
//				// 홀수 : 값 % 2 했을때 나머지가 1 이면 값은 홀수 
//				// 짝수 : 값 % 2 했을때 나머지가 0 이면 값은 짝수 
//		System.out.print(" 문제4) 정수 입력 : ");	int 문제4 = scanner.nextInt();
//		System.out.println(" 입력한 정수는 홀수 판단 : " + ( 문제4%2 == 1 ) );
//		
//		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
//		System.out.print(" 문제5) 정수 입력 : "); 	int 문제5 = scanner.nextInt();
//		System.out.println("입력한 정수는 7의배수 이면서 짝수 판단 : " 
//							+ ( 문제5%7 == 0 && 문제5%2 == 0 ) );
//		
//		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//		System.out.print(" 문제6) 정수1 입력 : ");	int 문제6_1 = scanner.nextInt();
//		System.out.print(" 문제6) 정수2 입력 : ");	int 문제6_2 = scanner.nextInt();
//		
//		int 큰수 = 문제6_1 > 문제6_2 ? 문제6_1 : 문제6_2; 
//		System.out.println(" 더 큰 수는 : " + 큰수 );
//		
//		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
//				// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//		System.out.print(" 문제7) 반지름 입력 : "); 	int 문제7 = scanner.nextInt();
//		System.out.println(" 원 넓이 : " + (문제7*문제7*3.14) );
//		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
				// 예) 54.5   84.3 이면    64.285714%
		/*
		System.out.print(" 문제8) 실수1 입력 : ");		double 문제8_1 = scanner.nextDouble();
		System.out.print(" 문제8) 실수2 입력 : "); 	double 문제8_2 = scanner.nextDouble();
		
		double 비율 = ( 문제8_1/문제8_2 )*100;
		System.out.println(" 실수1의 실수2 백분율 : " + 비율 + "%");
		System.out.printf(" 실수1의 실수2 백분율 : %.1f %% \n" , 비율 );
				// %f : 실수 표현
					// %.숫자f		// %.2f : 소수 2자리 까지 표현 
									// %.5f : 소수 5자리 까지 표현 
		
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
				//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		System.out.print(" 문제9) 윗변 : ");	double 윗변 = scanner.nextDouble();
		System.out.print(" 문제9) 밑변 : ");	double 밑변 = scanner.nextDouble();
		System.out.print(" 문제9) 높이 : ");  double 높이 = scanner.nextDouble();
		System.out.println(" 사다리꼴 넓이 : " + ( 윗변 * 밑변 ) * 높이 / 2 );
		
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
				// 표준체중 계산식 = > (키 - 100) * 0.9
		System.out.print(" 문제10) 키 : "); 	int 키 = scanner.nextInt();
		System.out.println(" 표준체중 : " + ( 키-100 ) * 0.9 );
		*/
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		
		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 % // 변수 * 0.3
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
		
		
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		
		//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
		
		int age = scanner.nextInt();
		String result = (age >= 40) ? "중년" : (age >= 20) ? "성인" : (age >=10) ? "학생" : "아동";
		System.out.println("당신은 " + result + "입니다");
		
		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
		
		 int num1 = scanner.nextInt();
		 int num2 = scanner.nextInt();
		 int num3 = scanner.nextInt();
		 
		 int max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 :
			 	   (num1 ==num2 && num1 > num3) ? num1 : (num1 == num3 &&num1 > num2) ? num2 : num3;
		 int min = (num1 < num2 && num1 < num3) ? num1 : (num2 < num1 && num2 < num3) ? num2 : 
		 		   (num1 ==num2 && num1 < num3) ? num1 : (num2 ==num3 && num2 < num1) ? num2 : num3;
		 
		 //a : A > B > C
		 int mid = (num1 > num2 && num1 < num3) ? num1 : (num2 > num1 && num2 < num3) ? num2 : (num3 > num1 && num2 < num3) ? num3 : 
			 	   (num1 < num2 && num1 > num3) ? num1 : (num2 < num1 && num2 > num3) ? num2 : num3;
		 
		 System.out.println("답 "+min + mid + max);
		 	
		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		 
		 int sum1 = scanner.nextInt();
		 int sum2 = scanner.nextInt();
		 int sum3 = scanner.nextInt();
		 int sum4 = scanner.nextInt();
		 /*
		 int max1 = (sum1 > sum2 && sum1 > sum3 && sum1 > sum4) ? sum1 : (sum2 > sum1 && sum2 > sum3 && sum2 > sum4) ? sum2 :
			 		(sum3 > sum1 && sum3 > sum2 && sum3 > sum4) ? sum3 : (sum1 ==sum2 && sum1 > sum3 && sum1 > sum4) ? num1 :
			 		(sum2 ==sum3 && sum2 > sum1 && sum2 > sum4) ? sum2 : (sum3 ==sum4 && sum3 ? sum1 && sum3 > sum2) ? sum3 :
			 		sum4;
		 
		 
		 int min1 = (sum1 < sum2 && sum1 < sum3 && sum1 < sum4) ? sum1 : (sum2 < sum1 && sum2 < sum3 && sum2 < sum4) ? sum2 :
		 			(sum3 < sum1 && sum3 < sum2 && sum3 < sum4) ? sum3 : (sum1 ==sum2 && sum1 < sum3 && sum1 < sum4) ? sum1 :
		 			(sum2 ==sum3 && sum2 < sum1 && sum2 < sum4) ? sum2 : (sum3 ==sum4 && sum3 < sum1 && sum3 < sum2) ? sum3 :
		 			;		 
		 */
		 int mid1_1 = 	(sum1 > sum2 && sum1 < sum3 && sum1 < sum4) ? sum1 : 
			 		  	(sum2 > sum1 && sum2 < sum3 && sum2 < sum4) ? sum2 :
			 		  	(sum3 > sum1 && sum3 < sum2 && sum3 < sum4) ? sum3 :
			 		  	(sum4 > sum1 && sum4 < sum2 && sum4 < sum3) ? sum4 :
			 		  		
			 			(sum1 > sum3 && sum1 < sum2 && sum1 < sum4) ? sum1 :
			 			(sum2 > sum3 && sum2 < sum1 && sum2 < sum4) ? sum2 :
			 			(sum3 > sum2 && sum3 < sum1 && sum3 < sum4) ? sum3 :
			 			(sum4 > sum3 && sum4 < sum1 && sum4 > sum2) ? sum4 :
			 			
			 			(sum1 > sum4 && sum1 < sum2 && sum1 < sum3) ? sum1 :
			 			(sum2 > sum4 && sum2 < sum1 && sum2 < sum3) ? sum2 :
			 			(sum3 > sum4 && sum3 < sum1 && sum3 < sum3) ? sum3 :
			 			sum4;
		 
		 int mid1_2 =   (sum1 > sum2 && sum1 > sum3 && sum1 < sum4) ? sum1 : (sum2 > sum1 && sum2 > sum3 && sum2 < sum4) ? sum2 :
			 			(sum3 > sum1 && sum3 > sum2 && sum3 < sum4) ? sum3 : (sum4 > sum1 && sum4 > sum2 && sum4 < sum3) ? sum4 :
			 				
			 			(sum1 > sum2 && sum1 > sum4 && sum1 < sum3) ? sum1 : (sum2 > sum1 && sum1 > sum4 && sum2 < sum3) ? sum2 :
			 			(sum3 > sum1 && sum3 > sum4 && sum3 < sum2) ? sum3 : (sum4 > sum1 && sum4 > sum3 && sum4 < sum2) ? sum4 :
			 				
			 			(sum1 > sum2 && sum1 > sum4 && sum1 < sum3) ? sum1 : (sum2 > sum3 && sum2 > sum4 && sum2 < sum1) ? sum2 :
			 			(sum3 > sum2 && sum3 > sum4 && sum3 < sum1) ? sum3 : sum4;
		 
		 //int mid1_2 = (sum1+sum2+sum3+sum4)-(max1 + min1 + mid1_1);41
		 

		 //System.out.println("답 "+ max1 + mid1_2 + mid1_1 + min1);
		// p. 102 확인문제
		 
		// 1 : 3
		// 2 : ++10 + 20-- => 11 + 20 -> 31
		 
		 	//++10 : 더하기 전에 증가
		 	//20-- : 더하기 후에 감소
		 
		// 3 :점수 > 90 "가" : "나"
		 	//80 > 90 -> false -> ! -> true -> 가
		 
		// 4. (1) : 연필수 / 학생수 -> 몫
		//	  (2) : 연필수 % 학생수 -> 나머지
		 
		//5 . 10의 자리 버리기
		// 
	}

}
//????






