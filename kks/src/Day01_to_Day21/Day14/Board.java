package Day01_to_Day21.Day14;

import java.util.ArrayList;

public class Board {
	
	// 클래스 맴버
	
		// 필드
	private String title;
	private String contents;
	private String writer;
	private int point;

	

		// 생성자 [ 객체 생성시 초기값 = 처음값 ] 
	// 빈생성자
	public Board() {
		
	}
	
	// 모든 필드를 받는 생성자
	public Board(String title, String contents, String writer, int point) {

		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.point = point;
	}


		//메소드
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContents() {
		return contents;
	}



	public void setContents(String contents) {
		this.contents = contents;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public int getPoint() {
		return point;
	}



	public void setPoint(int point) {
		this.point = point;
	}

	
}
