package Day01_to_Day21.Day10;

public class BattleGame implements GamePad{

	@Override
	public void bottonA() {
		System.out.println("공격");
	}

	@Override
	public void bottonB() {
		System.out.println("방어");
	}

	@Override
	public void bottonC() {
		System.out.println("교체");
	}
	//게임 클래스에 게임패드 인터페이스를 연결
		// * 추상메소드 구성
		// 버튼에 대한 기능 구현
		

}
