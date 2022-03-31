package 프로그래밍언어활용.평가연습_17일;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		
		
		
		Students[] studentlist = new Students[100];//100명
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("\t성\t적\t표");
				System.out.println("-------------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				int i = 0;
				for(Students temp : studentlist) {
					if(temp != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",
								(i+1),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTotal(),temp.getAve());
					}
					i++;
				}
				System.out.println("-------------------------------------------------------------------");
				System.out.println("1)학생등록 2)학생삭제");
				int ch = scanner.nextInt();
				if(ch == 1) {
					System.out.println("학생추가)");
					System.out.println("학생번호 : ");
					int num = scanner.nextInt();
					System.out.println("이름 입력 :");
					String name = scanner.next();
					System.out.println("국어점수 : ");
					int korean = scanner.nextInt();
					System.out.println("영어점수 : ");
					int english = scanner.nextInt();
					System.out.println("수학점수 : ");
					int math = scanner.nextInt();
					int total = korean+english+math;
					double avg = total/3;
					
					Students students = new Students(name, korean, english, math, total, avg);
					int j = 0;
					for(Students temp : studentlist) {
						if(temp == null) {
							studentlist[j] = students;
							int h = 0;
							for(Students temp2 : studentlist) {
								if(temp.getTotal() > temp2.getTotal()) {

										studentlist[j] = studentlist[h];
								}	
								h++;
							}

						}
						j++;
					}
				}
				else if(ch == 2) {
					String name = scanner.next();
					int j = 0;
					for(Students temp : studentlist) {
						if(temp != null && name.equals(temp.getName())) {
							studentlist[j-1] = studentlist[j];
							studentlist[j] = null;	
							break;
						}
						j++;
					}
				}
			}
			catch(Exception e) {
				scanner = new Scanner(System.in);
			}
			
			
		}
		
	}
	
}
