package ���ΰ���._18_����Ʈ����_���������ý���;

public class Book {
		
	
	String ISBN;
	String book_name;
	String book_writer;
	boolean book_rent;
	String renterId;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String iSBN, String book_name, String book_writer, boolean book_rent, String renterId) {
		ISBN = iSBN;
		this.book_name = book_name;
		this.book_writer = book_writer;
		this.book_rent = book_rent;
		this.renterId = renterId;
	}
	
	
	void book_add(String iSBN, String book_name, String book_writer) {
		Book book = new Book(iSBN, book_name, book_writer, false , "����");
		
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				System.out.println("�̹� ��ϵǾ��ִ�å�Դϴ�.");
				return;
			}
		}

		Main.booklist.add(book);
		System.out.println("å��� �Ϸ�.");

	}
	
	void book_remove(String iSBN) {
		
		for(int i = 0; i < Main.booklist.size(); i++) {
			if(Main.booklist.get(i).ISBN.equals(iSBN)) {
				Main.booklist.remove(i);
			}
		}
		System.out.println("�ش� ������ ���� �Ǿ����ϴ�.");

	}
	
	

	void book_rent(String iSBN, String id) {
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				Main.booklist.get(i).book_rent = true;
				Main.booklist.get(i).renterId = id;
				System.out.println(temp.book_name + "å�� �뿩�߽��ϴ�.");
				return;
			}
			i++;
		}
		
	}
	
	void book_return(String iSBN,String id) {
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				Main.booklist.get(i).book_rent = false;
				Main.booklist.get(i).renterId = "����";
				System.out.println(temp.book_name + "å�� �ݳ��߽��ϴ�.");
				return;
			}
			i++;
		}
	}
	
	void book_search(String iSBN) {
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				if(temp.book_rent) {
					System.out.println("�˻��Ͻ� å " + temp.book_name + "�� ���� �뿩�� �Դϴ�.");
				}
				else {
					System.out.println("�˻��Ͻ� å " + temp.book_name + "�� ���� �뿩�� �����մϴ�.");
				}

			}
			i++;
		}
		
	}
	
	void book_list() {
		System.out.println("ISBN\t����\t����\t�뿩����\t�뿩��");
		for(Book temp :Main.booklist) {
			if(temp != null) {
				if(temp.book_rent) {
					System.out.printf("%s\t%s\t%s\t�뿩�� \t%s\n",temp.ISBN,temp.book_name,temp.book_writer,temp.renterId);
				}
				else {
					System.out.printf("%s\t%s\t%s\t�뿩����\n",temp.ISBN,temp.book_name,temp.book_writer);
				}
			}
		}
		
		
	}
}
