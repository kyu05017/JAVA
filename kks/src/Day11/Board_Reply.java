package Day11;

public class Board_Reply {

	//필드
	private String reply_contents;
	private String reply_writer;
	private String reply_password;
	private String reply_Date;
	
	//생성자
	public Board_Reply() {
	}

	public Board_Reply(String reply_contents, String reply_writer, String reply_password) {
		super();
		this.reply_contents = reply_contents;
		this.reply_writer = reply_writer;
		this.reply_password = reply_password;
	}
	
	public Board_Reply(String reply_contents, String reply_writer, String reply_password, String reply_Date) {
		this.reply_contents = reply_contents;
		this.reply_writer = reply_writer;
		this.reply_password=reply_password;
		this.reply_Date = reply_Date;
	}
	
	//메소드
	public String getReply_contents() {
		return reply_contents;
	}
	public void setReply_contents(String reply_contents) {
		this.reply_contents = reply_contents;
	}
	public String getReply_writer() {
		return reply_writer;
	}
	public void setReply_writer(String reply_writer) {
		this.reply_writer = reply_writer;
	}
	public String getReply_password() {
		return reply_password;
	}
	public void setReply_password(String reply_password) {
		this.reply_password = reply_password;
	}
	public String getReply_Date() {
		return reply_Date;
	}
	public void setReply_Date(String reply_Date) {
		this.reply_Date = reply_Date;
	}
	
	
}
