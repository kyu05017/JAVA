package ���ΰ���._27_�������������α׷�;

public class Song1 extends Thread{
	
	static boolean stop = false;
	
	String[] lyrics = { "",
						"5",
						"4",
						"3",
						"2",
						"1",
						"'����?'��� �� ���ڿ�",
						"'�װ� ���� �;�' ���� �Ӹ����� ��� ��",
						"�̸�Ƽ�� �ϳ��ϳ� �ӿ�",
						"�޶����� �� �̹��� �ɸ��� �˱� ��",
						"�ƴ� �ٻ��� �ʾ� nothing no no",
						"���� ���� �ʾ� insomnia-nia-nia",
						"���� �ٸ� ����� �Բ����� �ʾ�",
						"��, ���� �ʸ� ���� ��",
						"�츮�� �׸� ĭ�� bloom",
						"�����հ������� ��̲��� �ǿ�",
						"��⿡ ���� �� ���� ��",
						"���� �Ѹ��� ����� ����",
						"I feel bloom, I feel bloom, I feel bloom",
						"�ʿ��� �� ���̸� �� ����",
						"��� �۾����� ������Ʈ",
						"��̷ο� �� ��ǰ�� ������ that's me ��",
						"���� �� ������ Ŭ���̸ƽ�",
						"2������ �Ѿ�⿣ ������ good timing ��",
						"���� ���� �� �˾� realize-la-lize",
						"���� ���� ���� just reply-la-la-ly",
						"���� �峭������ ���� ������",
						"�� �ؼ��� �ñ���",
						"�츮�� ���� gray and blue",
						"�����հ������� ��ǳ���� ���",
						"�ݼ� ���� �� ���� ��",
						"ȣ���� ������ ��������",
						"I feel blue, I feel blue, I feel blue",
						"�ʿ��� ������ ä��",
						"������� ������ ����� �� ����",
						"�鸸���� ��̲���, ���� �ǿ�����?",
						"������ ���� �츮 ���� ���� ��� ĥ��",
						"�õ� ���� ���ڰ�",
						"�츮�� �׸� ĭ�� bloom",
						"�����հ������� ��̲��� �ǿ�",
						"��⿡ ���� �� ���� ��",
						"���� �Ѹ��� ����� ����",
						"I feel bloom, I feel bloom, I feel bloom",
						"�ʿ��� �� ���̸� �� ����"
	};
	
	public Song1() {
		
	}
	
	public void Song1_stop (boolean stop) {
		this.stop = stop;
		if(this.stop) {
			System.out.println("���");
		}
		else {
			System.out.println("�Ͻ�����");
		}
	}
	
	
	@Override
	public void run() {
		int i = 0;
		while(this.stop) {
			try {
				System.out.println(lyrics[i]);
				Thread.sleep(1500);
			} 
			catch (InterruptedException e) {
				
			}
			i++;
		}
	}
}
