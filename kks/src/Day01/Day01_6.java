package Day01;

import java.util.Scanner;

public class Day01_6 { // c s
	/*
	����2 : �ϳ��� �湮�� 
	[�Էº���]
		1. �ۼ��� , ���� , ��¥ 
	[��� ��]
		 *  --------------�湮��--------------------
		 *  | ���� | �ۼ��� | 	���� 	  | ��¥  |
		 *  |  1    | ��ȣ�� | �ȳ��ϼ���  | 09-28 |
		 *  ----------------------------------------
	*/
	public static void main(String[] args) { // m s 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------- ���� ---------");
		System.out.println("�ۼ��� �̸��� �Է��ϼ���.");
		System.out.println("�Է� : ");
		String name = scanner.nextLine();
		System.out.println("������ �Է��ϼ���.");
		System.out.println("�Է� : ");
		String write = scanner.nextLine();
		System.out.println("��¥�� �Է��ϼ���. ( �� / �� )"); 
		String month = scanner.nextLine();
		String day = scanner.nextLine();
		System.out.println();
		System.out.println("----------------�湮��--------------------");
		System.out.println("| ���� |  �ۼ���  |		����		 |  ��¥  |");
		System.out.println("|  1  | "+name+" | "+write+ " | "+ month + " - " + day);
		System.out.println("----------------------------------------");
		
	} // m e
}//c e