package ���ΰ���._21_BoardApp;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Control.load(); 
		while(true) {
			try {//����ڰ� ���� �Է½� ����ȯ�� �Ұ��� �ؼ� ���ܰ� �߻���!!!!!!!! > catch
				// ��ü���� �޼ҵ�ȣ�� static �޼ҵ忩��
				System.out.println("-------------------------------------------------");
				System.out.println("\t��\t��\t��");
				System.out.println("-------------------------------------------------");
				// ��� �Խù��� ���
				System.out.printf("%s\t%s\t%s\t%s\t%s\t\n","��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				int i = 0;
				for(Board temp : Control.boardlist) {
					System.out.printf("%d\t%s\t%s\t%s %s\n",i+1,temp.getTitle(),temp.getWriter(),temp.getDate(),temp.getViewcount());
					i++;
				}
				System.out.println("-------------------------------------------------");
				System.out.println();
				System.out.print("1.���� 2.���� ����: \n");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("�Խù� ���))");
					System.out.print("���� �Է� : ");
					scanner.nextLine(); 
					// ���� ���� �Է��� ���� [ ����! nextLine �տ� �Ϲ� next �ϳ��� ��� ]
					// �ذ��� : �Ϲ� next �� nextLine ���̿� �ǹ̾��� nextLine �߰�
					String title = scanner.nextLine();
					System.out.print("���� �Է� : ");
					String contents = scanner.nextLine();
					System.out.print("�ۼ��� : ");
					String id = scanner.next();
					System.out.print("��й�ȣ : ");
					String pw = scanner.next();
					
					
					// �μ� ����.
					Control.writer(title,contents,id,pw);
					
				}
				else if(ch == 2) {
					System.out.println("�б�)) ");
					System.out.print("�Խù� ��ȣ�Է� : \n");
					int num = scanner.nextInt();
					Board temp = Control.boardlist.get(num-1);
					Reply temp2 = new Reply();
					temp.setViewcount(temp.getViewcount()+1);
					while(true) {
						System.out.println("-------------------------------------------------");
						System.out.println("�ۼ��� :"+temp.getWriter());
						System.out.println("����))");
						System.out.println(temp.getContens());
						System.out.println();
						System.out.println("�ۼ��� :"+temp.getDate());
						System.out.println("-------------------------------------------------");
						System.out.println("���))");
						if(temp2 != null) {
							System.out.println(temp2.getReply_contents());
						}
						System.out.print("1.�ڷΰ��� 2.���� 3.���� 4.��۾���\n");
						Control.save();
						
						int ch2 = scanner.nextInt();
						
						if(ch2 == 1) {
							System.err.println("�޼���)) ���� �޴��� ���ư��ϴ�.");
							break;
						}
						else if(ch2 == 2) {
							System.err.println("�޼���)) �Խù� ����");
							System.out.println("��й�ȣ �Է� : ");
							String pw = scanner.next();
							System.out.println("������ ���� : ");
							String newtitle = scanner.next();
							System.out.println("������ ���� : ");
							scanner.nextLine();
							String newcontents = scanner.nextLine();
							boolean result = Control.update((num-1),pw,newtitle,newcontents);
							if(result) {
								System.out.println("�޼���)) ������ �Ϸ� �Ǿ����ϴ�.");
								break;
							}
							else { System.out.println("�޼���)) ��й�ȣ�� �߸��Ǿ����ϴ�.");}
						}
						else if(ch2 == 3) {
							System.err.println("�޼���)) �Խù� ����");
							System.out.println("��й�ȣ �Է� : ");
							String pw =scanner.next();
							boolean result = Control.delete((num-1),pw);
							if(result) {
								System.out.println("�޼���)) ������ �Ϸ� �Ǿ����ϴ�.");
								break;
							}
							else { System.out.println("�޼���)) ��й�ȣ�� �߸��Ǿ����ϴ�.");}
						}
						else if(ch2 == 4) {
							System.out.println("�޼���)) ����ۼ�");
							System.out.println("��� ���� �Է� : ");
							scanner.nextLine();
							String reply_contents = scanner.nextLine();
							System.out.println("�ۼ��� : ");
							String reply_id = scanner.next();
							System.out.println("��й�ȣ : ");
							String reply_pw = scanner.next();
							
							Control.reply_wwrite((num-1),reply_contents,reply_id,reply_pw);
						}
					}
				}	
				else {
					
				}
			}
			catch(Exception e) {
			scanner = new Scanner(System.in); // �ٽ� �޸� �Ҵ�
			}
		}
	}
}
