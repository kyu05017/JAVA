package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	
	
	
	public static ArrayList<Board_MainContents> boardlist = new ArrayList<>();
	//  C R U D
	// 1 .create
	// 2. read
	// 3. update
	// 4. delete
	
	// ��ϸ޼ҵ�

	// ����
	public static void writer(String title, String writting, String id, String pw) {
		// 1. ��üȭ [ ������ �ϳ��̻��̸� �����ϱ� ���������� �ϳ��� ��ü�� ��� ���ϰ� �Ѵ� ]
		Board_MainContents board = new Board_MainContents(title, writting, id, pw);
		// 2. ����Ʈ�� ���� [ �ܼ��� �޸� ]
		boardlist.add(board);
		// 3. ���Ͽ��� ���� [ �ܺη� ���� ]
		save();
	}
	// ����

	// ����
	public static boolean update(int number,String pw,String newtitle, String newcontents) {
		
		Board_MainContents temp = Controller.boardlist.get(number);
		for(Board_MainContents temp2 : Controller.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				temp.setTitle(newtitle);
				temp.setContens(newcontents);
				Controller.save();
			return true;
			}	
			else {
				return false;
			}
		}
		return false;
	}
	// ����
	public static boolean delete(int number, String pw) {
		
		Board_MainContents temp = Controller.boardlist.get(number);
		for(Board_MainContents temp2 : Controller.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				Controller.boardlist.remove(number);
				Controller.save();
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	// ��� �ۼ�
	public static void reply_wwrite(int number, String replyCT, String replyID, String replyPW) {
		
		
		Board_Reply reply = new Board_Reply(replyCT, replyID, replyPW);
		Board_MainContents board = new Board_MainContents();
		reply.setReply_contents(replyCT);
		reply.setReply_writer(replyID);
		reply.setReply_password(replyPW);
		//board.getReplylist(board.setReplylist(reply));
	}
	
	// �Խù� ����
	public static void save() {

		// ����Ʈ���� ��� �Խù��� ���Ͽ� ����
		try {
		FileOutputStream outputStream = new FileOutputStream("D:/KKS/�ڹ�/a.txt");
		// 2. ���Ͽ� �ۼ��� ���� [ ���پ� ]
		for(Board_MainContents temp : boardlist) {
			String contents = temp.getTitle() +","+temp.getContens()+","+temp.getPassword()+","+temp.getWriter()+","+temp.getViewcount()+","+temp.getDate()+"\n";
			outputStream.write(contents.getBytes());
		}
		
		// 3. ����[���ڿ�] -> ����Ʈ�� ��ȯ [ �ܺ���� > ��Ʈ�� [����Ʈ] ]
		
		// 4. �������� write()
		
		
		}
		catch(Exception e) {
		}
	}
	
	// �Խù� �ҷ�����
	public static void load() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/KKS/�ڹ�/a.txt");
			byte[] bytes = new byte[1024]; // 1 . ����Ʈ �迭 ����
			inputStream.read(bytes); // 2. ��� ����Ʈ�� �о�ͼ� ����Ʈ���� ���� 
			String file = new String(bytes); // 3. ����Ʈ�� ���ڿ��� ��ȯ
			String[]list = file.split("\n"); // 4. ���ڿ� �ڸ���
			
			
			for(String temp : list) { // �迭�� �ϳ� �� ������
				String[] filed = temp.split(",");// 5. ���ڿ� �ڸ��� 
				Board_MainContents boards = new Board_MainContents(filed[0], filed[1], filed[2], filed[3], Integer.parseInt(filed[4]), filed[5],null);
				boardlist.add(boards);
			}
			
		}
		catch(Exception e) {
		}
		
	}
	

}
