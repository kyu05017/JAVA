package 개인과제._31_Map응용_회원제방명록;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Dao {
	public static void memberSave() {

		try {
			FileOutputStream outputStream = new FileOutputStream("D:/member&board.txt");
			for(Dto_Member temp : Control.list.keySet()) {
				String member = temp.getId() +","+temp.getPw()+","+Control.list.get(temp).getContents()+","+Control.list.get(temp).getDate()+"\n";
				outputStream.write(member.getBytes());
			}
			outputStream.close();
		}
		catch(Exception e) {
			System.out.println("회원 및 보드 저장 실패 " + e);
		}
	}

	public static void memberLoad() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/member&board.txt");
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
				Dto_Member member = new Dto_Member(filed[0], filed[1]);
				Dto_Board board = new Dto_Board(filed[2], filed[3]);
				Control.list.put(member,board);
				i++;
			}
			inputStream.close();
		}
		catch(Exception e) {
			System.out.println("회원 및 보드 불러오기 실패 " + e);
		}
		
	}
}
