package Day09;

public class Student extends People{
				//����Ŭ������ extends ����Ŭ������
	//�ʵ�
	public int studentNo; // �л���ȣ
	
	//������
	public Student(String name,String ssn,int studentNo) {
		// �Α�Ŭ������ �ʹ� �ʵ� ����ȭ [ ���ֱ�]
		// 1. �ʵ忡 ����
		/*
		 * this.name = name;	
		 * this.ssn = ssn;
		 */
		// 2. �������� ���� [ �ظ��ؼ� �̷��� �����ϴ°� ���� ]
		super(name,ssn);
		this.studentNo = studentNo;
	}
	
	//�޼ҵ�
}
