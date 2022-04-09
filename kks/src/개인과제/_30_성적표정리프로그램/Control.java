package 개인과제._30_성적표정리프로그램;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class Control {
	
	static Scanner scanner = new Scanner(System.in);
	
	static TreeSet<Student> scoreslsit = new TreeSet<>();
	
	public boolean addscore(String name,int score) {
		System.out.println(name + " | " + score);
		Student student = new Student(name, score);
		scoreslsit.add(student);
		Save();
		return true;
	}
	public boolean delete_score(String name) {
		for(Student temp : scoreslsit) {
			if(temp.getName().equals(name)) {
				scoreslsit.remove(temp);
				return true;
			}
		}
		Save();
		return false;
	}
	public static void Save() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/studnets0409.txt");
			for(Student temp : scoreslsit) {
				String c_save = temp.getName()+","+temp.getScore()+"\n";
				outputStream.write(c_save.getBytes());
			}
		} 
		catch (Exception e) {
			System.out.println("파일 저장 실패 " + e);
		}
	}
	public static void Load() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/studnets0409.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			int i = 0;
			for(String temp : list) {
				if( i+1 == list.length ) {
					break; 
				}
				String[] filed = temp.split(",");
				Student temp2 = new Student(filed[0],Integer.parseInt(filed[1]));
				scoreslsit.add(temp2);
				i++;
			}
			
		}
		catch (Exception e) {
			System.out.println("파일 불러오기 실패 " + e);
		}
	}
}
