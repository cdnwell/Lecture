package day07;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id,password;
		Scanner input=new Scanner(System.in);
		System.out.print("id�� �Է����ּ���:");
		id=input.nextLine();
		if(id.equals("java"))
		{
			System.out.println("id�� �½��ϴ�.");
			System.out.print("��й�ȣ�� �Է����ּ���:");
			password=input.nextLine();
			if(password.equals("abc123"))
			{
				System.out.println("��й�ȣ�� �½��ϴ�.");
				System.out.println("�α��� �Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			}
		}
		else
		{
			System.out.println("id�� �ǹٸ��� �ʽ��ϴ�.");
		}
	}
	

}
