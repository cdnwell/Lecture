package test02;

import java.util.Scanner;

public class Packaging2 {

	public static void main(String[] args) {
		int n;		//n�� �Է� ���� �Ѷ�� �����Դϴ�.
		int box;	//box�� �ʿ��� �ּ� ���� �����Դϴ�.
		int total,tmp1,tmp2,tmp3,tmp4;	//tmp�� �ӽ� �� �Դϴ�. total�� ������ �� ���� �Դϴ�.
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("������ �Ѷ�� �� kg :");
		n=sc.nextInt();
		if(n>=1 && n<=1000000) {

			tmp1=n/10;			//10kg ���� ���� tmp1
			tmp2=n%10;
			tmp2=tmp2/5;		//5kg ���� ���� tmp2
			tmp3=n%5;
			tmp3=tmp3/3;		//3kg ���� ���� tmp3
			tmp4=(n%5)%3;		//1kg ���� ���� tmp4
			
			total=tmp1+tmp2+tmp3+tmp4;
			
			System.out.println("�ּ� ���� ������ "+total+"�� �Դϴ�.");
			System.out.println("10kg ���� ����:"+tmp1);
			System.out.println("5kg ���� ����:"+tmp2);
			System.out.println("3kg ���� ����:"+tmp3);
			System.out.println("1kg ���� ����:"+tmp4);	
		}
		else {
			System.out.println("n���� ������ 1�̻� 1000000���� �Դϴ�.");
		}
	}

}
