package Day09;

public class HankookTire extends Tire{
	//필드
	
	//생성지
	public HankookTire(String location,int maxRotation){
		super(location,maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accmiatedRotation;
		if(accmiatedRotation < maxRotatoin) {
			System.out.println(location+" Hankook Tire 수명 : "+(maxRotatoin-accmiatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("*** "+ location + " Hankook Tire 펑크 ***");
			return false;
		}
	}

}
