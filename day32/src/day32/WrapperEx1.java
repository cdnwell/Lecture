package day32;

public class WrapperEx1 {

	public static void main(String[] args) {
		int i=30;
		Integer ii=new Integer(i);
		System.out.println(ii);
		//ii. 뒤에 메서드 많음, ii는 객체임
		
		double d=3.14;
		Double dd=new Double(d);
		//작대기가 그어져 있는 이유는 사용하지 말라는 의미
		System.out.println(dd);
		
		//wrapper 클래스의 사용이유는 일반 기본 자료형을 객체로 사용
		
		//autoboxing
		Integer iii=40;
		System.out.println(iii);
		//java 9ver 이후 부터 autoboxing 가능
		
	}

}
