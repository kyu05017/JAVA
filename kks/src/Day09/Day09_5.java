package Day09;

public class Day09_5 {
	public static void main(String[] args) {
		
		//객체 생성
		Car mycar = new Car();
			//클래스 내 타이어가 4개 -> mycar 포함
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = mycar.run();
			
			switch(problemLocation) {
				case 1 :
					System.out.println(" 앞 왼쪽 Hankook 타이어로 교체");
					mycar.frontLeftTire = new HankookTire("앞 왼쪽",15); //형변환 
					// 슈퍼클래스 객체명 = new 서브클래스(); 가능가능
					// 상속받아야 가능!!!!!!!!!
					break; // switch 탈출
				case 2 :
					System.out.println(" 앞 오른쪽 Kumho 타이어로 교체");
					mycar.frontRightTire = new KumhoTire("앞 오른쪽",13);
					// 슈퍼클래스 객체명 = new 서브클래스(); 가능가능
					// 상속받아야 가능!!!!!!!!!
					break;// switch 탈출
				case 3 :
					System.out.println(" 뒤 왼쪽 Hankook 타이어로 교체");
					mycar.backLeftTire = new HankookTire("뒤 왼쪽",14);
					// 슈퍼클래스 객체명 = new 서브클래스(); 가능가능
					// 상속받아야 가능!!!!!!!!!
					break;// switch 탈출
				case 4 : 
					System.out.println(" 뒤 오른쪽 Kumho 타이어로 교체");
					mycar.backRightTire = new KumhoTire("뒤 오른쪽",17);
					// 슈퍼클래스 객체명 = new 서브클래스(); 가능가능
					// 상속받아야 가능!!!!!!!!! 
					break;// switch 탈출
			}
			System.out.println("--------------------------------------");
		}
	}
}
