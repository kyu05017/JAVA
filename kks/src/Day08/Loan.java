package Day08;


public class Loan {
	
	//�ʵ�
	String lname;
	int loanmoney;
	final double interest = 0.1;
	String lid;
	boolean repay;
	
	//������
	
	public Loan() {
		
	}

	public Loan(String lname, int loanmoney, String lid, boolean repay) {
		this.lname = lname;
		this.loanmoney = loanmoney;
		this.lid = lid;
		this.repay = repay;
	}
	
	//�޼ҵ�

	void newloan(String loginid) {
		System.out.println("----------------���� ��ǰ ��� ������------------------");
		// 1. �Է¹ޱ�
		System.out.println("���� ��ǰ�̸� �Է� : "); String lname = Day08_5.scanner.next();
		System.out.println("���� �ݾ� �Է� : "); int loan = Day08_5.scanner.nextInt();
		
		// * �ߺ�üũ
		for(Loan temp : Day08_5.loanlist) {
			if(temp!=null && temp.lname.equals(lname)) {
				System.out.println("�˸�)) ���� ������� ���� ��ǰ�Դϴ�.[��Ͻ���]");
				return; // �����ǰ��� �޼ҵ� ���� (��Ͻ���)
			}
		}
		
		// 2. ��üȭ [ �����뿩���� = true, �뿩ȸ��id = null ]
		Loan newloan = new Loan(lname, loan, null, false);
		
		// 3. �迭 ����[�ֱ�]
		int index = 0;
		for(Loan temp : Day08_5.loanlist) {
			if(temp==null) {
				System.out.println("�˸�)) ���� ��ǰ ����� �Ϸ�Ǿ����ϴ�.");
				Day08_5.loanlist[index]=newloan;
				return; // ��� ������ �޼ҵ� ����
			}
			index++;
		}
	}
	/////////////////////////////////////////////////
	void loanlsit(String x) {//���� ���
		System.out.println("�����ǰ ��� ���))");
		System.out.print("�����ǰ\t�����ܾ�\t\n");
		try {
			for(Loan temp : Day08_5.loanlist) {
				
				if(temp != null && x.equals(temp.lid)) {
					System.out.println(temp.lname + "\t"+ temp.loanmoney);
					System.out.println("1)����ޱ�  2)�ڷΰ���");
					int ch = Day08_5.scanner.nextInt();
					if(ch == 1) {
						System.out.println("�˸�)) ���� �������� �̵��մϴ�.");
						inloan(x);
					}
					else if(ch == 2) {
						System.out.println("�˸�)) �������� ���ư��ϴ�.");
						return;
					}
				}
				if(temp != null && x.equals("admin")) {
					System.out.println(temp.lname + "\t"+ temp.loanmoney);
					System.out.println("1)�����ǰ����  2)�ڷΰ���");
					int ch = Day08_5.scanner.nextInt();
					if(ch == 1) {
						System.out.println("�˸�)) ���� ���� �������� �̵��մϴ�.");
						removeloan(x);
					}
					else if(ch == 2) {
						System.out.println("�˸�)) �������� ���ư��ϴ�.");
						return;
					}
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
	}
/////////////////////////////////////////////////////////////////////////////	
	void removeloan(String loginid) {
		System.out.println("----------------���� ��ǰ ���� ������------------------");
		// 1. �Է¹ޱ�
		System.out.println("������ ���� ��ǰ�̸� �Է� : "); String lname = Day08_5.scanner.next();
		
		// * �ߺ�üũ
		for(Loan temp : Day08_5.loanlist) {
			if(temp==null && !temp.lname.equals(lname)) {
				System.out.println("�˸�)) �������� �ʴ� ���� ��ǰ�Դϴ�.");
				return; // �����ǰ��� �޼ҵ� ���� (��Ͻ���)
			}
		}
		
		// 3. �迭 ����[�ֱ�]
		int i = 0;
		for(Loan temp : Day08_5.loanlist) {
			if(temp != null && temp.lname.equals(lname)) {
				Day08_5.loanlist[i] = null;
			}
			i++;
		}
	}
///////////////////////////////////////////////////////////////////////////////////	
	void myloan(String x) {
		System.out.println("���������ǰ ��� ���))");
		System.out.print("�����ǰ\t�����ܾ�\t\n");
		try {
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null &&temp.lid.equals(x)) {
					System.out.println(temp.lname + "\t"+ temp.loanmoney);
					System.out.println("1)�����ȯ  2)�ڷΰ���");
					int ch = Day08_5.scanner.nextInt();
					if(ch == 1) {
						System.out.println("�˸�)) �����ȯ �������� �̵��մϴ�.");
						outloan(x);
					}
					else if(ch == 2) {
						System.out.println("�˸�)) �������� ���ư��ϴ�.");
						return;
					}
					
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
	}
///////////////////////////////////////////////////////////////////////////////////	
	void outloan(String x) {
		System.out.println("�����ȯ)) ");
		System.out.print("��ȯ�� �����ǰ�� �̸��� �Է��ϼ��� :");
		String out = Day08_5.scanner.next();
		try {
			int j = 0;
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null && temp.lname.equals(out)) {
					Bankbook bankbook = new Bankbook(loanmoney);
					int i = 0;
					for(Bankbook temp2 : Day08_5.bankbooks) {
						if(temp2 != null && temp2.username.equals(x)) {
							System.out.println(temp.lname+" ��ǰ�� ��ȯ �մϴ�.");
							System.out.println("��ȯ �ݾ��� "+ (temp.loanmoney+(temp.loanmoney*interest)) + "�� �Դϴ�.");
							Day08_5.bankbooks[i].nowmoney -= (temp.loanmoney+(temp.loanmoney*interest));
							Day08_5.loanlist[j].lid = null;
						}
					}
				}
				else {
					System.out.println("�˸�)) �������� �ʴ� ��ǰ�Դϴ�.");
				}
				j++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	void inloan(String x) {
		System.out.println("����ޱ�)) ");
		System.out.print("������ �����ǰ�� �̸��� �Է��ϼ��� :");
		String ln = Day08_5.scanner.next();
		try {
			int j = 0;
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null && temp.lname.equals(ln)) {
					Bankbook bankbook = new Bankbook(loanmoney);
					int i = 0;
					for(Bankbook temp2 : Day08_5.bankbooks) {
						if(temp2 != null && temp2.username.equals(x)) {
							System.out.println(temp.lname+" ��ǰ��  ����޾ҽ��ϴ�.");
							Day08_5.bankbooks[i].nowmoney += temp.loanmoney;
							Day08_5.loanlist[j].lid = x;
						}
					}
				}
				else {
					System.out.println("�˸�)) �������� �ʴ� ��ǰ�Դϴ�.");
				}
				j++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� �����Դϴ�.");
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////
}
