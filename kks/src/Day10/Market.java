package Day10;

public class Market implements kiosk{
	
	// 1. �ʵ�
	public String address;
	// 2. ������
	public Market() {}
	// 3. �޼ҵ�
	@Override
	public void itemlist() {
		System.out.println("��ǰ���))");
		
	}
	@Override
	public void basket() {
		System.out.println("��ٱ���))");
		
	}
	@Override
	public void pay() {
		System.out.println("����))");
		
	}
	@Override
	public void additem() {
		System.out.println("��ǰ�߰�))");
		
	}
}
