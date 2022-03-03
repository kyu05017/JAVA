package Day3;

public class Day03_4 {//cs

	public static void main(String[] args) {//ms
		
		// 제어문 : 1.if 2.switch
			//if     : 논리 검사(true of false) /경우의수가 정해져 있지 않는경우
				//>=, <=, ==, !=
			//switch : 데이터 검사 (값을 검사) /경우의수 정해져 있는 경우 //연산속도가 쫌더 빠르다
				//동일한 case 이면 실행문처리 후 -> 다음 case로 이동
				//형태
					//switch ( 검사대상 ){
						//case '값' : 실행문;
						//case '값' : 실행문;
						//case '값' : 실행문;
						//그외
						//defailt : 실행문;
						//}
		
				//break;  : 가장 가까운 switch 혹은 반복문 탈출[나가기]
		
		
		//예제1) 점수 가 90 점이면 A 80 점이면 B 70점이면 C 그외 탈락
		int num = 80;
		if(num==90)System.out.println("A");
		else if(num==80)System.out.println("B");
		else if(num==70)System.out.println("C");
		else System.out.println("탈락");
		
		System.out.println("----------------------------------------------------------");
		
		switch (num) {
			case 90 : System.out.println("A등급"); break;
			case 80 : System.out.println("B등급"); break;
			case 70 : System.out.println("C등급"); break;
			default : System.out.println("탈락 "); break;
		}
		
		System.out.println("----------------------------------------------------------");
		//예제2) 
		int 버튼 =3;
		
		switch (버튼) {
			case 1  : System.out.println("1층으로 이동"); break;
			case 2  : System.out.println("2층으로 이동"); break;
			case 3  : System.out.println("3층으로 이동"); break;
			case 4  : System.out.println("2층으로 이동"); break;
			default : System.out.println("정지"); 
		}
		
		System.out.println("----------------------------------------------------------");
		
		//예제3)
		char 등급 = 'B';
		
		switch (등급) {
			case 'A': 
			case 'B': System.out.println("우수회원");break;
			case 'C':
			case 'D': System.out.println("일반회원");break;
			default : System.out.println(" 손님 ");
		}
		
		System.out.println("----------------------------------------------------------");
		
		//예제4)
		String 직급 = "과장";
		switch (직급) {
		case "부장": System.out.println("700만원");break;	
		case "과장": System.out.println("500만원");break;
		default   : System.out.println("300만원");break;
	
		}
		
		
		
		

	}//me

}//ce
