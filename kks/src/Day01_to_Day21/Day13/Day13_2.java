package Day01_to_Day21.Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class Day13_2 {
	
	public static void main(String[] args) {
		
		// p.539
		
			// Date Ŭ���� (java.util) : �ý��� ��¥�� �������
		Date now2  = new Date(); // date ��ü ����
		System.out.println("���� ��¥/�ð� "+now2);
		String strnow = now2.toString();
		System.out.println("���� ��¥/�ð� "+strnow);
		
			//SimpleDateFormat Ŭ���� : ��¥/�ð� ���� ( ���� = ��� ) ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
												//��¥�� ������ �����ϱ�
		System.out.println(sdf); // ��ü�� �ּҰ�
		// ��¥�� ���� �����ϱ� [ date ���� -> String ������ ��ȯ ]
		System.out.println("���� ��¥/�ð� " +sdf.format(now2));
										// ���ڿ��� ��ȯ�� 
										// ���İ�ü.format(��¥��ü)
		
		
		
		// p. 540
			//Calendar Ŭ���� : �ü�� �ð����� ��¥/�ð� �븦 ������
		Calendar now =  Calendar.getInstance(); // Calendar �� ��üȣ��
			// �̹� Calendar Ŭ������ ��ü ����!! = ������ ��ü���� X

		System.out.println("�⵵ : " + now.get(Calendar.YEAR));		//�⵵
		System.out.println("�� : " + (now.get(Calendar.MONTH)+1));	//�� : 0~11
		System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH));//��
											// ���������� �ϼ�
		System.out.println("�� : " + now.get(Calendar.DAY_OF_WEEK));//����
											// �� �������� �ϼ� [ 1 : �Ͽ��� 2 : �� 3 : ȭ 4 : �� 5 : �� 6 : �� 7 : �� ]
		// ���� ǥ��
		int week = now.get(Calendar.DAY_OF_WEEK);
		String days =  null;
		switch(week) {
			case 1 : days = "�Ͽ���"; break; 
			case 2 : days = "������"; break; 
			case 3 : days = "ȭ����"; break; 
			case 4 : days = "������"; break; 
			case 5 : days = "�����"; break; 
			case 6 : days = "�ݿ���"; break; 
			case 7 : days = "�����"; break; 
		} 
		System.out.println(days);
		
		//��������
		System.out.println("����/ ���� : "+ now.get(Calendar.AM_PM)); // 0�̸� ���� 1�̸� ����
		int ampm = now.get(Calendar.AM_PM);
		String mpm = null;
		
		if (ampm == 0) {
			mpm = "����";
		}
		else {
			mpm = "����";
		}
		System.out.println(mpm);
		
		// �ð�
		System.out.println("�� : " + now.get(Calendar.HOUR));		//��
		System.out.println("�� : " + now.get(Calendar.MINUTE));	//��
		System.out.println("�� : " + now.get(Calendar.SECOND)); //��		
		
		// ZonedDateTime Ŭ���� : ���� �����ð�
		ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("������ : " + dateTime);
		dateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("�ѱ��ð� : " + dateTime);
		dateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("����ð� : " + dateTime);
		
	}
}
