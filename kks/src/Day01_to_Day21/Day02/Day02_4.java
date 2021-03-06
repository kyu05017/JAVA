package Day01_to_Day21.Day02;

public class Day02_4 {

	public static void main(String[] args) {
		
		//p.64 연산자
		
		/*
		 * 
		 * 1.산술 
		 * 		//1. +(더하기) , -(빼기) , *(곱하기) , /(나누기) , %(나머지)
		 * 
		 * 2.비교 [ 결과값은 참 혹은 거짓]
		 * 		//1. >(초과) , <(미만)
		 * 		//   <=(이상), >=(이하) 
		 * 		//   ==(같다) , !=(다르다)
		 * 3.논리 [ 2개이상의 비교연산자]
		 * 		&& (and) - 이면서 면서 이고 모두 그리고
		 * 		|| (or)  - 이거나 거나 또는 하나라도 [ 엔터위 에 원화기로 + shift]
		 * 		!  (not) - 부정 반대 (true -> false , false -> true)
		 * 
		 * 4.대입
		 * 		=  : 오른쪽 값이 왼쪽을 이동 [저장]
		 * 		+= : 오른쪽 값이 왼쪽값과 덧셈후에 왼쪽값에 대입
		 * 			변수명 =  변수명 + 10 
		 * 				//1. 변수를 호출
		 * 				//2. 변수에 10을 더한다
		 * 				//3. 변수의 더한값을 대입.		 * 
		 * 					변수명 += 10
		 * 				//1. 변수를 호출
		 * 				//2.오른쪽값을 더한후에 변수에 대입

		 * 		-= *= /= %=
		 * 
		 * 5.중검[* : 일정간격으로 변화]
		 * 		//1. ++ : 1 증가  2. -- : 1 감소
		 * 
		 * 		//선위 증가/감소 : 먼저 증가하고 명령어 처리	
		 * 		//후위 증가/감소 : 다른 명령어를 처리후에 증가
	
		 * 
		 * 6.삼항연산자[조건연산자]
		 * 		조건식 ? 참 : 거짓
		 * 
		 * 
		 * 
		 * */

		//산술 연산자 예제
		int 정수1 = 10;int 정수2 = 20;//10과 20 을 저장하는 두개의 변수 선언
		System.out.println("더하기 "+정수1+정수2); //문자열 + 정수 -> 연결연산자 [정수끼리 계산 할때는 소괄호로 묶어야 한다]
		System.out.println("더하기 "+(정수1+정수2));//문자열 + (정수1 + 정수2)
		System.out.println("빼기"+ (정수1 - 정수2));
		System.out.println("곱하기"+ (정수1 * 정수2));
		System.out.println("나누기"+ (정수1/정수2));//몫0
		System.out.println("나머지"+ (정수1 %정수2));//나머지10
		
		//중감 연산자 에제
		정수1++; //변수명 뒤에 ++ 하면 해당 변수내 데이터에 +1
		System.out.println("증가"+정수1);
		정수1--; // 변수명 뒤에 -- 할 경우 변수내 데이터에 -1
		System.out.println("감소"+정수1);
		
		System.out.println("선위 증가" + ++정수1); // 11출력
		System.out.println("후위 증가" + 정수1++); // 11출력
			//명령어 처리는 동시처리 불가능 ->> 처리순서가 존재!!!
		//++변수 : 먼저 증가후에 print 실행됌
		//변수++ : print 실행후 증가
		
		System.out.println("후위 증가 후 :" + 정수1);
		
		System.out.println("선위 감소 : " + --정수1); // 1감소 후에 출력 -> 11출력
		System.out.println("후위 감소 : " + 정수1--); // 출력후에 1 감소 - > 11출력
		
		System.out.println("후위 감소 후 :" + 정수1);
		
		//비교연산자 예
		System.out.println("이상 " + (정수1 >= 정수2)); // 10 >= 20 : 거짓
		System.out.println("이하 " + (정수1 <= 정수2)); // 10 <= 20 : 참
		System.out.println("초과 " + (정수1 < 정수2)); // 10 > 20 : 거짓
		System.out.println("미만 " + (정수1 > 정수2)); // 10 < 20 : 참
		System.out.println("같다 " + (정수1 == 정수2));// 10 == 20 : 거짓
		System.out.println("같지 않다" + (정수1 != 정수2));//10 != 20 : 참
		
		//논리연산자 예
			//and && : 두개 이상의 비교연산지가 모두 true => 결과도 true 아니라면 false
			//or  || : 2개 이상의 비교연산자가 하나라도 true면 참
		
		int 정수3 = 30; int 정수4 = 40;
		System.out.println("and "+ (정수1 >= 정수2 && 정수3 >= 정수4));
									//10 >= 20  &&  30  >=  40 
									//결과는 false
		System.out.println("or "+ (정수1 >= 정수2 || 정수4 >= 정수3));
									//false      or      true 
									//결과는 true
		
		System.out.println("not" + !(정수1 >= 정수2 || 정수4 >= 정수3));
								//  결과 true -> false
		
		//대입연산자 예
		
		정수1 = 정수1 + 10;		 System.out.println(정수1);
		정수1 += 10; 				 System.out.println(정수1);
	
		System.out.println("정수1 " + (정수1 -=10));
		System.out.println("정수1 " + (정수1 /=10));
		
		//조건 연산지 예제
		int 점수 = 85;
		char 등급 = 점수 > 90 ? 'A' : 'B';
				//   조건식   ? 참 : 거짓
				//점수가 90을 초과하면 A 아니라면 B
		System.out.println("등급은 " + 등급);
		
		char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C';
				//   조건식   ? 참 -> 아니면 조건문 ? 참 : 거짓
				// 점수변수가 90초과 하면 A 대입 아니면 점수변수가 80 초과하면 B 대입 아니면 c
		
	}

}
