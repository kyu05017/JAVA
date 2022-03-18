package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		// p. 544 format 클래스
			// DecimalFormat 클래스 : 숫자 데이터를 원하는 형식으로 표현 
				// 0 : 자리수 [ 빈자리면 0으로 채움]
				// # : 자리수 [ 빈자리면 채우기 없음]
		double num = 1234567.89;
	
		DecimalFormat df = new DecimalFormat("0"); 
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");		// 무조건 소수점 한자리 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		// 천단위 쉼표 !!!!!!!!!!!!!!!!!! [ #,##0 ] 다른클래스는 패턴이 다름
		System.out.println("천단위---------------------");
		df = new DecimalFormat("#,##0원"); 
		System.out.println(df.format(num)); // 만약에 금액이 0원이면 
		df = new DecimalFormat("#,###원");
		System.out.println(df.format(num));
		System.out.println("-----------------------");
		
		df = new DecimalFormat("#,##.0");
		System.out.println(df.format(num));
		
		// 지수문자 E : 지수문자 
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		// 세미클론 기준으로 앞 양수 ; 뒤 음수
		df = new DecimalFormat("[양수]+#,### ; [음수]-#.###"); 
		System.out.println(df.format(num));
		
		System.out.println("백분율-----------------------");
		// 컴퓨터는 백분율x [ 계산시 1 : 100% ][ 0.5 : 50% ][ 0.05 : 5% ]
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		System.out.println("-----------------------");
		//아스키코드
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		// p. 545
			// SimpleDateFormat 클래스 : 날짜 형식을 변환
		
		// p. 547
			// MessageFormat 클래스 : 문자 형식을 변환
		
		
		String id = "Java";
		String name = "신용권";
		String tel = "010-1234-4567";
		
		String text = "회원 ID : {0} \n 회원이름 : {1} \n 회원전환 : {2}";
		String result1 = MessageFormat.format(text, id,name,tel);
										// 패턴 {0} {1} {2}
		System.out.println(result1);
		System.out.println();
		
		// DB dao 에서 사용할 예정
		String sql = "insert into member values( {0}, {1}, {2}";
										// 인덱스 :  0,  1,  2
		Object[] arguments = {id,name,tel};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
		// p. 552 java.time 패키지
		
		// Java7 이전에는 Date 
			// 이후에는 여러가지 날짜 API 추가됨
		
		LocalDate Ldate = LocalDate.now(); // new[x] static 메소드 now();
		System.out.println("현재 날짜 "+Ldate);
		
		LocalTime Ltime = LocalTime.now();
		System.out.println("현재 시간 "+Ltime);
		
		// Date 현재날짜/시간 [ 조작이 안되거나 비교기능 불충분 ]
		// VS 
		//LocalDate : 날짜 LocalTime : 현재시간
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("현재 날짜 시간 : " + dateTime);
		
		// 시간계산 
		
		Instant instant = Instant.now();
		Thread.sleep(1000); // 1초 대기 [ 코드흐름 1초간 멈춤 ] // 일반예외
		Instant instant2 = Instant.now();
		if(instant.isBefore(instant2)) {
			System.out.println("instant1이 더 빠릅니다.");
		}
		else if(instant.isAfter(instant2)){
			System.out.println("instant1이 더 느립니다.");
		}
		else {
			System.out.println("동일한 시간 입니다.");
		}
		// 중요하다
		System.out.println("차이(nanos) : " + instant.until(instant2, ChronoUnit.NANOS)); // 
				// 밀리초 = 1,000/1초  마이크로초 = 1,000,000/1초   나노초 = 1,000,000,000/1초
		
		
		
		
		
		
		
		
	}
}
