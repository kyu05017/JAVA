package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day18_3 {
	
	public static void main(String[] args) {
	
		// p. 731
			// LinkedList Ŭ����
		
		// 			ArrayList	 VS		 LinkedList 
		// 			   �迭                   ��ũ
		//���α�������   �ε��� ���� �޸𸮿���     ���δٸ� �޸� �ּ� ����
		//   �ӵ�    
		//add[ �߰� ]    ����                  
		//add[ ���� = �߰�]                       ����
		// �˻� 			����						
		// ���� 									����
		
		
		// p. 732
		
		// 1. ��� ����Ʈ ��ü ���� [ ���׸� : ���ڿ� ]
		ArrayList<String> list1 = new ArrayList<>();
		// 2. ��ũ�� ����Ʈ ��ü ���� [ ���׸� : ���ڿ� ]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. �ð� ����
		long statTime;
		long endTime;
		
		// ArrayList 10000���� ��ü�� �����ϴµ� �ɸ��� �ð� üũ
		statTime = System.nanoTime();
		for(int i = 0 ; i < 10000; i++) {
		//	list1.add(0, i+""); �������� ���ڿ��� ��ȯ 
			list1.add(0,String.valueOf(i)); // �������� ���ڿ��� ��ȯ 
			// ���ڿ��� ������ �ٲٴ� ��
			// Integer.ParseInt(���ڿ�);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð� : "+ (endTime - statTime) + "ns");
		
		// LinkedList 10000���� ��ü�� �����ϴµ� �ɸ��� �ð� üũ
		statTime = System.nanoTime();
		for(int i = 0 ; i < 10000; i++) {
			//	list2.add(0, i+""); �������� ���ڿ��� ��ȯ 
				list2.add(0,String.valueOf(i)); // �������� ���ڿ��� ��ȯ 
				// ���ڿ��� ������ �ٲٴ� ��
				// Integer.ParseInt(���ڿ�);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð� : "+ (endTime - statTime) + "ns");
	}
}
