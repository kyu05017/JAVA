package Day15;

public class Game3 implements GamePad{
	
	@Override
	public void A_bottom() {
		System.out.println("방어");
	}
	@Override
	public void B_bottom() {
		System.out.println("피하기");
	}
	@Override
	public void C_bottom() {
		System.out.println("참기");
	}

}
