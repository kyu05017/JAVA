package Day09;

public class Day09_3 {
	
	public static void main(String[] args) {
		
		//p. 294 ~ 295
			// super() : 부모클래스내 빈생성자 호출 / 생략시 자동추가
			// super( 인수1, 인수2) : 부모클래스내 [2개 인수 ] 생성자 호출
			// super( 인수1, 인수2, 인수3) : 부모클래스내 [ 3개 인수 ] 생성자 호출
		
		//1. 서브클래스 객체 생ㅇ성
		Student student = new Student("홍길동","123456-123456",1);
		
		// 2.서브 클래스로 받은 개객체로 슈퍼클래스 맴버 접근
		System.out.println("name " +student.name);
		System.out.println("ssn " + student.ssn);
		
		// 3. 본인 클래스에 접근에서 호출
		System.out.println("Student.No " + student.studentNo);
	}
}
