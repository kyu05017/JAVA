package 개인과제._30_성적표정리프로그램;

public class Main {
	public static void main(String[] args) {
		Control con = new Control();
		DB.in_Custommer_Load();
		
		while(true) {
			System.out.println("성적표 정리 프로그램))");
			System.out.println("----------------------------------------");
			for(Student temp : con.scoreslsit) {
				System.out.println(temp.getName() +" | "+ temp.getScore()+ "점");
			}
			System.out.println("----------------------------------------");
			System.out.println("1)성적등록 2)종료");
			String work = Control.scanner.next();
			if(work.equals("1")) {
				System.out.println("이름 : ");
				String name = Control.scanner.next();
				System.out.println("성적 : ");
				int score = 0;
				try {
					score = Control.scanner.nextInt();
				}
				catch (Exception e) {
					System.out.println("성적은 숫자만 입력가능합니다.");
				}
				boolean result = con.addscore(name, score);
				if(result) {
					System.out.println("저장완료");
				}
			}
			else if(work.equals("2")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
