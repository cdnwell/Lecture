package day42;
//main도 하나의 쓰레드이다. ***
public class Thread1 {
	public static void main(String[] args) {
		//JVM 스레드 요청
		//1)Thread 클래스 상속받은 클래스의 스레드를 요청
		MyThread th1=new MyThread();
		th1.start();
		//2)Runnable 인터페이스를 구현한 클래스의 스레드를 요청
		MyThread2 th2 =new MyThread2();
		Thread t=new Thread(th2); //thread(Runnable target)
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("메인 함수 진행 중~"+i);
		}
		
		
	}
}
//1)Thread 클래스 상속받아 작업을 구현
class MyThread extends Thread{
	//run 메서드 오버라이딩(재정의)
	public void run() {
		// thread가 해야 할 작업 구현
		for(int i=0;i<10;i++) {
			System.out.println("스레드 진행 중 "+i);
		}
	}
}

//2) Runnable 인터페이스를 구현하여 작업을 구현
class MyThread2 implements Runnable{
	//run이라는 메서드를 오버라이딩 하지 않으면 mythread2에 빨간 밑줄
	//인터페이스를 구현하기 때문이다.
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("러너블 진행 중 "+i);
		}
	}
	
}