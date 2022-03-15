package Day10;

public class Book {
	
	//필드
	private String bookName;
	private String writer;
	
	//생성자
	public Book() {}
	public Book(String bookName, String writer) {
		this.bookName = bookName;
		this.writer = writer;
	}
	//메소드
	
	public String getBookName() {return bookName;}
	public void setBookName(String bookName) {this.bookName = bookName;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
}
