package day30;

public class Exception2 {
	public static void main(String[] args) {
		try {
			Exception e=new Exception("고의 예외");
			//Exception 클래스의 생성자
			throw e;	//고의적으로 예외를 던지겠다.
			
		}
		catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}
}
