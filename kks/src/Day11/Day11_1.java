package Day11;

public class Day11_1 {
	// p.386
		// 1) 3
			// 인터페이스는 인스턴스필드를 가지지못함
			// 인터페이스의 맴버 [ 1.상수필드 2.추상메소드 3.디폴트메소드 4.정적메소드 ]
		// 2) 4 [ 인터페이스 변수 = 구현객체 ]
			// 구현객체 = 클래스가 implemants 한 객체
		
		// 3) 
	private static void printsound( Soundable soundable) {
	//접근제한자 정적   잔환타입 메소드명   (인수 [ 변수, 배열,객체,인터페이스 ] )
		System.out.println(soundable.sound());
	}
	public static void dbWork(DateAccesseObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		
		// 3)
		printsound(new Cat());
		printsound(new Dag());
		
		Soundable soundable = new Dag();
		Soundable[] soundables = new Dag[100];
		
		// 4)
			// Dao : DB접근 객체		Dto : 데이터의 이동객체
		dbWork(new Oracle());
		dbWork(new MysqlDao());
			
		
		// 5) 익명객체 [ 인터페이스가 직접구형 ]
			// 구현객체 : 인터페이스명 객체명 = new 클래스명();
			// 익명객체 : 인터페이스명 객체명 = new 인터페이스() { 구현하기 };
		Action action = new Action() { // 1회용
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};// 구현끝
		action.work();
	}
}
