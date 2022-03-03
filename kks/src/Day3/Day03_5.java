package Day3;

public class Day03_5 { //  cs

	public static void main(String[] args) { // ms
		
		// 반복문 : 1. for 2.while 3.do-while
		// for :
		//	어디서부터 어디까지 증가 / 감소 하면서 반복처리
		//	1부터 10까지 1씩 증가 하면서 반복처리 -> 10번실행
		//	1부터 10까지 3씩 증가 하면서 반복처리 -> 4번 실행
		//1.초기값 2.조건식 3.증감식
		//형태
		//	for(초기값; 조건식; 증감식){
		//		반복실행문
		//	}
		
		//p.121
		
		for(int i = 1;i <= 10;i++) {
			// int i = 1	: 초기값을 선언 [ i는 반복변수 ] 
				//i <= 10  : 조건식 [i 가 10이하이면 실행 아니면 실행불가]
					//i++ : 증감식 [ 실행문 실행후 증가 혹은 감소 단위]
			
			//* 변수 i는 1부터 10까지 1씩 증가 하면서 실행문 반복처리
			
			System.out.print(i + " ");
				//i = 1 일때 i <= 10 [true] 실행문실행 -> 증감식 i=2
				//i = 2 일때 i <= 10 [true] 실행문실행 -> 증감식 i=3
				//i = 3 일때 i <= 10 [true] 실행문실행 -> 증감식 i=4
				//~~~~~~
				//i = 10일때 i <= 10 [true] 실행문실행 -> 증감식 i=11
				//i = 11일때 i <= 10 [false] 실행불가 -> 종료
			
		}
		System.out.println("");
		System.out.println("-------------------------------------------------");
		int sum = 0;
		for(int i = 1;i <=100; i ++) {
			//i는 1부터 100까지 1씩 증가하면서 실행문을 반복한다
			sum += i;
		}
		System.out.println("1~100 합은 :" + sum);
		System.out.println("-------------------------------------------------");
		
		//예제3) 1부터 100까지 7배수의 누적합계
			//i는 0부터 100까지 7씩 증가 하면서 실행문 반복처리		
		int num1 = 0;
		for(int j=0;j<= 100;j+=7) {
			num1 += j;
		}
		System.out.println("1~100 7배수의 합 :"+num1);
		System.out.println("-------------------------------------------------");
		//다른 경우
		int num3 =0;
		for(int i=0;i<=100;i++) {
			//배수 찾기 : 값 % 배수 == 0 이면 값은 그 수의 배수
			if(i%7 ==0) {
			//만약에 i가 7의 배수가 아니면 x
				num3 += i;
			}
		}
		System.out.println("1~100 7배수의 합 :"+num3);
		System.out.println("-------------------------------------------------");
		
		//예제4) 2단 구구단 만들기 [ 2 는 상수 =곱+은 변수]		
		for(int 곱 = 1; 곱 < 10; 곱++) {
			System.out.println("2 x "+ 곱 + " = " + (2*곱));
			//System.out.printf("2 x %d = %d", 곱 , (2*곱));
		}
		
		System.out.println("-------------------------------------------------");
		
		//for 문 중첩 
		//p.124 : 2단~9단 구구단 만들기 [ 단 = 변수 , 곱 = 변수 ]
			//단 : 2부터 9까지 1씩증가 -> 8번실행
			//곱 : 1부터 9까지 1씩증가 -> 9번실행
				//단 1번 실행 될땨마ㅣ다 곱 9 번실행
			//구구단 총 실행 횟수 -> 72번 
		for(int i = 2;i<10;i++) {
			System.out.printf("------%d단------\n" , i);
			for(int j = 1; j < 10; j++) {
				//System.out.println(i + " x " + j + " = " + (i*j));
				System.out.printf("%d x %d = %d\n",i,j,(i*j));
			}
		}
		
	}//me
}//ce
