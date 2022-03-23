package Day16;

public class Day16_1 {
	
	
	public static void main(String[] args) {
		
		// 제네릭 
		
		// p. 656 비제네릭 예 1)
		
		// 1. Box 객체 생성
		Box box = new Box();
		// 2. 객체내 메소드 호출 [ 인수 : String ]
		box.set("홍길동");
		// 3. 객체내 메소드 호출 [ 반환 : 오브젝트 ] 
		String name = (String)box.get();
		
			// 자식객체 -> 부모객체 [ 자동형변환 ]
			// 부모객체 -> 자식객체 [ 강제형변환 ]
		
		// 4. 
		box.set(new Apple()); // [ 인수 : Apple ]
		Apple apple = (Apple)box.get();
		
			// 자식객체 -> 부모객체 [ 자동형변환 ]
			// 부모객체 -> 자식객체 [ 강제형변환 ]
				
	}
}
