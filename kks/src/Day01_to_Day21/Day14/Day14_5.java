package Day01_to_Day21.Day14;

public class Day14_5 {
	
	public static void main(String[] args) {
		
		// �� : ������ �Ҹ�, ����� �Ҹ� , ȣ���� �Ҹ�
			// 1. Thread Ŭ���� ���� extends
				// @overide - > ������
			// 2. Runnable �������̽� ���� implements
				// @override -> ����
		
		//main �����尡 ���� ������ ������ ȣ���Ѵ�
		// Thread Ŭ������ ���� ��ӹ��� �ڽ� Ŭ������ ��ü ����
		
		DogSound dogSound = new DogSound();
			// �ڽ� Ŭ������ ��üȣ �θ�Ŭ������ �޼ҵ� ����
		CatSound catSound = new CatSound();
			//
		TigerSound tigersound = new TigerSound();
		
		dogSound.start();// �� �޼ҵ� ȣ�� [ ��Ƽ ������ ���� ] 
		catSound.start();
		tigersound.start();

	}
	
}
