package day28;

public class InnerClass1 {
	public static void main(String[] args) {

	}

}
class A{
	static class StaticInner{}
	class InstanceInner{}
	//�ν��Ͻ� Ŭ������ ����ƽ Ŭ������ ��������� ������ ��ġ�� ����ȴ�.
	//�� Ŭ������ ��ü ������ �������� Ȯ����
	StaticInner st1=new StaticInner();
	InstanceInner ii1=new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2=new StaticInner();
		//InstanceInner ii2=new InstanceInner(); > ����ƽ �޼���� �ν��Ͻ� ����� ����
		//�Ұ��� �ϴ�. ����ƽ�̶� ���̸� �޸𸮿� ����Ǵ� ������ �ٸ��� �����̴�.
	}
	void InstanceMethod() {
		StaticInner st3= new StaticInner();
		InstanceInner ii3=new InstanceInner();
		//�ν��Ͻ� �޼���� ����ƽ Ŭ����, �ν��Ͻ� Ŭ���� ��� ���� �����ϴ�.
	}
}