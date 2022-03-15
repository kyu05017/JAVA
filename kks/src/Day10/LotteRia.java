package Day10;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LotteRia extends Market{
	
	
	
	// 1. �ʵ�
	private String manager;
	ArrayList<Goods> itemlist = new ArrayList<>();
	
	// 2. ������
	public LotteRia() {}
	
	
	public LotteRia(String manager, ArrayList<Goods> itemlist) {
		this.manager = manager;
		this.itemlist = itemlist;
	}


	@Override
	public void itemlist() {
		System.out.println("�Ե����� ��ǰ���))");
		int i = 1;
		for(Goods temp : itemlist) {
			System.out.print(i + ". "+temp.getGoodsname() + "("+temp.getPrise() + "��)\n");
			i++;
		}
		System.out.println();
	}
	@Override
	public void basket() {
		System.out.println("��ٱ���))");
		int i = 0;
		
		
	}
	@Override
	public void additem() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Ե����� ��ǰ�߰�)) ");
		System.out.println("��ǰ�� : ");
		String name = scanner.next();
		System.out.println("��� : ");
		int stock = scanner.nextInt();
		System.out.println("���� : ");
		int prise = scanner.nextInt();
		
		Goods goods = new Goods(name, stock, prise);
		itemlist.add(goods);
		//4. ���� ó�� 
		try {
			FileOutputStream OutputStream = new FileOutputStream("D:/KKS/�ڹ�/�Ե��������.txt",true);// true �� ���̸� �̾�� // �� ������ ���ٸ� �̾�Ⱑ �ȉ�
			String output = name + "," + stock + "," + prise+"\n";
			OutputStream.write(output.getBytes());
		}
		catch (Exception e) { // ������ ó�� ���� Exception Ŭ����

		}
		System.out.println("�˸�)) ��ǰ ���� �Ϸ�.");
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
}
