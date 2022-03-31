package 개인과제._13_회원제도서프로그램;

public class Book_rental_tesk_1 {

	String ISBN;
	String book_Name;
	String book_Writer;
	boolean book_rent;
	String member_id;
	
	public Book_rental_tesk_1() {
		
	}
	
	public Book_rental_tesk_1(String iSBN, String book_Name, String book_Writer, boolean book_rent, String member_id) {
		this.ISBN = iSBN;
		this.book_Name = book_Name;
		this.book_Writer = book_Writer;
		this.book_rent = book_rent;
		this.member_id = member_id;
	}
	
	
	int Book_add(String ISBN, String name, String writer) {
		
		Book_rental_tesk_1 book = new Book_rental_tesk_1(ISBN, name, writer,true , " ");
		
		
		for(Book_rental_tesk_1 temp : Main_1.booklist) {
			if(temp != null && temp.ISBN.equals(ISBN)) {
				return 5;
			}
		}
		
		int i = 0;
		for(Book_rental_tesk_1 temp : Main_1.booklist) {
			if(temp == null) {
				Main_1.booklist[i] = book;
				return 1;
			}
			i++;
		}
		return 0;
	}
	
	boolean Book_remove(String ISBN) {
		
		int i = 0;
		for(Book_rental_tesk_1 temp : Main_1.booklist) {
			if(temp != null && temp.ISBN.equals(ISBN)) {
				Main_1.booklist[i] = null;
				return true;
			}
			i++;
		}
		return false;
	}
	
	int Book_Rent(String id, String ISBN) {
		
		int i = 0;
		for(Book_rental_tesk_1 temp : Main_1.booklist) {
			if(temp != null && temp.ISBN.equals(ISBN)){
				if(temp.book_rent) {
					Main_1.booklist[i].book_rent = false;
					Main_1.booklist[i].member_id = id;
					return 1;
				}
				else {
					return 5;
				}
			}
			i++;
		}
		return 0;
	}
	int Book_Return(String id, String ISBN) {
		
		int i = 0;
		for(Book_rental_tesk_1 temp : Main_1.booklist) {
			if(temp != null && temp.ISBN.equals(ISBN)){
				if(temp.book_rent) {
					
					return 5;
				}
				else {
					Main_1.booklist[i].book_rent = true;
					Main_1.booklist[i].member_id = " ";
					return 1;
				}
			}
			i++;
		}
		return 0;
	}
	void Book_Lsit() {
		for(Book_rental_tesk_1 temp : Main_1.booklist) {
			if(temp != null) {
				if(temp.book_rent) {
				System.out.println(temp.ISBN + "\t"+ temp.book_Name + "\t"+temp.book_Writer+"\t"+"대여가능");
				}
				else {
					System.out.println(temp.ISBN + "\t"+ temp.book_Name + "\t"+temp.book_Writer+"\t"+"대여중");
				}
			}
		}
	}
	
	void Book_Search(String Search_ISBN) {
		for(Book_rental_tesk_1 temp : Main_1.booklist) {
			if(temp != null && temp.ISBN.equals(ISBN)) {
				if(temp.book_rent) {
					System.out.println("입력하신 해당 도서 "+temp.book_Name+"는 현재 대여 가능합니다.");
				}
				else {
					System.out.println("입력하신 해당 도서 "+temp.book_Name+"는 현재 대여중입니다.");
				}
			}
		}
	}
}
