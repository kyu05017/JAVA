package Day09;

public class HankookTire extends Tire{
	//�ʵ�
	
	//������
	public HankookTire(String location,int maxRotation){
		super(location,maxRotation);
	}
	//�޼ҵ�
	@Override
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
