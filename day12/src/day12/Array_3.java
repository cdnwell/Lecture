package day12;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []students= {100,95,90,88,93};
		int sum=0;
		for(int i=0;i<students.length;i++)
		{
			sum+=students[i];
			//sum의 요소 모두 저장된다.
		}
		System.out.println("시험 점수의 평균:"+sum/(float)students.length);
		//정수 나누기 정수 = 정수, 실수값이 나오려면 정수/실수가 되어야 한다 그래서 
		//students.length를 실수로로 형변환
	}

}
