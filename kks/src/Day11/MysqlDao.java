package Day11;

public class MysqlDao implements DateAccesseObject{
	@Override
	public void select() {
		System.out.println("Mysql���� ������ �˻�");
	}
	@Override
	public void insert() {
		System.out.println("Mysql���� ������ ����");
	}
	@Override
	public void update() {
		System.out.println("Mysql���� ������ ����");
	}
	@Override
	public void delete() {
		System.out.println("Mysql���� ������ ����");
	}
}
