package Day11;

public class Day11_1 {
	// p.386
		// 1) 3
			// �������̽��� �ν��Ͻ��ʵ带 ����������
			// �������̽��� �ɹ� [ 1.����ʵ� 2.�߻�޼ҵ� 3.����Ʈ�޼ҵ� 4.�����޼ҵ� ]
		// 2) 4 [ �������̽� ���� = ������ü ]
			// ������ü = Ŭ������ implemants �� ��ü
		
		// 3) 
	private static void printsound( Soundable soundable) {
	//���������� ����   ��ȯŸ�� �޼ҵ��   (�μ� [ ����, �迭,��ü,�������̽� ] )
		System.out.println(soundable.sound());
	}
	public static void dbWork(DateAccesseObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		
		// 3)
		printsound(new Cat());
		printsound(new Dag());
		
		Soundable soundable = new Dag();
		Soundable[] soundables = new Dag[100];
		
		// 4)
			// Dao : DB���� ��ü		Dto : �������� �̵���ü
		dbWork(new Oracle());
		dbWork(new MysqlDao());
			
		
		// 5) �͸�ü [ �������̽��� �������� ]
			// ������ü : �������̽��� ��ü�� = new Ŭ������();
			// �͸�ü : �������̽��� ��ü�� = new �������̽�() { �����ϱ� };
		Action action = new Action() { // 1ȸ��
			
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};// ������
		action.work();
	}
}
