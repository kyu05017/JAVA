package Day09;

public final class Computer extends Calculator{ // final Ŭ������ ������ �ȉ�
			// ����Ŭ���� extends ����Ŭ����
	
	//�ʵ�
	
	//������
	
	//�޼ҵ�
		// * override ����Ŭ������ �޼ҵ带 ������
	//Ctrl + �����̽���	
	@Override  // ����� ����Ŭ������ �������ִ� �޼ҵ� ȣ��
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI*r*r;
	}
}
