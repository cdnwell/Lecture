package day05;

public class Logic_operator {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false; //���� b������ false �� ����
		boolean c=true; //���� c������ true �� ����
		
		System.out.println(a&&b); //a���� b���� ��� ���� ���� ����� �� : AND
		System.out.println(a&&c); //a��c���� ��� ���ϰ�� ��
		System.out.println((2<4)&&(4<5));//true&&true = true
		
		System.out.println(a||b); //aȤ�� b�� true��� ����� true : OR
		System.out.println(a||c); //aȤ�� c�� true��� ����� true : OR
		System.out.println(b||b); //false || false == false ,false�� ������ ��� �� �Ѱ���
		
		System.out.println(!a); //a�� true�̸� false false�̸� true

	}

}
