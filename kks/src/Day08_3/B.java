package Day08_3;

public class B {
	//A와 패키지는 같지만 클래스가 다름
		//public, default 사용가능 
		//private 사용불가
	
	//필드
	A a1 = new A(true);		// o
	A a2 = new A(1);		// o
	//A a3 = new A("문자열"); // x
	//생성자
	public B() {
		
		A a = new A(true);
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 =1;
		
		a.method();
		a.method2();
		//a.method3();
		
	}
	
	//메소드
	
}
