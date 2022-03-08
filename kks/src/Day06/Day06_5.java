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
		
		
	}

}
