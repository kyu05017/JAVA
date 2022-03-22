package �����_��ũ_�ý���;


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
		System.out.print("���� ��ǰ�̸� �Է� : \n"); String lname = Day08_5.scanner.next();
		System.out.print("���� �ݾ� �Է� : \n"); int loan = Day08_5.scanner.nextInt();
		
		// * �ߺ�üũ
		for(Loan temp : Day08_5.loanlist) {
			if(temp!=null && temp.lname.equals(lname)) {
				System.out.println("�˸�)) ���� ������� ���� ��ǰ�Դϴ�.[��Ͻ���]");
				return; // �����ǰ��� �޼ҵ� ���� (��Ͻ���)
			}
		}
		
		// 2. ��üȭ [ �����뿩���� = true, �뿩ȸ��id = null ]
		Loan newloan = new Loan(lname, loan, " ", false);
		
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
		System.out.println("��ǰ�̸�\t����ݾ�\t������\t������");
		try {
			for(Loan temp : Day08_5.loanlist) {
				if(temp!=null) {
					System.out.println(temp.lname+"\t"+temp.loanmoney+"\t"+(interest*100)+"%"+temp.lid);
				}
			} // for end
			
			//System.out.println("������� ��ǰ�� �Է� : "); String lname = Day08_5.scanner.next();
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
			
		} // try end
		catch(NullPointerException e) {}
	}
/////////////////////////////////////////////////////////////////////////////	
	void removeloan(String x) {
		System.out.println("----------------���� ��ǰ ���� ������------------------");
		System.out.print("������ ���� ��ǰ�̸� �Է� : \n"); 
		for(Loan temp : Day08_5.loanlist) {
			if(temp!=null) {
				System.out.println(temp.lname+"\t"+temp.loanmoney+"\t"+(interest*100)+"%"+temp.lid);
			}
		}
		String lname = Day08_5.scanner.next();	
		int a =0;
		for(Loan temp : Day08_5.loanlist) {
			if(temp!=null && !temp.lname.equals(lname)) {
				
			}
			else if(temp!=null && temp.lname.equals(lname)) {
				System.out.println("�˻� ��� : ");
				System.out.println("��ǰ�̸�\t����ݾ�\t������");
				System.out.println(temp.lname+"\t"+temp.loanmoney+"\t"+(interest*100)+"%");
				System.out.println("1.���� 2.���"); int ch = Day08_5.scanner.nextInt();
				
				if(ch==1) {
					System.out.println("�˸�)) �ش� ��ǰ�� �����Ǿ����ϴ�.");
					Day08_5.loanlist[a]=null;
					int j = 0;	
					for(Loan temp2 : Day08_5.loanlist) {
						if(temp2==null) {
							for(int i=j; i<Day08_5.loanlist.length; i++) {
								if(i==Day08_5.loanlist.length-1) {
									Day08_5.loanlist[Day08_5.loanlist.length-1] = null;
								}
								else {
									Day08_5.loanlist[i]=Day08_5.loanlist[i+1];
								}
							}
						}
						j++;	
					} // for end
					return;
				} // if end
				else if(ch==2) {
					System.out.println("�˸�)) ������ �޴��� ���ư��ϴ�.");
					return;
				}
				else System.out.println("�˸�)) �� �� ���� �Է��Դϴ�.");
					return;
			}
			a++;
		} // for end
		System.out.println("�˸�)) ��ġ�ϴ� ���� ��ǰ�� �����ϴ�.");
	}
///////////////////////////////////////////////////////////////////////////////////	
	void myloan(String x) {
		System.out.println("���������ǰ ��� ���))");
		System.out.print("�����ǰ\t�����ܾ�\t\n");
		try {
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null &&temp.lid.equals(x)) {
					System.out.println(temp.lname + "\t"+ (temp.loanmoney+(temp.loanmoney*interest)));
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
		for(Loan temp : Day08_5.loanlist) {
			if(temp!=null && x.equals(temp.lid)) {
				System.out.println(temp.lname+"\t"+temp.loanmoney+"\t"+(interest*100)+"%\t"+temp.lid);
			}
		}
		System.out.print("��ȯ�� �����ǰ�� �̸��� �Է��ϼ��� : \n");
		String out = Day08_5.scanner.next();
		try {
			int j = 0;
			for(Loan temp : Day08_5.loanlist) {
				
				if(temp!=null && !temp.lname.equals(out)) {}
				else if(temp != null && temp.lname.equals(out)) {
					Bankbook bankbook = new Bankbook(loanmoney);
					System.out.print("����� ���¹�ȣ�� �Է��ϼ���.  : \n");
					int bnum = Day08_5.scanner.nextInt();
					int i = 0;
					for(Bankbook temp2 : Day08_5.bankbooks) {
						if(temp2 != null && temp2.nowmoney < (temp.loanmoney+(temp.loanmoney*interest))) {
							System.out.println("�˸�)) �ܾ��� �����Ͽ� ��ȯ�ϽǼ� �����ϴ�.");
							return;
						}
						else if(temp2 != null && temp2.username.equals(x) && temp2.banknum == bnum) {
							System.out.println(temp.lname+" ��ǰ�� ��ȯ �մϴ�.");
							System.out.println("��ȯ �ݾ��� "+ (temp.loanmoney+(temp.loanmoney*interest)) + "�� �Դϴ�.");
							Day08_5.bankbooks[i].nowmoney -= (temp.loanmoney+(temp.loanmoney*interest));
							Day08_5.bankbooks[i].loanm =0;
							Day08_5.loanlist[j].lid = " ";
							System.out.println("�˸�)) ��ȯ�� �Ϸ�Ǿ����ϴ�. �̿����ּż� �����մϴ�.");
							return;
						}
						i++;
					}
				} 
				
				j++;
			}
			System.out.println("�˸�)) �������� �ʴ� ��ǰ�Դϴ�.");
		}
		catch(NullPointerException e) {
		
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	void inloan(String x) {
		System.out.println("����ޱ�)) ");
		System.out.print("������ �����ǰ�� �̸��� �Է��ϼ��� : \n");
		String ln = Day08_5.scanner.next();
		try {
			int j = 0;
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null && temp.lname.equals(ln)) {
					Bankbook bankbook = new Bankbook(loanmoney);
					System.out.print("������ ���¹�ȣ�� �Է��ϼ���.  : \n");
					int bnum = Day08_5.scanner.nextInt();
					int i = 0;
					for(Bankbook temp2 : Day08_5.bankbooks) {
						if(temp2 != null && temp2.username.equals(x)&&temp2.banknum == bnum) {
							System.out.println(temp.lname+" ��ǰ��  ����޾ҽ��ϴ�.");
							Day08_5.bankbooks[i].nowmoney += temp.loanmoney;
							Day08_5.bankbooks[i].loanm += (temp.loanmoney+(temp.loanmoney*interest));
							Day08_5.loanlist[j].lid = x;
							return;
						}
						i++;
					}
				}
				
				j++;
			}
			System.out.println("�˸�)) �������� �ʴ� ��ǰ�Դϴ�.");
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� �����Դϴ�.");
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////
}
