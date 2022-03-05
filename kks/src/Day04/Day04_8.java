package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_8 {

	public static void main(String[] args) {
		
		
		int[] myNum = new int[6];
		int[] lottoNum = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//사용자에게 번호 입력받기
		for(int i = 0; i < 6; i++) {
			int inputNum = scanner.nextInt();
			boolean pass = true;
			System.out.println((i+1)+"째 번호 입력됨");
			//입력조건을 만들어준다
			if(inputNum < 1 || inputNum > 45) {
				System.out.println("사용가능한 번호는 1 ~ 45 사이 입니다.");
				i--;
				pass = false;
			}
			//중복체크
			for(int j = 0; j < myNum.length; j++) {
				if(inputNum == myNum[j]) {
					System.out.println("같은 번호를 입력할수 없습니다.");
					i--;
					pass = false;
				}
			}
			if(pass = true) {//위에 항목을 통과하여 나오면
				myNum[i] = inputNum;//myNum에 inputNum을 저장한다.
			}
		}
		System.out.println("----입력한 숫자----");
		//저장된 값 출력해보기
		for(int temp : myNum) {
			System.out.print(temp + " ");
		}
		
		//로또 번호 생성
		for(int i = 0; i < 6; i++) {
			int lotto = random.nextInt(45)+1;
			boolean pass2 = true;
			
			for(int temp : lottoNum) {
				if(lotto == temp) {
					i--;
					pass2 = false;
				}
			}
			if(pass2 == true) {
				lottoNum[i] = lotto;
			}
		}
		System.out.print("\n \t추첨번호\t: ");
		// * 배열내 모든 인덱스 출력 
		for( int temp : lottoNum ) {
			System.out.print( temp +"\t");
		}
		
		
	}//m e
}//c e
