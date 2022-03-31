package 개인과제._06_로또판별기;

import java.util.Random;		//난수객체 임폴트
import java.util.Scanner;		//임력객체 임폴트

public class 로또판별기_5 { //클래스
	public static void main(String[] args) {//메인 메소드
		
		Scanner scanner = new Scanner(System.in);	//입력객체
		Random random = new Random();				//난수객체
		
		int[] mynum = new int[6];		//내번호 배열 생성 배열의 길이는 6개
		int[] comnum = new int[6];		//로또번호 배열 생성 배열의 길이는 6개
		
		//i가 0일때 6까지 1씩 증가하며 반복
		for(int i = 0; i < 6; i++) {
			System.out.println("1~45 사이 숫자 입력");
			//번호 입력받음
			int num = scanner.nextInt();
			//판단에 따라 스위치 역할
			boolean pass = true;
			
			//입력받은수가 1보다 작거나 45보다 크면
			if(num < 1 || num > 45) {
				System.out.println("잘못된 입력입니다.");
				i--;	//기회를 초기화시킴
				pass = false;//거짓값으로 저장하는것 막음
			}
			//j가 0일때 6까지 1씩 증가하며 반복
			for(int j = 0; j < 6;j++) {
				//입력받은수와 배열에 저장된수가 같을경우
				if(num == mynum[j]) {
					System.out.println("이미 선택한 숫자 입니다.");
					i--;	//기회를 초기화시킴
					pass = false;//거짓값으로 저장하는것 막음
				}
			}
			//참이라면 배열에 입력받은숫자를 저장
			if(pass == true ) {
				mynum[i] = num;
			}
		}
		
		System.out.println("당신이 선택한숫자");
		//배열숫자만금 임시를 선언
		for(int temp : mynum) {
			System.out.print(temp + "\t");
		}
		
		//i가 0일때 배열의 길이 6까지 1씩 증가하며 반복
		for(int i = 0; i < comnum.length;i++) {
			//1~45까지의 난수생성
			int ch=random.nextInt(45)+1;
			//스위치 역할
			boolean pass2 = true;
			
			//임시변수  temp가 배열의 길이 만큼 반복
			for(int temp : comnum) {
				//생성된 난수와 배열의 수가 같을 경우
				if(ch == temp) {
					i--; // 기호를 초기화
					pass2 = false; //거짓으로 반환
				}
			}
			//pass2가 참이라면 로또 배열에 난수를 입력
			if(pass2 == true) {
				comnum[i] = ch;
			}
		}
		
		
		// 변수 하나를 생성
		int i =0;
		//temp1 은 저장된 숫자의 배열 임시변수수 만큼 반복
		for(int temp1 : mynum) {
			//temp2는 저장된 로또 난수의 임시변수 만큼 반복
			for(int temp2 : comnum) {
				if(temp1 == temp2) {//두개의 임시변수중 같은것이 있을경우
					i++;// 같은횟수의 반복수만큼 추가됨
				}
			}
		}
		System.out.println("당신이 선택한 숫자"+i);
		
		
		
	}
}
