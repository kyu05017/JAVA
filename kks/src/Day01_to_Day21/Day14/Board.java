package Day01_to_Day21.Day14;

import java.util.ArrayList;

public class Board {
	
	// Ŭ���� �ɹ�
	
		// �ʵ�
	private String title;
	private String contents;
	private String writer;
	private int point;

	

		// ������ [ ��ü ������ �ʱⰪ = ó���� ] 
	// �������
	public Board() {
		
	}
	
	// ��� �ʵ带 �޴� ������
	public Board(String title, String contents, String writer, int point) {

		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.point = point;
	}


		//�޼ҵ�
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
