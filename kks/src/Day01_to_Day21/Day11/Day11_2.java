package Day01_to_Day21.Day11;

public class Day11_2 {
	// p. 422
		// ��ǻ���� �ϵ���� ������ ���� [ ����Ұ��� ]
		// ������� �߸��� ���� or �������� �߸��� �ڵ��� ������ ����
		// ���� : 1�Ϲݿ��� 2.���࿹��
			// �Ϲݿ��� : ������ �������� ���ܰ˻� [ �����ڿ��� ���� ����ó�� = �ܺ�ó��(������) ]
			// ���࿹�� : ������ �����Ŀ� ���ܰ˻� [ �������� ������ �Ǵ��ؼ� ����ó�� ]
		// ����ó��
			// ���� : ������ �߻��ϸ� ���α׷��� ����ȴ�. [ �������� ���� ]
			// ���࿡ ���ܰ� �߻��ϸ� ��ü �ڵ尡 ����� [ ���α׷��� ������� �ʰ� ]
	
	public static void main(String[] args) {
		
		String date = null;
		try { //NullPointerException
		System.out.println(date.toString()); // ObjectŬ���� �żҵ� : toString() : ��ü ���� �м� 
				// ���������� ������ ����.
		// ������ �߻��ϴ� ���� : null �� �޸� �Ҵ��� ���� ������ ��ü ������� �Ұ���
		}
		catch(NullPointerException e) {
			System.out.println("���ܹ�� :" + e);
		}
		String[] arr = new String[2]; // ���ڿ� 2�� �����ϴ� �迭
		try {//ArrayIndexOutOfBoundsException
			// ���ܰ� �߻��Ұ� ���� �ڵ�
			
			arr[0] = "a";
			arr[1] = "b";
			arr[2] = "c";
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//���࿡ ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
			arr[0] = "a";
			arr[1] = "b";
			System.out.println("���ܹ�� :" + e);
		}

		try{
			String data1 = "100";
			String data2 = "a100";
			int value1 =Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			//Integer.parseInt(���ڿ�); > ���ڿ��� ���ڷ�
						// "100" > 100 [o] "a100" > a100[x]
			int result = value1 + value2;
			System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("���ܹ�� :" + e);
		}
		
		// p. 429
		
		String ���ڿ� ="���缮"; // �ڹ� Ŭ������ �ϳ�
		Object ����Ŭ����;	//�ڹ� Ŭ������ �ֻ��� Ŭ����
		����Ŭ���� = ���ڿ�; // �ڽ� > �θ� [ ���� ]
		���ڿ� = (String)����Ŭ����; // �θ� > �ڽ� [ �Ұ���] [ ����ó�� ]
			//��������ȯ
	


	}
}
