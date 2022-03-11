package Day08_3;

public class A { // 동일한 클래스내 접근제한자 사용의미X
//전범위 클래스선언 A
	
	//필드
	A a1 = new A(true);  // 현재 클래스에서 public  호출가능
	A a2 = new A(1); 	 // 현재 클래스에서 default 호출가능
	A a3 = new A("문자열");// 현재 클래스에서 private 호출가능
	
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A(boolean b) { //전범위
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method();
		method2();
		method3();
	} // 전범위
	A(int b){} 			   // defualt 현 패키지
	private A(String s) {} // 현 클래스 내
	
	//메소드
	public void method() {}
	void method2() {}
	private void method3() {}
	
}
