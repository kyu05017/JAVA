package Day08;

import java.util.Random;

import Day08_2.B;
import Day09.Bank;
import Day09.Day09_06;

public class Controler { // ���� ��Ʈ�ѷ�
	
	// �ش� Ŭ������ ������� ��Ʈ�ѷ�
	// V <----> C 
	// M : ��(Modle) [ ������ ]
	// V : ��(View) [ ����� ]
	// C : ��Ʈ��(Create) ��[M]�� ��[V]�� ���� ����
	
	
	//�޼ҵ�
	// �信�� ��û�ϴ� ����[���] ����
		// 1. ���� ���� [ Create ]
	public String resregistration(String pw, String name, int bankcompanynum) {
		// 1. �Է¹��� ���� �����´� [ �μ� ]
			// ���¹�ȣ �ڵ����� 
		String bnum = null;
		while(true) {
			Random random = new Random();
			int ranNo = random.nextInt(10000);// ���� ���� ���� ( %d ���� 
			bnum = String.format("%04d",ranNo);//%4d ���� 4�ڸ� [ ���� �ڸ��� ������ ����ó��]	
													  //%04d ���� 4�ڸ�[ ���� �ڸ��� ������ 0  ó��]
			boolean bncheck = false;
			for(Bank temp : Day09_06.banks) {
				if(temp != null && temp.getBanknum().equals(bnum)) {
					bncheck = true;
				}
			}
			if(bncheck == false)break;
		}
		Bank temp = null;
		if(bankcompanynum == 1) {temp = new Kokmin(bnum, pw, name, 0);}
		else if(bankcompanynum == 2){temp = new Shinhan(bnum, pw, name, 0);}
		else if(bankcompanynum == 3) {temp = new Hana(bnum, pw, name, 0);}
		else {
			return null;
		}
		
		int i = 0;
		for(Bank temp3 : Day09_06.banks) {
			if(temp3 == null) { // �ش� temp�� �����̸� ���鿡 ����.
				Day09_06.banks[i] = temp;
				return bnum;
			}
			i++;
		}
		return null;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2. �Ա� [ Update ]
	public int inmoney(String bnum, int putmoney) {
		int i = 0;
		for(Bank temp2 : Day09_06.banks) {
			// ������ ���¹�ȣ�� ������ �Ա�ó��
			if(temp2 != null && temp2.getBanknum().equals(bnum)) {
				//�ش� �迭�� ������ �ƴϰ� �Է��� �μ��� ������
				Day09_06.banks[i].setMymoney(temp2.getMymoney()+putmoney);
				return 0;
			}
			i++;
			return 2;
		}
		return 1;
	}
		// 3. ��� [ Update ]
	public int outmoney(String bnum, String pw, int putmoney) {
		Bank bank = new Bank();
		
		int i = 0;
		for(Bank temp2 : Day09_06.banks) {
			if(temp2 != null && temp2.getBanknum().equals(bnum) && temp2.getBankpw().equals(pw)) {
				if(putmoney > temp2.getMymoney()) {
					return 3;
				}
				else {
					Day09_06.banks[i].setMymoney(temp2.getMymoney()-putmoney);
					return 0;
				}
			}
			i++;
			if(temp2 != null || !(temp2.getBanknum().equals(bnum)) || !(temp2.getBankpw().equals(pw))){
				return 2;
			}
		}
		return 1;
	}
		// 4. ��ü [ Update ] 
	public int sendmoney(String bknum1, String pw,String bknum2,int sendmoney) {
		int i = 0;
		for(Bank temp : Day09_06.banks) {
			if(temp != null && bknum1.equals(temp.getBanknum()) && pw.equals(temp.getBankpw())) {
				int j = 0;
				for(Bank temp2 : Day09_06.banks) {
					if(temp2 != null && bknum2.equals(temp2.getBanknum())) {
						if(temp.getMymoney() < sendmoney) {
							return 1;
						}
						else {
							Day09_06.banks[i].setMymoney(temp.getMymoney()-sendmoney);
							Day09_06.banks[j].setMymoney(temp2.getMymoney()+sendmoney);
							return 2;
						}
						
					}
					j++;
				}
			}
			i++;
		}
		return 4;
	}
		// 5. �� ���¸�� [ Read ]
	public Bank[] mylist(String name) {
	//�Է¹��� �������� ���¸���� ���� ��ȯ
		
		Bank[] mybanklist = new Bank[100];
		
		for(Bank temp : Day09_06.banks) {
			if(temp != null && name.equals(temp.getName())) {
				// �ش� ���³� �����ֿ� �μ��� �����ֿ� �����ϸ�
				// �� ���¸�� �迭�� ������� ã�Ƽ� �����¸�Ͽ� �ֱ�
				int i = 0;
				for(Bank temp2 : mybanklist) {
					if(temp2 == null) {
						mybanklist[i] = temp;
						break;
					}
					i++;
				}
			}
		}
		return mybanklist;
	}
		// 6. ���� [ Update ]
	public boolean loanmoney() {
		return false;
	}
	
	
	
	
	
	
}