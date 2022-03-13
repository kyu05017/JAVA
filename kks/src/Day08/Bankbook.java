package Day08;


public class Bankbook {
	
	//�ʵ�
	int banknum; // ���¹�ȣ
	int nowmoney;
	private String bankpw;
	String username;
	int loanm;



	//������
	public Bankbook() {
		
	}
	
	public Bankbook(int nowmoney) {
		this.nowmoney = nowmoney;
	}

	public Bankbook(int banknum, int nowmoney, String bankpw, String username,int loanm) {
		this.banknum = banknum;
		this.nowmoney = nowmoney;
		this.bankpw = bankpw;
		this.username = username;

	}
	//�޼ҵ�
/////////////////////////////////////////////////////////////////////////////////////////////
	boolean bankregistration(String x) {//���»���
		System.out.println("���°���) ");
		System.out.print("����� ���¹�ȣ �Է� : \n");int banknum = Day08_5.scanner.nextInt();
		try {
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.banknum == banknum) {
					System.out.println("�˸�)) ���� ������� ���¹�ȣ�Դϴ�.");
					return false;
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
			return false;
		}
		System.out.print("����� ��ι�ȣ �Է� : \n");String pw = Day08_5.scanner.next();
	
		Bankbook bankbook = new Bankbook(banknum,0, pw,x,0);
		try {
			int i = 0;
				for(Bankbook temp2 : Day08_5.bankbooks) {
					if(temp2 == null) {
						Day08_5.bankbooks[i] = bankbook;
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
	/*
	for(Bankbook temp : Day08_5.bankbooks) {
		if(!(temp == null) && !(temp.banknum == banknum)) {
			System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
			return;
		}
	}
	*/
/////////////////////////////////////////////////////////////////////////////////////////////
	public void inmoney(String x) {//�Ա�
		System.out.print("���¹�ȣ  �Է� 	: \n");int banknum =Day08_5.scanner.nextInt();
		System.out.print("���� ��й�ȣ �Է� : \n");String pw =Day08_5.scanner.next();
		System.out.print("�Ա��� �ݾ��Է� 	: \n");int money =Day08_5.scanner.nextInt();
		boolean pass = false;
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null &&temp.banknum == banknum && temp.bankpw.equals(pw) && temp.username.equals(x)) {
					System.out.println("�˸�)) "+money + "���� ���·� �Ա� �Ǿ����ϴ�");
					Day08_5.bankbooks[i].nowmoney += money;
					pass = true;
					return;
				}
				else {
					
				}
				i++;
			}
		}
		catch (NullPointerException e) {
			System.out.println("�˸�)) �߸��� �����Դϴ�.");
		}
		if(pass == false)System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	void outmoney(String x) {//���
		System.out.print("���¹�ȣ  �Է� 	: \n");int banknum =Day08_5.scanner.nextInt();
		System.out.print("���� ��й�ȣ �Է� : \n");String pw =Day08_5.scanner.next();
		System.out.print("����� �ݾ��Է� 	: \n");int money =Day08_5.scanner.nextInt();
		boolean pass = false;
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null &&temp.banknum == banknum && temp.bankpw.equals(pw) && temp.username.equals(x)) {
					if(money > temp.nowmoney) {
						System.out.println("�˸�)) �ܾ��� �����մϴ�.");
						pass = true;
						return;
					}
					else {
						System.out.println("�˸�)) "+money + "���� ���¿��� ��� �Ǿ����ϴ�");
						Day08_5.bankbooks[i].nowmoney -= money;
						pass = true;
						return;
					}
					
				}
				i++;
			}
		}
		catch (NullPointerException e) {
			System.out.println("�˸�)) �߸��� �����Դϴ�.");
		}
		if(pass == false)System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
/////////////////////////////////////////////////////////////////////////////////////////////
	void bankbooklsit(String x) {//���� ���
		System.out.println("���� ���))");
		System.out.print("���¹�ȣ\t�����ܾ�\t��������ݾ�\n");
		try {
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.username.equals(x)) {
					System.out.println(temp.banknum + "\t"+ temp.nowmoney+"\t"+temp.loanm);
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////
	void sendmoney(String x) { 
		System.out.println("��ü))");
		System.out.print("���¹�ȣ\t�����ܾ�\t��������ݾ�\n");
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp != null && temp.username.equals(x)) {
				System.out.println(temp.banknum + "\t"+ temp.nowmoney+"\t"+temp.loanm);
			}
		}
		System.out.print("���� ��ȣ �Է� 	: "); int bname = Day08_5.scanner.nextInt();
		System.out.print("���� ��й�ȣ �Է� 	: "); String pw = Day08_5.scanner.next();
		boolean pass = false;
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp.banknum == bname && temp.bankpw.equals(pw)) {
					System.out.print("�����Ǻ� ���¹�ȣ  : "); int bnum = Day08_5.scanner.nextInt();
					int j = 0;
					for(Bankbook temp2 : Day08_5.bankbooks) {
						if(temp2 != null && temp2.banknum == bnum) {
							System.out.print("��ü�� �ݾ��� �Է��ϼ���. : ");
							int money = Day08_5.scanner.nextInt();
							if(temp.nowmoney < money) {
								System.out.println("�˸�)) �ܾ��� �����Ͽ� ��ü�� �����߽��ϴ�.");
							}
							else {
								Day08_5.bankbooks[j].nowmoney += money;
								Day08_5.bankbooks[i].nowmoney -= money;
								System.out.println("���¹�ȣ "+bnum+"�� "+money+"���� ��ü �߽��ϴ�.");
								pass = true;
								return;
							}
						}
						j++;
					}
				}
				i++;
			}
		}
		catch(NullPointerException e) {
			return;
		}
		if(pass == false)System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
	//////////////////////////////////////////////
	void findbankpw(String x) {
		System.out.println("��й�ȣ ã��))");
		System.out.print("���¹�ȣ 	: \n"); int bnum = Day08_5.scanner.nextInt();
		System.out.print("����ó 		: \n"); String phone = Day08_5.scanner.next();
		boolean pwcheck = false;
		try {
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.banknum == bnum && temp.username.equals(x)) {
					for(Member temp2 : Day08_5.members) {
						if(temp2 != null && temp2.phone.equals(phone)) {
							System.out.println("ȸ�����ǰ��� ��й�ȣ�� "+ temp.bankpw+ "�Դϴ�");
							System.out.println("1)���� 2)�ڷΰ���");
							int ch = Day08_5.scanner.nextInt();
							if(ch==1) {
								System.out.println("��й��θ� �����մϴ�.");
								System.out.print("���ο� ��й�ȣ�� �Է��ϼ���. :");
								String npw = Day08_5.scanner.next();		
								try {
									int i = 0;
									for(Bankbook temp3 : Day08_5.bankbooks) {
										if(temp3 != null && temp3.username.equals(x) && temp3.banknum==bnum) {
											Day08_5.bankbooks[i].bankpw = npw;
											System.out.println("��й�ȣ ������ �Ϸ� �Ǿ����ϴ�");
										}
										i++;
									}
								}
								catch(NullPointerException e) {
									System.out.println("�˸�)) �߸��� �����Դϴ�.");
								}
								pwcheck = true;
							}
							else if(ch==2) {
								System.out.println("�˸�)) �������� ���ư��ϴ�.");
								pwcheck = true;
								return;
							}
							
						}
					}
				}
			}
		}
		catch (NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
			return;
		}
		if(pwcheck == false)System.out.println("�˸�)) �������� �ʴ� ȸ���Դϴ�.");
	}
}
