package 개인과제._27_스레드응용프로그램;

public class Book {
	private String name;
	private String contents;
	
	public Book() {}

	public Book(String name, String contents) {
		this.name = name;
		this.contents = contents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
