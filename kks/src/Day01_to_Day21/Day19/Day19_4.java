package Day01_to_Day21.Day19;

import java.util.*;

public class Day19_4 {
	
	public static void main(String[] args) {
		
		// p. 747
		
		Hashtable <String, String> map = new Hashtable<>();
		
		map.put("spring","12");
		map.put("summer","123");
		map.put("fall","1234");
		map.put("winter","12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�α���");
			System.out.println("ID : ");
			String id = scanner.next();
			
			System.out.println("PW : ");
			String pw = scanner.next();
			
			System.out.println();
			
			if(map.containsKey(id)) {	// .contains ( Ű ) : ��ü�� �ش� Ű�� �����ϸ� true / �ƴϸ��� false;
									// ���࿡ �Է��� ���̵� ��ü�� key�� �����ϸ� 
				if(map.get(id).equals(pw)) {	
					// ���࿡ key �̿��� �� ȣ�� 
					System.out.println("�α��� �Ϸ�!");
					break;
				}
				else {
					System.out.println("��й�ȣ ����ġ");
				}
			}
			else {
				System.out.println("���̵� ����ġ");
			}
		}
		scanner.close();
	}
	
}
