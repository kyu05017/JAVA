package Day03;

import java.util.Scanner;

public class Day03_3 { //c s

	public static void main(String[] args) {//m s
		
		// ���� 6: ������ �Է¹޾� 90�� �̻��̸� �հ� �ƴϸ� ���հ�
		
		Scanner scanner = new Scanner(System.in);
		/*
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
		*/
		String id = "admin";
		int pw = 1234;
		System.out.println("���̵� �Է��ϼ���");
		String putId = scanner.nextLine();
		
		//char�� ���� �Ѱ� �ۿ� �����Ҽ� ����.
		//�ڷ������� ���ڿ��� �����Ҽ� ����.
			//1.String Ŭ���� ����ϸ� ���ڿ� ���尡��
			//2.char �迭 /����Ʈ ����ϸ� ����
		//��ü�� ����Ұ�
			//�ڷ��� ����ϴ� ������ �����ڴ� ��밡��
			//Ŭ������ ����ϴ� ��ü�� ������ ��밡�� -> �޼ҵ�
				//���ڿ� �񱳽� .equals
				//���ڿ�1.equals(���ڿ�2)
				//
		boolean �α��μ��� = false;
			//True or False �� ��� ����
		if(putId.equals(id)){ //���̵� ������ ���� �ƴϸ� ����Ұ�
			//id�� Ŭ���� ��ü�̱� ������ == �Ұ��� //��ü �񱳽� ���� .equals
			System.out.println("��й�ȣ�� �Է��ϼ���"); 
			int putPw = scanner.nextInt();
			if(putPw == pw) { //��й�ȣ�� ������ ���� �ƴ϶�� ����Ұ�
				// �ڷ��� �����̱� ������ === ����
				System.out.println("�α��ο� �����߽��ϴ�.");
				�α��μ��� = true; // id,pw �� ��� �����ϸ� ������ ���� [ 
			} else { //��й�ȣ�� Ʋ����
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {//���̵� admin�� �ƴ϶��
			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
		}
		if ( �α��μ��� == false) {
			System.out.println("�α��� ����");
			//�α��� ���������� false��� ���
		}
		
		//����9 
		//[�Է�] : ���� ���� ����
		//[����] : ��� 90�� �̻��̸鼭 �������� 100�̸� 
		//						 �������� 100���̸�
		//						 �������� 100���̸�
		
		System.out.println("�������� �Է� :");int ���� = scanner.nextInt();
		System.out.println("�������� �Է� :");int ���� = scanner.nextInt();		
		System.out.println("�������� �Է� :");int ���� = scanner.nextInt();
		
		int total = (���� + ���� + ����)/3;
		
		if(total >= 90){//��� 90�� �̻��̸�
				//if ��ø
			if(����==100) {
				System.out.println("������");
			}if (���� == 100) {
				System.out.println("������");
			}if (���� == 100 ) {
				System.out.println("���п��");
			}
		} else if(total >= 80) { //��� 80�� �̻��̸�
				//if ��ø
			if(����>=90) {
				System.out.println("�������");
			}if (���� >=90) {
				System.out.println("�������");
			}if (���� >=90 ) {
				System.out.println("�������");
			}
		} else {
			System.out.println("�����");
		}
		
	}//m e

}//c e

