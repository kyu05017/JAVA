package 개인과제._24_달력;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.Scanner;

public class Calen {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Scanner scanner = new Scanner( System.in);
	
	public static void Cal(int year,int month) throws IOException {
		
		while( true ) { 
			Calendar calendar = Calendar.getInstance();
			
				calendar.set( year , month-1 , 1 ); 
				int sweek = calendar.get( Calendar.DAY_OF_WEEK );
				int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH ); 
			
			bw.write("********************** "+year+"년 " + month+"월 ******************\n");
			bw.write("일\t월\t화\t수\t목\t금\t토\n");
			bw.flush();
		
			for( int i = 1 ; i < sweek ; i++ ) {
				bw.write("\t"); 
			}
			for( int i = 1 ; i<=eday ; i++ ) {
				bw.write(i+"\t"); 
				if( sweek % 7 == 0 ) {
					bw.write("\n"); 
				}
				sweek++;
			}
			bw.write("\n1)이전달 2)다음달 3)재검색 4)종료");
			bw.flush();
			String ch = scanner.next();
			if(ch.equals("1")) { 
				bw.write("메세지)) 이전달로 전환합니다.\n"); 
				bw.flush();
				month = month -1; 
				if( month == 0 ) { 
					year -=1; 
					month = 12; 
				}
			}
			else if(ch.equals("2")) { 
				bw.write("메세지)) 다음달로 전환합니다.\n"); 
				bw.flush();
				month += 1; 
				if( month == 13 ) { 
					year +=1; 
					month = 1 ;  
				}
			}
			else if(ch.equals("3")) {
				bw.write("메세지)) 새로운 연도와 월을 입력해주세요.\n"); 
				bw.write("연도 : \n"); 
				bw.flush();
				year = scanner.nextInt();
				bw.write("월 : \n");	
				bw.flush();
				month = scanner.nextInt();
			}
			else if(ch.equals("4")) { 
				bw.write("메세지)) 프로그램을 종료합니다. \n");
				bw.flush();
				bw.close();
				break; 
			}else { 
				bw.write("메세지)) 존재하지 않는 메뉴 입니다. \n");
				bw.flush();
			}
		}
	}
} 