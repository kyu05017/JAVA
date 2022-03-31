package Day01_to_Day21.Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class Day13_2 {
	
	public static void main(String[] args) {
		
		// p.539
		
			// Date 클래스 (java.util) : 시스템 날짜를 가지고옴
		Date now2  = new Date(); // date 객체 생성
		System.out.println("현재 날짜/시간 "+now2);
		String strnow = now2.toString();
		System.out.println("현재 날짜/시간 "+strnow);
		
			//SimpleDateFormat 클래스 : 날짜/시간 포멧 ( 형식 = 모양 ) 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
												//날짜의 형식을 적용하기
		System.out.println(sdf); // 객체의 주소값
		// 날짜에 형식 적용하기 [ date 형식 -> String 형으로 변환 ]
		System.out.println("현재 날짜/시간 " +sdf.format(now2));
										// 문자열로 반환된 
										// 형식객체.format(날짜객체)
		
		
		
		// p. 540
			//Calendar 클래스 : 운영체제 시간대의 날짜/시간 대를 가져옴
		Calendar now =  Calendar.getInstance(); // Calendar 내 객체호출
			// 이미 Calendar 클래스내 객체 존재!! = 별도로 객체생성 X

		System.out.println("년도 : " + now.get(Calendar.YEAR));		//년도
		System.out.println("월 : " + (now.get(Calendar.MONTH)+1));	//월 : 0~11
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));//일
											// 월기준으로 일수
		System.out.println("일 : " + now.get(Calendar.DAY_OF_WEEK));//요일
											// 주 기준으로 일수 [ 1 : 일요일 2 : 월 3 : 화 4 : 수 5 : 목 6 : 금 7 : 토 ]
		// 요일 표현
		int week = now.get(Calendar.DAY_OF_WEEK);
		String days =  null;
		switch(week) {
			case 1 : days = "일요일"; break; 
			case 2 : days = "월요일"; break; 
			case 3 : days = "화요일"; break; 
			case 4 : days = "수요일"; break; 
			case 5 : days = "목요일"; break; 
			case 6 : days = "금요일"; break; 
			case 7 : days = "토요일"; break; 
		} 
		System.out.println(days);
		
		//오전오후
		System.out.println("오전/ 오후 : "+ now.get(Calendar.AM_PM)); // 0이면 오전 1이면 오후
		int ampm = now.get(Calendar.AM_PM);
		String mpm = null;
		
		if (ampm == 0) {
			mpm = "오전";
		}
		else {
			mpm = "오후";
		}
		System.out.println(mpm);
		
		// 시간
		System.out.println("시 : " + now.get(Calendar.HOUR));		//시
		System.out.println("분 : " + now.get(Calendar.MINUTE));	//분
		System.out.println("초 : " + now.get(Calendar.SECOND)); //초		
		
		// ZonedDateTime 클래스 : 세계 협정시계
		ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시 : " + dateTime);
		dateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("한국시간 : " + dateTime);
		dateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕시간 : " + dateTime);
		
	}
}
