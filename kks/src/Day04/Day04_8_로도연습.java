package Day04;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Day04_8_로도연습 {//c s

	public static void main(String[] args) {//m s
		
		// 로또 판별기
		//1. 사용자가 6개 수 입력받기 => 배열저장
			// 1. 1~45 사이 수만 입력 받기 아니면 재입력
			// 2. 중복이면 재입력
		//2. 추첨번호 : 컴퓨터 난수 6개 발생 => 저장 
			//1. 1~ 45 사이
			//2. 중복 x
		//3사용자 추첨번호와 컴ㅍ퓨터 추첨번호 동일 수의 개수
		
		//변수 준비
		int[] choiceMyNum = new int[6];//사용자에게 입력받을 6개의 숫자 0~5 [순번]
		int[] lottoNum    = new int[6];//컴퓨터가 생성할 난수 6개 0~5[순번] 
		
		Scanner scanner = new Scanner(System.in); // 입력 객체
		Random random = new Random(); //난수 객체
		
		System.out.println("로또 판별기 1 ~ 45 사이 숫자 입력");
		
		//사용자에게 숫자 입력받기
		for(int i = 0; i < 6; i++) {
			//i가 1씩 증가하며 6미만까지 반복한다.
			System.out.println((i+1) + "번째 숫자 입력");
			int putMyNum = scanner.nextInt();//사용자에게 입력받는 정수
			boolean pass = true; // true 와 false를 둬서 저장여부를 결정
			
			//입력된 정수의 범위를 결정함
			if(putMyNum < 1 || putMyNum > 45) {
				System.out.println("지정할수 있는숫자가 아닙니다.");
				i--;
				pass = false;
			}
			
			//중복여부 결정
			for(int j = 0; j < 6; j++) {
				if(putMyNum == choiceMyNum[j]) {
					System.out.println("이미 입력한 숫자 입니다.");
					i--; //사용된 반복수량을 반환함
					pass = false; //false를 둬서 저장하지 않게함
				}
			}

			//위에 조건이 모두 성립할 경우 choiceMyNum에 putMyNum을 대입
			if(pass == true) {
				choiceMyNum[i] = putMyNum; 
			}
		}//입력 반복문 종료
		
		
		System.out.println();
		System.out.println("-----입력된 추첨번호-----");
		if(choiceMyNum[0] > choiceMyNum[1]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[1];
			choiceMyNum[1] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[2]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[2];
			choiceMyNum[2] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[3]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[3];
			choiceMyNum[3] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[4]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[5]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[1] >choiceMyNum[2]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[2];
			choiceMyNum[2] = min;
		}
		if(choiceMyNum[1] > choiceMyNum[3]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[3];
			choiceMyNum[3] = min;
		}
		if(choiceMyNum[1] > choiceMyNum[4]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[1] > choiceMyNum[5]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[2] > choiceMyNum[3]) {
			int min = choiceMyNum[2];
			choiceMyNum[2] = choiceMyNum[3];
			choiceMyNum[3] = min;
		}
		if(choiceMyNum[2] > choiceMyNum[4]) {
			int min = choiceMyNum[2];
			choiceMyNum[2] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[2] > choiceMyNum[5]) {
			int min = choiceMyNum[2];
			choiceMyNum[2] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[3] > choiceMyNum[4]) {
			int min = choiceMyNum[3];
			choiceMyNum[3] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[3] > choiceMyNum[5]) {
			int min = choiceMyNum[3];
			choiceMyNum[3] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[4] > choiceMyNum[5]) {
			int min = choiceMyNum[4];
			choiceMyNum[4] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		System.out.print(choiceMyNum[0]+" "+choiceMyNum[1]+" "+choiceMyNum[2]+" "+choiceMyNum[3]+" "+choiceMyNum[4]+" "+choiceMyNum[5]);
		
		//컴퓨터가 난수 생성하기
		
		for(int i = 0; i < 6; i++) {
			int randomLottoNum = random.nextInt(45)+1; //뒤에 덧셈은 그 그자리수 부터 시작한다는것을 의미 한다
			boolean pass2 = true;
			
			//중복여부결정
			for(int j = 0; j < 6; j++) {
				if(randomLottoNum == lottoNum[j]) {
					i--;
					pass2 = false;
				}
			}
			
			if(pass2 == true) {
				//만약에 pass2가 참일경우 lottoNum[]에 생성된 randomLottoNum을 대입한다
				lottoNum[i] = randomLottoNum;
			}
		}//로또 난수 저장 종료
		
		System.out.println();
		System.out.println("-----이번회차 추첨번호-----");

		if(lottoNum[0] > lottoNum[1]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[1];
			lottoNum[1] = min;
		}
		if(lottoNum[0] > lottoNum[2]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[2];
			lottoNum[2] = min;
		}
		if(lottoNum[0] > lottoNum[3]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[3];
			lottoNum[3] = min;
		}
		if(lottoNum[0] > lottoNum[4]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[0] > lottoNum[5]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[1] > lottoNum[2]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[2];
			lottoNum[2] = min;
		}
		if(lottoNum[1] > lottoNum[3]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[3];
			lottoNum[3] = min;
		}
		if(lottoNum[1] > lottoNum[4]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[1] > lottoNum[5]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[2] > lottoNum[3]) {
			int min = lottoNum[2];
			lottoNum[2] = lottoNum[3];
			lottoNum[3] = min;
		}
		if(lottoNum[2] > lottoNum[4]) {
			int min = lottoNum[2];
			lottoNum[2] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[2] > lottoNum[5]) {
			int min = lottoNum[2];
			lottoNum[2] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[3] > lottoNum[4]) {
			int min = lottoNum[3];
			lottoNum[3] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[3] > lottoNum[5]) {
			int min = lottoNum[3];
			lottoNum[3] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[4] > lottoNum[5]) {
			int min = lottoNum[4];
			lottoNum[4] = lottoNum[5];
			lottoNum[5] = min;
		}
		System.out.print(lottoNum[0]+" "+lottoNum[1]+" "+lottoNum[2]+" "+lottoNum[3]+" "+lottoNum[4]+" "+lottoNum[5]);
		
		int sameNum = 0;
		
		for(int i = 0; i < choiceMyNum.length; i++) {
			for(int j = 0; j < lottoNum.length; j++) {
				if(choiceMyNum[i] == lottoNum[j]) {
					sameNum++;
				}
			}
		}
		System.out.println();
		System.out.println("동일한 숫자의 수 " + sameNum);
		
	}// m e
}// c e
