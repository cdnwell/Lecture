package day11;

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num;
			while(true) {
				System.out.println("�����Է�:");
				num=sc.nextInt();
				//num==0 ����
				//num<0 �ٽ� �ݺ� ����
				if(num==0)
				{
					break;
				}
				else if(num<0)
				{
					System.out.println("�Ʒ� ��� �����ϰ� ���� �ݺ�����");
					continue;
				}
				System.out.println("num:"+num);
				
			}
	}

}
