package Day18;

import java.util.List;
import java.util.Vector;

public class Day18_2 {
	// p. 730
	public static void main(String[] args) {
		
		// p. 730
			// list �÷���
				// arraylist
				// vector
				// linkedlist
		
		// arraylsit VS vector [ ����ȭ ���� ] 
		// 	����ȭ x 	    ����ȯ o
		// �̱۽����� 		��Ƽ������
		// 	main 		Thread,runnable
		//
		//
		//Vector Ŭ����
		// 1. Vector ����Ʈ ��ü ����
		Vector<Board> list = new Vector<>();
		// 2. ����Ʈ ��ü�� �߰�
			// 1. ����Ʈ�� ��ü �ٷ� �߰� new : ��ü �޸� �Ҵ�
		list.add(new Board("����1", "����1", "�۾���1"));
			// 2. ��ü ������ ����Ʈ�� ��ü �߰�
		Board board = new Board("����2", "����2", "�۾���2");
		list.add(board);
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		System.out.println("Ȯ�� : " + list);
		
		// 1. �˻�
		System.out.println("��ü �˻� : " + list.contains(board));
		System.out.println("��ü �˻� ��ġ : " + list.indexOf(board));
		
		// 2. ����
		list.remove(2);
		System.out.println("2�� �ε��� ���� �� : " + list);
		list.remove(2);
		System.out.println("2�� �ε��� ���� �� : " + list);
		System.out.println("----------------------------------------");
		System.out.println("����  ����  �ۼ���");
		// 3. �ݺ����� �̿��� ���ù����
		for(Board temp : list) {
			System.out.println(temp.subject+" "+temp.contents+" "+temp.writer);
		}
		System.out.println("----------------------------------------");
		for(int i = 0; i < list.size(); i++) {
			Board board2 = list.get(i);
			System.out.println(board2.subject+" "+board2.contents+" "+board2.writer);
		}
	}
}
