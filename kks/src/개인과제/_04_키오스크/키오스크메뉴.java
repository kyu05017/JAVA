package ���ΰ���._04_Ű����ũ;

public class Ű����ũ�޴� {
	
	//�ʵ�
	int buycoke;
	int buycider;
	int buywhan;
	int cokeitem = 10;
	int whanitem = 10;
	int cideritem = 10;
	//������
	public Ű����ũ�޴�() {
		
	}
	//�޼ҵ�
	int bc() {
		System.out.println("�ݶ� �����߽��ϴ�.");
		buycoke +=1;
		
		return buycoke;
	}
	int bw() {
		System.out.println("ȯŸ�� �����߽��ϴ�.");
		buywhan+= 1;
		return buywhan;
	}
	int buyci() {
		System.out.println("���̴ٸ� �����߽��ϴ�.");
		buycider +=1;
		return buycider;
	}
}
