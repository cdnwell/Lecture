package day43;

public class Thread2 {

	public static void main(String[] args) {
		Runnable t =new MyThread3();	//��ĳ����, �ڽĿ� �ִ� ���� �θ�� ����ȯ
		//���� runnable ���ͤ��̽��� ���ص� �ȴ�.
		Thread t1=new Thread(t,"thread1");//new Thread(Runnable target,String name);
		//�����忡 �̸��� ����
		t1.setPriority(1);
		
		System.out.println("t1�� �켱������:"+t1.getPriority());
		
		Thread t2=new Thread(t,"thread2");
		//�������� ���� ���ҽ� �ڵ����� �켱���� �� 5
		System.out.println("t2�� �켱������:"+t2.getPriority());
		
		Thread t3=new Thread(t,"thread3");
		t3.setPriority(10);
		System.out.println("t3�� �켱������:"+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		//�켱������ ���� �۾��� �� ���� �ð��� �Ҵ��Ѵ�. t3�� ���� ���� �ð��� �Ҵ�ް�
		//t1�� ���� ���� �ð��� �Ҵ� �޾� ���� ���������� ������ �ȴ�.
	}

}
class MyThread3 implements Runnable {
		@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("<"+Thread.currentThread().getName()+">");
		}
		for(int i=0;i<1000;i++) {
			//�ð�����
		
		}
	}
}
//������ ����:������ �켱���� ������ ���� ����, ��ȭ �ٿ��� �ؾ� �Ѵٸ� ���� ���⿡ �� ���� �ð��� �Ҵ��Ͽ� �켱������ ���� �ش�.
