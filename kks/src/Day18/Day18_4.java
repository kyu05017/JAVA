package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		// ����� ���α׷�
			// 1.����߰� 2.������ [ ������] 3. ����� ����
		
		ArrayList<wait_person> waitlist = new ArrayList<>();
		
		int waitnum = 1;
		
		while(true) {
			System.out.println("��� ���))");
			System.out.println("����ȣ  ��� ");
			
			for(wait_person temp : waitlist) {
				if(waitlist.indexOf(temp) == 0) {
					System.out.println(temp.waitting_num + " " + temp.persons+ "�ٷ����尡��");
				}
				else {
				System.out.println(temp.waitting_num + " " + temp.persons+ " "+ waitlist.indexOf(temp)*3+"��");
				}
			}
			
			System.out.println("�޴�))");
			System.out.println("1)����߰� 2)������ 3)����");
			
			String work = scanner.next();
			
			if(work.equals("1")) {
				System.out.println("��� �߰�");
				System.out.println("��ȭ��ȣ : ");
				String phone = scanner.next();
				System.out.println("�ο��� �Է� :");
				int members = scanner.nextInt();
				
				wait_person wait = new wait_person(waitnum, phone, members);
				
				waitlist.add(wait);
				// * ����ȣ�� ����
				waitnum++;
			}
			else if(work.equals("2")) {
				System.out.println("��� ���");
				System.out.println("����� ����ȣ : ");
				int input = scanner.nextInt();
				
				for(wait_person temp : waitlist) {
					if(temp.waitting_num == input) {
						waitlist.remove(temp);
						break;
					}
				}
				
			}
			else if(work.equals("3")) {
				System.out.println("���� �տ��ִ� ����ڸ� ����");
				waitlist.remove(0);
				
				
			}
			else {
				System.out.println("���� �޴�");
			}
		}
	}
}


