package 개인과제._20_PC방_ver2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {
	
	static void memberSave() {
		
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/pcMemberDB.txt");
		
			for(Member temp : Control.memberList) {
				String memberSave = temp.getId()+","+temp.getPw()+","+temp.getName()+","
			+temp.getPhone()+","+temp.getTime()+","+temp.getSeat()+","+temp.isUse()+"\n";
				outputStream.write(memberSave.getBytes());
			}
		}
		catch(Exception e) {
			
		}
	}
	
	
	static void memberLoad() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/pcMemberDB.txt");
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
				Member temp2 = new Member(filed[0], filed[1], filed[2], filed[3],Integer.parseInt(filed[4]), Integer.parseInt(filed[5]), Boolean.parseBoolean(filed[6]));
				Control.memberList.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
	}
}
