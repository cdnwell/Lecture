package day43;

public class Thread2 {

	public static void main(String[] args) {
		Runnable t =new MyThread3();	//업캐스팅, 자식에 있는 값이 부모로 형변환
		//굳이 runnable 인터ㅔ이스로 안해도 된다.
		Thread t1=new Thread(t,"thread1");//new Thread(Runnable target,String name);
		//스레드에 이름값 지정
		t1.setPriority(1);
		
		System.out.println("t1의 우선순위는:"+t1.getPriority());
		
		Thread t2=new Thread(t,"thread2");
		//ㅇ선순위 지정 안할시 자동으로 우선순위 값 5
		System.out.println("t2의 우선순위는:"+t2.getPriority());
		
		Thread t3=new Thread(t,"thread3");
		t3.setPriority(10);
		System.out.println("t3의 우선순위는:"+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		//우선순위가 높은 작업이 더 많은 시간을 할당한다. t3가 가장 많은 시간을 할당받고
		//t1이 가장 적게 시간을 할당 받아 가장 마지막으로 끝나게 된다.
	}

}
class MyThread3 implements Runnable {
		@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("<"+Thread.currentThread().getName()+">");
		}
		for(int i=0;i<1000;i++) {
			//시간지연
		
		}
	}
}
//스레드 예시:스레드 우선순위 설정은 과제 제출, 영화 다운을 해야 한다면 과제 제출에 더 많은 시간을 할당하여 우선순위를 높게 준다.
