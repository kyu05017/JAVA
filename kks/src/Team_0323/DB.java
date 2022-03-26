package Team_0323;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {
	
	public void memberSave() {
		
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
	
	public void movieSave() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/movieDB.txt");
		
			for(Movie temp : Controller.movielist) {
				String memberSave = temp.getTitle()+","+temp.getIntime()+","+temp.getRuntime()+","+temp.getMoney()+"\n";
				outputStream.write(memberSave.getBytes());
			}
		}
		catch(Exception e) {
			
		}
	}
	
	public void movieLoad() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/movieDB.txt");
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
				Movie temp2 = new Movie(filed[0],filed[1],filed[2],Integer.parseInt(filed[3]));
				Controller.movielist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
	}
	
	public void ticketSave() {
		
	}
	
	public void ticketLoad() {
		
	}
	
}
