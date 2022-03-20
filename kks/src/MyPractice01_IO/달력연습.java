package MyPractice01_IO;

import java.util.Calendar;
import java.util.Scanner;

import Day13.Day13_3_달력;

public class 달력연습 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("달력");
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH)+1;
				int day = calendar.get(Calendar.DAY_OF_MONTH);
				calendar.set(year, month-1,1); 
				int start_week = calendar.get(Calendar.DAY_OF_WEEK) ;
				int end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

				System.out.println("\t\t*** " + year + "년 "+ month+"월 ***");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				
				for(int i =1; i < start_week; i++ ) {
					System.out.print("\t");
				}
				for(int i = 1; i <= end_day; i++) {
					System.out.print(i+"\t");
					/*
					if(i == day) {
						System.err.print(i+"\t");
					}
					else {
						System.out.print(i+"\t");
					}
					*/
					if(start_week%7 == 0) {
						System.out.println();
					}
					start_week++;
				}
				System.out.println();
				System.out.println("달력검색");
				System.out.println("년도 : ");
				int year2 = scanner.nextInt();
				System.out.println("월 : ");
				int month2 = scanner.nextInt();
				calendar.set(year2, month2-1,1); 
				while(true) {
					System.out.println("\t\t*** " + year2 + "년 "+ month2+"월 ***");
					System.out.println("일\t월\t화\t수\t목\t금\t토");
					
					for(int i =1; i < start_week; i++ ) {
						System.out.print("\t");
					}
					for(int i = 1; i <= end_day; i++) {
						System.out.print(i+"\t");
						if(start_week%7 == 0) {
							System.out.println();
						}
						start_week++;
					}

					System.out.println();
					System.out.println("1.이전달 2.다음달 3.다시검색 4.종료");
					try {
						int ch = scanner.nextInt();
						month2 -= 1;
						
						if(ch == 1) {
							
						if(month2 == 0) {
							year2 -= 1;
							month2 = 12;
							}
						}
						else if(ch == 2) {
							month2 += 1;
						if(month2 == 13) {
							year2 += 1;
							month2 = 1;
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
		catch(Exception e) {
			System.out.println("잘못된 입력");
		}
		
	}
}
