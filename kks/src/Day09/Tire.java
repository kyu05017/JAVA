package Day09;

public class Tire {
	
	//필드
	public int maxRotatoin;			//최대 회전 가능수
	public int accmiatedRotation;	//누적 회전수
	public String location;			//타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
				//타이어 위치 , 회전수
		this.location = location;		//외부로 부터 전달받은 인수로 내부 변수에 대입
		this.maxRotatoin = maxRotation;	//
	}
	
	//메소드
	public boolean roll() {
		++accmiatedRotation; //누적 회전수 1씩 증가
		if(accmiatedRotation < maxRotatoin) {
			//누적 회전수가 최대 회전수 보다 작으면 수명이 남음
			System.out.println(location+" Tire 수명 : "+(maxRotatoin-accmiatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("*** "+ location + " Tire 펑크 ***");
			return false;
		}
	}
}
