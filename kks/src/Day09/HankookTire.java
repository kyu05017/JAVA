package Day09;

public class HankookTire extends Tire{
		//����Ŭ���� extends ����Ŭ����
	//�ʵ�
	
	//������
	public HankookTire(String location,int maxRotation){
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
			System.out.println(location+" Hankook Tire ���� : "+(maxRotatoin-accmiatedRotation)+"ȸ");
			return true;
		}
		else {
			System.out.println("*** "+ location + " Hankook Tire ��ũ ***");
			return false;
		}
	}
	
}
