package Day19;

import java.util.TreeSet;

public class Day19_5 {

	public static void main(String[] args) {
		
		// p. 753 : TreeSet Ŭ����
			// 1. �ϳ��� ��ü = ���
			// 2. �� ���� �ִ� 2���� �ڽ� ��带 ������ �ִ�.
			// 3. �θ𺸴� ������ ���� �ڽ� / �θ𺸴� ũ�� ������ �ڽ�
			// 4. Ʈ���������� ���� ���ʿ� �ִ� ���� ���� ������
			//			   ���� �����ʿ� �ִ� ���� ���� ū��
		
		// 1. TreeSet Ŭ������ ��ü ����
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. TreeSet ��ü�� ��ü ( ��� ) �߰� 
		System.out.println("�ڵ� ����");
		scores.add(87);
		System.out.println("Ȯ�� : " + scores);
		scores.add(98);
		System.out.println("Ȯ�� : " + scores);
		scores.add(75);
		System.out.println("Ȯ�� : " + scores);
		scores.add(95);
		System.out.println("Ȯ�� : " + scores);
		scores.add(80);
		System.out.println("Ȯ�� : " + scores);

		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ���� : " + score);
		
		score = scores.last();
		System.out.println("���� ���� ���� : " + score);
		
		score = scores.lower(95);
		System.out.println("���� 95�� �Ʒ� ���� : " + score);
		
		score = scores.higher(95);
		System.out.println("���� 95�� �� ���� : " + score);
		
		score = scores.floor(95);
		System.out.println("���� 95���� ���ų� �ٷ� �Ʒ� ���� : " + score);
		
		score = scores.ceiling(85);
		System.out.println("���� 85���� ���ų� �ٷ� �� ���� : " + score);
		
		// 4. ���� 
		System.out.println(scores.pollFirst()); // ���� ���� ��带 ����
		System.out.println(scores.pollLast()); 	// ���� ������ ��带 ���� 
		System.out.println("Ȯ�� : " + scores);
		
	}
	
}
