package test01;

//Scanner Ŭ������ ��ü�� ��� ������ ���� y�� �տ� ����Ʈ���� ������ ������� �ʴ´�.
//�տ� �ϳ��� ������ ����Ǵ� �� �ϴ�.

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y;
		int num;
		//System.out.println("�ұ⿬�� �Է�!");
		while(true) {
			//System.out.println("�١ڡ١ںұ⿬���� ���⿬���� �ٲߴϴ١١ڡ١�");
			//System.out.print("�ұ⿬���� �Է����ּ���:");
			y=sc.nextInt();
			if(y>=1000 && y<=3000) {
				num=y-543;
				System.out.println("�Է��Ͻ� �ұ⿬��:"+y);
				System.out.println("�ٲ� ���⿬��:"+num);
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(y==0) {
				System.out.println("������ �ߴ��մϴ�!");
				break;
			}else
			{
				System.out.println("���ڴ� 1000�̻� 3000���Ϸ� �����ּ���.");
			}
		}
	}
}