package Day01_to_Day21.Day08;

public class Person {
	
	//static + final 불변상수 : 프로그램 전반적으로 사용되는 상수
	static final double pi = 3.14;
	//static : 프로그램 전반적으로 사용되는 변수
	static double pi2 = 3.14;
	//final : 객체내에서 사용되는 상수
	final double pi3 = 3.14;
	
	
	// 1.필드
	final String nation = "Korean"; //final 선언으로 수정불가
	final String ssn;//final 선언으로 수정불가
	String name;
	// 2. 생성자 [  객체의 초기값 ]
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	// 3. 메소드
}
