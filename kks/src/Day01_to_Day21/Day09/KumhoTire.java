package Day01_to_Day21.Day09;

public class KumhoTire extends Tire{
		//����Ŭ���� extends ����Ŭ����
	//�ʵ�
	
	//������
	public KumhoTire(String location,int maxRotation){
		super(location,maxRotation);
		//����Ŭ�������� �μ��� �����̼ǰ� �ƽ������̼��� �������
		//super(�μ�1, �μ�2) = ����Ŭ���� ���� [ �μ� 2��] ������ ȣ��
	}
	//�޼ҵ�
		// Ctrl + �����̽�
	@Override // ����Ŭ������ �޼ҵ带 ������
	public boolean roll() {
		++accmiatedRotation;
		if(accmiatedRotation < maxRotatoin) {
			System.out.println(location+" KumhoTire Tire ���� : "+(maxRotatoin-accmiatedRotation)+"ȸ");
			return true;
		}
		else {
			System.out.println("*** "+ location + " KumhoTire Tire ��ũ ***");
			return false;
		}
	}

}

