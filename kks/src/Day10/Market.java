package Day10;

public class Market implements kiosk{
	
	// 1. 필드
	public String address;
	// 2. 생성자
	public Market() {}
	// 3. 메소드
	@Override
	public void itemlist() {
		System.out.println("제품목록))");
		
	}
	@Override
	public void basket() {
		System.out.println("장바구니))");
		
	}
	@Override
	public void pay() {
		System.out.println("결제))");
		
	}
	@Override
	public void additem() {
		System.out.println("상품추가))");
		
	}
}
