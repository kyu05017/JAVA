package Day06;

import java.util.Scanner;

public class Day06_6 {//c s
	
	
	//�Խ��� [ Ŭ���� ���� ]
		// 0. �Խù� ���� => Ŭ���� ����
			// �ʵ� : ����, ����, �ۼ���, ��й�ȣ
			// ������ : ������� ����
	
		// 1. ùȭ�� [ ��� �Խù� ���(��ȣ, ����, �ۼ���)]
	
		// 2. �޴� [ 1.�۾��� 2.�ۺ���]
			// 1. �۾��� [ ����, ����, �ۼ���, ��й�ȣ] => 4�� ���� => ��üȭ
			// 2. �ۺ��� [ �ش� �۹�ȣ��
				// �۹�ȣ�� �迭�� ����Ǵ� ����
				// �ۺ��� �޴�
	
		// 3. �ۺ��� �޴� 
			// 1. �ڷΰ���(��Ϻ���)
			// 2. ����
				//��й�ȣ �Է¹޾� �����ϸ� ����
			// 3. ����
				//��й�ȣ �Է¹޾� �����ϸ� ����
	
	public static void main(String[] args) {//m s
		
		//�غ� [ ��� {} �ȿ��� ���Ǵ� ���� ���� ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
/////////////////////////////////////////////////////////////////		
		while(true) {//w1 s [ ���ѷ��� �������� ���� ]
			System.out.println("-----------------Ŀ�´�Ƽ----------------");
			System.out.println("��ȣ\t�ۼ���\t����");
				//�迭�� �ӵ� ��ü�� ��� �ݺ���
			int index = 0;//�ε��� �߰� [ �ݺ����� : �迭�� ��ü �� üũ ]
			for(Board board : boardlist) {
				if( board != null) { // ���࿡ �ش� board ��ü�� ���빰�� ������ ���
					System.out.printf("%d\t%s\t%s \n" , (index) , board.writer , board.title);
				}
				index++;// �ε��� ����
			}
			System.out.println("(1)�۾��� (2)�ۺ��� (3)����");
			System.out.println("--------------------------------------");
			int ch = scanner.nextInt();
			
			if(ch==1) { // ch1 s
				System.out.println("-----------------�۾���----------------");
				// 4�� ������ �Է¹޴´�
				System.out.println("���� :"); String title =scanner.next();
				System.out.println("���� :"); String content = scanner.next();
				System.out.println("�ۼ��� :"); String writer = scanner.next();
				System.out.println("��й�ȣ :"); String password = scanner.next();
				// 2. 4�� ������ ��üȭ [ ��ü�� ���� 4�� ������ ��ü�� �ʵ�[ ����
				Board board = new Board( title , content , writer , password ); // 4�� �ʵ带 ���� ������ ���
				// 3. �迭�� ������� ã�Ƽ� ������� ��ü ����
				int i = 0;
				for( Board temp : boardlist ) {
					if( temp == null ) { // ����� ã������ 
						boardlist[i] = board; // �ش� �ε����� ���ο� ��ü ���� 
						break; // �ѹ� ���������� �ݺ��� ���� 
					}
					i++;
				}
				////////////
				
			}//ch1 e
			else if(ch == 2) { // ch2 s
				System.out.println("------------------�ۺ���-----------------");
				System.out.println("�Խù� ��ȣ ����");int bno = scanner.nextInt();
					//�迭�� �ӵ� ��ü�� ��� �ݺ���			//���� �ε��� ��ȣ 
				// �ݺ��� ��� ���� ���� => �����[�ε���] ��ġ�� �Է¹޾ұ� ������
				// �Է¹��� �ε��� ��ġ�� ���
				System.out.printf("�ۼ���: %s  ����: %s\n",boardlist[bno].writer,boardlist[bno].title);
				System.out.printf("���� : %s\n",boardlist[bno].content);
				System.out.println("(1)��Ϻ��� (2)�ۻ��� (3)�ۼ���"); int ch2 = scanner.nextInt();
				System.out.println("--------------------------------------");
				
				if (ch2 == 1) {
					System.out.println("�˸�)) �޴��� ���ư��ϴ�");
				}
				else if (ch2 == 2) {
					System.out.println("------------------�ۻ���-----------------");
					System.out.println("���� ���� �մϴ�.");
					System.out.println("��й�ȣ�� �Է��ϼ���.");
					String password = scanner.next();
					if( boardlist[bno].password.equals(password) ) { // �Խù���ü�� ��й�ȣ == �Է��� ��й�ȣ 
						System.out.println(" �˸�)) ���� ���� ");
						boardlist[bno] = null; // �ش� �Խù��� null ���� // ����ó��
						
						// �����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵� 
							// ��???  ���࿡ �ش� �ڵ尡 ������� �迭�� ���̻��� ���� �߻� 
						for( int i = bno ; i< boardlist.length ; i++ ) {
							// * �˻��� �Խù��� �ε������� �������ε������� 1������ 
							
							if( i == boardlist.length-1) boardlist[ boardlist.length-1 ] = null;
							// i�� �������ε����� ������ �������ε������� null ����
							else boardlist[i] = boardlist[i+1];// ������ �Խù� ���� �Խù�
							// ������ �ε����� �ƴϸ� �ε��� ���� 
							
								// *  	���࿡ 2�� �ε��� ������ 
								// 		2�ε��� = 3�ε��� 
								//	  	3�ε��� = 4�ε��� 
								//		4�ε��� = 5�ε��� 
								//      ~~~~~~~~~~~
								//		98�ε��� = 99�ε��� [ 0��~99�� -> 100�� �ε��� ]
								//		99�ε��� = null [ 99�� �ε��� : �������ε��� ] 
						
						}
						
					}else {
						System.out.println(" �˸�)) ��й�ȣ�� �ٸ��ϴ� [ �������� ]");
					}
					System.out.println("--------------------------------------");
				}
				else if (ch2 == 3) {
					System.out.println("------------------�ۼ���-----------------");
					System.out.println("���� ���� �մϴ�.");
					System.out.println("��й�ȣ�� �Է��ϼ���.");
					String pw2 = scanner.next();
					if (pw2.equals(boardlist[bno].password)) {
						System.out.println("������ ������ �Է��ϼ���");
						boardlist[bno].title = scanner.next();
						System.out.println("������ ������ �Է��ϼ���");
						boardlist[bno].content = scanner.next();
						System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
					}
					else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
					
					System.out.println("--------------------------------------");
					
				}
				else {
					System.out.println("�߸� �Է��Ͽ����ϴ�");
				}
				
			}//ch2 e
			else if(ch == 3) { // ch3 s
				System.out.println("�˸�) �����߽��ϴ�.");
				break;
			}//ch3 e
			else {
				System.out.println("�˸�)) �߸��� �Է�");
			}
		}//w1 e
//////////////////////////////////////////////////////////////		
	}//m e

}//c e
