package Day09;

public class Tire {
	
	//�ʵ�
	public int maxRotatoin;			//�ִ� ȸ�� ���ɼ�
	public int accmiatedRotation;	//���� ȸ����
	public String location;			//Ÿ�̾� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
				//Ÿ�̾� ��ġ , ȸ����
		this.location = location;		//�ܺη� ���� ���޹��� �μ��� ���� ������ ����
		this.maxRotatoin = maxRotation;	//
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accmiatedRotation; //���� ȸ���� 1�� ����
		if(accmiatedRotation < maxRotatoin) {
			//���� ȸ������ �ִ� ȸ���� ���� ������ ������ ����
			System.out.println(location+" Tire ���� : "+(maxRotatoin-accmiatedRotation)+"ȸ");
			return true;
		}
		else {
			System.out.println("*** "+ location + " Tire ��ũ ***");
			return false;
		}
	}
}
