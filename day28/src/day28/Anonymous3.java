package day28;

public class Anonymous3 {

	public static void main(String[] args) {
		Inter1 it=new Inter1() {

			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
			}};
			it.f1();
		//�Ұ��� �������̽��� ��ü�� ������ �� ����.
		//Ŭ������ 1ȸ������ ����Ѵٸ� Ŭ������ ���� ������� �ʰ�
		//�͸�Ŭ������ ���� �������̽��� ��ü�� ����
	}

}
interface Inter1 {
	void f1();
}
//�Ʒ��� �Ϲ�Ŭ�����̰� �������̽��� ��ü�� ����� ���� ����
class Inter1Impl implements Inter1{
	public void f1() {
		System.out.println("�������̽��� ��ü�� ���� Ŭ����");
	}
}