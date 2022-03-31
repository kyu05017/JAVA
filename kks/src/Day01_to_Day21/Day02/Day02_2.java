package Day01_to_Day21.Day02;

public class Day02_2 { // c s

	public static void main(String[] args) { // m s
		
		//p.40
		
		//; 세미콜론 : 실행단위구분
		//동일한 변수명은 사용할수 없다.
		
		//byte : 1바이트 =+128
		byte var1 = -128; System.out.println(var1);
		byte var2 = -30;  System.out.println(var2);
		byte var3 = 30;   System.out.println(var3);
		//byte var4 = 300; 
			//오류발생 : 128이상은 저장할수 없다.
		
		byte var4 = 'j'; System.out.println(var4); 
			//j를 아스키코드로 변환하여 사용.
			//문자를 입력했을때 정수로변환을 한다.
			//문자를 > 정수로 규칙은 아스키 코드.
		
		// p.43 char : 2바이트 [ 하나의 문자를 저장 ] : 유니코드(2바이트 :세계 공용어[용량이 크다]) vs 아스키코드
		char c1 = 'a'; System.out.println(c1);
		char c2 = 97; System.out.println(c2);		// 10진수 : 0~9
			//정수 -> 문자 변환
		char c3 = '\u0041'; System.out.println(c3); // 16진수로 표현
		char c4 = '가'; System.out.println(c4);
		char c5 = 44032; System.out.println(c5); 
		char c6 = '\uac00'; System.out.println(c6);
		//진법 : 컴퓨가 2진수만 사용하면 표현할수 있는 단위가 적다. --> 표현단위의 다양성을 위해서 사용
			//2진수 0 , 1 -> 기계어에서는 (2진코드) / 용량 1비트
			//8진수 0 ~ 7
			//10진수 0 ~ 0
			//16진수 0 ~9 a b c d e f
		
		//p.43
			//short : 2 바이트 정수형 +-3만정도 
	
		short num1 = 30000; System.out.println(num1);
		//short num2 = 40000; System.out.println(num2);//저장할수 있는 수를 넘었기에 오류가 남
		
		//p.44 int : 4바이트 정수 +-20억정도 ( 정수 기본타입 )
		int num2 = 10; System.out.println(num2); // 10진수
		int num3 = 012; System.out.println(num3);// 8진수는 앞에 0 붙이기 0 1 2 3 4 5 6 7 10 11 12 * * *
		int num4 = 0xA; System.out.println(num4);// 16진수는 앞에 0x가 붙음 0 1 2 3 4 5 6 7 8 9 A B C D E F
	
		//p.46 long : 8바이트 정수 +-20억 이상 
		//long num5 = 10; System.out.println(num5);
		long num5 = 100000000000L; System.out.println(num5);//끝에 L을 붙인다 없다면 데이터를 int 형으로 인식
					//int 형 -> long형
		//p.47~48 float[데이터 뒤에 f ](실수형) : 4바이트(8자리)  / double(실수형 기본타임) : 8바이트 : 17 자리까지 표현
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14F; System.out.println(num7);
		
		double num8 = 0.1234567891234567891234567111111111111189; System.out.println(num8);
		float num9 = 0.1231254654613121353213215454F; System.out.println(num9); 
		
		//p.48 boolean : 1비트 [treu 혹은 false ]
			// 스위치 역할을 한다 : on , off 
		
		boolean bol = true; System.out.println(bol);
		
		//p.49 : 타입변환 
			// ----------->>>>>>>>---------자동형변환------>>>>>>>>-----
			// * 크기순서 : byte > short > int > long > float > double
			//---------<<<<<<<<<<강제형 변환 방
			//1. 자동 형변환
				//작은 상자에서 큰상자로 이동가능
				//큰 상자에서 작은 상자로 이동불가
		byte 바이트 = 10;
		
		int  인트 = 바이트;//자동 형변환이 된다.
		//캐스트 
		//short 소트 = 인트;// 자동 형변환이 안된다.
		
			//2.강제 형변환
				//큰 상자로 이동가능하나 데이터에 손실이 있다.
				//(변경할 자료형)변수형
		short 소트 = (short)인트;
		
		//p.60 연습문제
			//1. 4번
			//2. 1,4,5 [ 변수는 숫자로 시작할수 없다. 미리만들어진 단어는 사용불가 ] 
			//3. byte short int   long
			//        chat
			//				float double
			//boolean
			//4. 타입   : int , double
			//   이름   : age , prise
			// 리터럴(값): 10 , 3.14
			//5. 3번
			//6. 4번 		char(문자) = String(문자'열') [x]
			//*String 은 객체이다. (String은 class다)
			// 기본자료형(래퍼클래스) 사용한 메모리는 변수 -> 메모리 할당 / new 를 안쓴다
			// 클래스를 사용한 메모리는 객체 		   -> 메모리 할당 / new를 쓴다
			//7. 3번
			//8. 1번 [자료형 연산식 자료형 변환] : 정수끼리 있을 경우 int, 실수끼리 있을 경우 double로 형변환.
				//1. byte + byte -> int => byte [x]
				//2. int  + byte -> int => int   [ 자동형변환 ]
				//3. int + float -> int => float [ 자동형변환 ]
				//4. int + double-> int => folat [ 자동형변환 ]
		
		
		
	}

}







