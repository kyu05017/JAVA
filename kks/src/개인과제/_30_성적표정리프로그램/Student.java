package 개인과제._30_성적표정리프로그램;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		if(score > o.score) return 1;
		else if (score == o.score) return 0;
		else return -1;
	}
}
