package 개인과제._21_BoardApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class DB {
	public static void save() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/boardDB.txt");
			for(Board temp : Control.boardlist) {
				String contents = temp.getTitle() +","+temp.getContens()+","+temp.getPassword()+","+temp.getWriter()+","+temp.getViewcount()+","+temp.getDate()+"\n";
				outputStream.write(contents.getBytes());
			}
		}
		catch(Exception e) {
		}
	}
	// 게시물 불러오기
	public static void load() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/boardDB.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			Board board = new Board();
			for(String temp : list) {
				String[] filed = temp.split(",");
				Board boards = new Board(filed[0], filed[1], filed[2], filed[3], Integer.parseInt(filed[4]), filed[5]);
				Control.boardlist.add(boards);
			}
			
		}
		catch(Exception e) {
		}
	}
	public static void resave() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/replyDB.txt");
			for(Reply temp : Control.replylist) {
				String contents = temp.getBoard_num() +","+temp.getReply_contents()+","+temp.getReply_writer()+","+temp.getReply_password()+","+temp.getReply_Date()+"\n";
				outputStream.write(contents.getBytes());
			}
		}
		catch(Exception e) {
		}
	}
	// 게시물 불러오기
	public static void reload() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/replyDB.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			Board board = new Board();
			for(String temp : list) {
				String[] filed = temp.split(",");
				Reply temp2 = new Reply(Integer.parseInt(filed[0]),filed[1],filed[2],filed[3],filed[4]);
				Control.replylist.add(temp2);
			}
			
		}
		catch(Exception e) {
		}
	}
}
