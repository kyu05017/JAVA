package Day3;

import java.util.Scanner;

public class Day03_3 { //c s

	public static void main(String[] args) {//m s
		
		// ���� 6: ������ �Է¹޾� 90�� �̻��̸� �հ� �ƴϸ� ���հ�
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է� :");int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println(score + "�� �հ��Դϴ�");
		}else {
			System.out.println(score + "�� ���հ��Դϴ�");
		}
		
		
		// ���� 7: ������ 90�� �̻��̸� A��� 
		//			   80�� �̻��̸� B���
		//			   75���̻��̸� C���
		
		System.out.println("���� �Է� :");int grade = scanner.nextInt();
		
		if(grade >= 90) {
			System.out.println(score + "�� A����Դϴ�.");
		} else if (grade >= 80) {
			System.out.println(score + "�� B����Դϴ�.");
		} else if (grade >= 75) {
			System.out.println(score + "�� C����Դϴ�.");
		} else {
			System.out.println(score + "�� �̴��Դϴ�.");
		}
		
		//����8 �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
		// [ ���� ] : ȸ�����̵� admin �̰� 
		//           ��й�ȣ�� 1234 �� ��쿡�� 
		//          �α��� ���� �ƴϸ� �α��� ���� ���
		
		String id = "admin";
		String pw = "1234";
		System.out.println("���̵� �Է��ϼ���"); String putId = scanner.nextLine();
		if(putId.equals(id)){
			System.out.println("��й�ȣ�� �Է��ϼ���");String putPw = scanner.nextLine();
			if(putPw.equals(pw)) {
				System.out.println("�α��ο� �����߽��ϴ�.");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
		}

	}//m e

}//c e
