package Day09;

public class Student extends People{
				//서브클래스명 extends 슈퍼클래스명
	//필드
	public int studentNo; // 학생번호
	
	//생성자
	public Student(String name,String ssn,int studentNo) {
		// 부뫀클래스네 맵버 필드 포기화 [ 값넣기]
		// 1. 필드에 접근
		/*
		 * this.name = name;	
		 * this.ssn = ssn;
		 */
		// 2. 생상자의 접근 [ 왠만해서 이렇게 접근하는게 좋음 ]
		super(name,ssn);
		this.studentNo = studentNo;
	}
	
	//메소드
}
