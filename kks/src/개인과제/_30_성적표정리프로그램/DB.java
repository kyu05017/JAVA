package ���ΰ���._30_����ǥ�������α׷�;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {
	
	
	
	public static void in_Custommer_Save() {
		Control con = new Control();
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/studnets0409.txt");
			for(Student temp : con.scoreslsit) {
				String c_save = temp.getName()+","+temp.getScore()+"\n";
				outputStream.write(c_save.getBytes());
			}
			outputStream.close();
		} 
		catch (Exception e) {
			System.out.println("���� ���� ���� " + e);
		}
	}
	
	// 2. ������ �ҷ�����
	public static void in_Custommer_Load() {
		Control con = new Control();
		try {
			FileInputStream inputStream = new FileInputStream("D:/studnets0409.txt");
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
				Student temp2 = new Student(filed[0],Integer.parseInt(filed[1]));
				con.scoreslsit.add(temp2);
				i++;
			}
			
		}
		catch (Exception e) {
			System.out.println("���� �ҷ����� ���� " + e);
		}
	}
}
