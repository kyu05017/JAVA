package ���ΰ���._21_BoardApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	
	public static ArrayList<Board> boardlist = new ArrayList<>();
	public static ArrayList<Reply> replylist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	// ����
	public static void writer(String title, String writting, String id, String pw) {
		// 1. ��üȭ [ ������ �ϳ��̻��̸� �����ϱ� ���������� �ϳ��� ��ü�� ��� ���ϰ� �Ѵ� ]
		Board board = new Board(title, writting, id, pw);
		// 2. ����Ʈ�� ���� [ �ܼ��� �޸� ]
		boardlist.add(board);
		// 3. ���Ͽ��� ���� [ �ܺη� ���� ]
		DB.save();
	}
	// ����

	// ����
	public static boolean update(int number,String pw,String newtitle, String newcontents) {
		
		Board temp = Control.boardlist.get(number);
		for(Board temp2 : Control.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				temp.setTitle(newtitle);
				temp.setContens(newcontents);
				DB.save();
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
		
		Board temp = Control.boardlist.get(number);
		for(Board temp2 : Control.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				Control.boardlist.remove(number);
				DB.save();
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
		Reply reply = new Reply(number,replyCT, replyID, replyPW);
		replylist.add(reply);
		DB.resave();
	}
	public static void reply_remove(int num) {
		
		
		System.out.println(replylist.get(num).getReply_writer() + "�� �� ��й�ȣ �Է�:");
		String pw = scanner.next();
		if(pw.equals(replylist.get(num).getReply_password())){
			System.out.println("�޼���)) ����� �����մϴ�.");
			replylist.remove(num);
		}
	}

}
