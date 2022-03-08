package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		// p.207
		
		// 1. 생성자 없이 필드에 값넣기
		Korean k1 = new Korean();
			k1.name = "유재석";// 필드에 직접 들어가서 대입한다
			k1.ssn = "123123-1231237";
		System.out.println("(빈생성자)k1의 국적 :" + k1.nation);
		System.out.println("(빈생성자)k1의 이름 :" + k1.name);
		System.out.println("(빈생성자)k1의 등록번호 :" + k1.ssn);
		// 2. 필드 2개를 갖는 생성자로 객체 생성
		Korean k2 = new Korean("박자바","123123-1231237");
		System.out.println("k2의 국적 :" + k2.nation);
		System.out.println("k2의 이름 :" + k2.name);
		System.out.println("k2의 등록번호 :" + k2.ssn);
		/////////////////////////////////////////////////
			// 1. 빈생성자 객체
		Korean 한국인1 = new Korean();
			//한국인1은 국적이 대한민국이고 이름 주민번호가 없다.
		
			// 2. 필드 1개 생성자 객체 생성
		Korean 한국인2 = new Korean("유재석");
			//한국인2는 국적이 대한민국이고 이름이 유재석이고 주민등록번호는 없다.
		
			// 3. 필드 2개 생성자 객체 생성
		Korean 한국인3 = new Korean("강호동", "123456-1234567");
			//한국인3은 국적이 대한민국이고 이름이 강호동이고 주민등록번호도 있다.
		
			// 4. 필드 3개 생성자 객체 생성
		Korean 한국인4 = new Korean("일본", "신동엽", "123456-1234567");
			//한국인4는 국적이 일본으로 바뀌었고 이름은 신동엽 주민등록번호도 존재
		
		System.out.println("한국인1 "+한국인1.nation);
		System.out.println("한국인2 "+한국인2.nation+" "+한국인2.name);
		System.out.println("한국인3 "+한국인3.nation+" "+한국인3.name+" "+한국인3.ssn);
		System.out.println("한국인4 "+한국인4.nation+" "+한국인4.name+" "+한국인4.ssn);
	}

}
