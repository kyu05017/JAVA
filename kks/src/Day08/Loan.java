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
		Loan newloan = new Loan(lname, loan, loginid, false);
		
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
	void myloanlsit(String x) {//���� ���
		System.out.println("���� ���))");
		System.out.print("�����ǰ\t�����ܾ�\t\n");
		try {
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null) {
					System.out.println(temp.lname + "\t"+ temp.loanmoney);
					System.out.println("1)����ޱ�  2)�ڷΰ���");
					int ch = Day08_5.scanner.nextInt();
					if(ch == 1) {
						System.out.println("�˸�)) ���� �������� �̵��մϴ�.");
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
	
}
