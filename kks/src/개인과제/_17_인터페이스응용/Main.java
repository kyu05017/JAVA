package 개인과제._17_인터페이스응용;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		Remote rc;
		boolean tv_power = false;
		boolean tv_option = false;
		boolean Air_conditioner_power = false;
		boolean Air_conditioner_option = false;
		boolean Air_cleaner_power = false;
		boolean Air_cleaner_option = false;
		boolean DoorLock_power = false;
		boolean Gas_valve_power = false;
		int ch = 1;
		int vol = 1;
		
		while(true) {
			System.out.println("IoT 리모컨");
			System.out.println("1)TV 2)에어컨 3)공기청정기 4)현관문 5)가스벨브 6)종료");
			
			String work = scanner.next();
			
			if(work.equals("1") || work.equals("TV")) {
				ch = 1;
				vol = 1;
				while(true) {
					
					rc = new Tv();
					System.out.print("Ezen 스마트 티비");
					if(tv_power) {
						System.out.print("\t 전원 켜짐");
					}
					else {
						System.out.print("\t 전원 꺼짐");
					}
					if(tv_option) {
						System.out.print("\t 음소거  \n");
					}
					else {
						System.out.print("\t 음소거끔  \n");
					}
					System.out.println("1)전원 2)다음채널 3)이전채널 4)볼륨업 5)볼륨다운 6)음소거 7)메인메뉴");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("전원")) {
						if(tv_power) {
							boolean result = rc.turnOff(tv_power);
							tv_power = result;
						}
						else if(tv_power == false){
							boolean result = rc.turnOn(tv_power);
							tv_power = result;
						}
					}
					if(tv_power) {
						if(work2.equals("2") || work2.equals("다음채널")) {
							rc.mainUp();
							ch++;
							if(ch >= 11) {
								ch = 1;
							}
							System.out.println("TV)) 현재채널 " + ch);
						}
						else if(work2.equals("3") || work2.equals("이전채널")) {
							rc.mainDown();
							ch--;
							if(ch == 0) {
								ch = Remote.MAX;
							}
							System.out.println("TV)) 현재채널 " + ch);
						}
						else if(work2.equals("4") || work2.equals("볼륨업")) {
							if(vol >= 11) {
								System.out.println("TV)) 현재 최대 볼륨입니다.");
							}
							else {
								rc.subUp();
								vol++;
							}
							System.out.println("TV)) 현재볼륨 " + vol);
							tv_option = false;
						}
						else if(work2.equals("5") || work2.equals("볼륨다운")) {
							if(vol == 0) {
								System.out.println("TV)) 현재 최소 볼륨입니다.");
							}
							else {
								rc.subDown();
								vol--;
							}
							System.out.println("TV)) 현재볼륨 " + vol);
							tv_option = false;
						}
						else if(work2.equals("6") || work2.equals("음소거")) {
							if(tv_option) {
								boolean result = rc.optionOff(tv_option);
								tv_option = result;
							}
							else if(tv_option == false){
								boolean result = rc.optionOn(tv_option);
								tv_option = result;
							}
						}
					}
					else {
						System.out.println("메세지)) 전원을 켜주세요.");
					}
					if(work2.equals("7") || work2.equals("메인메뉴")) {
						System.out.println("메세지)) 메뉴로 돌아갑니다.");

						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("2") || work.equals("에어컨")) {
				vol = 0;
				ch = 25;
				while(true) {
					rc = new Air_conditioner();
					
					System.out.print("Ezen 무풍 에어컨");
					if(Air_conditioner_power) {
						System.out.print("\t 전원 켜짐");
					}
					else {
						System.out.print("\t 전원 꺼짐");
					}
					if(Air_conditioner_option) {
						System.out.print("\t 무풍모드  \n");
					}
					else {
						System.out.printf("\t 기온 %d'C 풍량 %d  \n",ch,vol);
					}
					System.out.println("1)전원 2)온도↑ 3)온도↓ 4)풍량↑ 5)풍량↓ 6)무풍 7)메인메뉴");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("전원")) {
						if(Air_conditioner_power) {
							boolean result = rc.turnOff(Air_conditioner_power);
							Air_conditioner_power = result;
						}
						else if(Air_conditioner_power == false){
							boolean result = rc.turnOn(Air_conditioner_power);
							Air_conditioner_power = result;
							vol = 1;
						}
						
					}
					if(Air_conditioner_power) {
						if(work2.equals("2") || work2.equals("온도업")) {
							if(ch >= 30) {
								System.out.println("에어컨)) 최고 온도 입니다.");
							}
							else {
								rc.mainUp();
								ch++;
							}
							System.out.println("에어컨)) 현재 온도 " + ch);
						}
						else if(work2.equals("3") || work2.equals("온도다운")) {
							if(ch <= 16) {
								System.out.println("에어컨)) 최저 온도 입니다.");
							}
							else {
								rc.mainDown();
								ch--;
							}
							System.out.println("에어컨)) 현재 온도 " + ch);
						}
						else if(work2.equals("4") || work2.equals("풍량업")) {							
							if(vol >= 10) {
								System.out.println("에어컨)) 최고 풍량 입니다.");
							}
							else {
								vol++;
								rc.subUp();
							}
							System.out.println("에어컨)) 현재풍량 " + vol);
							Air_conditioner_option = false;
						}
						else if(work2.equals("5") || work2.equals("풍량다운")) {							
							if(vol == 0) {
								System.out.println("에어컨)) 최저 풍량 입니다.");
							}
							else {
								vol--;
								rc.subDown();
							}
							System.out.println("에어컨)) 현재풍량 " + vol);
							Air_conditioner_option = false;
						}
						else if(work2.equals("6") || work2.equals("무풍")) {
							if(Air_conditioner_option) {
								boolean result = rc.optionOff(Air_conditioner_option);
								Air_conditioner_option = result;
							}
							else if(Air_conditioner_option == false){
								boolean result = rc.optionOn(Air_conditioner_option);
								Air_conditioner_option = result;
							}						}
					}
					else {
						System.out.println("메세지)) 전원을 켜주세요.");
					}
					if(work2.equals("7") || work2.equals("메인메뉴")) {
						System.out.println("메세지)) 메뉴로 돌아갑니다.");
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("3") || work.equals("공기청정기")) {
				while(true) {
					rc = new Air_cleaner();
					ch = 0;
					System.out.print("Ezen 공기청정기");
					if(Air_cleaner_power) {
						System.out.print("\t 전원 켜짐");
					}
					else {
						System.out.print("\t 전원 꺼짐");
					}
					if(Air_cleaner_option) {
						System.out.print("\t 자동모드  \n");
					}
					else {
						System.out.printf("\t 풍량 %d  \n",ch);
					}
					System.out.println("1)전원 2)풍량↑ 3)풍량↓ 4)자동 5)메인메뉴");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("전원")) {
						if(Air_cleaner_power) {
							boolean result = rc.turnOff(Air_cleaner_power);
							Air_cleaner_power = result;
						}
						else if(Air_cleaner_power == false){
							boolean result = rc.turnOn(Air_cleaner_power);
							Air_cleaner_power = result;
							vol = 1;
						}
						
					}
					if(Air_cleaner_power) {
						if(work2.equals("2") || work2.equals("온도업")) {
							if(ch >= 11) {
								System.out.println("공기청정기)) 최고 풍량 입니다.");
							}
							else {
								ch++;
								rc.mainUp();								
							}
							System.out.println("공기청정기)) 현재 풍량 " + ch);
						}
						else if(work2.equals("3") || work2.equals("온도다운")) {
							if(ch == 1) {
								System.out.println("공기청정기)) 최저 풍량 입니다.");
							}
							else {
								ch--;
								rc.mainDown();
							}
							System.out.println("공기청정기)) 현재 풍량 " + ch);
						}
						else if(work2.equals("4") || work2.equals("자동")) {
							if(Air_cleaner_option) {
								boolean result = rc.optionOff(Air_cleaner_option);
								Air_cleaner_option = result;
							}
							else if(Air_cleaner_option == false){
								boolean result = rc.optionOn(Air_cleaner_option);
								Air_cleaner_option = result;
							}						
						}
					}
					else {
						System.out.println("메세지)) 전원을 켜주세요.");
					}
					if(work2.equals("5") || work2.equals("메인메뉴")) {
						System.out.println("메세지)) 메뉴로 돌아갑니다.");
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("4") || work.equals("현관문")) {
				while(true) {
					rc = new DoorLock();
					System.out.print("Ezen 도어락");
					if(DoorLock_power) {
						System.out.print("\t 도어락 잠김 \n");
					}
					else {
						System.out.print("\t 도어락 열림 \n");
					}
					
					System.out.println("1)문열림 2)메인메뉴");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("전원")) {
						if(DoorLock_power) {
							boolean result = rc.turnOff(DoorLock_power);
							DoorLock_power = result;
						}
						else if(DoorLock_power == false){
							boolean result2 = rc.turnOn(DoorLock_power);
							DoorLock_power = result2;
							Thread.sleep(5000);
							boolean result = rc.turnOff(DoorLock_power);
							DoorLock_power = result;
						}
						
					}
					if(work2.equals("5") || work2.equals("메인메뉴")) {
						System.out.println("메세지)) 메뉴로 돌아갑니다.");
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("5") || work.equals("가스벨브")) {
				
				while(true) {
					rc = new Gas_valve();
					System.out.print("Ezen 가스벨브");
					if(Gas_valve_power) {
						System.out.print("\t 가스벨브 열림 \n");
					}
					else {
						System.out.print("\t 가스벨브 잠김 \n");
					}
					
					System.out.println("1)가스벨브 2)메인메뉴");
					String work2 = scanner.next();
					

					if(work2.equals("1") || work2.equals("전원")) {
						if(Gas_valve_power) {
							boolean result = rc.turnOff(Gas_valve_power);
							Gas_valve_power = result;
						}
						else if(Gas_valve_power == false){
							boolean result2 = rc.turnOn(Gas_valve_power);
							Gas_valve_power = result2;
						}
						
					}
					if(work2.equals("5") || work2.equals("메인메뉴")) {
						System.out.println("메세지)) 메뉴로 돌아갑니다.");
						ch = 1;
						vol = 1;		
						break;
					}
				}
			}
			else if(work.equals("6") || work.equals("종료")) {
				System.out.println("메세지)) 시스템을 종료 합니다.");
				break;
			}
		}
	}
}
