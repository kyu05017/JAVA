package Day09;

public class KumhoTire extends Tire{
	
	//�ʵ�
	
	//������
	public KumhoTire(String location,int maxRotation){
		super(location,maxRotation);
	}
	//�޼ҵ�
	@Override
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

