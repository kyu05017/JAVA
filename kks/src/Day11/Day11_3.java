package Day11;

public class Day11_3 {
	// p. 422 ���� ������
		// ���� : ��� �޼ҵ忡�� try{}catch{} ���� �ڵ� ������ > �Ѱ����� ���ܸ� �̵�
	
	public static void main(String[] args)  {
		
		try {
			findclass();
		}
		catch(Exception e) {
			System.out.println( e );
		}	
		try {
			withdraw(30000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void findclass() throws Exception {
		
		//1.���� ������
		Class class1 = Class.forName("java.lang.String2");
		/*
		// 1. try - catch
		try { // ���ܰ� �߻��Ұ� ���� �ڵ�(���� ����) Ȥ�� �Ϲݿ��� [ ������ ]
			Class clazz = Class.forName("java.lang.String2");
							// Ŭ���� ã�� �޼ҵ�
		}
		catch (Exception e) {
			System.out.println( e );
		}
		*/
	}
	
	// p,444 ~ 445 :���� �����
	public static void withdraw(int money)throws Exception {
		if(20000 < money) {
			throw new Exception("�ܰ����");
		}
	}
	
}
