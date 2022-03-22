package Day15;

public class Game implements GamePad{
		// 클래스명 implements 인터페이스명
	
	@Override
	public void A_bottom() {
		
		System.out.println("공격");
	}
	
	@Override
	public void B_bottom() {
	
		System.out.println("방어");
	}
	
	@Override
	public void C_bottom() {
	
		System.out.println("스킬");
	}
	
}
