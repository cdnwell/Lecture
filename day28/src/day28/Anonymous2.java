package day28;

public class Anonymous2 {
	public static void main(String[] args) {
		OuterClass1 o=new OuterClass1() {
			void a() {
				System.out.println("���Ӱ� ���ǵ� �͸�Ŭ���� �޼����Դϴ�.");
			}
		};
		o.a();
		OuterClass1 ok=new OuterClass1();
		ok.a();
		//�͸�Ŭ������ 1ȸ���̴�.
		//�͸�Ŭ������ �ٸ� Ŭ�������� �����ϰ� �ʹٸ� �� �ٽ� ������ �Ѵ�.
	}
}
class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}