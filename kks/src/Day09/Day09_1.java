package Day09;

import java.util.Scanner;

public class Day09_1 {// c s
	
	
		
		// p.277 ~ 
			// 1) 3 [ �ϳ��� Ŭ������ ������ ��ü ���� ���� ]
			// 2) 4 [ ���ú��� {} ������ ���� (��������) ]
			// 3) 4 [ �ݵ��x ]
			// 4) 3 [ Ŭ������ �ɹ� ���� ������ �������. ]
			// 5) 1 
				// 1. ����ü�� ������x �ν��Ͻ� ������o
				// 2. this.�ʵ��
				//	  this.�޼ҵ��
				//    this() : �� ������ ȣ��
				//    this( ������, ������ ) : ������
	
			// 6) void : �޼ҵ尡 ����Ǹ鼭 ��ȯ���� ����.
				// 4. override : ������ �޼ҵ带 ������
			// 7) 2
	

			// 8) 2
					//static : ���� �ɹ� [ �����ڿ����� static ]
					// ��ü���� Ŭ������ ���� ���� ����  <------> new ������ ��ü�� ����
			
			// 9) 2 : �����ڿ��� �ʱ�ȭ �Ұ���!
					//final : ��� [ �����Ұ� ] 
					// ����� ���������� �빮�ڸ� ����.
	
			// 10) 4 [ �� ��Ŭ����, ���ڸ����� ���� �����ʹ� �ڵ����� ]
	
			// 11) 3 / default : �ش���Ű�� / private : �ش�Ŭ����
	
			// 12) (1)�ʵ�, (2)������, (3)�޼ҵ�
				// {} ������ ������ Ȥ�� �޼ҵ�
				// Ŭ������� �̸��� �����ϸ� ������
				// Ŭ������� �̸��� �������� ������ �޼ҵ�
	
			// 13)
			/*
			 * 1) String name;
			 * 2) String id;
			 * 3) String password;
			 * 4) integer age;
			 */
	
			// 14)
			/*
			 * ������ ����� : Ŭ���� �̸� ����
			 * Member(String name, String id) {
			 * 		this.name = name;
			 * 		this.id = id;
			 * }
			 */
	
			// 15)
			/*	
			 *  �Ű����� : �μ� : �޼ҵ� ȣ��� �޼ҵ�� ������ ������
			 * �α��� �޼ҵ�
			 * boolean login(String id, String password) {
			 * 	if(id.equals("hong") && password.equals("12345")) {
			 * 		//���̵� hong �̸鼭 �н����尡 12345�� true ��ȯ
			 * 		return true;
			 * 	}
			 * 	return false;
			 * }
			 * �α׾ƿ� �޼ҵ� [ ��ȯŸ�� �޼ҵ��( �μ�1, �μ�2) {...} ]
			 * void logout(String id){
			 * 	System.out.println("�α׾ƿ� �Ǿ����ϴ�");
			 * }
			 */
	
			// 16) [ new ] [ �ܱ� ]
			/*	��ü�� ���� �޼ҵ� ȣ��
			 * [ ������ �̸����� �޼ҵ� ������ �����ϰ� [ �� ���� �ٸ� �μ�[�Ű�����] ��� ]]
			 * void println( int x){ // �ܺη� ���� int�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 * void println( boolean x){ // �ܺη� ���� boolean�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 * void println( double x){ // �ܺη� ���� double�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 * void println( String x){ // �ܺη� ���� String�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 */
	
			//17) [ static ] [ ��� ]
			/*
			 *  ��ü�� �������� �ʰ� �޼ҵ带 ȣ���ϴ� ���
			 * static void println( int x){ // �ܺη� ���� int�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 * static void println( boolean x){ // �ܺη� ���� boolean�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 * static void println( double x){ // �ܺη� ���� double�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 * static void println( String x){ // �ܺη� ���� String�� ������ �μ��� �޾� ���
			 * 		System.out.println(x);
			 * }
			 */
	
			//18) pass
	
			//19) ����� ��ũ�� ��ü
		
			//20) 
	
	
	
	public static void main(String[] args) {// m s	
		Scanner scanner; //��ü
		Scanner scanner2 = new Scanner(System.in); // �ν��Ͻ�ȭ

	}// m e

	int method() {
	//��ȯŸ��
		//��ȯŸ���� ������ ������ ������ ��. �ݵ�� �����ؾ���
		return 1;
	}
	void method2() {
	//��ȯŸ���� void�� ������ ��� �ȴ�.
		return; 
	}
	
	
	

}// c e
