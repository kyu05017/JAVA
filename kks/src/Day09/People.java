package Day09;

public class People { // 클래스 선언
	//필드
		// 접근제한자 자료형 변수명
	public String name;
	public String ssn;
	
	
	//생성자
	public People(String name,String ssn) {
		//super(); //생략가능
		this.name = name;
		this.ssn = ssn;
	}
}
