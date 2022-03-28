package Day19;

import java.util.*;

public class Day19_1 {
	
	public static void main(String[] args) {
		
		// �÷���( ���� ) �����ӿ�ũ ( API [ �̸� ������� Ŭ����] )
			// * �迭�� ������ ���� ���
			// 1. List �÷���
				// * �ε��� ( ��������� ���� )�� ���� 
				// 1. ArrayList Ŭ����	: �̱۽�����[ ������ �߰�/ ���� : ���� ���� ]
				// 2. Vector Ŭ����		: ��Ƽ������ [ ����ȭ ���� == ��� ���� ] 
				// 3. LinkendList Ŭ����	: �߰� ����/ ���� 
			// 2. Set �÷���
				// * �ε��� X ( ��������� ���� ������ �ڵ����� ��ü�� �ߺ� �Ұ��� )
				// 1. Hashset Ŭ����
					// 1. .add( ��ü�� ) : set ��ü�� ��ü ( ��� ) �߰�
					// 2. size() : set��ü�� ��ü ( ��� ) ����
					// 3. .iterator : set ��ü ��ȸ �޼ҵ�
						// * Iterator < ���׸� > �������̽��� : �������� ��ü ��ȸ �������̽� 
						// * Iterator < ���׸� > interator = set.iterator();
						//		1. iterator.hashnext() : ���� ��ü ���� ���� Ȯ��
						// 		2. iterator.next() : ���� ��� ��������
						// or
						// for( �ӽð�ü�� : set��ü�� ) { }
					// 4. .remove ( ��ü�� ) : set ��ü�� �ش� ��� ����
					// 5. .cleara(); : �ش� 
			// 3. Map
		 //��
		// p. 737
		
		HashSet<String> set = new HashSet<String>();
		// 1. HashSet : �÷��� ������ ��ũ Ŭ����
			// 2. < ���׸� > : Set Ŭ���� �ȿ� ���� �ڷ���
				// 3. set : Ĵü�� ( �ƹ��ų� ) 
					// 4. new : ��ü ������ �޸� �Ҵ� 
						// 5. HashSet< �������� > () : ������
		
		
		// 2. set ��ü�� ��ü �ֱ� [ set��ü��.add ( ��ü�� ) ;
		set.add("Java");System.out.println("Ȯ�� : " + set);
		set.add("JDBC");System.out.println("Ȯ�� : " + set);
		set.add("Servlet/JSP");System.out.println("Ȯ�� : " + set);
		set.add("iBATIS");System.out.println("Ȯ�� : " + set);
		// ��ü �ߺ� �Ұ���
		set.add("Java");System.out.println("Ȯ�� ( �ߺ� �Ұ��� ) : " + set);
		
		
		// 3. set��ü�� ��ü �� [ set��ü��.size(); ]
		int size = set.size();System.out.println("[Iterator]�� ��ü�� : " + size);
		
		// 4. Iterator : ����� ��ü�� �ѹ��� �������� �ݺ��� ���� ( ��ȸ )
			// * set �÷��ǿ��� ���Ǵ� ���� : �ε����� ���� ������ ȣ���ϴ� ����� ���� [ get�� ���� ]
		Iterator<String> iterator = set.iterator(); // set��ü�� interator() :  ��ȸ
		while(iterator.hasNext()) { // .hasNext() ���� ��� ���� ���� Ȯ�� = ���� ��Ұ� �����ϸ� true ������ false
			String element = iterator.next();	// .next() ���� ��� ��������
			System.out.println("\t" + element);
		}
		
		size = set.size();System.out.println("[for]�� ��ü�� : " + size);
		// * for ���� �÷����� Ȱ��
			// for ( �ӽ� ��ü�� : �÷��� / �迭 ){ }  : �ӽ� ��ü���� �᷺��/ �迭 �� ��ҵ��� �ѹ��� �������� �ݺ��� 
		for(String temp : set) {
			System.out.println("\t" + temp);
		}
		
		set.remove("JDBC");
		System.out.println("Ȯ�� : " + set);
		set.remove("iBATIS");
		System.out.println("Ȯ�� : " + set);
		
		System.out.println("�� ��ü�� : " + size);
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("�������");
		}
	}
}
