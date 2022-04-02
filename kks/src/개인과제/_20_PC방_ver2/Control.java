package ���ΰ���._20_PC��_ver2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Control {
	
	static ArrayList<Member> memberList = new ArrayList<>();
	static String[] PC = {"[ī����]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
	static Scanner scanner = new Scanner(System.in);
	DecimalFormat timeSet = new DecimalFormat("00�ð�");
	DecimalFormat timeSet3 = new DecimalFormat("00��");
	DecimalFormat moneySet = new DecimalFormat("#,##0��");
	
	public void signUp() {
		
		while(true) {

			String id = null;
			System.out.println("ȸ������))");
			while(true) {
				boolean pass1 = true;
				System.out.print("ID : \n");
				id = scanner.next();
				
				for(int i = 0; i < memberList.size(); i++) {
					if(id.equals(memberList.get(i).getId())) {
						System.out.println("������ ���̵� �����մϴ�.");
						pass1 = false;
						break;
					}
					else {
						System.out.println("���̵�Ȯ��))");
						System.out.println(id+" ���̵� ����մϴ�.");
						System.out.println("1)�� 2)�ƴϿ�");
						String work = scanner.next();
						
						if(work.equals("1")) {
							pass1 = true;
							break;
						}
						else if(work.equals("2")) {
							System.out.println("�޼���)) ���̵� �Է����ּ���");
							pass1 = false;
							break;
						}
					}
				}
				if(pass1) {break;}
			}
			
			String pw = null;
			while(true) {
				boolean pass2 = true;
				System.out.print("PW : \n");
				pw = scanner.next();
				
				Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
				Matcher passMatcher1 = passPattern1.matcher(pw);
				
				if(!passMatcher1.find()){
					System.out.println("�޼���)) ��й�ȣ�� ������ Ư������ ���ڸ� �����ϸ� 8�� �̻��̾�� �մϴ�.");
					pass2 = false;
				}
				Pattern passPattern2 = Pattern.compile("(\\w)\\1\\1\\1");
				Matcher passMatcher2 = passPattern2.matcher(pw);
				  
				if(passMatcher2.find()){
					System.out.println("�޼���)) ��й�ȣ�� ������ ���ڸ� �����ϰ� �����ؼ� ����� �� �����ϴ�.");
					pass2 = false;
				}
				
				if(pw.contains(id)){
				    System.out.println("�޼���)) ���̵� ��й�ȣ�� ���ԵǾ��ֽ��ϴ�.");
				    pass2 = false;
				}
				
				if(pw.contains(" ")){
				    System.out.println("�޼���)) ��й�ȣ�� ������ ���ԵǾ��ֽ��ϴ�.");
				    pass2 = false;
				}
				
				if(pass2) {
					break;
				}
				
			}
			if(id.equals("admin")) {
				Member admin = new Member(id, pw, null, null, 0, 0, true);
				System.out.println("�޼���) ������ �������� �Ϸ�");
				memberList.add(admin);
				DB.memberSave();
				break;
			}
			else {
			
				String name = null;
				while(true) {
					boolean pass3 = true;
					System.out.print("Name : \n");
					name = scanner.next();
					
					String regExp_symbol = "(.*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*)";
					Pattern pattern_symbol = Pattern.compile(regExp_symbol);
					Matcher matcher_symbol = pattern_symbol.matcher(name);
					
					if(matcher_symbol.find()){
						System.out.println("�޼���)) �̸��� Ư�����ڸ� �����Ҽ� �����ϴ�.");
						pass3 = false;
					}
					
					if(name.contains(" ")){
					    System.out.println("�޼���)) �̸��� ������ ���ԵǾ��ֽ��ϴ�.");
					    pass3 = false;
					}
					
					if(pass3) {
						break;
					}
				}
				
				String phone = null;	
				while(true) {
					boolean pass4 = true;
					System.out.print("Phone : \n");
					phone = scanner.next();
					
					Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
					Matcher matcher = pattern.matcher(phone);
					if(phone.contains("-")) {
						if(phone.length() == 13) {}
						else {
							System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.1");
							pass4 = false;
						}
					}
					else {
						if(phone.length() == 11) {}
						else {
							System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.2");
							pass4 = false;
						}
					}
					if (matcher.matches()) {
				    		pass4 = true;
				    } 
				    else if(!matcher.matches() &&  phone.length() == 11){
				    	String str1 = phone.substring(0, 3);
			            String str2 = phone.substring(3, 7);
			            String str3 = phone.substring(7, 11);
			            phone = str1+"-"+str2+"-"+str3;
				    	pass4 = true;
				    }
				    
				    if(pass4){
				    	break;
				    }
				}
				System.out.println("�޼���)) ȸ�������� �Ϸ� �Ǿ����ϴ�.");
				System.out.println("ȸ������))");
				System.out.println("ID : " + id);
				System.out.println("PW : " + pw);
				System.out.println("Name : " + name);
				System.out.println("Phone : "+ phone);
				Member member = new Member(id, pw, name, phone, 0, 0, false);
				memberList.add(member);
				DB.memberSave();
				break;
			}
			
		}
	}
	
	public String logIn() {
		
		System.out.println("�α���))");
		System.out.println("ID : ");
		String id = scanner.next();
		System.out.println("PW : ");
		String pw = scanner.next();
		
		for(Member temp : memberList) {
			if(id.equals("admin") && pw.equals(temp.getPw())) {
				return "admin";
			}
			else if(id.equals(temp.getId()) && pw.equals(temp.getPw())) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public void addTime(String id, int time) {
		
		int change = 0;
		for(Member temp : memberList) {
			if(id.equals(temp.getId())) {
				if(time == 1) {
					System.out.println("����)) 1�ð� 1,000��");
					System.out.println("�޼���)) ������ �ݾ��� �Է��ϼ���");
					System.out.println("�Է� : ");
					int money = scanner.nextInt();
					
					if(money == 1000) {
						System.out.println("�޼���)) 1�ð� �߰��Ǿ����ϴ�.");
						temp.setTime(temp.getTime() + 60);
						System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
					}
					else if(money >= 1000) {
						change = money - 1000;
						String new_money = moneySet.format(change);
						System.out.println("�޼���)) 1�ð� �߰��Ǿ����ϴ�. �Ž������� " + new_money + "�Դϴ�.");
						temp.setTime(temp.getTime() + 60);
						System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
					}
					else {
						System.out.println("�޼���)) �����ݾ��� �����մϴ�.");
						return;
					}
				}
				else if(time == 2) {
					System.out.println("����)) 2�ð� 2,000��");
					System.out.println("�޼���)) ������ �ݾ��� �Է��ϼ���");
					System.out.println("�Է� : ");
					int money = scanner.nextInt();
					
					if(money == 2000) {
						System.out.println("�޼���)) 2�ð� �߰��Ǿ����ϴ�.");
						temp.setTime(temp.getTime() + 120);
						System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
					}
					else if(money >= 2000) {
						change = money - 2000;
						String new_money = moneySet.format(change);
						System.out.println("�޼���)) 2�ð� �߰��Ǿ����ϴ�. �Ž������� " + new_money + "�Դϴ�.");
						temp.setTime(temp.getTime() + 120);
						System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
					}
					else {
						System.out.println("�޼���)) �����ݾ��� �����մϴ�.");
						return;
					}
				}
				else if(time == 3) {
					System.out.println("����)) 5�ð� 5,000��");
					System.out.println("�޼���)) ������ �ݾ��� �Է��ϼ���");
					System.out.println("�Է� : ");
					int money = scanner.nextInt();
					
					if(money == 5000) {
						System.out.println("�޼���)) 5�ð� �߰��Ǿ����ϴ�.");
						temp.setTime(temp.getTime() + 300);
						System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
					}
					else if(money >= 5000) {
						change = money - 5000;
						String new_money = moneySet.format(change);
						System.out.println("�޼���)) 5�ð� �߰��Ǿ����ϴ�. �Ž������� " + new_money + "�Դϴ�.");
						temp.setTime(temp.getTime() + 300);
						System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
					}
					else {
						System.out.println("�޼���)) �����ݾ��� �����մϴ�.");
						return;
					}
				}
				else {
					int a = time/60;
					int b = time%60;
					if(b >= 60){
						a += 1;
						b = 0;
					}
					
					if(b == 0) {
						int pay = a*1000;
						String new_money = moneySet.format(pay);
						System.out.printf("����)) %d�ð� %s\n",a,new_money);
						System.out.println("�޼���)) ������ �ݾ��� �Է��ϼ���");
						System.out.println("�Է� : ");
						int money = scanner.nextInt();
						
						if(money == (pay)) {
							System.out.println("�޼���)) "+a+"�ð� �߰��Ǿ����ϴ�.");
							temp.setTime(temp.getTime() + time);
							System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
						}
						else if(money >= (pay)) {
							change = money - pay;
							String new_money2 = moneySet.format(change);
							System.out.println("�޼���)) "+a+"�ð� �߰��Ǿ����ϴ�. �Ž������� " + new_money2 + "�Դϴ�.");
							temp.setTime(temp.getTime() + time);
							System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
						}
						else {
							System.out.println("�޼���)) �����ݾ��� �����մϴ�.");
							return;
						}
					}
					else {
						int pay = 0;
						int nb = 0;
						if(b < 10) {
							nb  = 0;
						}
						else {
							nb = b / 10;
							
						}
						pay = (a*1000)+(nb*100);
						String new_money = moneySet.format(pay);
						System.out.printf("����)) %d�ð� %d�� %s��\n",a,b,new_money);
						System.out.println("�޼���)) ������ �ݾ��� �Է��ϼ���");
						System.out.println("�Է� : ");
						int money = scanner.nextInt();
						
						if(money == pay) {
							System.out.println("�޼���)) "+a+"�ð� "+b+"�� �߰��Ǿ����ϴ�.");
							temp.setTime(temp.getTime() + time);
							System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
						}
						else if(money >= pay) {
							change = money - pay;
							String new_money2 = moneySet.format(change);
							System.out.println("�޼���)) "+a+"�ð� "+b+"�� �߰��Ǿ����ϴ�. �Ž������� " + new_money2 + "�Դϴ�.");
							temp.setTime(temp.getTime() + time);
							System.out.println(id+"���� �ܿ��ð� " + temp.getTime() + "��");
						}
						else {
							System.out.println("�޼���)) �����ݾ��� �����մϴ�.");
							return;
						}
					}
				}
			}
		}
		DB.memberSave();
	}
	
	public void startPC(String id) {
		System.out.println("�ڸ�����))");
		for(int i = 0; i < PC.length; i++) {
			System.out.print(PC[i]);
			if(i%5==0)System.out.println();
		}
		System.out.println("�Է� : ( 1 ~ 15 )");
		while(true) {
			try {
				int seat = scanner.nextInt();
				
				if(seat == 0) {
					System.out.println("�޼���)) �������� �ʴ� �ڸ� �Դϴ�.");
				}
				else if(seat >= 16) {
					System.out.println("�޼���)) �������� �ʴ� �ڸ� �Դϴ�.");
				}
				else if(PC[seat].equals("[ ]")) {
					PC[seat]="[o]";
				}
				else {
					System.out.println("�޼���)) ������� �ڸ� �Դϴ�.");
				}
				
				for(Member temp : memberList) {
					if(temp.getId().equals(id)) {
						temp.setSeat(seat);
						temp.setUse(true);
						System.out.println("�޼���)) "+seat+"�� �ڸ� ����� ���۵Ǿ����ϴ�.");
						DB.memberSave();
						return;
					}
				}
				
			}
			catch (Exception e) {
				System.out.println("�޼���)) �Է¿���");
			}
		}
	}
	
	public void ChangePC(String id) {
		System.out.println("�ڸ�����))");
		int my_seat = 0;
		for(Member temp : memberList) {
			if(temp.getId().equals(id)){
				my_seat = temp.getSeat();
			}
		}
		for(int i = 0; i < PC.length; i++) {
			System.out.print(PC[i]);
			if(i%5==0)System.out.println();
		}
		System.out.println("�Է� : ( 1 ~ 15 )");
		while(true) {
			try {
				int seat = scanner.nextInt();
				
				if(seat == 0) {
					System.out.println("�޼���)) �������� �ʴ� �ڸ� �Դϴ�.");
				}
				else if(seat >= 16) {
					System.out.println("�޼���)) �������� �ʴ� �ڸ� �Դϴ�.");
				}
				else if(seat == my_seat) {
					System.out.println("�޼���)) ���� �̿����� �ڸ� �Դϴ�.");
				}
				else if(PC[seat].equals("[ ]")) {
					PC[my_seat]="[ ]";
					PC[seat]="[o]";
				}
				else {
					System.out.println("�޼���)) ������� �ڸ� �Դϴ�.");
				}
				
				for(Member temp : memberList) {
					if(temp.getId().equals(id)) {
						temp.setSeat(seat);
						temp.setUse(true);
						System.out.println("�޼���)) "+seat+"�� �ڸ��� ����Ǿ����ϴ�.");
						DB.memberSave();
						return;
					}
				}
				
			}
			catch (Exception e) {
				System.out.println("�޼���)) �Է¿���");
			}
		}
	}
	
	public void endPC(String id) {
		int my_seat = 0;
		for(Member temp : memberList) {
			if(temp.getId().equals(id)) {
				my_seat = temp.getSeat();
				PC[my_seat]="[ ]";
				temp.setSeat(0);
				temp.setUse(false);
				System.out.println("�޼���)) PC����� �����մϴ�. �̿����ּż� �����մϴ�.");
				DB.memberSave();
				return;
			}
		}
	}
	
	public void members() {
		System.out.println("ȸ�����))");
		System.out.println("��ȣ ���̵�\t\t�̿��ڸ�\t�����ð�\t�̿�ݾ�");
		int i = 0;
		for(Member temp : Control.memberList) {
			if(temp.getId().equals("admin")) {
				
			}
			else {
				int a = temp.getTime()/60;
				int b = temp.getTime()%60;
				String aa = null;
				String bb = null;
				String cc = null;
				int nb = b;
				if(b >= 60){
					a += 1;
					nb = 0;
				}
				else {
					nb = b / 10;
				}
				if(temp.getSeat() == 0) {
					if(a == 0 && b == 0) {
						String money = moneySet.format(a*1000);
						System.out.printf("%d,%s\t%s\t%s\t%s\n",i,temp.getId(),"��������","�ð�����",money);
					}
					else if(b == 0){
						aa = timeSet.format(a);
						String money = moneySet.format(a*1000);
						System.out.printf("%d,%s\t%s\t%s\t%s\n",i,temp.getId(),"��������",aa,money);
					}
					else {
						bb = timeSet.format(a);
						cc = timeSet3.format(b);
						String money = moneySet.format(a*1000+nb*100);
						System.out.printf("%d,%s\t%s\t%s%s\t%s\n",i,temp.getId(),"��������",bb,cc,money);
					}
				}
				else {
					if(a == 0 && b == 0) {
						String money = moneySet.format(a*1000);
						System.out.printf("%d,%s\t%s\t%s\t%s\n",i,temp.getId(),"��������","�ð�����",money);
					}
					else if(b == 0){
						aa = timeSet.format(a);
						String money = moneySet.format(a*1000);
						System.out.printf("%d,%s\t%d\t%s\t%s\n",i,temp.getId(),temp.getSeat(),aa,money);
					}
					else {
						bb = timeSet.format(a);
						cc = timeSet3.format(b);
						String money = moneySet.format(a*1000+nb*100);
						System.out.printf("%d,%s\t%d\t%s%s\t%s\n",i,temp.getId(),temp.getSeat(),bb,cc,money);
					}
				}
			}
			i++;
		}
	}
	
	public void changeTime () {
		
		int insert = 0;
		while(true) {
			try {
				if(insert > Control.memberList.size()) {
					System.out.println("�޼���)) �������� �ʴ� ȸ���Դϴ�.");
				}
				else {
					insert = Control.scanner.nextInt();
				}
				break;
			}
			catch(Exception e) {
				System.out.println("�޼���)) ���ڸ� �Է°��� �մϴ�.");
			}
		}
		System.out.println("������ �ð� �Է� : ");
		int time = 0;
		while(true) {
			try {
				time = Control.scanner.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.println("�޼���)) ���ڸ� �Է°��� �մϴ�.");
			}
		}
		memberList.get(insert).setTime(time);
		DB.memberSave();
	}

	public void forcedLogout () {
		int insert = 0;
		while(true) {
			try {
				if(insert > Control.memberList.size()) {
					System.out.println("�޼���)) �������� �ʴ� ȸ���Դϴ�.");
				}
				else {
					insert = Control.scanner.nextInt();
				}
				break;
			}
			catch(Exception e) {
				System.out.println("�޼���)) ���ڸ� �Է°��� �մϴ�.");
			}
		}
		memberList.get(insert).setSeat(0);
		memberList.get(insert).setUse(false);
		DB.memberSave();
	}

	public void sale() {
		
		Hashtable <String, Integer> map = new Hashtable<>();
		for (Member temp1 : memberList) {
			int ticketfee = 0; 
			for (Member temp2 : memberList) {
				if (temp1.getId().equals(temp2.getId())) {
					ticketfee += temp1.getTime();
				}
			}
			map.put(temp1.getId(), ticketfee);
		}
		for(String temp : map.keySet()) {
			if(!temp.equals("admin")) {
				int a = map.get(temp)/60;
				int b = map.get(temp)%60;
				String new_money = null;
				if(b == 0) {
					new_money = moneySet.format(a*1000);
				}
				if(b >= 60) {
					b = 0;
					a += 1;
				}
				else {
					a = a*1000;
					b = b*100;
					new_money = moneySet.format(a+b);
				}
				System.out.println(temp+ " " + new_money);
			}
		}
		int totalsales = 0;
		for (Member temp1 : memberList) {
			 totalsales += temp1.getTime();
		}
		int a = totalsales/60;
		int b = totalsales%60;
		String new_money = null;
		if(b == 0) {
			new_money = moneySet.format(a*1000);
		}
		if(b >= 60) {
			b = 0;
			a += 1;
		}
		else {
			a = a*1000;
			b = b*100;
			new_money = moneySet.format(a+b);
		}
		System.out.println("�� ����� : " + new_money);
		System.out.println("---------------------------------------------");
	}
	
	public void findid() {
		boolean pass = true;
		String name = null;
		String phone = null;
		System.out.println("���̵� ã��))");
		System.out.println("Name : ");
		name = scanner.next();
		
		for(Member temp : memberList) {
			if(temp.getName().equals(name)) {
				pass = true;
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �̸��Դϴ�.");
				pass = false;
				break;
			}
		}
		if(pass) {
			System.out.println("Phone : ");
			phone = scanner.next();
			
			Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
			Matcher matcher = pattern.matcher(phone);
			
			if(phone.contains("-")) {
				if(phone.length() == 13) {}
				else {
					System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.1");
					pass = false;
				}
			}
			else {
				if(phone.length() == 11) {}
				else {
					System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.2");
					pass = false;
				}
			}
			if (matcher.matches()) {
				pass = true;
		    } 
		    else if(!matcher.matches() &&  phone.length() == 11){
		    	String str1 = phone.substring(0, 3);
	            String str2 = phone.substring(3, 7);
	            String str3 = phone.substring(7, 11);
	            phone = str1+"-"+str2+"-"+str3;
	            pass = true;
		    }
			
			for(Member temp : memberList) {
				if(phone.equals(temp.getPhone())) {
					pass = true;
					break;
				}
				else {
					System.out.println("�޼���)) �������� �ʴ� ��ȣ�Դϴ�.");
					pass = false;
					break;
				}
			}
		}
		if(pass) {
			for(Member temp : memberList) {
				if(phone.equals(temp.getPhone()) && name.equals(temp.getName())) {
					System.out.println("�޼���)) ȸ������ ���̵�� " + temp.getId() + "�Դϴ�.");
				}
			}
		}		
	}
	
	public void findpw() {
		boolean pass = true;
		String id = null;
		String phone = null;
		System.out.println("��й�ȣ ã��))");
		System.out.println("ID : ");
		id = scanner.next();
		
		for(Member temp : memberList) {
			if(temp.getId().equals(id)) {
				pass = true;
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �̸��Դϴ�.");
				pass = false;
				break;
			}
		}
		if(pass) {
			System.out.println("Phone : ");
			phone = scanner.next();
			
			Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
			Matcher matcher = pattern.matcher(phone);
			
			if(phone.contains("-")) {
				if(phone.length() == 13) {}
				else {
					System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.1");
					pass = false;
				}
			}
			else {
				if(phone.length() == 11) {}
				else {
					System.out.println("�޼���)) �ùٸ��� �ʴ� ��ȣ�Դϴ�.2");
					pass = false;
				}
			}
			if (matcher.matches()) {
				pass = true;
		    } 
		    else if(!matcher.matches() &&  phone.length() == 11){
		    	String str1 = phone.substring(0, 3);
	            String str2 = phone.substring(3, 7);
	            String str3 = phone.substring(7, 11);
	            phone = str1+"-"+str2+"-"+str3;
	            pass = true;
		    }
			
			for(Member temp : memberList) {
				if(phone.equals(temp.getPhone())) {
					pass = true;
					break;
				}
				else {
					System.out.println("�޼���)) �������� �ʴ� ��ȣ�Դϴ�.");
					pass = false;
					break;
				}
			}
		}
		if(pass) {
			for(Member temp : memberList) {
				if(phone.equals(temp.getPhone()) && id.equals(temp.getId())) {
					System.out.println("���� ����� ��й�ȣ�� �Է��ϼ���.");
					String pw = null;
					while(true) {
						boolean pass2 = true;
						System.out.print("PW : \n");
						pw = scanner.next();
						
						Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
						Matcher passMatcher1 = passPattern1.matcher(pw);
						
						if(!passMatcher1.find()){
							System.out.println("�޼���)) ��й�ȣ�� ������ Ư������ ���ڸ� �����ϸ� 8�� �̻��̾�� �մϴ�.");
							pass2 = false;
						}
						Pattern passPattern2 = Pattern.compile("(\\w)\\1\\1\\1");
						Matcher passMatcher2 = passPattern2.matcher(pw);
						  
						if(passMatcher2.find()){
							System.out.println("�޼���)) ��й�ȣ�� ������ ���ڸ� �����ϰ� �����ؼ� ����� �� �����ϴ�.");
							pass2 = false;
						}
						
						if(pw.contains(id)){
						    System.out.println("�޼���)) ���̵� ��й�ȣ�� ���ԵǾ��ֽ��ϴ�.");
						    pass2 = false;
						}
						
						if(pw.contains(" ")){
						    System.out.println("�޼���)) ��й�ȣ�� ������ ���ԵǾ��ֽ��ϴ�.");
						    pass2 = false;
						}
						
						if(pass2) {
							break;
						}
					}
					temp.setPw(pw);
					DB.memberSave();
					return;
				}
			}
		}		
	}
	
	public void myinfo(String id) {
		System.out.println(id + "���� ����");
		for(Member temp : memberList) {
			if(temp.getId().equals(id)) {
				System.out.println("�̸� : "+temp.getName());
				System.out.println("��ȭ��ȣ : "+temp.getPhone());
			}
		}
		System.out.println("1)��й�ȣ ���� 2)ȸ��Ż�� 3)���ư���");
		String work = scanner.next();
		if(work.equals("1")) {
			ChangePw(id);
		}
		else if(work.equals("2")) {
			signout(id);
		}
		else if(work.equals("3")) {
			return;
		}
	}
	
	public void ChangePw(String id) {
		boolean pass = true;
		String Pw = null;
		System.out.println("��й�ȣ ����))");
		System.out.println("PW : ");
		Pw = scanner.next();
		
		for(Member temp : memberList) {
			if(temp.getPw().equals(Pw)) {
				pass = true;
				break;
			}
			else {
				System.out.println("�޼���)) ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				pass = false;
				break;
			}
		}
		if(pass) {
			for(Member temp : memberList) {
				if(Pw.equals(temp.getPw()) && id.equals(temp.getId())) {
					System.out.println("���� ����� ��й�ȣ�� �Է��ϼ���.");
					String pw = null;
					while(true) {
						boolean pass2 = true;
						System.out.print("PW : \n");
						pw = scanner.next();
						
						Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
						Matcher passMatcher1 = passPattern1.matcher(pw);
						
						if(!passMatcher1.find()){
							System.out.println("�޼���)) ��й�ȣ�� ������ Ư������ ���ڸ� �����ϸ� 8�� �̻��̾�� �մϴ�.");
							pass2 = false;
						}
						Pattern passPattern2 = Pattern.compile("(\\w)\\1\\1\\1");
						Matcher passMatcher2 = passPattern2.matcher(pw);
						  
						if(passMatcher2.find()){
							System.out.println("�޼���)) ��й�ȣ�� ������ ���ڸ� �����ϰ� �����ؼ� ����� �� �����ϴ�.");
							pass2 = false;
						}
						
						if(pw.contains(id)){
						    System.out.println("�޼���)) ���̵� ��й�ȣ�� ���ԵǾ��ֽ��ϴ�.");
						    pass2 = false;
						}
						
						if(pw.contains(" ")){
						    System.out.println("�޼���)) ��й�ȣ�� ������ ���ԵǾ��ֽ��ϴ�.");
						    pass2 = false;
						}
						
						if(pass2) {
							break;
						}
					}
					temp.setPw(pw);
					DB.memberSave();
					return;
				}
			}
		}		
	}
	
	public void signout(String id) {
		boolean pass = true;
		String Pw = null;
		System.out.println("��й�ȣ ����))");
		System.out.println("PW : ");
		Pw = scanner.next();
		
		for(Member temp : memberList) {
			if(temp.getPw().equals(Pw)&& id.equals(temp.getId())) {
				pass = true;
				break;
			}
			else {
				System.out.println("�޼���)) ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				pass = false;
				break;
			}
		}
		int index = 0;
		int i = 0;
		for(Member temp : memberList) {
			if(Pw.equals(temp.getPw()) && id.equals(temp.getId())) {
				index = i;
				break;
			}
			i++;
		}
		memberList.remove(index);
		DB.memberSave();
		return;
	}


}
