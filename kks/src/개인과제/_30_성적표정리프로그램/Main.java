package 개인과제._30_성적표정리프로그램;

public class Main {
	public static void main(String[] args) {
		Control con = new Control();
		Control.Load();
		
		while(true) {
			System.out.println("성적표 정리 프로그램))");
			System.out.println("----------------------------------------");
			for(Student temp : Control.scoreslsit) {
				System.out.println(temp.getName() +" | "+ temp.getScore()+ "점");
			}
			System.out.println("----------------------------------------");
			System.out.println("1)성적등록 2)삭제 3)모든학생지우기 4)종료");
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
				System.out.println(name + " | " + score);
				
				boolean result = con.addscore(name, score);
				if(result) {
					System.out.println("저장완료");
				}
			}
			else if(work.equals("2")) {
				System.out.println("이름 : ");
				String name = Control.scanner.next();
				for(Student temp : Control.scoreslsit) {
					if(temp.getName().equals(name)) {
						boolean result = con.delete_score(name);
						if(result) {
							System.out.println("삭제완료");
							break;
						}						
					}
					else {
						System.out.println("존재하지 않는 학생입니다.");
					}
				}
				boolean result = con.delete_score(name);
				if(result) {
					System.out.println("삭제완료");
				}
				
			}
			else if(work.equals("3")) {
				System.out.println("목록을 초기화 합니다.");
				Control.scoreslsit.clear();
				Control.Save();
			}
			else if(work.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
