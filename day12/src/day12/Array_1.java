package day12;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3명의 학생의 점수를 만들고 싶다. int형 배열 3개를 만든다.
		//int[] score=new int[3];
		//int score1=100;
		//int score2=80;
		//int score3=70;
		//System.out.println("1번 학생의 점수는 "+score1+"점 입니다.");
		//System.out.println("2번 학생의 점수는 "+score2+"점 입니다.");
		//System.out.println("3번 학생의 점수는 "+score3+"점 입니다.");
		
		int scores[] = new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		
		for(int i=0;i<3;i++)
		{
			System.out.println(i+1+"번 학생의 점수는 "+scores[i]+"점 입니다.");
		}
		
		
	}

}
