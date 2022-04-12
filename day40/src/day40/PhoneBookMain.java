package day40;

import java.util.*;
//�ѹ��� java.util ��Ű�� Ŭ���� import�ϱ�

public class PhoneBookMain {
	static HashMap<String,String> hm=new HashMap<String,String>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		while (true) {
			System.out.println("�ޡߡޡ���ȭ��ȣ�Ρޡߡޡ�");
			System.out.println("1. �� ���� ����");
			System.out.println("2. �� ���� �˻�");
			System.out.println("3. �� ���� ���");
			System.out.println("4. ������");
			System.out.println("��ȣ �Է�:");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("�ޡߡޡ߰� ���� ����ޡߡޡ�");
				insert();

			}
			else if(choice==2) {
				System.out.println("�ޡߡޡ߰� ���� �˻��ޡߡޡ�");
				search();
			}
			else if(choice==3) {
				System.out.println("�ޡߡޡ߰� ���� ��¡ޡߡޡ�");
				show();

			}
			else if(choice==4) {
				System.out.println("���α׷��� �����մϴ�.");
			}
			else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
		}
	}
	public static void insert() {
		String name,phone;
		System.out.print("������ ���� �̸�:");
		name=sc.next();
		//name�� key�̹Ƿ�, �ߺ� ��� �Ұ���
		if(hm.containsKey(name)) {
			System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			return;
		}
		else {
			System.out.print("������ ���� ��ȣ:");
			phone=sc.next();
			hm.put(name, phone);
			System.out.println("���� �Ϸ�!");
		}
	}
	public static void search() {
		String searchName;
		System.out.print("�˻��� �̸�");
		searchName=sc.next();
		if(hm.containsKey(searchName)) {
			System.out.println("�˻� �Ϸ�!");
			System.out.println("�˻��� ��ȭ��ȣ:"+hm.get(searchName));
		}
		else {
			System.out.println("�˻��� �̸��� �����ϴ�!");
		}
	}
	public static void show() {
		//1.��ü �� ���� ���, ��ü �� Ű ����
		Set<String> keyset=hm.keySet();
		Iterator i=keyset.iterator();
		while(i.hasNext()) {
			String curName=(String)i.next();
			//����� ����ȯ�� ���� ������ ����, �ٿ�ĳ�����̶�� �� �� �ִ�.
			System.out.println("name:"+curName+", phone:"+hm.get(curName));
		}
		
		
	}

	
}
