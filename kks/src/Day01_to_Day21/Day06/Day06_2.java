package Day01_to_Day21.Day06;

public class Day06_2 {

	public static void main(String[] args) {
		
		// 1. Ŭ���� ������ -> ��ü ����
		Car myCar = new Car();
			// 1. Car   : Ŭ���� ��
			// 2. myCar : ��ü�̸� [ �ƹ��ų� ]
			// 3. new   : �޸� �Ҵ� ������
			// 4. Car() : ������???????????
		
		// 2. ��ü �� �ʵ带 ȣ��	
		//��ü�̸�.�ɹ��̸�
		System.out.println("����ȸ�� :" + myCar.company);//myCar ��ü�� �ʵ� ����
		System.out.println("�𵨸�  :" + myCar.model);//myCar.model : model �ʵ� ȣ��
		System.out.println("����   :" + myCar.color);//myCar.color : color �ʵ� ȣ��
		System.out.println("�ְ�ӵ�:" + myCar.maxSpeed);//myCar.maxSpeed : maxSpeed ȣ��
		System.out.println("����ӵ�:" + myCar.speed);//myCar.speed : speed ȣ��
		
		
		// 3. ��ü�� �ʵ� �� ����
		myCar.speed = 60;
			//myCar ��ü�� speed �ʵ� ȣ���ؼ� 60�̶�� ������ ����
		System.out.println("������ �ӵ� : " + myCar.speed);
		
		// ���ο� �ڵ��� ��ü ���� [ ���������� ������ ]
		Car yourcar = new Car();
		yourcar.maxSpeed = 1000;
		System.out.println("2��° �ڵ��� :" + yourcar.maxSpeed);
	}

}
