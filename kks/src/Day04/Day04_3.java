package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {//c s

	public static void main(String[] args) {//m s
		// ���� ����������
		//1.����ڿ��� ����[0]����[1]��[2]�� �Է¹޴´�.
		//2.��ǻ�ʹ� ������ �߻� [0~2]
		//3.����ڿ� ��ǻ���� ������ �Ǵ�
		//4.3�� �����ϱ� ������ ���� ����
		//5.3�� ���ý� 
			//1.�Ѱ��Ӽ�
			//2.�����¸�
		
		//�غ�
		int player;		//����ڰ� ������ �� ����
		int computer;	//��ǻ�Ͱ� ������ ������ �� ����
		int game = 0;		//�� �������� ���� Ƚ�� ����
		int playerWin = 0; int computerWin = 0;	// ������ �¸���
		int same = 0;
		//�Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		while(true) {// ���α׷� ���� [ ���� ���� : 3���� ������ ����(break)]
			System.out.println("---------------��������������---------------");
			System.out.println("[0 ����], [1 ����], [2 ��],[3 ����]");
			System.out.println("���� : ");
			player = scanner.nextInt();// �Է��� ���� ����
			
			Random random = new Random();	// ���� ��ü ����
			computer = random.nextInt(3);	// ������ int������ �����´�
							//random.nextInt(����) => 0~������ ���� ������ ���� �߻�	
								//random.nextInt(10) : 0 ~ 9 ���� ���� �߻�
								//rnadom.nextInt(11) + 10 : 10~20 �� ���� �߻�
	
			
			if(player == computer) {
				System.out.println("�����ϴ�.");
				game+=1;
				same+=1;
			}
			else if((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
				System.out.println("����� �̰���ϴ�");
				System.out.println(" �÷��̾ ���� : " + player);
				System.out.println(" ��ǻ�Ͱ� ���� : " + computer);
				playerWin +=1;
				game+=1;
			}
			else if((computer == 1 && player == 0) || (computer == 0 && player == 2) || (computer == 2 && player == 1)) {
				System.out.println("����� �����ϴ�");
				System.out.println(" �÷��̾ ���� : " + player);
				System.out.println(" ��ǻ�Ͱ� ���� : " + computer);
				computerWin +=1;
				game+=1;
			}

			else if(player == 3) {
				System.out.println("-----����-----");
				System.out.println("�� ���Ӽ� : " + game);
				System.out.println("��� Ƚ��  :" + same);
				System.out.println("����� �¸� :" + playerWin);
				System.out.println("��ǻ�� �¸� :" + computerWin);
				System.out.println("-----�����¸�-----");
				if(playerWin > computerWin) {
					System.out.println("����� �̰���ϴ�.");
				} 
				else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				break;
			}
			else {
				
			}

		}
		
		
	}//s e

}// c e
