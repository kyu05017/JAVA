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
				// �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
			// 3. ����
				// �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
	
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
				if( board != null ) { // ���࿡ �ش� board ��ü�� ���빰�� ������ ���
					System.out.printf("%d\t%s\t%s \n" , index , board.writer , board.title);
				}
				index++;// �ε��� ����
			}
			System.out.println("(1)�۾��� (2)�ۺ���");
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
				
			}//ch2 e
			else if(ch == 3) { // ch3 s
				
			}//ch3 e
			else {
				System.out.println("�˸�)) �߸��� �Է�");
			}
		}//w1 e
//////////////////////////////////////////////////////////////		
	}//m e

}//c e
