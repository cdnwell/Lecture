package day27;

public class Interface1 {

	public static void main(String[] args) {
		//Ainter a;
		//�������̽��� �߻�Ŭ������ ���������� ��ü�� �����Ҽ� ��� new ������ Ŭ������ ������� �ʴ´�.
		//Ainter.x=20; �Ұ����ϴ�. final Ű���尡 �����ǵ� ���
		B b =new B();
		b.methodA();
		b.methodB();
		System.out.println(b.x);
		//b.x=30; �Ұ���
	}

}

interface Ainter{//interface�� interface ��+inter��� �̸����� ���� ���δ�.
	final int x=10;
	int y=20;		//final ���� ���� Ÿ���� ����� �ȴ�.
	abstract void methodA();
	void methodB();		//�߻�ȭ ���� ���� �����Ǿ �߻�޼���� ���ֵȴ�. ������ ��������
}
class B implements Ainter{

	@Override
	public void methodA() {
		System.out.println("methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
	
}