package Day01_to_Day21.Day10;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7 {
	
	// 상속 : 슈퍼클래스 
	// 클래스 : 서브클래스 : 롯데이라, 맥도날드
	// 인터페이스 : 키오스크
	// 파일처리 : 재고
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		ArrayList<Goods> itemlist = new ArrayList<>();
		kiosk mcdonald = new Mcdonald();
		kiosk lotteria  = new LotteRia("유재석",itemlist);
		// 파일입력 객체
		try { // 예외처리 try { } 오류가 발생할거 같은 코드를 넣음 [예상]
			// 1. 파일 입력객체
			FileInputStream inputStream = new FileInputStream("D:/KKS/자바/롯데리아재고.txt");
			//2. 파일 읽어오기 [ 파일 --> 스트림[바이트배열] ==> 자바 ]
			// 1. 바이트 배열선언
			byte[] bytes = new byte[1024*10];
			// 2. 읽어와서 배열 저장 
			inputStream.read(bytes);
			// 3. 분별[ , : 필드 구별 \n : 객체 ] 
			String file = new String(bytes);
				// String 분해 메소드 split("기준")
			String[]list = file.split("\n");
			for(String temp : list) {
				String[] filed = temp.split(",");
				Goods goods = new Goods(filed[0],Integer.parseInt(filed[1]),Integer.parseInt(filed[2]));
									//	 문자열 >>>> 정수형 [ 변환 ] Integer.parseInt("문자열") -> 정수로 변환됨
				//리스트 저장
				itemlist.add(goods);
			}
			
			
		} catch (Exception e) {} // catch :  예외 잡기 => Exception 클래스의 객체를 저장
		while(true) {
			System.out.println("메뉴판))");
			lotteria.itemlist();
			System.out.println("메뉴 선택))");
			int ch = scanner.nextInt();
			if(ch == -1) {
				lotteria.additem();
			}
			else if(ch == -2) {
				
			}
			else if(ch == 1) {
				lotteria.itemlist();
			}
			else if(ch == 2) {
				lotteria.basket();
			}
			
		}
	}
}
