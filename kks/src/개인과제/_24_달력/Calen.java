package ���ΰ���._24_�޷�;

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
			
			bw.write("********************** "+year+"�� " + month+"�� ******************\n");
			bw.write("��\t��\tȭ\t��\t��\t��\t��\n");
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
			bw.write("\n1)������ 2)������ 3)��˻� 4)����");
			bw.flush();
			String ch = scanner.next();
			if(ch.equals("1")) { 
				bw.write("�޼���)) �����޷� ��ȯ�մϴ�.\n"); 
				bw.flush();
				month = month -1; 
				if( month == 0 ) { 
					year -=1; 
					month = 12; 
				}
			}
			else if(ch.equals("2")) { 
				bw.write("�޼���)) �����޷� ��ȯ�մϴ�.\n"); 
				bw.flush();
				month += 1; 
				if( month == 13 ) { 
					year +=1; 
					month = 1 ;  
				}
			}
			else if(ch.equals("3")) {
				bw.write("�޼���)) ���ο� ������ ���� �Է����ּ���.\n"); 
				bw.write("���� : \n"); 
				bw.flush();
				year = scanner.nextInt();
				bw.write("�� : \n");	
				bw.flush();
				month = scanner.nextInt();
			}
			else if(ch.equals("4")) { 
				bw.write("�޼���)) ���α׷��� �����մϴ�. \n");
				bw.flush();
				bw.close();
				break; 
			}else { 
				bw.write("�޼���)) �������� �ʴ� �޴� �Դϴ�. \n");
				bw.flush();
			}
		}
	}
} 