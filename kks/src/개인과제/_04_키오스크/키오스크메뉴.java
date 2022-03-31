package 개인과제._04_키오스크;

public class 키오스크메뉴 {
	
	//필드
	int buycoke;
	int buycider;
	int buywhan;
	int cokeitem = 10;
	int whanitem = 10;
	int cideritem = 10;
	//생성자
	public 키오스크메뉴() {
		
	}
	//메소드
	int bc() {
		System.out.println("콜라를 선택했습니다.");
		buycoke +=1;
		
		return buycoke;
	}
	int bw() {
		System.out.println("환타를 선택했습니다.");
		buywhan+= 1;
		return buywhan;
	}
	int buyci() {
		System.out.println("사이다를 선택했습니다.");
		buycider +=1;
		return buycider;
	}
}
