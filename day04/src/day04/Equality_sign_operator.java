package day04;

import java.util.Scanner;

public class Equality_sign_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a =3.14; //�Ǽ��� ���� a�� 3.14����
			double b =5.14; //�Ǽ��� ���� b�� 5.14����
			System.out.println(a==b); //a�� b�� ������
			System.out.println(a!=b); //a�� b�� �ٸ���
			
			String c1="Hello JAVA!"; //c1���ڿ� ������ "Hello JAVA!" ���� ����
			System.out.println(c1=="Hello JAVA!");
			System.out.println(c1.equals("Hello JAVA!"));
			System.out.println(c1.equals("hello java!")); 
			//���ڿ��� �빮�� �ҹ��� �񱳵��Ѵ�.
			int num[]=new int[3];
			
			Scanner sc=new Scanner(System.in);
			
			int split;
			split=10;
			System.out.println(split);
	}

}
