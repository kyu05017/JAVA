package Day10;

public class BattleGame implements GamePad{

	@Override
	public void bottonA() {
		System.out.println("공격합니다.");
	}

	@Override
	public void bottonB() {
		System.out.println("방어합니다");
	}

	@Override
	public void bottonC() {
		System.out.println("교체합니다.");
	}
	//게임 클래스에 게임패드 인터페이스를 연결
		// * 추상메소드 구성
		// 버튼에 대한 기능 구현
		

}
