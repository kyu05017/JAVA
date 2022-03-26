package Team_0323;

public class Ticket {
	 private String t_id; // Member���̵�� ������ ����Ȯ���ϱ�����
	 private String t_title; // Ƽ�Ͽ� ǥ�õ� ��ȭ����
	 private String t_intime; // Ƽ�Ͽ� ǥ�õ� ���۽ð�
	 private String t_outtime; // Ƽ�Ͽ� ǥ�õ� �����½ð�
	 private String t_seat; // Ƽ�Ͽ� ǥ�õ� �ڸ�
	 private int t_num; // Ƽ�Ͽ� ǥ�õ� ���Ź�ȣ
	 private int t_money; // Ƽ�Ͽ� ǥ�õ� �ݾ�

	 public Ticket() {}

	public Ticket(String t_id, String t_title, String t_intime, String t_outtime, String t_seat, int t_num,
			int t_money) {
		super();
		this.t_id = t_id;
		this.t_title = t_title;
		this.t_intime = t_intime;
		this.t_outtime = t_outtime;
		this.t_seat = t_seat;
		this.t_num = t_num;
		this.t_money = t_money;
	}
	
	public Ticket(String t_id, String t_title, String t_intime, String t_outtime, String t_seat) {
		super();
		this.t_id = t_id;
		this.t_title = t_title;
		this.t_intime = t_intime;
		this.t_outtime = t_outtime;
		this.t_seat = t_seat;
	}
	

	public Ticket(String t_id, String t_title, String t_intime, String t_outtime, String t_seat, int t_num) {
		super();
		this.t_id = t_id;
		this.t_title = t_title;
		this.t_intime = t_intime;
		this.t_outtime = t_outtime;
		this.t_seat = t_seat;
		this.t_num = t_num;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getT_title() {
		return t_title;
	}

	public void setT_title(String t_title) {
		this.t_title = t_title;
	}

	public String getT_intime() {
		return t_intime;
	}

	public void setT_intime(String t_intime) {
		this.t_intime = t_intime;
	}

	public String getT_outtime() {
		return t_outtime;
	}

	public void setT_outtime(String t_outtime) {
		this.t_outtime = t_outtime;
	}

	public String getT_seat() {
		return t_seat;
	}

	public void setT_seat(String t_seat) {
		this.t_seat = t_seat;
	}

	public int getT_num() {
		return t_num;
	}

	public void setT_num(int t_num) {
		this.t_num = t_num;
	}

	public int getT_money() {
		return t_money;
	}

	public void setT_money(int t_money) {
		this.t_money = t_money;
	}
	
	
}
