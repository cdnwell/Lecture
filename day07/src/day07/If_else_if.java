package day07;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+shift+o scanner ���� �ʿ��� �� import
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("����:");
		age=sc.nextInt();
		
		if(age>19)
		{
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		else if(age>13) // 13<age<=19 
		{
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ� ����� ����˴ϴ�.");
		}
		else if(age>8) // 8<age<=13 //else �� �ٷ� ���� ���ǹ����� �����Ѵ�.
		{
			System.out.println("����Դϴ�.");
			System.out.println("��� ����� ����˴ϴ�.");
		}
		else
		{
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		System.out.println("������ ������ �ּ���.");
		
	}

}
