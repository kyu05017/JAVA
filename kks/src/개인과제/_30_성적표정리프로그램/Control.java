package ���ΰ���._30_����ǥ�������α׷�;

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
