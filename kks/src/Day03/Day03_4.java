package Day03;

import java.util.Scanner;

public class Day03_4 {//cs

	public static void main(String[] args) {//ms
		
		// ��� : 1.if 2.switch
			//if     : �� �˻�(true of false) /����Ǽ��� ������ ���� �ʴ°��
				//>=, <=, ==, !=
			//switch : ������ �˻� (���� �˻�) /����Ǽ� ������ �ִ� ��� //����ӵ��� �ʹ� ������
				//������ case �̸� ���๮ó�� �� -> ���� case�� �̵�
				//����
					//switch ( �˻��� ){
						//case '��' : ���๮;
						//case '��' : ���๮;
						//case '��' : ���๮;
						//�׿�
						//defailt : ���๮;
						//}
		
				//break;  : ���� ����� switch Ȥ�� �ݺ��� Ż��[������]
		
		
		//����1) ���� �� 90 ���̸� A 80 ���̸� B 70���̸� C �׿� Ż��
		int num = 80;
		if(num==90)System.out.println("A");
		else if(num==80)System.out.println("B");
		else if(num==70)System.out.println("C");
		else System.out.println("Ż��");
		
		System.out.println("----------------------------------------------------------");
		
		switch (num) {
			case 90 : System.out.println("A���"); break;
			case 80 : System.out.println("B���"); break;
			case 70 : System.out.println("C���"); break;
			default : System.out.println("Ż�� "); break;
		}
		
		System.out.println("----------------------------------------------------------");
		//����2) 
		int ��ư =3;
		
		switch (��ư) {
			case 1  : System.out.println("1������ �̵�"); break;
			case 2  : System.out.println("2������ �̵�"); break;
			case 3  : System.out.println("3������ �̵�"); break;
			case 4  : System.out.println("2������ �̵�"); break;
			default : System.out.println("����"); 
		}
		
		System.out.println("----------------------------------------------------------");
		
		//����3)
		char ��� = 'B';
		
		switch (���) {
			case 'A': 
			case 'B': System.out.println("���ȸ��");break;
			case 'C':
			case 'D': System.out.println("�Ϲ�ȸ��");break;
			default : System.out.println(" �մ� ");
		}
		
		System.out.println("----------------------------------------------------------");
		
		//����4)
		String ���� = "����";
		switch (����) {
		case "����": System.out.println("700����");break;	
		case "����": System.out.println("500����");break;
		default   : System.out.println("300����");break;
	
		}
		
		System.out.println("----------------------------------------------------------");
		
		//����1) ����,����, ���� ������ �Է������� ����� 90�� �̻��̸� A 80���̻��̸� B ������ Ż��
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������� �Է�"); int ���� = scanner.nextInt();
		System.out.println("�������� �Է�"); int ���� = scanner.nextInt();
		System.out.println("�������� �Է�"); int ���� = scanner.nextInt();
		
		int total = (���� + ���� + ����) /3;
		
		
		System.out.println("��� : " + total + " ������ /10 : " + (total/10));
		
		switch (total/10) { // 1�� �ڸ��� ���� �ؼ� ���
			case  9 : System.out.println("A���"); break;
			case  8 : System.out.println("B���"); break;
			default  : System.out.println(" Ż��"); break; //�������� default�� break�� ���� �ʾƵ� �ȴ�,		
		}
		
		//�ٸ� ������ ������ ���� ���� ����� �ִ� �׷���� if �� ��õ
		

	}//me

}//ce
