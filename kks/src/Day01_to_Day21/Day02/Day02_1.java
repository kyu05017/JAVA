
//Ȯ����� ��Ʈ�� +-
//�ּ�ó���� ����ȭ ���� [�ڵ� ����]
//�ּ� 1. // 2, ./**/

package Day01_to_Day21.Day02; // ��Ű�� �̸�

public class Day02_1 { // Ŭ���� ����

	//1. ��� �ڵ��ۼ��� Ŭ���� {} �ȿ��� �ۼ��Ѵ�.
	//2. ������ �ڵ�� main �Լ� {} �ȿ��� �ۼ��Ѵ�. [������ : �ڵ带 �о��ִ� ����]
	//3. �ڵ��ϼ� 1~3���� �Է��� Ctrl + �����̽�
	//4. �߰�ȣ {} �ȿ��� tap
	
	//�޸� : ��ǻ�Ϳ��� �����ϴ� ����  [ RAM ] : �ڿ����� 
	
	//����
		//1. �����͸� 1�� �����ϴ� �޸� ���� [ ������� ]
		//2. ���� ���� [ �ڷ�� ������ ; ]
		//3. ���� �ʱ�ȭ(ó����) [ �ڷ��� ������ = ������; ]
		//4. ���� ȣ�� [�����̸�]
	//�뷮 ����
		// 0 Ȥ�� 1 -> 1��Ʈ
		// 01010101 -> 8��Ʈ -> 1 ����Ʈ
		// 1024����Ʈ -> 1kb -> 1024kb -> 1mb -> 1024mb -> 1gb 
	//�ڷ���
		//1. �޸𸮸� ȿ������ ���� �Ʋ�����.
		//boolean - 1��Ʈ   : �� ���� 0,1 true false
		//char    - 2����Ʈ  : ���� 1�� [�ƽ�Ű�ڵ� > �����ڵ�] 
		//byte    - 1����Ʈ  : ���� +-128
		//short   - 2����Ʈ  : ���� +-3������
		//int     - 4����Ʈ  : ���� 20�� ����
		//long    - 8����Ʈ  : ���� 20�� �̻�
		//float   - 4����Ʈ  : �Ǽ�(�Ҽ���)
		//double  - 8����Ʈ  : �Ǽ�(�Ҽ���)
			//������ �������!!!!!
	
		//������� �������� ȿ������ ��������.
		//�޸𸮰� �����ϸ� �ӵ��� �پ���.
		//�ݴ�� �޸𸮰� �پ��� �ӵ��� ��������.
		//
	
	public static void main(String[] args) { 
		
		//p.35 ���� 1
		int value = 10;//1.������ ����� �ʱ�ȭ�� �ǹ��� 
		//int : +- 20�� ������ �����͸� �����Ҽ� �ִ� ����
			//value [�ƹ��ų�] : ������ �̸� (�����ڰ� �����ϱ� ���ؼ�)
				// = : ������ �����Ͱ� ���ʿ� ����[����]
		// * ���� 10�� int�� value ������ ����
		
		int result  = value + 10;
		//int : +- 20�� ������ �����͸� �����Ҽ� �ִ� ����
			//result [�ƹ��ų�] : ������ �̸�
				//����ȣ��[�����ҷ�����[ + 10
		//		10 + 10
		
		//System.out.println("����Ű �ְ���!");
		System.out.println(result);//��� (�����̸�)
		
	}

} //Ŭ���� ��