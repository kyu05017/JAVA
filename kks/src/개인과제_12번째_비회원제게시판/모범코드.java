package ���ΰ���_12��°_��ȸ�����Խ���;

import java.util.Scanner;

public class ����ڵ� {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[1024];
		
		//
		
		while(true) {
			try {
				System.out.println("Ŀ�´�Ƽ)");
				System.out.println("��ȣ\t�ۼ���\t����");
				
				
				int index = 0;
				for(Board temp : boardlist) {
					if(temp != null) {
						System.out.println("����Ҳ���");
					}
				}
				System.out.println("1)���ۼ� 2)�ۺ��� 3)����");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("�۾���))");
					System.out.println("���� :");
					scanner.next();
					String title = scanner.nextLine();
					System.out.println("���� :");
					String contents = scanner.nextLine();
					System.out.println("ID  :");
					String id = scanner.next();
					System.out.println("PW  : ");
					String pw = scanner.next();
					
					Board board = new Board(title, contents, id, pw);
					
					int i = 0;
					for(Board temp : boardlist) {
						if(temp == null) {
							boardlist[i] = board;
							break;
						}
						i++;
					}
				}
				else if(ch == 2) {
					// �� ������
				}
				else if(ch == 3) {
					System.out.println("���α׷��� ���� �մϴ�.");
					break;
				}
				else {
					System.out.println("�������� �ʴ� �޴� �Դϴ�.");
				}
			}
			catch(Exception e) {
				scanner = new Scanner(System.in);
				System.out.println(e);
			}
			
			
			
		}
		
		
	}
}
