package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {
	/*
	 * 
	 *�Խ��� + ��� [ ����ó��, ����ó��, ����Ʈ ]
	 * 			//m) �Խù� Ŭ����
	 * 				// �ʵ�
	 * 					// �Խù���ȣ[�ε���] ��й�ȣ ���� ���� �ۼ��� �ۼ��� ��ȸ��
	 * 					// ��۸���Ʈ 
	 * 			//m) ���
	 * 				// ����, �ۼ���, �ۼ���
	 *			//c) ��Ʈ��
	 *				// 1.��� 2.���� 3.���� 4.���� 5.���� 6 ��۾��� 7. ��ۻ���
	 *				// 8 ���� 9 �ҷ����� 10������� 11 �ҷ�����
	 *			//v) Day11_4_BoardApp 
	 *					//����Ʈ
	 *					// �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ����.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {//����ڰ� ���� �Է½� ����ȯ�� �Ұ��� �ؼ� ���ܰ� �߻���!!!!!!!! > catch
				Controller.boardlist(); // ��ü���� �޼ҵ�ȣ�� static �޼ҵ忩��
				System.out.print("1.���� 2.���� ����: \n");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					Controller.writer();
				}
				else if(ch == 2) {

				}
				else {
					
				}
			}
			catch(Exception e) {
			System.err.println("�޼���))���ڸ� �Է°����մϴ�.");
			scanner = new Scanner(System.in); // �ٽ� �޸� �Ҵ�
			}
		}
		
	}
}
