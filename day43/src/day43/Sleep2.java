package day43;

public class Sleep2 {

	public static void main(String[] args) {
		SleepThread t=new SleepThread();
		t.start();
	}

}
class SleepThread extends Thread{
	public void run() {
		System.out.println("ī��Ʈ �ٿ� 5��");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			if(i!=0) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException ie) {
					System.err.println(ie.toString());
				}
			}
		}
		System.out.println("����!");
	}
}
//sleep�޼���� ���� ������ �ð����� �����带 block��Ű�� ����� �Ѵ�.