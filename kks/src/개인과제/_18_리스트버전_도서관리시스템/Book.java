package 개인과제._18_리스트버전_도서관리시스템;

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
		Book book = new Book(iSBN, book_name, book_writer, false , "없음");
		
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				System.out.println("이미 등록되어있는책입니다.");
				return;
			}
		}

		Main.booklist.add(book);
		System.out.println("책등록 완료.");

	}
	
	void book_remove(String iSBN) {
		
		for(int i = 0; i < Main.booklist.size(); i++) {
			if(Main.booklist.get(i).ISBN.equals(iSBN)) {
				Main.booklist.remove(i);
			}
		}
		System.out.println("해당 도서가 삭제 되었습니다.");

	}
	
	

	void book_rent(String iSBN, String id) {
		
		int i = 0;
		for(Book temp : Main.booklist) {
			if(temp != null && temp.ISBN.equals(iSBN)) {
				Main.booklist.get(i).book_rent = true;
				Main.booklist.get(i).renterId = id;
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
				Main.booklist.get(i).book_rent = false;
				Main.booklist.get(i).renterId = "없음";
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
		System.out.println("ISBN\t제목\t저자\t대여여부\t대여자");
		for(Book temp :Main.booklist) {
			if(temp != null) {
				if(temp.book_rent) {
					System.out.printf("%s\t%s\t%s\t대여중 \t%s\n",temp.ISBN,temp.book_name,temp.book_writer,temp.renterId);
				}
				else {
					System.out.printf("%s\t%s\t%s\t대여가능\n",temp.ISBN,temp.book_name,temp.book_writer);
				}
			}
		}
		
		
	}
}
