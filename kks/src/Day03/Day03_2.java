package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		
		
		// 입력개체 = { } 당 1번 선언
		Scanner scanner = new Scanner(System.in);
		
		
		//문제1 : 2개의 정수를 더 큰수를 출력
		System.out.println("정수 입력");
		
		//입력
		int 정수1 = scanner.nextInt();
			//int형 변수 선안 핟도 입력받은 값을 정수로 가져와서 대입
		int 정수2 = scanner.nextInt();
		
		// 제어
		if (정수1 > 정수2) { // 만약에 입력받은 정수변수가 정수2 보다 크면 실행 아니면 다음 조건
			System.out.println(정수1 + "이 " + 정수2 +"보다 큽니다." );
		} else if (정수1 < 정수2) { //[다음조건] 정수1 변수가 정수2 변수보다 작으면 실행 아니면 다음조건
			System.out.println(정수1 + "이 " + 정수2 +"보다 작습니다.");
		} else {// 나머지 실행
			System.out.println(정수1 + "이 " + 정수2 +"와 같습니다." );
		}

		
		//문제 2 ) 3개으ㅢ 정수를 입력받아서 가장 큰수 출력
		
		System.out.println("1정수입력");int 정수3 = scanner.nextInt();
		System.out.println("2정수입력");int 정수4 = scanner.nextInt();
		System.out.println("3정수입력");int 정수5 = scanner.nextInt();
		
		int max = 정수3; //가장 큰수를 저장하는 임시 저장
			//max에 첫번째 값 넣어주기
		/*
		if(max < 정수4 ) {
			//만약에 max보다 정수4가 더 크면 교체
			int temp = 정수4; //임시변수 [스왑용]
			정수4 = max;
			max = temp;
		}
		*/ //스왑하는법
		if(max < 정수4) { max = 정수4; }
		if(max < 정수5) { max = 정수5; }
		System.out.println("가장큰수는" + max);
		
		
		//문제3 : 4개 숫자를 입력받아 가장 쿤수 출력
		
		int 정수6 = scanner.nextInt();
		int 정수7 = scanner.nextInt();
		int 정수8 = scanner.nextInt();
		int 정수9 = scanner.nextInt();
		
		int max2 = 정수6;
		
		if(max2 < 정수7) { max = 정수7;}
		if(max2 < 정수8) { max = 정수8;}
		if(max2 < 정수9) { max = 정수9;}
		System.out.println("가장큰수는 " + max2);
		
		//문제4 : 3개의 정수를 입력받아 오름차순
		
		System.out.println("1정수입력");int 정수10 = scanner.nextInt();
		System.out.println("2정수입력");int 정수11 = scanner.nextInt();
		System.out.println("3정수입력");int 정수12 = scanner.nextInt();		
		
		//선택 정렬
		
		if (정수10 > 정수11) { // > : 오름차순  < : 내림차순
			//교체 [ 스왑 = 두개 변수에 데이터 교환 방법 ]
			int temp = 정수10; //임시변수 = 변수1
			정수10 = 정수11;    // 변수1 = 변수2;
			정수11 = temp;	 // 변수1 = 임시변수;
		}
		if( 정수10 > 정수12) {
			int temp = 정수10;
			정수10 = 정수12;
			정수12 = temp;
		}
		if( 정수11 > 정수12) {
			int temp = 정수11; 정수11 = 정수12; 정수12 = temp;
		}
		System.out.printf("입력한 값 오름차순 : %d %d %d", 정수10 ,정수11, 정수12);
		System.out.println("입력한 값 오름차순" + 정수10 + 정수11 + 정수12);
		
		
		//문제5 : 4개의 정수를 입력받아 내림차순
		
		System.out.println("정수1 입력");int 정수13 = scanner.nextInt();
		System.out.println("정수2입력");int 정수14 = scanner.nextInt();
		System.out.println("정수3 입력");int 정수15 = scanner.nextInt();
		System.out.println("정수4 입력");int 정수16 = scanner.nextInt();	
		
		//첫번째 값 비교
		if(정수13 < 정수14) { int temp = 정수13; 정수13 = 정수14; 정수14 = temp;} //정수13이 정수14보다 작을때 temp에 정수13을 넣고 정수13에 정수14를 넣고 정수14에 다시 temp[정수13]을 넣는다. 
		if(정수13 < 정수15) { int temp = 정수13; 정수13 = 정수15; 정수15 = temp;} //정수13이 정수15보다 작을때 temp에 정수13을 넣고 정수13에 정수15를 넣고 정수15에 다시 temp[정수13]을 넣는다.
		if(정수13 < 정수16) { int temp = 정수13; 정수13 = 정수16; 정수16 = temp;}
		//두번째 값 기준으로 비교
		if(정수14 < 정수15) { int temp = 정수14; 정수14 = 정수15; 정수15 = temp;}
		if(정수14 < 정수16) { int temp = 정수14; 정수14 = 정수16; 정수16 = temp;}
		//세번째 값 기분으로 비교
		if(정수15 < 정수16) { int temp = 정수15; 정수15 = 정수16; 정수16 = temp;}
		
		System.out.printf("입력한 값의 내림 차순 %d %d %d %d" , 정수13 , 정수14, 정수15, 정수16);
		System.out.println("입력한 값의 내림 차수 " + 정수13 + 정수14 + 정수15 + 정수16);
	}

}
