package day12;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3���� �л��� ������ ����� �ʹ�. int�� �迭 3���� �����.
		//int[] score=new int[3];
		//int score1=100;
		//int score2=80;
		//int score3=70;
		//System.out.println("1�� �л��� ������ "+score1+"�� �Դϴ�.");
		//System.out.println("2�� �л��� ������ "+score2+"�� �Դϴ�.");
		//System.out.println("3�� �л��� ������ "+score3+"�� �Դϴ�.");
		
		int scores[] = new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		
		for(int i=0;i<3;i++)
		{
			System.out.println(i+1+"�� �л��� ������ "+scores[i]+"�� �Դϴ�.");
		}
		
		
	}

}