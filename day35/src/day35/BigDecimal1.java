package day35;

import java.math.BigDecimal;

public class BigDecimal1 {

	public static void main(String[] args) {
		double a=24.3953;
		double b=50.343998;
		System.out.println(a+b);
		//실수값을 정확하게 표현하지 못해 실수 아래 자리에9999가 반복 생성됨
		
		BigDecimal number=new BigDecimal(String.valueOf(a));
		BigDecimal number2=new BigDecimal(String.valueOf(b));
		System.out.println(number.add(number2));
	}

}
