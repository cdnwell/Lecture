package day33;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar today= Calendar.getInstance();
		Calendar endOfYear= Calendar.getInstance();
		Calendar christmas=Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH, 11);//MONTH필드를 11값으로 지정한다
		//12월로 지정됨
		endOfYear.set(Calendar.DATE,31);//date:31일
		long diff = endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은 날:"+diff/(24*60*60*1000)+"일");
		
		christmas.set(2022,11,25); //2022년 12월 25일
		diff=christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날:"+diff/(24*60*60*1000)+"일");
		
	}

}
