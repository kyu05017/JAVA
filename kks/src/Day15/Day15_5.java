package Day15;

public class Day15_5 {
	public static void main(String[] args) {
		// °´Ã¼ »ý¼º
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		
	}
}
