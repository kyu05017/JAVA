package 개인과제19_키오스크_파일처리;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {

	static void itemSave() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/itemList.txt");
			for(Product temp : Control.saleItem) {
				String Save = temp.getName()+","+temp.getItem()+","+temp.getMoney()+"\n";
				outputStream.write(Save.getBytes());
			}
		}
		catch(Exception e) {
			
		}
	}
	static void itemLoad() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/itemList.txt");
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
				Product temp2 = new Product(filed[0],Integer.parseInt(filed[1]),Integer.parseInt(filed[2]));
				Control.saleItem.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
	}
}

/*
 * 
 * public void memberSave() {
		
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/memberDB.txt");
		
			for(Member temp : Controller.memberlist) {
				String memberSave = temp.getId()+","+temp.getPw()+","+temp.getName()+","+temp.getPhone()+","+temp.isCheck()+"\n";
				outputStream.write(memberSave.getBytes());
			}
		}
		catch(Exception e) {
			
		}
	}
	
	
	public void memberLoad() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/memberDB.txt");
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
				Member temp2 = new Member(filed[0],filed[1],filed[2],filed[3],Boolean.parseBoolean(filed[4]));
				Controller.memberlist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
	}
 * */
 