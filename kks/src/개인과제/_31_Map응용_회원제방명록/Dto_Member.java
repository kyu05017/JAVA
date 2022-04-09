package 개인과제._31_Map응용_회원제방명록;

public class Dto_Member {
	private String id;
	private String pw;
	
	public Dto_Member() {}

	public Dto_Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
