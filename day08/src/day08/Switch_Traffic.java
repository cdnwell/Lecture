package day08;

import java.util.Scanner;

public class Switch_Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//scanner�ڿ� ctrl+space�� �ȴ�. import
			System.out.println("�١ڡ١ڽ�ȣ�� ���α׷��١ڡ١�");
			System.out.println("������:1, �����:2, �ʷϺ�:3");
			System.out.print("��ȣ:");
			int sign=sc.nextInt();
			switch(sign) {
			case 1: //shift+;
				System.out.println("�������Դϴ�. �����ϼ���");
				break;
			case 2:
				System.out.println("������Դϴ�. break��������");
				break;
			case 3:
				System.out.println("�ʷϺ��Դϴ�. ����ϼ���");
				break;
			default:
				System.out.println("�߸������̽��ϴ�.");
			}
	}

}
