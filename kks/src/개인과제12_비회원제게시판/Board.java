package ���ΰ���12_��ȸ�����Խ���;

public class Board {
	// * Board Ŭ���� ����
		// main �޼ҵ�� �����Ҷ��� ���
	
	// 1. �ʵ�
	String title;
	String content;
	String writer;
	String password;

	
	// 2. ������
		// �ڵ� : ������Ŭ�� source �ؿ��� ����° �޴�
		
		// 1. �������
	public Board() {
		
	}
		// 2. 1�� �ʵ带 �޴� ������
	Board(String title) {
		this.title = title;
		//this.�ʵ�� => ���κ���
		// * �ܺη� ���� ���� ������ ���κ����� ����
	}
		// 3. 2�� �ʵ带 �޴� ������
	Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	Board(String title, String content, String writer,String password) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
		// 4. 3�� �ʵ带 �޴� ������
		// 5. 4�� �ʵ带 �޴� ������
}
