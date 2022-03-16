package Day11;

public class MysqlDao implements DateAccesseObject{
	@Override
	public void select() {
		System.out.println("Mysql에서 데이터 검색");
	}
	@Override
	public void insert() {
		System.out.println("Mysql에서 데이터 삽입");
	}
	@Override
	public void update() {
		System.out.println("Mysql에서 데이터 수정");
	}
	@Override
	public void delete() {
		System.out.println("Mysql에서 데이터 삭제");
	}
}
