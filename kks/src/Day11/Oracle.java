package Day11;

public class Oracle implements DateAccesseObject{
	
	@Override
	public void select() {
		System.out.println("����Ŭ���� DB �˻�");
	}
	@Override
	public void insert() {
		System.out.println("����Ŭ���� DB ����");
	}
	@Override
	public void update() {
		System.out.println("����Ŭ���� DB ����");
	}
	@Override
	public void delete() {
		System.out.println("����Ŭ���� DB ����");
	}

}
