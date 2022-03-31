package Day01_to_Day21.Day10;

public class Child extends Parent{
	
	// 필드
	private String name;
	
	// 생성자

	public Child() {
		//this.name = name;
		this("홍길동");
		System.out.println(" 4. Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println(" 3. Child(String name) call");
	}
	// 메소드

}
