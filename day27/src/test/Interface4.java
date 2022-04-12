package test;

public class Interface4 {

	public static void main(String[] args) {
		MyCellPhone phone1=new MyCellPhone();
		Camera phone2=new MyCellPhone();
		Call phone3=new MyCellPhone();
		Memo phone4=new MyCellPhone();
		Clock phone5=new MyCellPhone();
		
		PhoneUser user1=new PhoneUser();
		user1.call(phone1);
		user1.call(phone3);
	}

}
interface Camera{
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}
class MyCellPhone implements Camera,Call,Memo,Clock{
	public void photo() {
		System.out.println("photo()");
	}
	public void calling() {
		System.out.println("calling()");
	}
	public void write() {
		System.out.println("write()");
	}
	public void clock() {
		System.out.println("clock()");
	}
}
class PhoneUser{
	void call(Call c) {
		System.out.println("전화를 걸었습니다");
	}
}