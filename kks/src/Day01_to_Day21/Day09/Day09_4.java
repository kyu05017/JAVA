package Day01_to_Day21.Day09;

public class Day09_4 {

	public static void main(String[] args) {
		
		// p.296 ~ 297
			// @override : ������ 
			// ������ ������ �μ��� ������ �޼ҵ�� �Ұ��� 
			// ���� : ������ �ޤǵ带 ������ [ ���� ] 
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		
		System.out.printf("������ %.3f",calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		
		System.out.printf("������ %.8f",computer.areaCircle(r));
	}
}
