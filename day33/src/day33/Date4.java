package day33;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar today= Calendar.getInstance();
		Calendar endOfYear= Calendar.getInstance();
		Calendar christmas=Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH, 11);//MONTH�ʵ带 11������ �����Ѵ�
		//12���� ������
		endOfYear.set(Calendar.DATE,31);//date:31��
		long diff = endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("�������� ���� ��:"+diff/(24*60*60*1000)+"��");
		
		christmas.set(2022,11,25); //2022�� 12�� 25��
		diff=christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("ũ������������ ���� ��:"+diff/(24*60*60*1000)+"��");
		
	}

}
