package 평가연습_17일;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 연습1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//변수란
		int[] students = new int[100];
		String[] nam = new String[students.length];
		int[] kor = new int[students.length];
		int[] eng = new int[students.length];
		int[] mat = new int[students.length];
		int[] tot = new int[students.length];
		double[] avg = new double[students.length];
		int[] rank = new int[students.length];
		
 		try {
			while(true) {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("\t성\t적\t표");
				System.out.println("-------------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				//성적표 나오는 곳
				for(int i = 0; i< students.length;i++) {
					if(nam[i] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",i+1,nam[i],kor[i],eng[i],mat[i],tot[i],avg[i]);
					}
				}
				
				System.out.println("-------------------------------------------------------------------");
				System.out.println("1)학생등록 2)학생삭제");
				
				int ch = scanner.nextInt();
				if(ch == 1) {
					System.out.println("학생추가)");
					System.out.println("이름 입력 :");
					String name = scanner.next();
					System.out.println("국어점수 : ");
					int korean = scanner.nextInt();
					System.out.println("영어점수 : ");
					int english = scanner.nextInt();
					System.out.println("수학점수 : ");
					int math = scanner.nextInt();

					for(int i = 0; i < students.length; i++) {
						if(nam[i] == null) {
							students[i] = i;
							nam[i] = name;
							kor[i] = korean;
							eng[i] = english;
							mat[i] = math;
							tot[i] = (kor[i]+eng[i]+mat[i]);
							avg[i] = (kor[i]+eng[i]+mat[i])/3;
							rank[i] = 1;
							System.out.println("학생등록 완료~!");
							break;
						}
					}
				}
				else if (ch == 2) {
					System.out.println("학생삭제)");
					System.out.println("학생 이름 :");
					String name = scanner.next();
					
					for(int i = 0; i < students.length;i++) {
						if(nam[i] != null && nam[i].equals(name)){
							nam[i] = null;
							kor[i] = 0;
							eng[i] = 0;
							mat[i] = 0;
						}
					}
				}
				else {
					System.out.println("잘못된 입력");
				}
			}
		}
		catch(InputMismatchException e) {
		System.out.println("숫자만 입력 가능합니다.");
		}
	}
}
