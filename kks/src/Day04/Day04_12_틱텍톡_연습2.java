package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_12_ƽ����_����2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] gamePad = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		String win = "";
		
		while(true) {
			for(int i = 0; i < gamePad.length; i++) {
				System.out.print(gamePad[i]);
				if(i%3 == 2) {
					System.out.println();
				}
			}
			while(true) {
				System.out.println(" ��ġ���� ");
				int point = scanner.nextInt();
				if (gamePad[point].equals("[ ]")) {
					gamePad[point] = "[O]";
					break;
				}
				else {
					System.out.println("�̹� ��ġ�� ���� �����մϴ�.");
				}
			}
			while(true) {
				Random random = new Random(); // 1. ���� ��ü ���� 
				int ��ġ = random.nextInt(9); // 2. 0~8 ������ ���� int������ �������� 
				if( gamePad[��ġ].equals("[ ]") ) { // 3. �ش� ������ġ�� �����̸� 
					// ���� ��ġ�� �����̸� X �� �α� 
					gamePad[��ġ]="[X]"; break;	 // 4. ���� �ξ����� �ݺ��� Ż��
				}
			}
			
		}//ù��° while ��
		

		
	}//m e
}//c e
