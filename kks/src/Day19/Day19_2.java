package Day19;

import java.util.*;

public class Day19_2 {
	
	// set �ߺ� �Ұ���
		// ��ü �� ��� �ʵ尡 �����ϸ� �ߺ� �Ұ�

	public static void main(String[] args) {
		
		// �ζ� ���α׷� 
			// set �÷��� 
		Scanner scanner = new Scanner(System.in);	// 1. �Է°�ü
		
		HashSet<Integer> set = new HashSet<>();		// 2. set�÷��� Hashset Ŭ���� ��ü ����
		
		
		while(true) {	// 3. ���ѷ��� : set��ü�� ��ü���� 6�̸� break
			
			System.out.println("1~45 ��ȣ �Է�( �ߺ��Ұ� ) : ");
			int mynum = scanner.nextInt();	// �Է¹ޱ�
			
			if(mynum < 1 || mynum > 45) { // 4. 1 ~ 45 �� �ƴ϶�� �ٽ� �Է¹ޱ�
				System.out.println("�����Ҽ� ���� ��ȣ");
			}
			else {
				set.add(mynum);	// 5. 1~45 ���̸� set��ü�� ���� 
				System.out.println("Ȯ�� : " + set);
			}
			if(set.size() == 6) {	// 6. ���� set��ü�� ��ü���� 6�̸� ����
				break;
			}
			
		}
		
	}
}
