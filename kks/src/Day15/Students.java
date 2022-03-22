package Day15;
				// 상속
public class Students extends Person{
			// 자식클래스 extends 부모클래스
	//필드
	
	
	public void callname() {
		System.out.println("이름 " + name);
		// 상속을 받으면 현 클래스에 없응 필드를
		// 부모클래스내 존재하면 사용가능 
	}
}
