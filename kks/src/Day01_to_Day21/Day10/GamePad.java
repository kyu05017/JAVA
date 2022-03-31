package Day01_to_Day21.Day10;

public interface GamePad {

	
	//예 1.)
	// 1. 상수필드
	// 2. 추상메소드
	public void bottonA();
	public void bottonB();
	public void bottonC();
	// 3. 디폴트메소드
	default void endGamePad(){
		System.out.println(" 게임패드 종료");
	}
	// 4. 정적메소드
	static void charge() {
		System.out.println("충전중 입니다.");
	}
}
