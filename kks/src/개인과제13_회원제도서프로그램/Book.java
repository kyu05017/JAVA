package 개인과제13_회원제도서프로그램;

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
		Book book = new Book(iSBN, book_name, book_writer, false , "");
		
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				System.out.println("이미 등록되어있는책입니다.");
				return;
			}
		}
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp == null) {
				Main.booklist[i] = book;
				System.out.println("책등록 완료.");
				return;
			}
			i++;
		}
	}
	
	void book_remove(String iSBN) {
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				Main.booklist[i] = null;
				System.out.println("해당 도서가 삭제 되었습니다.");
				return;
			}
			i++;
		}
		
	}
	
	

	void book_rent(String iSBN, String id) {
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				Main.booklist[i].book_rent = true;
				Main.booklist[i].renterId = id;
				System.out.println(temp.book_name + "책을 대여했습니다.");
				return;
			}
			i++;
		}
		
	}
	
	void book_return(String iSBN,String id) {
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				Main.booklist[i].book_rent = false;
				Main.booklist[i].renterId = null;
				System.out.println(temp.book_name + "책을 반납했습니다.");
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
					System.out.println("검색하신 책 " + temp.book_name + "은 현재 대여중 입니다.");
				}
				else {
					System.out.println("검색하신 책 " + temp.book_name + "은 현재 대여가 가능합니다.");
				}

			}
			i++;
		}
		
	}
	
	void book_list() {
		System.out.println("ISBN\t제목\t저자\t대여여부");
		for(Book temp :Main.booklist) {
			if(temp != null) {
				if(temp.book_rent) {
					System.out.printf("%s\t%s\t%s\t대여중 \n",temp.ISBN,temp.book_name,temp.book_writer);
				}
				else {
					System.out.printf("%s\t%s\t%s\t대여중가능\n",temp.ISBN,temp.book_name,temp.book_writer);
				}
			}
		}
		
		
	}
	
	
}
