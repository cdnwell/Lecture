package day42;
//main�� �ϳ��� �������̴�. ***
public class Thread1 {
	public static void main(String[] args) {
		//JVM ������ ��û
		//1)Thread Ŭ���� ��ӹ��� Ŭ������ �����带 ��û
		MyThread th1=new MyThread();
		th1.start();
		//2)Runnable �������̽��� ������ Ŭ������ �����带 ��û
		MyThread2 th2 =new MyThread2();
		Thread t=new Thread(th2); //thread(Runnable target)
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("���� �Լ� ���� ��~"+i);
		}
		
		
	}
}
//1)Thread Ŭ���� ��ӹ޾� �۾��� ����
class MyThread extends Thread{
	//run �޼��� �������̵�(������)
	public void run() {
		// thread�� �ؾ� �� �۾� ����
		for(int i=0;i<10;i++) {
			System.out.println("������ ���� �� "+i);
		}
	}
}

//2) Runnable �������̽��� �����Ͽ� �۾��� ����
class MyThread2 implements Runnable{
	//run�̶�� �޼��带 �������̵� ���� ������ mythread2�� ���� ����
	//�������̽��� �����ϱ� �����̴�.
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("���ʺ� ���� �� "+i);
		}
	}
	
}