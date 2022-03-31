package 개인과제._02_엘리베이터;

import java.util.Scanner;

public class 한요한_모범코드 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// 입력객체 선언
		
		Elevator elevator = new Elevator(10);// 처음 기본값 10 인자 선언 => 10층
		
		while (true) {
			System.out.println("-----------------------------------엘리베이터-------------------------------------------");
			System.out.println("현재몇층입니까? 1~20: "); int 호출층수 = scanner.nextInt(); // 현재 층수 입력받기
			
			boolean 도착여부 = false; // 엘베 도착 여부
			if(elevator.층수 != 호출층수 && 호출층수 > 0 && 호출층수 <= 20) {// 같은층수가 아니면
				if(호출층수 < elevator.층수) {// 호출층수 보다 엘베위치가 높으면
					while(true) {// 엘베 가동 시작
						elevator.층수--;// 엘베가 내려가면서 하나씩 내려가기
						System.out.println(elevator.층수 + "층");
						if(호출층수 == elevator.층수) { // 엘베가 같은층이되면
							System.out.println("도착");
							도착여부 = true;			// 엘베가 정상적으로 도착했으면 도착여부 true;
							break; 					// 중지
						}// 같은층이면 end
					}// 엘베가동 end	
				}else {// 호출층수 보다 엘베위가 낮으면
					while(true) {// 엘베 가동 시작
						elevator.층수++;// 엘베가 올라가면서 하나씩 플러스
						System.out.println(elevator.층수 + "층");
						if(호출층수 == elevator.층수) { // 엘베가 같은층이되면
							System.out.println("도착");
							도착여부 = true;			// 엘베가 정상적으로 도착했으면 도착여부 true;
							break; 					// 중지
						}// 같은층이면 end
					}// 엘베가동 end
				}					
				
			}else if(elevator.층수 == 호출층수) { // 층수가같을때
				System.out.println("같은 층입니다");
				도착여부 = true;
			}
			else { // 범위에서 벗어나면
				System.out.println("에러)) 1~20층 까지 입력해주세요");
			}
			
			
			if(도착여부 == true){ // 층수가 같으면
				System.out.println("몇층의 가겠습니까?: "); int 목적층수 = scanner.nextInt(); // 목적층수 입력받기
				if(목적층수 >= 1 && 목적층수 <= 20) {// 범주안일때
					if(elevator.층수 < 목적층수) {// 엘베층수보다 목적층수가 높을때
						System.out.println("올라갑니다");
						while(true) { // 엘베 가동시작 
							elevator.층수++; // 엘베 한층식 올라가기
							System.out.println(elevator.층수 + "층");
							if(elevator.층수 == 목적층수) {//엘베가 도착했을때
								System.out.println("도착했습니다");
								break;// 반복문 종료
							}
						} //while end
					}else if(elevator.층수 > 목적층수) {//엘베층수보다 목적층수가 높을때
						System.out.println("내려갑니다");
						while(true) { // 엘베 가동시작 
							elevator.층수--; // 엘베 한층식 올라가기
							System.out.println(elevator.층수 + "층");
							if(elevator.층수 == 목적층수) {//엘베가 도착했을때
								System.out.println("도착했습니다");
								break;// 반복문 종료
							}		
						}
					}
				}else {// 목적층수 범주가 벗었났을때
					System.out.println("에러)) 1~20층 까지 입력해주세요");
				}
				
				
			}
			System.out.println("현재엘베 층수: " + elevator.층수);
		}// while
	}// me
}// cs

