package Day09;

public class Day09_2 {
	public static void main(String[] args) {
		
		// 상속 
			// 부모에게 물려받는것
			// 현실 : 부모 ---> 자식
			// 프로그램 : 자식 ---> 부모
			// extends : 연장하다 [ 싱속하다 ] : 설계를 연장하다
			// (목적)상속을 쓰는 이유 : 빠른 설계 [ 기존에 있던 클래스를 연장해서 새로운 클래스를 설계 ]
			
		// p. 290 ~ 292 예제
		
		
		//객체생성
		// 1. 서브클래스로객체 생성
		DmbCallPhone dmbCallPhone = new DmbCallPhone("자바폰", "검정", 10);
		
		// 2. 서브클래스로 만들어진 객체로 슈퍼클래스내 맴버(필드) 접근
		System.out.println("모델 "+dmbCallPhone.model);
		System.out.println("색상 "+dmbCallPhone.color);
		
		// 3. 서브클래스로 만들어진 객체로 본인 맴바(필드) 접근
		System.out.println("채널 "+dmbCallPhone.channel);
		
		
		// 4. 서브클래스로 만들어진 객체로 슈퍼클래스내 맴버(메소드) 접근
		dmbCallPhone.powerOn();
		dmbCallPhone.bell();
		dmbCallPhone.sendVoice("여보세요");
		dmbCallPhone.receveVoice("안녕하세요, 홍길동인데요.");
		dmbCallPhone.sendVoice("아~ 예 반갑습니다");
		dmbCallPhone.hangUp();
		
		// 5. 서브클래스로 만들어진 본인 맴버(메소드) 접근
		dmbCallPhone.turnOnDmb();
		dmbCallPhone.changeChannelDmb(12);
		dmbCallPhone.turnOffDmb();
		
	}
}
