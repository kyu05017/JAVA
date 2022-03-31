package Day01_to_Day21.Day15;

public class User1 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator= calculator;
	}

	
	public void run() {
		calculator.setMemory(100);
	}
}
