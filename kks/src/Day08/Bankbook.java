package Day08;

public class Bankbook {
	
	//�ʵ�
	private int banknum; // ���¹�ȣ
	private int nowmoney;
	private String bankpw;
	private String username;



	//������
	public Bankbook() {
		
	}

	public Bankbook(int banknum, int nowmoney, String bankpw) {
		this.banknum = banknum;
		this.nowmoney = nowmoney;
		this.bankpw = bankpw;

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
	
		Bankbook bankbook = new Bankbook(banknum,0, pw);
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
/////////////////////////////////////////////////////////////////////////////////////////////
	public void inmoney() {//�Ա�
		System.out.print("���¹�ȣ  �Է� 	: \n");int banknum =Day08_5.scanner.nextInt();
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp != null && temp.banknum != banknum) {
				System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
				return;
			}
		}
		System.out.print("���� ��й�ȣ �Է� : \n");String pw =Day08_5.scanner.next();
		System.out.print("�Ա��� �ݾ��Է� 	: \n");int money =Day08_5.scanner.nextInt();
		
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null &&temp.banknum == banknum && temp.bankpw.equals(pw)) {
					System.out.println("�˸�)) "+money + "���� ���·� �Ա� �Ǿ����ϴ�");
					Day08_5.bankbooks[i].nowmoney += money;
					return;
				}
				i++;
			}
		}
		catch (NullPointerException e) {
			System.out.println("�˸�)) �߸��� �����Դϴ�.");
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	void outmoney() {//���
		System.out.print("���¹�ȣ  �Է� 	: \n");int banknum =Day08_5.scanner.nextInt();
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp != null && temp.banknum != banknum) {
				System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
				return;
			}
		}
		System.out.print("���� ��й�ȣ �Է� : \n");String pw =Day08_5.scanner.next();
		System.out.print("�Ա��� �ݾ��Է� 	: \n");int money =Day08_5.scanner.nextInt();
		
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null &&temp.banknum == banknum && temp.bankpw.equals(pw)) {
					if(money > temp.nowmoney) {
						System.out.println("�˸�)) �ܾ��� �����մϴ�.");
						return;
					}
					else {
						System.out.println("�˸�)) "+money + "���� ���¿��� ��� �Ǿ����ϴ�");
						Day08_5.bankbooks[i].nowmoney -= money;
						return;
					}
					
				}
				i++;
			}
		}
		catch (NullPointerException e) {
			System.out.println("�˸�)) �߸��� �����Դϴ�.");
		}
	}


/////////////////////////////////////////////////////////////////////////////////////////////
	void bankbooklsit(String x) {//���� ���
		System.out.println("���� ���))");
		System.out.print("���¹�ȣ\t�����ܾ�\t\n");
		try {
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null) {
					System.out.println(temp.banknum + "\t"+ temp.nowmoney);
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////
	void sendmoney() { 
		System.out.println("��ü))");
		System.out.print("���� ��ȣ �Է� 	: "); int bname = Day08_5.scanner.nextInt();
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp != null && temp.banknum != banknum) {
				System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
				return;
			}
		}
		System.out.print("���� ��й�ȣ �Է� 	: "); String pw = Day08_5.scanner.next();
		//
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.bankpw.equals(pw) && temp.banknum == bname) {
					System.out.print("�����Ǻ� ���¹�ȣ  : "); int bnum = Day08_5.scanner.nextInt();
					try {
						for(Bankbook temp2 : Day08_5.bankbooks) {
							if(temp2 != null && temp2.banknum != banknum) {
								System.out.println("�˸�)) �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
								return;
							}
						}
						int j = 0;
						for(Bankbook temp2 : Day08_5.bankbooks) {
							if(temp2 != null && temp2.banknum == bnum) {
								System.out.print("��ü�� �ݾ��� �Է��ϼ���. : ");int money = Day08_5.scanner.nextInt();
								Day08_5.bankbooks[j].nowmoney += money;
								Day08_5.bankbooks[i].nowmoney -= money;
								return;
							}
							j++;
						}
					}
					catch(NullPointerException e) {
						System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
					}
				}
				else {
					System.out.println("�˸�) �߸��� �����Դϴ�.");
				}
				i++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("�˸�)) �߸��� ���� �Դϴ�.");
		}
		
	}
	//////////////////////////////////////////////
	void findbankpw() {
		System.out.println("��й�ȣ))");
		System.out.print("���¹�ȣ 	: \n"); int banknum = Day08_5.scanner.nextInt();
		System.out.print("����ó 		: \n"); String phone = Day08_5.scanner.next();
		boolean pwcheck = false;
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp!=null && temp.banknum==banknum) {
				for( Member temp2 : Day08_5.members) {
					if(temp2!=null && temp2.phone.equals(phone)) {
						System.out.println("�˸�)) ȸ������ ��й�ȣ : "+temp.bankpw);
						pwcheck = true;
						return;
					} // if end
				} // for end
				
			} // if end
			
		} // for end
		if(pwcheck == false)System.out.println("�˸�)) �������� �ʴ� ȸ���Դϴ�.");
	}
	///////////////////////////////////////////////////////////////////////////////
}
