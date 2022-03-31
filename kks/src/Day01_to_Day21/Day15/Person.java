package Day01_to_Day21.Day15;

public class Person extends Jobs{
	
	// 필드
	String name;
	
	// 생성자
	public Person(String name) {
		this.name = name;
	}
	
	// 메소드
	public void callname() {
		System.out.println("부모클래스 에서 실행");
		System.out.println(this.name);
	}
	
}
