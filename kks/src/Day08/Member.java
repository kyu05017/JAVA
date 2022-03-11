package Day08;

public class Member {
	
	//�ʵ�
	private String name;
	private String id;
	private String pw;
	String phone;
	private String address;
	
	//������
	public Member() { //�������
		
	}
	public Member(String phone) {
		this.phone = phone;
	}

	public Member(String name, String id, String pw, String phone, String address) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.address = address;
	}
	
	//�޼ҵ�
	
	boolean registration() {//ȸ������
		System.out.println("ȸ������)");
		System.out.print("����� ���̵� �Է�	 : ");String id = Day08_5.scanner.next();
		try {
			for(Member temp : Day08_5.members) {
				if(temp != null && temp.id.equals(id)) {
					System.out.println("�˸�)) ���� ������� ���̵��Դϴ�.");
					return false;
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
			return false;
		}
		System.out.print("����� ��ι�ȣ �Է� : \n");String pw = Day08_5.scanner.next();
		System.out.print("ȸ���̸� �Է� 	 : \n");String name = Day08_5.scanner.next();
		System.out.print("�̵���Ź�ȣ �Է�   : \n");String phone = Day08_5.scanner.next();
		System.out.print("�ּ��Է�(EX:�����) : \n");String address = Day08_5.scanner.next();
		
		Member member = new Member(name, id, pw, phone, address);
		
		try {
			int i = 0;
			for(Member temp : Day08_5.members) {
				if(temp == null) {
					Day08_5.members[i] = member;
					return true;
				}
				i++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
			return false;
		}
		return false;
	}
	
	String login() {//�α���
		System.out.println("�α���)");
		System.out.print("ID : \n");String id = Day08_5.scanner.next();
		System.out.print("PW : \n");String pw = Day08_5.scanner.next();
		boolean idcheck = false;
		try {
			for(Member temp : Day08_5.members) {
				if( temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
					idcheck = true;
					return temp.id;
					
				}
				else if(temp != null && id.equals("admin") && temp.pw.equals(pw)) {
					idcheck = true;
					return "admin";
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
			return null;
		}
		if(idcheck == false)System.out.println("�˸�)) �������� �ʴ� ȸ���Դϴ�.");
		return null;
	}
	
	void findid() {//���̵� ã��
		System.out.println("���̵� ã��)");
		System.out.print("������� �̸� : \n");String name = Day08_5.scanner.next();
		System.out.print("��ȭ��ȣ �Է� : \n");String phone = Day08_5.scanner.next();
		boolean idcheck = false;
		try {
			int i = 0;
			for(Member temp : Day08_5.members) {
				if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
					System.out.println("ȸ������ ���̵�� " + temp.id + " �Դϴ�.");
					idcheck = true;
					return;
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
		if(idcheck == false)System.out.println("�˸�)) �������� �ʴ� ȸ���Դϴ�.");
	}
	
	void findpw() {//��й�ȣã��
		System.out.println("��й�ȣ ã��)");
		System.out.print("������� ���̵�: \n");String id = Day08_5.scanner.next();
		System.out.print("��ȭ��ȣ �Է� : \n");String phone = Day08_5.scanner.next();
		boolean idcheck = false;
		try {
			int i = 0;
			for(Member temp : Day08_5.members) {
				if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
					System.out.println("ȸ������ ���̵�� " + temp.pw + " �Դϴ�.");
					idcheck = true;
					return;
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
		if(idcheck == false)System.out.println("�˸�)) �������� �ʴ� ȸ���Դϴ�.");
	}
	
}