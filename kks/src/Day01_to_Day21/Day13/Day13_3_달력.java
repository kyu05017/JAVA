package Day01_to_Day21.Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_달력 {
	
	public static Scanner scanner = new Scanner(System.in);
	


	public static void main(String[] args) {
		try {
			System.out.println("날짜 검색");
			System.out.println("연도 : "); int year = scanner.nextInt();
			System.out.println("월  : "); int month = scanner.nextInt();	
			System.out.println();
			달력(year, month);
		}
		catch(Exception e) {
			System.out.println("숫자만 입력가능 합니다.");
			return;
		}
	}
	public static void 달력(int year, int month) {
		while(true) {
			// 1, 캘린더 클래스내 날짜/시간 객체 호출
			Calendar calendar = Calendar.getInstance();
			
			
			
			
			// 2. 연도, 월, 일
			//int year = calendar.get(Calendar.YEAR);
			//int month = calendar.get(Calendar.MONTH)+1;
			// * 해당 월의 1일의 요일을 찾는다
				// 1. 사용자 정의 갤린더 설정
			calendar.set(year, month-1,1); // 예) 들면 3월 1일
			// 2. 3월 1일의 요일
			int start_week = calendar.get(Calendar.DAY_OF_WEEK) ;
			// 3. 월의 마지막 일
			int end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	
		
		
			System.out.println("\t\t*** " + year + "년 "+ month+"월 ***");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			for(int i =1; i < start_week; i++ ) {
				System.out.print("\t");
			}
			for(int i = 1; i <= end_day; i++) {
				/* 오늘 찾기
				if(i == day) {
					System.err.print(i+"\t");
				}
				else {
					System.out.print(i+"\t");
				}
				*/
				System.out.print(i+"\t");
				// 토요일 마다 줄바꿈 토요일은 7
				if(start_week%7 == 0) {
					System.out.println();
				}
				start_week++;
			}
		
	// 버튼 [ 1. 2.]
		
			System.out.println();
			System.out.println("1.이전달 2.다음달 3.다시검색 4.종료");
			try {
				int ch = scanner.nextInt();
				month -= 1;
				
				if(ch == 1) {
					
				if(month == 0) {
					year -= 1;
					month = 12;
					}
				}
				else if(ch == 2) {
					month += 1;
				if(month == 13) {
					year += 1;
					month = 1;
					}

				}
				else if(ch == 3) {
					System.out.println("검색으로 돌아갑니다.");
					Day13_3_달력.main(null);
				}
				else if(ch == 4) {
					System.out.println("종료");
					break;
				}
			}
			catch(Exception e) {
				System.out.println("숫자만 입력가능합니다.");
				scanner = new Scanner(System.in);
			}
		
		}
	}
}
