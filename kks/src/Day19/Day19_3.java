package Day19;

import java.util.*;

public class Day19_3 {
	
	public static void main(String[] args) {
		
		// 1. Map �÷��� == json
			// * Ű ( ��ü )  , �� ( ��ü ) = ��Ʈ��
			// Ű : Set�÷��� ���		[ �ߺ� �Ұ��� 	]
			// �� : List�÷��� ���		[ �ߺ� ����	]
		// HashMap Ŭ����
			// 1. ��ü��.put ( Ű��ü , ����ü ) : ��Ʈ�� ( Ű = �� ) �߰�
			// 2. ��ü��.size() : ��Ʈ�� ����
			// 3. ��ü��.get ( Ű��ü ) : �ش� ��ü�� ���� ���
			// 4. ��ü��.KeySet() : ��ü�� ��� Ű ȣ�� ����
			// 5. ��ü��.values() : ��ü�� ��� ���� ȣ�� 
				// * Ű ( �ߺ� �Ұ� )�� �˰� ������ ���� �˼� �ִ�.
				// for( �ӽð�ü�� : ��ü��.KeySet() ) { } 
			// 6. ��ü��.remove ( Ű��ü ) : �ش� Ű�� ��Ʈ�� ����
			// 7. ��ü��.clear() : ��� ��Ʈ���� ����
		
		// * List�÷��� : ���� ( �ε��� ) ���� = �迭�� ����
		// * Set�÷���  : �������� ����	= �ߺ� �Ұ��� 
		// * Map�÷���  : Ű(Set)�� ��(List)���� �̷���� ��Ʈ���� ������ ���� [ ������ �������� �ʴ´� ] = 
		
		// 1. HashMap Ŭ������ ��ü ����
		HashMap<String, Integer> map = new HashMap<>();
		// HashMap : �÷��� ������ ��ũ Map Ŭ����
			// 1. < ���׸�, ���׸� > : key , value �� ������ ���׸�
				// 2. map : ��ü�� ( �ƹ��ų� )
					// new : ��ü ������ �޸� �Ҵ�
						// HashMap<>()  ������
		// 2. map ��ü�� �߰�
		map.put("�ſ��", 85);
		System.out.println("Ȯ�� : " + map);
		map.put("ȫ�浿", 90);
		System.out.println("Ȯ�� : " + map);
		map.put("���屺", 80);
		System.out.println("Ȯ�� : " + map);
		map.put("ȫ�浿",95);
		// * Key ���� �ߺ� �Ұ�
		System.out.println("Ȯ�� : " + map);
		map.put("���缮",95);
		// * value ���� �ߺ� ����
		System.out.println("Ȯ�� : " + map);
		// 3. map��ü��.size() : map��ü�� ��Ʈ�� (Ű = ��) ����
		System.out.println("�� ��Ʈ�� ���� : " + map.size());
		// 4. map��ü��.get( Ű ) : map ��ü�� Ű -> �� ȣ��
		System.out.println("��ü�� �� ȣ�� : " + map.get("���缮"));
		// ����Ʈ = [ ��ü, ��ü, ��ü ]
		// ��Ʈ = [ ��ü, ��ü, ��ü ] 
		// �� = { Ű = ��}
		
		// 5. ��� key �� ȣ��
		System.out.println("map �� ��� Ű ȣ�� : " + map.keySet());
		// 6. ��� value �� ȣ��
		System.out.println("map �� ��� �� ȣ�� : " + map.values());
		
		// 7. �ݺ���
			// 1. Iterator 
		System.out.println("Iterator");
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("for");
			// 2. for
		for(String temp : map.keySet()) {
			System.out.println("\t"+temp + " : " + map.get(temp));
		}
		
		System.out.println();
		// 8. ����
		map.remove("ȫ�浿");
		System.out.println("Ȯ�� : " + map);
		System.out.println("�� ��Ʈ�� ���� : " + map.size());
		// 9. ��� ����
		map.clear();
		System.out.println("Ȯ�� : " + map);
		System.out.println("�� ��Ʈ�� ���� : " + map.size());
		
	}
}
