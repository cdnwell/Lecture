package day25;
//�۲� ũ�� ���� ctrl+shift+(+ (or) -)
public class Upcasting1 {

	public static void main(String[] args) {
		Student st1=new Student("���浿",20,"�����ϱ�",3);
		st1.info();
		st1.study();
		//����
		System.out.println(st1.grade);
		//����
		
		//��ĳ����
		Human h1=new Student("���浿",30,"���ϱ�",3);
		h1.info();
		//h1.study();
		//study() �޼��带 ����� �� ����.
		//System.out.println(h1.grade);
		//�Ұ��� �θ�Ŭ������ �ڸ��� ���� �����̴�.
	}

}

class Human{
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
	}
}
class Student extends Human{
	//�׳� student extends Human�� �ϸ� ����Ʈ �����ڰ� ������ ����������.
	int grade;
	public Student(String name, int age, String hobby,int grade) {
		super(name,age,hobby);
		//�θ� Ŭ������ �Ű����� �����ڸ� ȣ���ϰڴ�. super(�Ű�����..);
		//�����ڸ� ������ ������
		//����Ʈ �����ڸ� �ڵ����� �������� �ʴ´�.
		this.grade=grade;		
	}
	void info() {//�������̵�
		super.info();
		//�θ�Ŭ���� ������ info�̴�. super class = �θ� Ŭ����
		//sub class = �ڽ� Ŭ����
		System.out.println("grade:"+grade);
		
	}
	void study() {
		System.out.println("�����ϱ�");
	}
}
