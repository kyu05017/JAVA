package 프로그래밍언어활용.평가연습_17일;

import java.util.Scanner;

public class 연습3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Students[] studentlist = new Students[100];
		try {
			while(true) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("\t성\t적\t표");
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				//성적표 표시
				for(int i = 0; i <studentlist.length; i++) {
					for(int j = 0; j < studentlist.length; j++) {
						if(studentlist[i] != null && studentlist[j] != null) {
							if(studentlist[i].getTotal() > studentlist[j].getTotal()) {
								Students[] temp = new Students[1];
								temp[0] = studentlist[i];
								studentlist[i] = studentlist[j];
								studentlist[j] = temp[0];
								
							}
						}
					}
				}
				int i = 0;
				for(Students temp : studentlist) {
					if(temp != null) {
						System.out.printf("%d\t%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								(i+1),temp.getName(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTotal(),temp.getAve(),(i+1));
					}
					i++;
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("1)학생등록 2)학생삭제");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("학생등록))");
					System.out.println("학생번호 : \n");
					int num = scanner.nextInt();
					System.out.print("학생이름 : \n");
					String name = scanner.next();
					System.out.print("국어점수 : \n");
					int kor = scanner.nextInt();
					System.out.print("영어점수 : \n");
					int eng = scanner.nextInt();
					System.out.print("수학점수 : \n");
					int math = scanner.nextInt();
					int total = kor+eng+math;
					double avg = total/3;
					
					Students students = new Students(name, kor, eng, math, total, avg);
					
					int j = 0;
					for(Students temp : studentlist) {
						if(temp == null) {
							studentlist[j] = students;
							break;
						}
						j++;
					}
				}
				else if(ch == 2) {
					System.out.println("학생삭제))");
					System.out.print("삭제할 학생의 번호 : \n");
					int num = scanner.nextInt();
					
					for(int h = num-1;h <studentlist.length;h++) {
						if( h == studentlist.length-1) {
							studentlist[ studentlist.length-1 ] = null;
						}
						else {
							studentlist[h] = studentlist[h+1];
						}
					}
				}
				else {
					System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
				}
			}
		}
		catch(Exception e) {
			System.err.println("메세지) 오류");
			scanner = new Scanner(System.in);
		}
	}

}
