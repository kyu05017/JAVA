package Day01_to_Day21.Day09;

public class KumhoTire extends Tire{
		//서브클래스 extends 슈퍼클래스
	//필드
	
	//생성자
	public KumhoTire(String location,int maxRotation){
		super(location,maxRotation);
		//슈퍼클래스에서 인수인 로케이션과 맥스로테이션을 가지고옴
		//super(인수1, 인수2) = 슈퍼클래스 내에 [ 인수 2개] 생성자 호출
	}
	//메소드
		// Ctrl + 스페이스
	@Override // 슈퍼클래스내 메소드를 재정의
	public boolean roll() {
		++accmiatedRotation;
		if(accmiatedRotation < maxRotatoin) {
			System.out.println(location+" KumhoTire Tire 수명 : "+(maxRotatoin-accmiatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("*** "+ location + " KumhoTire Tire 펑크 ***");
			return false;
		}
	}

}

