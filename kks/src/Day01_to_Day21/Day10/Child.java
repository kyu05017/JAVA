package Day01_to_Day21.Day10;

public class Child extends Parent{
	
	// �ʵ�
	private String name;
	
	// ������

	public Child() {
		//this.name = name;
		this("ȫ�浿");
		System.out.println(" 4. Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println(" 3. Child(String name) call");
	}
	// �޼ҵ�

}
