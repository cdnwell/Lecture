package test01;

import java.util.Scanner;

public class Break_even_point {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a,b,c;
		long point;
		System.out.println("�� ���, ��Ʈ�� �� �� ������, ��Ʈ�� ����");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		point=a/(c-b)+1;
		if(point<=0) {
			System.out.println("-1");
		}else {
			System.out.println(point);
		}
		
		
	}

}
