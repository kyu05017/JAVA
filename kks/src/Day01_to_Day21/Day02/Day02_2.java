package Day01_to_Day21.Day02;

public class Day02_2 { // c s

	public static void main(String[] args) { // m s
		
		//p.40
		
		//; �����ݷ� : �����������
		//������ �������� ����Ҽ� ����.
		
		//byte : 1����Ʈ =+128
		byte var1 = -128; System.out.println(var1);
		byte var2 = -30;  System.out.println(var2);
		byte var3 = 30;   System.out.println(var3);
		//byte var4 = 300; 
			//�����߻� : 128�̻��� �����Ҽ� ����.
		
		byte var4 = 'j'; System.out.println(var4); 
			//j�� �ƽ�Ű�ڵ�� ��ȯ�Ͽ� ���.
			//���ڸ� �Է������� �����κ�ȯ�� �Ѵ�.
			//���ڸ� > ������ ��Ģ�� �ƽ�Ű �ڵ�.
		
		// p.43 char : 2����Ʈ [ �ϳ��� ���ڸ� ���� ] : �����ڵ�(2����Ʈ :���� �����[�뷮�� ũ��]) vs �ƽ�Ű�ڵ�
		char c1 = 'a'; System.out.println(c1);
		char c2 = 97; System.out.println(c2);		// 10���� : 0~9
			//���� -> ���� ��ȯ
		char c3 = '\u0041'; System.out.println(c3); // 16������ ǥ��
		char c4 = '��'; System.out.println(c4);
		char c5 = 44032; System.out.println(c5); 
		char c6 = '\uac00'; System.out.println(c6);
		//���� : ��ǻ�� 2������ ����ϸ� ǥ���Ҽ� �ִ� ������ ����. --> ǥ�������� �پ缺�� ���ؼ� ���
			//2���� 0 , 1 -> ������� (2���ڵ�) / �뷮 1��Ʈ
			//8���� 0 ~ 7
			//10���� 0 ~ 0
			//16���� 0 ~9 a b c d e f
		
		//p.43
			//short : 2 ����Ʈ ������ +-3������ 
	
		short num1 = 30000; System.out.println(num1);
		//short num2 = 40000; System.out.println(num2);//�����Ҽ� �ִ� ���� �Ѿ��⿡ ������ ��
		
		//p.44 int : 4����Ʈ ���� +-20������ ( ���� �⺻Ÿ�� )
		int num2 = 10; System.out.println(num2); // 10����
		int num3 = 012; System.out.println(num3);// 8������ �տ� 0 ���̱� 0 1 2 3 4 5 6 7 10 11 12 * * *
		int num4 = 0xA; System.out.println(num4);// 16������ �տ� 0x�� ���� 0 1 2 3 4 5 6 7 8 9 A B C D E F
	
		//p.46 long : 8����Ʈ ���� +-20�� �̻� 
		//long num5 = 10; System.out.println(num5);
		long num5 = 100000000000L; System.out.println(num5);//���� L�� ���δ� ���ٸ� �����͸� int ������ �ν�
					//int �� -> long��
		//p.47~48 float[������ �ڿ� f ](�Ǽ���) : 4����Ʈ(8�ڸ�)  / double(�Ǽ��� �⺻Ÿ��) : 8����Ʈ : 17 �ڸ����� ǥ��
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14F; System.out.println(num7);
		
		double num8 = 0.1234567891234567891234567111111111111189; System.out.println(num8);
		float num9 = 0.1231254654613121353213215454F; System.out.println(num9); 
		
		//p.48 boolean : 1��Ʈ [treu Ȥ�� false ]
			// ����ġ ������ �Ѵ� : on , off 
		
		boolean bol = true; System.out.println(bol);
		
		//p.49 : Ÿ�Ժ�ȯ 
			// ----------->>>>>>>>---------�ڵ�����ȯ------>>>>>>>>-----
			// * ũ����� : byte > short > int > long > float > double
			//---------<<<<<<<<<<������ ��ȯ ��
			//1. �ڵ� ����ȯ
				//���� ���ڿ��� ū���ڷ� �̵�����
				//ū ���ڿ��� ���� ���ڷ� �̵��Ұ�
		byte ����Ʈ = 10;
		
		int  ��Ʈ = ����Ʈ;//�ڵ� ����ȯ�� �ȴ�.
		//ĳ��Ʈ 
		//short ��Ʈ = ��Ʈ;// �ڵ� ����ȯ�� �ȵȴ�.
		
			//2.���� ����ȯ
				//ū ���ڷ� �̵������ϳ� �����Ϳ� �ս��� �ִ�.
				//(������ �ڷ���)������
		short ��Ʈ = (short)��Ʈ;
		
		//p.60 ��������
			//1. 4��
			//2. 1,4,5 [ ������ ���ڷ� �����Ҽ� ����. �̸�������� �ܾ�� ���Ұ� ] 
			//3. byte short int   long
			//        chat
			//				float double
			//boolean
			//4. Ÿ��   : int , double
			//   �̸�   : age , prise
			// ���ͷ�(��): 10 , 3.14
			//5. 3��
			//6. 4�� 		char(����) = String(����'��') [x]
			//*String �� ��ü�̴�. (String�� class��)
			// �⺻�ڷ���(����Ŭ����) ����� �޸𸮴� ���� -> �޸� �Ҵ� / new �� �Ⱦ���
			// Ŭ������ ����� �޸𸮴� ��ü 		   -> �޸� �Ҵ� / new�� ����
			//7. 3��
			//8. 1�� [�ڷ��� ����� �ڷ��� ��ȯ] : �������� ���� ��� int, �Ǽ����� ���� ��� double�� ����ȯ.
				//1. byte + byte -> int => byte [x]
				//2. int  + byte -> int => int   [ �ڵ�����ȯ ]
				//3. int + float -> int => float [ �ڵ�����ȯ ]
				//4. int + double-> int => folat [ �ڵ�����ȯ ]
		
		
		
	}

}







