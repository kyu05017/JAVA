package Day08;

public class Day08_4 {
	
	//p. 267 ~ 268 : Setter , Getter �޼ҵ�
		// �ʵ� private �� ���Ǵ� ��찡 ����
		// �ܺο��� �ʵ忡 �����Ҽ� ����.
		// ���� : �ܺο��� �ʵ忡 �������� �����ϰ� �޼ҵ带 ���� �ʵ� ���� [ ���� ���� ] 
		//Setter �޼ҵ� : �ʵ� ������ ����
		//Getter �޼ҵ� : �ʵ� ������ ȣ��
	
	
	
	
	
	public static void main(String[] args) {
		
		// 1. ��üȣ��
		Car myCar = new Car();
		// 2. ��ü �޼ҵ� ȣ�� 
		myCar.setSpeed(-50);
		// 3. ��ü�� �޼ҵ� ȣ��
		System.out.println("����ӵ� :" + myCar.getSpeed());

		
		myCar.setSpeed(60);
		
		System.out.println("����ӵ� :" + myCar.getSpeed());
		
		if(!myCar.isStop()) { //�������°� �ƴϸ�
			// ! ���������� [ true > false ] [ false > true ]
			myCar.setStop(true);
		}
		System.out.println("����ӵ� :" + myCar.getSpeed());
	}

}
