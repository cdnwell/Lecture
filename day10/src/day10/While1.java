package day10;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//ctrl+shift+o > import
		String answer="Y"; //�켱�� while���� ����ǵ��� �ʱ� ���� ������ ���� �ǵ��� ����
		int count=0;
		while(answer.equals("Y"))
		{
			System.out.print("������ ����Ͻðڽ��ϱ�?:");
			answer=sc.nextLine();
			
			if(answer.equals("Y"))
			{
				System.out.printf("������ %d�� ����߽��ϴ�.\n",++count);
			}
		}
		System.out.println("�������");
	}

}
