package 개인과제._21_BoardApp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reply {
	//필드
		private int board_num;
		private String reply_contents;
		private String reply_writer;
		private String reply_password;
		private String reply_Date;
		
		//생성자
		public Reply() {
		}
		public Reply(int board_num,String reply_contents, String reply_writer, String reply_password) {
			this.board_num = board_num;
			this.reply_contents = reply_contents;
			this.reply_writer = reply_writer;
			this.reply_password=reply_password;
			Date date = new Date(); // 날짜 객체 입력
			// 날짜 형식 클래스 : SimpleDateFormat 클래스 java.text
			SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
			this.reply_Date = format.format(date);
			// 객체명.format{ 날짜 } : 해당 달짜가 포멧으로 설정한 패턴으로 저장
		}
		public Reply(int board_num,String reply_contents, String reply_writer, String reply_password,String reply_Date) {
			this.board_num = board_num;
			this.reply_contents = reply_contents;
			this.reply_writer = reply_writer;
			this.reply_password=reply_password;
			Date date = new Date(); // 날짜 객체 입력
			// 날짜 형식 클래스 : SimpleDateFormat 클래스 java.text
			SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
			this.reply_Date = format.format(date);
			// 객체명.format{ 날짜 } : 해당 달짜가 포멧으로 설정한 패턴으로 저장
		}
		
		//메소드
		public int getBoard_num() {
			return board_num;
		}
		public void setBoard_num(int board_num) {
			this.board_num = board_num;
		}
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
