package 개인과제._31_Map응용_회원제방명록;

public class Dto_Board {
	private String contents;
	private String date;
	
	public Dto_Board() {}

	public Dto_Board( String contents, String date) {
		this.contents = contents;
		this.date = date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
