package Day09;

public class Day09_5 {
	public static void main(String[] args) {
		
		//��ü ����
		Car mycar = new Car();
			//Ŭ���� �� Ÿ�̾ 4�� -> mycar ����
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = mycar.run();
			
			switch(problemLocation) {
				case 1 :
					System.out.println("�� ���� Hankook Ÿ�̾�� ��ü");
					mycar.frontLeftTire = new HankookTire("�� ����",15);
					break;
				case 2 :
					System.out.println("�� ������ Kumho Ÿ�̾�� ��ü");
					mycar.frontRightTire = new KumhoTire("�� ������",13);
					break;
				case 3 :
					System.out.println("�� ���� Hankook Ÿ�̾�� ��ü");
					mycar.backLeftTire = new HankookTire("�� ����",14);
					break;
				case 4 : 
					System.out.println("�� ������ Kumho Ÿ�̾�� ��ü");
					mycar.backRightTire = new KumhoTire("�� ������",17);
					break;
			}
			System.out.println("--------------------------------------");
		}
	}
}
