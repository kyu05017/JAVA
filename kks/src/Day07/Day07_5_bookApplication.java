package Day07;

import java.util.Scanner;

//�뿩���� �ݳ��ϸ� ������Ʈ ����

public class Day07_5_bookApplication {// c s
	
	// bookAplication Ŭ���� : ����� �����ڵ�
			// Book : �������� �ڵ�
			// Member Ŭ���� : ȸ�������ڵ�
			
			// * ���� �뿩 console ���α׷�[Ŭ��������]
				// 1. Ŭ����
					// 1. book
						// 1. �ʵ�  : ISBM[�����ڵ�], ������, �۰�, �����뿩����, �뿩ȸ�� 
						// 2. �޼ҵ� : 1. �����˻� 2. ������� 3.�����뿩 4. �����ݳ�
						// 3. ������ �޼ҵ� : 1.���� ��� 2.��������
					// 2. member	
						// 1. �ʵ� : ȸ����ȣ, ȸ�����̵�, ��й�ȣ,�̸�,����ó
						// 2. �޼ҵ� : ȸ������ , �α���, ���̵�ã�� , ��й�ȣ ã��
						
					
				// 2. ȭ�鼳��
					// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� 4.��й�ȣã��]
					// 2. �Ϲ�ȸ���޴� [ 1.�����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5.�α׾ƿ� ]
					// 3. ������ �޴� [ 1. ������� 2. ������� 3.�������� 4.����(����) 5.�α׾ƿ� ]
	
	// * main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ����
		// �������� : �߰�ȣ {} ������ ����� ������ {} ������ ������
			// ���� �ٸ� �߰�ȣ���� ������ ���� => ��������
		//static : ���α׷� ����� ���� �޸𸮿� �Ҵ�	
			// ���α׷� ���۽� �޸� �Ҵ��� �ǰ� ����� �޸��ʱ�ȭ
			// ���α׷� ���������� ������ ���Ǵ� �޸𸮿� ���
			// �� static�� �������� �ʴ� ���� => ��� �޸𸮰� �Ҵ��� �Ǿ� ���α׷��� ���ſ�����.
	
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];//��� Ŭ�������� ����ϴ� ȸ����� 
	static Book[] books = new Book[1000];
	
	// 0. �ڵ帣 �о��ִ� �޼ҵ�
	public static void main(String[] args) { // m s
		
		//�޼ҵ� ȣ��
			
		// 1. ����ȣ�� �Ұ���
		//menu(); //����ȣ�� �Ұ��� ��� �޼ҵ忡 static �ٿ�����
			//static : �޸� �켱�Ҵ� �̱⶧���� static�� �޼ҵ�, �ʵ带 ������
			//main �޼ҵ�� static �޼ҵ� �̱⶧���� static �޸�常 ����ȣ�� ���� 
		// 2. �ܺ�ȣ��
			// 1. ��ü ���� -> �޼ҵ� ȣ��
			Day07_5_bookApplication appAplication = new Day07_5_bookApplication();
			appAplication.menu();
			
			
		
	}// m e
	
	// 1. �ʱ� �޴� �޼ҵ�
	void menu() {
		Day07_5_bookApplication appAplication = new Day07_5_bookApplication();
		Member member = new Member(); // 1~4������ ����Ϸ���
		while(true) { // �������� [ 5�� ]
			System.out.println("-----------ȸ���� �����뿩 ���α׷�-----------");
			System.out.println("1.ȸ������/ 2.�α���/ 3.���̵�ã��/ 4.��й�ȣã��");
			int ch = scanner.nextInt();
			
			if(ch == 1) {//ȸ����
				boolean result = member.singup();
				if(result == true)System.out.println("�˸�))ȸ������ ����");
				else System.out.println("�˸�)) ȸ������ ����");
			}
			else if(ch == 2) {//�α���
				//�α��θ޼ҵ� ȣ��
					//1. �Ϲ�ȸ�� �޼ҵ�
				String result = member.login();
				
				if( result == null ) { // �α��ν��� 
					System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
				}else if( result.equals("admin")) { // ������
					// 2. ������ �޴� �޼ҵ� ȣ�� 
					System.out.println("�˸�)) �ȳ��ϼ���~ "+result+"��");
					adminmenu(); // ���� �޼ҵ� ȣ��
				}else{ // �Ϲ� 
					// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println("�˸�)) �ȳ��ϼ���~ "+result+"��");
					membermenu(result);
				}
					//2. �����ڸ޴� �޼ҵ�
			}	
			else if(ch == 3) {//���̵� ã��
				member.findid();
			}
			else if(ch == 4) {//��й�ȣã��
				member.findpw();
			}
			else if(ch == 5) {
				System.out.println("�˸�))���� �մϴ�.");
				break;
			}
		}
	}
	
	// 2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu(String loginid) { //�μ��� �������� �ƹ��ų�
		while(true) {
			System.out.println("---------------�����뿩�ý���-----------------");
			System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�");
			int ch= scanner.nextInt();
			Book book = new Book();
			
			if(ch==1) {//�����˻�
				book.bsearch();
			}
			else if(ch==2) {//�������
				book.blist();
			}
			else if (ch ==3) {//�����뿩
				book.brental(loginid);
			}
			else if(ch ==4) {//�����ݳ�
				book.bback(loginid);
			}
			else if(ch==5) {//�α׾ƿ�
				return;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	
	// 3. ������ �޴� �޼ҵ�
	void adminmenu() {
		while(true) {
			System.out.println("--------------- ������ �޴�-----------------");
			System.out.println("1.�����߰� 2.������� 3.�������� 4.�α׾ƿ�");
			int ch= scanner.nextInt();
			Book book = new Book();
			
			if(ch==1) {//�����߰�
				book.badd();
			}
			else if(ch==2) {//�������
				book.blist();
			}
			else if(ch ==3) {//��������
				book.bremove();
			}
			else if(ch==4) {//�α׾ƿ�
				return;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	
}// c e
