package day32;

public class WrapperEx1 {

	public static void main(String[] args) {
		int i=30;
		Integer ii=new Integer(i);
		System.out.println(ii);
		//ii. �ڿ� �޼��� ����, ii�� ��ü��
		
		double d=3.14;
		Double dd=new Double(d);
		//�۴�Ⱑ �׾��� �ִ� ������ ������� ����� �ǹ�
		System.out.println(dd);
		
		//wrapper Ŭ������ ��������� �Ϲ� �⺻ �ڷ����� ��ü�� ���
		
		//autoboxing
		Integer iii=40;
		System.out.println(iii);
		//java 9ver ���� ���� autoboxing ����
		
	}

}
