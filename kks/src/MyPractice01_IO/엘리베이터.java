package MyPractice01_IO;

import java.util.Scanner;

public class 엘리베이터 {
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 int nowFloor = 1;
		 
		 while(true) {
			 System.out.println("엘리베이터");
			 System.out.println("엘리베이터에 탑승합니다");
			 
			 int floor = scanner.nextInt();
			 
			 while(true) {
				 System.out.println();
				 System.out.println("원하는 층수를 입력하세요");
				 
				 if (floor == nowFloor) {
					 System.out.println("현재층수와 같습니다.");
				 }
				 else if(floor > nowFloor) {
					 System.out.println("위로 갑니다");
					 break;
				 }
				 else if(floor < nowFloor) {
					 System.out.println("아래로 갑니다");
					 break;
				 }
				 else {
					 System.out.println("존재하지 않는 층수 입니다.");
				 }
			 }
			 
			 switch(floor) {
				 case 1 : {
					 System.out.println("1층으로 이동합니다");
					 nowFloor = 1;
					 break;
				 }
				 case 2 : {
					 System.out.println("2층으로 이동합니다");
					 nowFloor = 2;
					 break;
				 }
				 case 3 : {
					 System.out.println("3층으로 이동합니다");
					 nowFloor = 3;
					 break;
				 }
				 case 4 : {
					 System.out.println("4층으로 이동합니다");
					 nowFloor = 4 ;
					 break;
				 }
				 case 5 : {
					 System.out.println("5층으로 이동합니다");
					 nowFloor = 5;
					 break;
				 }
				 default : {
					 System.out.println("존재하지 않는 층수 입니다.");
					 break;
				 }
			 }
		 }
	}
}
