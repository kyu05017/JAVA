package Day01_to_Day21.Day10;

public class Day10_3 {
	
	public static void main(String[] args) {
		
		//
		GamePad gp;
		gp = new BattleGame();
		gp.bottonA();
		gp.bottonB();
		gp.bottonC();
		
		gp = new GameScoccer();
		gp.bottonA();
		gp.bottonB();
		gp.bottonC();
	}
}
