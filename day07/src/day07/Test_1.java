package day07;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id,password;
		Scanner input=new Scanner(System.in);
		System.out.print("id�� �Է����ּ���");
		id=input.nextLine();
		if(id.equals("java"))
		{
			System.out.println("id ��ġ!");
			System.out.print("��й�ȣ�� �Է����ּ���:");
			password=input.nextLine();
			if(password.equals("abc123"))
			{
				System.out.println("��й�ȣ�� �½��ϴ�.");
				System.out.println("�α��� �Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("��й�ȣ�� �ǹٸ��� �ʽ��ϴ�.");
			}
		}
		else
		{
			System.out.println("id�� Ʋ���ϴ�.");
		}
	}

}
