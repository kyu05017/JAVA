package 개인연습.개인연습;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Format연습 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double num = in.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("00000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,##0원");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,##원");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,##.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("[양수]+#,### ; [음수]-#.###"); 
		System.out.println(df.format(num));
		
		System.out.println("백분율-----------------------");
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		System.out.println("-----------------------");
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		
		
	}
}
