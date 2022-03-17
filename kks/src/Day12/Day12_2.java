package Day12;

public class Day12_2 {
	
	public static void main(String[] args) {
		
		// p. 499 String method
		
		// charAt()
		
		String ssn = "012345-223456";
		
		char sex = ssn.charAt(7); // 7�� �ε����� ���ڸ� ����
		
		switch(sex) { // switch ��� [ switch(�˻���) ]
			case '1' :	// sex ������ ���� ���� 1�� ���
			case '3' :	// 2�ϰ��
				System.out.println("���� �Դϴ�."); // �޼����� ���
				break; // ����
			case '2' : // sex ������ ���� ���� 2�ϰ��
			case '4' : // 4�ϰ��
				System.out.println("���� �Դϴ�"); // �޼����� ���
				break; // ���̻��� ������ �������� �극��ũ�� ���� �ȴ�.
		}
		// �ڹ� �޸� [ JVM ]
			// ���� �޸�		: �������� (new �����ڸ� ����ϸ� new�� ���� ��������� ������ ���޸��� �޸� �ּҸ� ������ ] 
			// �� �޸�		: ��ü
			// �޼ҵ� �޸�	: 
		
		// p.501  equals() : ���ڿ� ��
			// �⺻�ڷ��� ����ϴ� ������ ������ ��밡�� [ == ]
			// ���ڿ�(String)�� ���ϴ� ���� equals �� ����ؾ��� [ equals ]
		// 1.���ڿ� �����ϴ� ��� �ΰ���
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";// ��ü�� new �����ڰ� �ʼ� ������ String�� new �����ڸ� ������ �ڵ����� ����
		// 2. ���ڿ� ��
		
		if(strVar1 == strVar2) { // ���ڿ��� �ּҰ��� �� [ == ���ּҸ� ��]
			System.out.println("���� String ��ü�� ����");
		}
		else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		// 3.���ڿ� ��
		if(strVar1.equals(strVar2)) { // [���ڿ��� ���� [ ���ּ� �ȿ� �ִ� �������� ������ �� ]
			System.out.println("���� ���ڿ��� ����");
		}
		else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		
		// p. 502
			// getBytes();
				// ���ڿ��� ����Ʈ���� ��ȯ������
		
		String str = "�ȳ��ϼ���";// ������ 1 ����Ʈ �ѱ��� 2����Ʈ �� 5���ڷ� 10����Ʈ��.
		
		byte[] bytes1 = str.getBytes(); // ���ڿ� > ����Ʈ���� ��ȯ
		
		System.out.println(bytes1.length); // �迭��.length > �迭�� ���� �ʵ�
		System.out.println(bytes1); // �޸��� �ּҰ�
		
		String str1 = new String(bytes1);// ����Ʈ���� ���ڿ��� ��ȯ
		
		System.out.println(str);
	
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		try {
			// 1. ���ڵ�Ÿ�� [ ���ڵ�/ ���ڵ�] : ��ȯ ���
			
			// 1. EUC_KR [ �ѱ� / ���� : �ѱ� 2����Ʈ ]
			byte[] bytes2 = str.getBytes("EUC_KR"); // �Ϲ� ���� �߻�
			System.out.println("EUC_KR ����: "+bytes2.length);
			String str2 = new String(bytes2,"EUC_KR");
			System.out.println("����Ʈ�� -> ���ڿ�: "+str2);
			
			// 2. UFT-8 [ ������ ��� : �ѱ� 3����Ʈ ]
			byte[] bytes3 = str.getBytes("UTF8"); // �Ϲ� ���� �߻�
			System.out.println("UTF8 ����: "+bytes3.length);
			String str3 = new String(bytes3,"UTF8");
			System.out.println("����Ʈ�� -> ���ڿ� : "+str3);
			
		} catch (Exception e) {

		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		// p. 504
		// .indexOf
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		
		if(subject.indexOf("�ڹ�") != -1) { // �ε����� 0������ ���� [ -1 �ε����� ���� ]
			System.out.println("�ڹٿ� ���õ� å�Դϴ�.");
		}
		else {
			System.out.println("�ڹٿ� ���� ����.");
		}
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println();
		// p.505 
		// length() : ���ڿ��� ����
		// ������ ���� ���ؼ� ���̰� �´��� Ʋ���� �Ǵ��� ��) ��й�ȣ ���� ��ȿ�� �˻�
		String ssn2 = "7306241230123"; //���ڿ�
		int length = ssn2.length(); // ���ڿ��� ���̸� ���������� �������
		if(length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		}
		else {
			System.out.println("�ֹι�ȣ �ڸ��� Ʋ���ϴ�.");
		}
		
		System.out.println("-------------------------------------------------------------");
		
		// p.506
			// ���ڿ� ��ġ replace()
			// replace("��������","���ο��") : ���ڸ� ����
		String oldstr = "�ڹٴ� ��ü������ �Է��Դϴ�.";
		String newstr = oldstr.replace("�ڹ�", "Java");
							// ���ڿ�.replace("��������","���ο��");
		System.out.println(oldstr);
		System.out.println(newstr);
		// �� �ҷ������� ������ �ʿ��Ұ�� ���
				
		System.out.println("-------------------------------------------------------------");
		
		// p.507
			// ���ڿ� �߶󳻱� substring() vs split()
			//
		String ssn3 = "880815-1234567";
		//substring()
		String firstnum = ssn3.substring(0,6); // ���� �δ콺 ~ ���ε���
		System.out.println(firstnum);
		String num2 = ssn3.substring(7); // �ε��� ��ó~ ������
		System.out.println(num2);
		
		//slpit
			//"880815-1234567" "-" �������� �ڸ��� 2���� -> �ſ���ȯ
			// [0] : 880815 [1]: 1234567
		System.out.println("�պκ� "+ ssn3.split("-")[0]);
		System.out.println("�޺κ� "+ ssn3.split("-")[1]);
		
		System.out.println("-------------------------------------------------------------");
		// p. 508
			// ���ڿ�.toLowerCase() > ���� [ �ҹ��ڷ� ��ȯ ]
			// ���ڿ�.toUpperCase() > ���� [ �빮�ڷ� ��ȯ ]
		
		// p. 509
			// ���ڿ�.trim() : �յ� �������� [����� �ȵȴ�]
			// �ܺη� ���� �����͸� �������� ����Ѵ�.
		
		// p. 510
			// ���ڿ�.valueOf() : �⺻����[int,double ��]  ->  ���ڿ��� ��ȯ
		String str10 = String.valueOf(10); // int 10�� String 10���� ��ȯ
		String str11 = String.valueOf(10.5); // double �� 10.5�� ������ 10.5�� ��ȯ
		String str12 = String.valueOf(true); //boolean�� true �� ���ڿ��� ��ȯ
		String str13 = 10+""; // int���� String���� ��ȯ [ + �� ���Ῥ���� ]
		
		System.out.println(str10 + 10);// ���� + ���� : ����
		System.out.println(str11 + 10);
		// if(str13) ���� : str13�� boolean���� ���ڿ��� ��ȯ�Ǿ��� ������ ���Ұ���
		System.out.println(str12);
		System.out.println(str13);
		
		
		
		
	}
}
