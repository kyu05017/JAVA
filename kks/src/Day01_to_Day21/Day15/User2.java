package Day01_to_Day21.Day15;

public class User2 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator= calculator;
	}

	
	public void run() {
		calculator.setMemory(50);
	}

}
