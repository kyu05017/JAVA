package ���ΰ���._25_����Ÿ�����α׷�;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {
	
	public static void inCarSave() {

		try {
		FileOutputStream outputStream = new FileOutputStream("D:/inCarSave.txt");

		for(Car temp : Control.carlist) {
			String contents = temp.getCarNum() +","+temp.getCardate()+","+temp.getParking()+"\n";
			outputStream.write(contents.getBytes());
			}
		}
		catch(Exception e) {
		}
	}

	public static void inCarLoad() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/inCarSave.txt");
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
				Car temp2 = new Car(filed[0], filed[1],Integer.parseInt(filed[2]));
				Control.carlist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
		
	}
	
	public static void daysaleSave() {

		try {
		FileOutputStream outputStream = new FileOutputStream("D:/saleList.txt");
	
		for(DaySale temp : Control.salelist) {
			String contents = temp.getTodaymoney()+","+temp.getSavedate()+"\n";
			outputStream.write(contents.getBytes());
			}
		}
		catch(Exception e) {
		}
	}
	
	// �Խù� �ҷ�����
	public static void daysaleLode() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/saleList.txt");
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
				DaySale temp2 = new DaySale(Integer.parseInt(filed[0]),filed[1]);
				Control.salelist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
		
	}
}
