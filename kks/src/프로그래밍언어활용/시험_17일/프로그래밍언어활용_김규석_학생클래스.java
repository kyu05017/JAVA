package 프로그래밍언어활용.시험_17일;

public class 프로그래밍언어활용_김규석_학생클래스 {
	
	//필드 
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total = kor+eng+math;
	private double ave = total/3;
	
	
	//생성자
	public 프로그래밍언어활용_김규석_학생클래스() {
		
	}


	public 프로그래밍언어활용_김규석_학생클래스( String name, int kor, int eng, int math, int total, double ave) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.ave = ave;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getAve() {
		return ave;
	}


	public void setAve(double ave) {
		this.ave = ave;
	}
	
	
	
	
}
