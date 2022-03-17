package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {
	
	public static void main(String[] args) {
		
		
		
		
		// 차량번호 구분 프로그램
		// [조건]
			// 1. 난수 0000 ~9999 난 수 10개를 저장
			// 2. 모든 차량 번호 배열에 저장
			// 3. 끝자리 번호 홀수 차량 출력
			// 4. 끝자리 번호 짝수 차량 출력
		
		
		Random random = new Random();
		String[] carlsit = new String[10];
		String[] evenlist = new String[10]; 
		String[] oddlist = new String[10];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("짝수차량 진입");
			for(String temp : evenlist) {
				if(temp != null) {
					System.out.println(temp);
				}
			}
			System.out.println("홀수차량 진입");
			for(String temp : oddlist) {
				if(temp != null) {
					System.out.println(temp);
				}
			}
			
			System.out.println("1.차량진입 2.홀수짝수확인"); int ch = scanner.nextInt();
			if(ch == 1) {
				boolean pass = false;
				int carNum = random.nextInt(10000);
				String strnum = String.format("%04d", carNum);
											// 형식
						// %d : 정수
												// %d숫자 : 숫자만큼 자릿수 [ 만인 해당 자릿수가 없으면 공백]
												// %d0숫자 : 숫자만큼 자릿수 [ 만일 해당 자리숫가 없으면 0 ]
				
				
				for(int i = 0; i < carlsit.length; i++) {
					if(carlsit[i] != null &&carlsit[i].equals(strnum)) {
						pass = false;
					}
				}
				
				for(int i = 0; i < carlsit.length; i++) {
					if(carlsit[i] == null ) {		 
						carlsit[i] = strnum;
						pass = true;
						break;
					}
				}
				for(String temp : carlsit) {
					if(temp != null) {
						if(Integer.parseInt(temp) %2 == 0) {
							for(int i = 0; i<evenlist.length; i++) {
								if(evenlist[i] == null) {
									evenlist[i] = temp;
									break;
								}
							}
						}
						else {
							for(int i = 0; i<oddlist.length; i++) {
								if(oddlist[i] == null) {
									oddlist[i] = temp;
									break;
								}
							}
						}
					}
				}
				if(pass == false) {
					System.out.println("만차입니다.");
				}
			}
			else if(ch == 2) {
				int num = 0;
				for(int i = 0; i < carlsit.length; i++) {
					if(carlsit[i] != null) {
						num = Integer.parseInt(carlsit[i].substring(3));
					}
				}
				System.out.println("1짝수 2홀수");
				int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {
					for(int i = 0; i < carlsit.length; i++) {
						if(carlsit[i] != null) {
							num = Integer.parseInt(carlsit[i].substring(3));
							if(num%2==0) {
								System.out.println(num);
								
							}
						}
					}
				}
				else if(ch2 == 2) {
					for(int i = 0; i < carlsit.length; i++) {
						if(carlsit[i] != null) {
							num = Integer.parseInt(carlsit[i].substring(3));
							if(num%2!=0) {
								System.out.println(num);
								
							}
						}
					}
				}
				System.out.println("----------");
				
			}
			
		}
	}
}
