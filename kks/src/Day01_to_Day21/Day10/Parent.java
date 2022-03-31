package Day01_to_Day21.Day10;

public class Parent {
	//필드
	public String nation;
	
	//생성자


	public Parent() { // 강통 생성자
		this("대한민국");
		System.out.println(" 2. Parant() call");
	}
	// 메소드 
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println(" 1. Parnat String nation call");
	}
	// 메소드 
}
