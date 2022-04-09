package 개인과제._29_List응용_방문자기록시스템;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Customer> in_List = new ArrayList<>();
	
	
	
	
	// 1. 입장기록 저장
	public static void in_Custommer_Save() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/in_Custommer.txt");
			for(Customer temp : in_List) {
				String c_save = temp.getMembers()+","+temp.getDate()+"\n";
				outputStream.write(c_save.getBytes());
			}
			outputStream.close();
		} 
		catch (Exception e) {
			System.out.println("파일 저장 실패 " + e);
		}
	}
	
	// 2. 입장기록 불러오기
	public static void in_Custommer_Load() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/in_Custommer.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			int i = 0;
			for(String temp : list) {
				if( i+1 == list.length ) {
					break; 
				}
				String[] filed = temp.split(",");
				Customer customer = new Customer(Integer.parseInt(filed[0]),filed[1]);
				in_List.add(customer);
				i++;
			}
			
		}
		catch (Exception e) {
			System.out.println("파일 불러오기 실패 " + e);
		}
	}
	
	// 3. 고객 입장.
	public boolean in_Custommer(Customer customer) {
		in_List.add(customer);
		in_Custommer_Save();
		return true;
	}
	public void serch_Customers(int years, int month) {
		in_Custommer_Load();
		DecimalFormat df = new DecimalFormat("0000");
		DecimalFormat df2 = new DecimalFormat("00");
		
		String new_y = df.format(years);
		
		String new_m = df2.format(month);
		System.out.println("메세지)) "+new_y+"년 "+new_m+"월");
		System.out.println("입장 고객 명수");
		int i = 0;
		for(Customer temp : in_List) {
			
			String[] filed = temp.getDate().split("-");
			if(filed[0].equals(new_y)) {
				if(filed[1].equals(new_m)) {
					System.out.println((i+1)+"))"+temp.getMembers()+"명 일시))"+filed[0]+"년 "+filed[1]+"월 "+filed[2]+"일 "+filed[3]+" : "+filed[4]);
					System.out.println();
				}
				else {
					System.out.println("메세지)) 해당 날짜에 입장기록이 존재하지 않습니다.");
					System.out.println();
					break;
				}
			}
			i++;
		}
	}
	
}	
