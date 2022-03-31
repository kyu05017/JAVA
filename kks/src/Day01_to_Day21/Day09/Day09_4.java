package Day01_to_Day21.Day09;

public class Day09_4 {

	public static void main(String[] args) {
		
		// p.296 ~ 297
			// @override : 재정의 
			// 원래는 동일한 인수의 동일한 메소드명 불가능 
			// 목적 : 동일한 메ㅗ드를 재정의 [ 수정 ] 
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		
		System.out.printf("원면적 %.3f",calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		
		System.out.printf("원면적 %.8f",computer.areaCircle(r));
	}
}
