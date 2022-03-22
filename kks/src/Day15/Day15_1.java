package Day15;

public class Day15_1 {
	
	// 클래스 : 객체 설계도
		// 객체 : 클래스 기반으로 메모리 할당
			// 기본 자료형/ 클래스 변수명 					[ String 점수;  => 변수 ] 
			// 기본 자료형/ 클래스 변수명 = new 클래스생성자();	[ String 이름; = new String("") = > 객체 ] 
	
	// 상속 : 설계도 연장 [ extends ] ( 모범 설계도를 이어서 새로운 설계 )
		// *선언방식 : public class 자식클래스 extends 부모클래스 { }
		// 부모클래스 ( 슈퍼클래스 ) : 부모클래스 내에 맴버 ( 필드, 생성자, 메소드 ) 를 자식클래스에게 ( 상속 )물려준다.
		// 자식클래스 ( 서브클래스 ) : 부모클래스 내에 맴버를 상용가능 
			// super VS this
		// 자식클래스로 객체 생성시 : 부모클래스 생성자 호출
		// Object 클래스 : 모든 클래스는 objects 생성자 호출 [ 100% 객체 지향 ]
	
		// ** 다형성 
			// 하나의 객체가 여러가지의 타입으로 변환이 가능
			// 조건 1 : 자식 객체 => 부모객체
	
	public static void main(String[] args) {
		
		// 1. 부모클래스로 객체 생성
		Person p1 = new Person("유재석"); 
			// 부모는 자식클래스의 접근 불가 
		p1.name = "유재석";
		p1.callname();
		
		// 2. 자식클래스로 객체 생성
		Students p2 = new Students("유재석");
			// 자식은 부모클래스에 접근가능 
		p2.name = "강호동";
		p2.callname();
		
		//부모의 부모 클래스 접근
		p2.jobs = "학생";
		
		// * 다형성 객체
		Jobs j1 = new Students("박명수"); 
		// 부모클래스 객체 = 자식 잭체
		//Students p3 = new Jobs(); 불가능
		
		
	}
		
}
