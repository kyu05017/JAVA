package Day11;

import java.util.ArrayList;

public class Board_MainContents {
	
		//필드
	private String title;
	private String contens;
	private String password;
	private String writer;
	private int viewcount;
	private String Date;
	private ArrayList<Board_Reply> replylist = new ArrayList<>();
	
		//생성자
	public Board_MainContents() {
	}

	public Board_MainContents(String title, String contens, String password, String writer) {
		this.title = title;
		this.contens = contens;
		this.password = password;
		this.writer = writer;
	}

	public Board_MainContents(String title, String contens, String password, String writer, int viewcount,String date, ArrayList<Board_Reply> replylist) {
		this.title = title;
		this.contens = contens;
		this.password = password;
		this.writer = writer;
		this.viewcount = viewcount;
		Date = date;
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
	
		//메소드
	
	
}
