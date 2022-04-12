package day33;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
		//Calendar a =new Calendar();
		//불가능 추상클래스라 객체를 생성할 수 없다.
		Calendar a = Calendar.getInstance();
		Calendar b = new GregorianCalendar();
		//경고 밑줄 나옴, 임포트 해줘야 된다
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		
		
	}

}
