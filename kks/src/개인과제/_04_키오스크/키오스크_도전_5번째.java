package 개인과제._04_키오스크;

//스캐너가 있는 자바 클래스를 임폴트
import java.util.Scanner;

//현재 클래스
public class 키오스크_도전_5번째 {
	
	//메인메소드
	public static void main(String[] args) {
		
		//스캐너 객체 선언
		Scanner scanner = new Scanner(System.in);
		
		int bc=0;		//콜라구매횟수
		int bw = 0;		//환타구매횟수
		int bcid = 0;	//사이다수매횟수
		int ci = 10;	//콜라재고
		int wi =10;		//환타재고
		int cidi=10;	//사이다재고
		
		//반복문
		while(true) { // 무한반복 종료조건없음
			System.out.println("자판기))");
			System.out.println("1)콜라 300원 2)환타 200원 3)사이다 100원");
			System.out.println("4)결제");
			int ch = scanner.nextInt();//ch를 입력받는다
			
			if(ch==1) {//1일경우 콜라를 추가
				System.out.println("콜라를 추가하셨습니다.");
				bc += 1; //콜라구매횟수에 1을 추가해줌
			}
			else if(ch==2) {// 2일 경우 환타를 추가
				System.out.println("환타를 추가하셨습니다");
				bw +=1;//환타구매횟수에 1을 추가
				
			}
			else if(ch==3) {//3일 경우 사이다를 추가
				System.out.println("사이다를 추가하셨습니다");
				bcid +=1; // 사이다 구매횟수에 1추가
			}
			else if(ch==4) {// 4일 경우 결제창을 보여준다
				System.out.println("결제창))");
				System.out.println("품목\t수량 \t 가격\t");
				if(bc != 0)System.out.printf("콜라\t%d\t%d",bc,bc*300);			//콜라 구매횟수가 0이 아니라면 출력
				if(bw != 0)System.out.printf("환타\t%d\t%d",bw,bw*200);			//환타 구매횟수가 0이 아니라면 출력
				if(bcid != 0)System.out.printf("사이다\t%d\t%d",bcid,bcid*100);	//사이다구매횟수가 0이 아니라면 출력
				int total = bc*300+bw*200+bcid+100;//총합을 변수로 선언
				System.out.println("총 결제 금액 " + total + "원");
				System.out.println("1)결제 2)결제취소");
				int ch2 =scanner.nextInt();//결제창의 설정을 입력받음
				
				if(ch2 == 1) { // 1이라면 결제창을 실행
					while(true) { //무한 반복 종료조건은 결제완료 및 결제취소
						System.out.println("결제 금액을 입력하세요");
						int money = scanner.nextInt();//금액을 입력받음
						
						if(money >= total) {// 입력한 금액이 계산된 총금액보다 크다면 
							System.out.println("결제가 완료 되었습니다.");
							ci -= bc;wi -= bw;cidi -= bcid;//추가된 항목들을 재고에서 빼준다
							bc =0; bw =0; bcid =0;//추가 된항목을 0으로 초기화
							break;//반복문 종료
						}
						else {//그외 금액이 부족하거나 잘못 입력된 경우
							System.out.println("결제에 실패하였습니다.");
							System.out.println("잔액부족");
						}
					}
				}
				else if (ch2 == 2) {//2일경우 결제 취소를 실행
					System.out.println("결제를 취소하셨습니다.");
					bc =0; bw =0; bcid =0;//추가항 항목을 0으로 모두 초기화
					break;//빈복문 종료
				}
				else {//결제창 if에서 잘못 입력받았을경우
					System.out.println("알림)) 잘못된 입력입니다.");
				}
			}
			else {//메인 반복문의 if문에서 잘못 입력받았을 경우
				System.out.println("알림)) 잘못된 입력입니다.");
			}
		}
	}
}
