package ���ΰ���13_ȸ�����������α׷�;

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
		System.out.println("�̸����� �˻��Ϸ��� (�̸�) �ڵ�� �˻��Ϸ���(�ڵ�):");
		String serch = ���ī��.scanner.next();
		if(serch.equals("�̸�")) {
			System.out.println("�˸�)) �����̸��� �Է��ϼ���");
			String sn =���ī��.scanner.next();
			for(Book temp : ���ī��.books) {
				if(temp != null) {
					if(sn.equals(temp.bname)) {
						if(temp.brental) {
							System.out.println("�Է��Ͻ� �ش� ���� "+sn+"�� ���� �뿩 �����մϴ�.");
							return;
						}
						else {
							System.out.println("�Է��Ͻ� �ش� ���� "+sn+"�� ���� �뿩���Դϴ�.");
							return;
						}
					}
					else {
						System.out.println("�˸�)) �ش� ������ �������� �ʽ��ϴ�.");
					}
				}
			}
			
		}
		else if(serch.equals("�ڵ�")) {
			System.out.println("�˸�)) �����ڵ带 �Է��ϼ���");
			String is = ���ī��.scanner.next();
			for(Book temp : ���ī��.books) {
				if(temp != null) {
					if(is.equals(temp.bname)) {
						if(temp.brental) {
							System.out.println("�Է��Ͻ� �ش� ���� "+is+"�� ���� �뿩 �����մϴ�.");
							return;
						}
						else {
							System.out.println("�Է��Ͻ� �ش� ���� "+is+"�� ���� �뿩���Դϴ�.");
							return;
						}
					}
					else {
						System.out.println("�˸�)) �ش� ������ �������� �ʽ��ϴ�.");
					}
				}
			}
			
		}
		else {
			System.out.println("�߸��� �Է�.");
		}
	}
		//2.�������
	void blist() {
		System.out.println("--------------- �������-----------------");
		System.out.print("ISBM\t������\t�۰�\t�뿩���ɿ���\n");
		for(Book temp : ���ī��.books) {
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
		System.out.println("--------------- �뿩���-----------------");
		System.out.print("ISBM\t������\t�۰�\t�뿩���ɿ���\n");
		for(Book temp : ���ī��.books) {
			if(temp.mid == null) {
				System.out.println("�˸�)) �뿩�Ͻ� å�� �����ϴ�.");
			}
			else if(temp != null && temp.mid.equals(loginid)) {
				System.out.println(temp.ISBM + "\t"+ temp.bname + "\t"+temp.bwriter+"\t"+"�뿩��");
			}
		}
	}
		//3.�����뿩
	void brental(String loginid) {
		System.out.println("--------------- �����뿩-----------------");
		System.out.print("�뿩�� ISBM :");String aa = ���ī��.scanner.next();
		int i = 0;
		for(Book temp : ���ī��.books) {
			if(temp != null &&temp.ISBM.equals(aa) && temp.brental) {
				if(temp.brental ) {
					System.out.println("�˸�)) �ش� ������ �뿩�մϴ�.");
					���ī��.books[i].mid = loginid;
					���ī��.books[i].brental = false;
					return;
				}
				else {
					System.out.println("�˸�)) �̹� �뿩���� ���� �Դϴ�.");
					return;
				}
			}
			i++;
		}
		System.out.println("�˸�)) ������ ISBM�� �����ϴ�.");
	}
		//4.�����ݳ�
	void bback(String loginid) {
		try{
			System.out.println("--------------- �����ݳ�-----------------");
			myrentalbook(loginid);
			System.out.print("�ݳ��� ISBM :");String aa = ���ī��.scanner.next();
			int i = 0;
			for(Book temp : ���ī��.books) {
				if(temp.mid == null) {
					System.out.println("�˸�)) �뿩�Ͻ� å�� �����ϴ�.");
				}
				if(temp != null &&temp.ISBM.equals(aa) && temp.mid.equals(loginid)) {
					if(temp.brental ) {
						System.out.println("�˸�)) �뿩���� ������ �ƴմϴ�.");
						return;
					}
					else {
						System.out.println("�˸�)) �ش� ������ �ݳ��մϴ�.");
						���ī��.books[i].brental = true;
						���ī��.books[i].mid = null;
						return;
					}
				}
				i++;
			}
		}catch(NullPointerException e){
			System.out.println("�˸�)) ������ ISBM�� �����ϴ�.");
		}
		
	}

		//5.�������
	void badd() {
		System.out.println("--------------- �������-----------------");
		System.out.println("ISBM �Է� : ");
		String isbm = ���ī��.scanner.next();//�̸�
		System.out.println("å�̸� :");
		String bname = ���ī��.scanner.next();//�̸�
		System.out.println("�۰��� �̸� :");
		String bwritwer = ���ī��.scanner.next();//�ۼ���
		
		
		// ��üȭ [ �����뿩���� = true , �뿩ȸ�� id = null]
		Book book = new Book(isbm, bname, bwritwer,true,null);
		int i = 0;
		//���
		for(Book temp : ���ī��.books) {
			if(temp == null) {
				���ī��.books[i] = book;
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
		String isbm = ���ī��.scanner.next();//�̸�
		//ISBM �ߺ�üũ
		int i = 0;
		for(Book temp : ���ī��.books) {
			if(temp != null && temp.ISBM.equals(isbm)) {
				���ī��.books[i] = null;
			}
			i++;
		}
	}
}
