package day06;
//�ڵ� import : ctrl+shift+ o (���ĺ�)
import java.util.Scanner;

public class Traffic_Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("��ȣ�� ���α׷�");
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.println("������:1 , �ʷϺ�:2, �����:3");
			int sign=sc.nextInt();
			String result=sign==1?"�����ϼ���":sign==2?"����ϼ���":"����ϼ���";
			System.out.println(result);
			
	}

}
