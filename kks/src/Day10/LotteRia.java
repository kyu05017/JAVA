package Day10;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LotteRia extends Market{
	
	
	
	// 1. 필드
	private String manager;
	ArrayList<Goods> itemlist = new ArrayList<>();
	
	// 2. 생성자
	public LotteRia() {}
	
	
	public LotteRia(String manager, ArrayList<Goods> itemlist) {
		this.manager = manager;
		this.itemlist = itemlist;
	}


	@Override
	public void itemlist() {
		System.out.println("롯데리아 제품목록))");
		int i = 1;
		for(Goods temp : itemlist) {
			System.out.print(i + ". "+temp.getGoodsname() + "("+temp.getPrise() + "원)\n");
			i++;
		}
		System.out.println();
	}
	@Override
	public void basket() {
		System.out.println("장바구니))");
		int i = 0;
		
		
	}
	@Override
	public void additem() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("롯데리아 상품추가)) ");
		System.out.println("상품명 : ");
		String name = scanner.next();
		System.out.println("재고 : ");
		int stock = scanner.nextInt();
		System.out.println("가격 : ");
		int prise = scanner.nextInt();
		
		Goods goods = new Goods(name, stock, prise);
		itemlist.add(goods);
		//4. 파일 처리 
		try {
			FileOutputStream OutputStream = new FileOutputStream("D:/KKS/자바/롯데리아재고.txt",true);// true 를 붙이면 이어쓰기 // 단 파일이 없다면 이어쓰기가 안됌
			String output = name + "," + stock + "," + prise+"\n";
			OutputStream.write(output.getBytes());
		}
		catch (Exception e) { // 오류를 처리 해줌 Exception 클래스

		}
		System.out.println("알림)) 상품 저장 완료.");
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
}
