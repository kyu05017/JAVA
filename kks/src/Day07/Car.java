package Day07;

public class Car {
	//Ŭ���� ����
	
	// 1.�ʵ� 
	int gas;
	// 2.������
	
	// 3.�޼ҵ�	
		// 1. gas�� �ܺη� ���� �Է¹޾Ƽ����η� �����ϴ� �޼ҵ� ����
	void setGas(int gas) {//�μ� o ��ȯ x
	//���� x �޼ҵ�� (�μ�1) { ���κ��� = �ܺκ��� }
		this.gas = gas;
	// ���κ����� �ܺκ����� �����Ҷ� �����ϴ� ���!!
			//this.�ʵ�� : ����{���� Ŭ��������} ����
	}
	
		//2. ���κ��� gas�� ������ Ȯ�� [ 0 = ��������] [1�̻�=�����ִ�]
	boolean isLeftGas() {//�μ�x ��ȯ o
	//����ȯ �޼ҵ��() {���๮ ��ȯ��(��/����) }
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
		// 3. gas 0�϶����� �����ϴµ� �����Ҷ����� ����1�� ����
			// gas 0 �� ����
	void run() {//�μ� x ��ȯ x
		while(true) { // ���ѷ��� [ ���� : 1. break; 2.return(�޼ҵ带 ���� ���ѷ����� ����) 3.����ġ����
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�߷� : "+gas+")");
				gas--; // gas ���� 1�� ����
			}
			else {
				System.out.println("����ϴ�. (gas�ܷ� : "+gas +")");
				//break; // �ݺ��� Ż�� [����]
				return; // �Լ� Ż��
			}
		}
	}
}
