package ���ΰ���._04_Ű����ũ;

//��ĳ�ʰ� �ִ� �ڹ� Ŭ������ ����Ʈ
import java.util.Scanner;

//���� Ŭ����
public class Ű����ũ_����_5��° {
	
	//���θ޼ҵ�
	public static void main(String[] args) {
		
		//��ĳ�� ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		int bc=0;		//�ݶ󱸸�Ƚ��
		int bw = 0;		//ȯŸ����Ƚ��
		int bcid = 0;	//���̴ټ���Ƚ��
		int ci = 10;	//�ݶ����
		int wi =10;		//ȯŸ���
		int cidi=10;	//���̴����
		
		//�ݺ���
		while(true) { // ���ѹݺ� �������Ǿ���
			System.out.println("���Ǳ�))");
			System.out.println("1)�ݶ� 300�� 2)ȯŸ 200�� 3)���̴� 100��");
			System.out.println("4)����");
			int ch = scanner.nextInt();//ch�� �Է¹޴´�
			
			if(ch==1) {//1�ϰ�� �ݶ� �߰�
				System.out.println("�ݶ� �߰��ϼ̽��ϴ�.");
				bc += 1; //�ݶ󱸸�Ƚ���� 1�� �߰�����
			}
			else if(ch==2) {// 2�� ��� ȯŸ�� �߰�
				System.out.println("ȯŸ�� �߰��ϼ̽��ϴ�");
				bw +=1;//ȯŸ����Ƚ���� 1�� �߰�
				
			}
			else if(ch==3) {//3�� ��� ���̴ٸ� �߰�
				System.out.println("���̴ٸ� �߰��ϼ̽��ϴ�");
				bcid +=1; // ���̴� ����Ƚ���� 1�߰�
			}
			else if(ch==4) {// 4�� ��� ����â�� �����ش�
				System.out.println("����â))");
				System.out.println("ǰ��\t���� \t ����\t");
				if(bc != 0)System.out.printf("�ݶ�\t%d\t%d",bc,bc*300);			//�ݶ� ����Ƚ���� 0�� �ƴ϶�� ���
				if(bw != 0)System.out.printf("ȯŸ\t%d\t%d",bw,bw*200);			//ȯŸ ����Ƚ���� 0�� �ƴ϶�� ���
				if(bcid != 0)System.out.printf("���̴�\t%d\t%d",bcid,bcid*100);	//���̴ٱ���Ƚ���� 0�� �ƴ϶�� ���
				int total = bc*300+bw*200+bcid+100;//������ ������ ����
				System.out.println("�� ���� �ݾ� " + total + "��");
				System.out.println("1)���� 2)�������");
				int ch2 =scanner.nextInt();//����â�� ������ �Է¹���
				
				if(ch2 == 1) { // 1�̶�� ����â�� ����
					while(true) { //���� �ݺ� ���������� �����Ϸ� �� �������
						System.out.println("���� �ݾ��� �Է��ϼ���");
						int money = scanner.nextInt();//�ݾ��� �Է¹���
						
						if(money >= total) {// �Է��� �ݾ��� ���� �ѱݾ׺��� ũ�ٸ� 
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
							ci -= bc;wi -= bw;cidi -= bcid;//�߰��� �׸���� ����� ���ش�
							bc =0; bw =0; bcid =0;//�߰� ���׸��� 0���� �ʱ�ȭ
							break;//�ݺ��� ����
						}
						else {//�׿� �ݾ��� �����ϰų� �߸� �Էµ� ���
							System.out.println("������ �����Ͽ����ϴ�.");
							System.out.println("�ܾ׺���");
						}
					}
				}
				else if (ch2 == 2) {//2�ϰ�� ���� ��Ҹ� ����
					System.out.println("������ ����ϼ̽��ϴ�.");
					bc =0; bw =0; bcid =0;//�߰��� �׸��� 0���� ��� �ʱ�ȭ
					break;//�󺹹� ����
				}
				else {//����â if���� �߸� �Է¹޾������
					System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
				}
			}
			else {//���� �ݺ����� if������ �߸� �Է¹޾��� ���
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
		}
	}
}
