package 개인과제._21_BoardApp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {		
		//필드
	private String title;
	private String contens;
	private String password;
	private String writer;
	private int viewcount;
	private String Date;
	
	private ArrayList<Reply> replylist = new ArrayList<>();
	
		//생성자
	public Board() {
	}
	// 게시물 등록 [ 날짜 자동주입 ]
	public Board(String title, String contens, String writer, String password) {
		this.title = title;
		this.contens = contens;
		this.password = password;
		this.writer = writer;
		Date date = new Date(); // 날짜 객체 입력
		// 날짜 형식 클래스 : SimpleDateFormat 클래스 java.text
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		this.Date = format.format(date);
		// 객체명.format{ 날짜 } : 해당 달짜가 포멧으로 설정한 패턴으로 저장
	}

	//게시물 수정
	
	public Board(String title, String contens, String password, String writer, int viewcount,String date, ArrayList<Reply> replylist) {
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

	public ArrayList<Reply> getReplylist() {
		return replylist;
	}

	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}
	
}
