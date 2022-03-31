package Day01_to_Day21.Day14;

public class Account {
	
	
	String id;
	String pw;
	String name;
	int point;
	
	public Account() {

	}
	
	

	public Account(String id, String pw, String name, int point) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
