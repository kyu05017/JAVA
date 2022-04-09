package 개인과제._30_성적표정리프로그램;

import java.util.Scanner;
import java.util.TreeSet;

public class Control {
	
	static Scanner scanner = new Scanner(System.in);
	
	public TreeSet<Student> scoreslsit = new TreeSet<>();
	
	public boolean addscore(String name,int score) {
		
		scoreslsit.add(new Student(name, score));
		DB.in_Custommer_Save();
		return true;
	}
}
