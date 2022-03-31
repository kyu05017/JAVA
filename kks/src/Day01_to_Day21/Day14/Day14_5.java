package Day01_to_Day21.Day14;

public class Day14_5 {
	
	public static void main(String[] args) {
		
		// 예 : 강아지 소리, 고양이 소리 , 호랑이 소리
			// 1. Thread 클래스 에서 extends
				// @overide - > 재정의
			// 2. Runnable 인터페이스 부터 implements
				// @override -> 구현
		
		//main 스레드가 새로 생성된 스래드 호출한다
		// Thread 클래스로 부터 상속받은 자식 클래스의 객체 생성
		
		DogSound dogSound = new DogSound();
			// 자식 클래스의 객체호 부모클래슨내 메소드 실행
		CatSound catSound = new CatSound();
			//
		TigerSound tigersound = new TigerSound();
		
		dogSound.start();// 런 메소드 호출 [ 멀티 스레드 시작 ] 
		catSound.start();
		tigersound.start();

	}
	
}
