package Day01_to_Day21.Day11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board_MainContents {
	
		//�ʵ�
	private String title;
	private String contens;
	private String password;
	private String writer;
	private int viewcount;
	private String Date;
	private ArrayList<Board_Reply> replylist = new ArrayList<>();
	
		//������
	public Board_MainContents() {
	}
	// �Խù� ��� [ ��¥ �ڵ����� ]
	public Board_MainContents(String title, String contens, String writer, String password) {
		this.title = title;
		this.contens = contens;
		this.password = password;
		this.writer = writer;
		Date date = new Date(); // ��¥ ��ü �Է�
		// ��¥ ���� Ŭ���� : SimpleDateFormat Ŭ���� java.text
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		this.Date = format.format(date);
		// ��ü��.format{ ��¥ } : �ش� ��¥�� �������� ������ �������� ����
	}

	//�Խù� ����
	
	public Board_MainContents(String title, String contens, String password, String writer, int viewcount,String date, ArrayList<Board_Reply> replylist) {
		this.title = title;
		this.contens = contens;
		this.password = password;
		this.writer = writer;
		this.viewcount = viewcount;
		this.Date = date;
		this.replylist = replylist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContens() {
		return contens;
	}

	public void setContens(String contens) {
		this.contens = contens;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public ArrayList<Board_Reply> getReplylist() {
		return replylist;
	}

	public void setReplylist(ArrayList<Board_Reply> replylist) {
		this.replylist = replylist;
	}
	
		//�޼ҵ�
	
	
}
