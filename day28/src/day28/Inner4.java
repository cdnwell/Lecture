package day28;

public class Inner4 {
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		System.out.println("OuterClass�� a�� ��:"+oc.a);
		System.out.println("OuterClass�� b�� ��:"+OuterClass.b);
		//����ƽ ������ ��ü�� �������� �ʾƵ� ��� �����ϰ� ��ü�� �����ϴ� ���� �Ҿ����� �� ����.
		
		System.out.println("--inner Ŭ���� �����ϱ�---");
		OuterClass oc2=new OuterClass();
		//Inner i=new Inner(); ��� �ִ� Ŭ�������� �𸥴�.
		OuterClass.Inner i=oc2.new Inner();
		//���� Ŭ������ �����ڸ� �θ��� ���ؼ��� �ܺ� Ŭ������ ��ü�� ���� �����ؾ� �Ѵ�.
		//���� Ŭ������ ��ü�� �����ϴ� ���, 1.�ܺ�Ŭ����.����Ŭ������ ��ü�� = new �ܺ�Ŭ����������().����Ŭ����������();
		//2.�ܺ�Ŭ������ü.����Ŭ����������()
		
		System.out.println("Inner�� c�� ��:"+i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner�� d�� ��:"+si.d);
		
		//si.staticMethod();
		//��ü�� ������� �ʰ� Ŭ�������� ����ؼ� ȣ�� ����
		//����ƽ�� ����� ����=boldü�� ǥ�� �Ǿ� �ִ�.
		OuterClass.StaticInner.staticMethod();
	}

}

class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner{
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}