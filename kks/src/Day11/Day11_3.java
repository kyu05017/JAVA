package Day11;

public class Day11_3 {
	// p. 422 예외 던지기
		// 목적 : 모든 메소드에서 try{}catch{} 사용시 코드 복잡함 > 한곳으로 예외를 이동
	
	public static void main(String[] args)  {
		
		try {
			findclass();
		}
		catch(Exception e) {
			System.out.println( e );
		}	
		try {
			withdraw(30000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void findclass() throws Exception {
		
		//1.예외 던지기
		Class class1 = Class.forName("java.lang.String2");
		/*
		// 1. try - catch
		try { // 예외가 발생할것 같은 코드(실행 예외) 혹은 일반예외 [ 무조건 ]
			Class clazz = Class.forName("java.lang.String2");
							// 클래스 찾기 메소드
		}
		catch (Exception e) {
			System.out.println( e );
		}
		*/
	}
	
	// p,444 ~ 445 :예외 만들기
	public static void withdraw(int money)throws Exception {
		if(20000 < money) {
			throw new Exception("잔고부족");
		}
	}
	
}
