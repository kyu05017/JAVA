package 개인과제._23_차량번호분배시스템;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

	
public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Random random = new Random();
		String[] carlist = new String[10];
		String[] evenlist = new String[10];
		String[] oddlist = new String[10];
		byte[] bytes = new byte[100];
		
		
		while(true) { 
			
			bw.write("\n차량목록)) \n");
			for( String temp : carlist  ) {
				if( temp != null ) {
					if( Integer.parseInt(temp) % 2 == 0 ) {
						bw.write( temp+"[짝]  " );
					}else {	
						bw.write( temp+"[홀]  " );
					}
				}
			}
			bw.flush();
			bw.write("\n홀수 차량 목록)) \n");
			for( String temp : oddlist  ) {
				if( temp != null ) {
					bw.write( temp+" " ); 
				}
			}
			bw.flush();
			bw.write("\n짝수 차량 목록)) \n");
			for( String temp : evenlist  ) {
				if( temp != null ) { 
					bw.write( temp+" " ); 
				}
			}
			
			bw.write("\n1.차량입차"); 
			bw.flush();
			int input = System.in.read(bytes);
			String ch = new String(bytes,0,input-2);
			
			if(ch.equals("1")) {
				int intnum = random.nextInt(10000);
				String strnum = String.format("%04d", intnum );
				boolean save = false;
				for( int i = 0 ; i<carlist.length ; i++ ) {
					if( carlist[i] == null ) { 
						carlist[i] = strnum; save=true; 
						break; 
					}
				}
				if( save == true ) {
					if( Integer.parseInt(strnum) % 2 == 0 ) {
						for( int i = 0 ; i<evenlist.length ; i++) {
							if( evenlist[i] == null ) { 
								evenlist[i] = strnum; 
								break;
							}
						}
					}
					else {	
						for( int i = 0 ; i<oddlist.length ; i++) {
							if( oddlist[i] == null ) {
								oddlist[i] = strnum; 
								break; 
							}
						}
					}
				}
				else {
					System.err.println(" 만차 [ 주차 불가 ] ");
				}
			}
		}
	}
}



