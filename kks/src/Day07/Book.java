package Day07;

public class Book {
	
	// 1. �ʵ�
		//
	String ISBM;
	String bname;
	String bwriter;
	boolean brental;
	String mid;

	// 2. ������
		// 1. ������� �޼ҵ� ȣ��� (��Ʈ�� �����̽�)
	public Book() { // ����
		
	}

	public Book(String ISBM, String bname, String bwriter, boolean brental, String mid) {
		this.ISBM = ISBM;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	 
	// 3. �޼ҵ�
		//1.�����˻�
	void bsearch() {
		System.out.println("--------------- �����˻�-----------------");
	}
		//2.�������
	void blist() {
		System.out.println("--------------- �������-----------------");
		System.out.print("ISBM\t������\t�۰�\t�뿩���ɿ���\n");
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null) {
				if(temp.brental) {
				System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"�뿩����");
				}
				else {
					System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"�뿩��");
				}
			}
		}
	}
	void myrentalbook(String loginid) {
		System.out.println("--------------- �������-----------------");
		System.out.print("ISBM\t������\t�۰�\t�뿩���ɿ���\n");
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null && temp.mid.equals(loginid)) {

				System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"�뿩��");
			}
		}
	}
		//3.�����뿩
	void brental(String loginid) {
		System.out.println("--------------- �����뿩-----------------");
		System.out.print("�뿩�� ISBM :");String aa = Day07_5_bookApplication.scanner.next();
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null &&temp.ISBM.equals(aa) && temp.brental) {
				if(temp.brental ) {
					System.out.println("�˸�)) �ش� ������ �뿩�մϴ�.");
					temp.mid = loginid;
					temp.brental = false;
					return;
				}
				else {
					System.out.println("�˸�)) �̹� �뿩���� ���� �Դϴ�.");
					return;
				}
			}
			
		}
		System.out.println("�˸�)) ������ ISBM�� �����ϴ�.");
	}
		//4.�����ݳ�
	void bback(String loginid) {
		System.out.println("--------------- �����ݳ�-----------------");
		myrentalbook(loginid);
		System.out.print("�ݳ��� ISBM :");String aa = Day07_5_bookApplication.scanner.next();
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null &&temp.ISBM.equals(aa) && temp.mid.equals(loginid)) {
				if(temp.brental ) {
					System.out.println("�˸�)) �뿩���� ������ �ƴմϴ�.");
					return;
				}
				else {
					System.out.println("�˸�)) �ش� ������ �ݳ��մϴ�.");
					temp.brental = true;
					temp.mid = null;
					return;
				}
			}
			
		}
		System.out.println("�˸�)) ������ ISBM�� �����ϴ�.");
	}

		//5.�������
	void badd() {
		System.out.println("--------------- �������-----------------");
		System.out.println("ISBM �Է� : ");
		String isbm = Day07_5_bookApplication.scanner.next();//�̸�
		System.out.println("å�̸� :");
		String bname = Day07_5_bookApplication.scanner.next();//�̸�
		System.out.println("�۰��� �̸� :");
		String bwritwer = Day07_5_bookApplication.scanner.next();//�ۼ���
		
		
		// ��üȭ [ �����뿩���� = true , �뿩ȸ�� id = null]
		Book book = new Book(isbm, bname, bwriter,true,null);
		int i = 0;
		//���
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp == null) {
				Day07_5_bookApplication.books[i] = book;
				System.out.println("�˸�)) ��������� �Ϸ�Ǿ����ϴ�.");
				return;
			}//ISBM �ߺ�üũ
			else if(temp != null && temp.ISBM.equals(isbm)) {
				System.out.println("�˸�)) ���� ������� ISBM �Դϴ�.");
				return;
			}
			i++;
		}
	}
		//6.��������
	void bremove() {
		System.out.println("--------------- ��������-----------------");
		System.out.println("ISBM �Է� :");
		String isbm = Day07_5_bookApplication.scanner.next();//�̸�
		//ISBM �ߺ�üũ
		int i = 0;
		for(Book temp : Day07_5_bookApplication.books) {
			if(temp != null && temp.ISBM.equals(isbm)) {
				Day07_5_bookApplication.books[i] = null;
			}
			i++;
		}
	}
}
