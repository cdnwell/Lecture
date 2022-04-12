package test;

public class Interface3 {
	public static void main(String[] args) {
		TourGuide guide=new TourGuide();
		guide.leisureSports();
		guide.sightSeeing();
		guide.food();
	}
}
interface Providable{
	abstract void leisureSports();
	abstract void sightSeeing();
	abstract void food();
}
class KoreaTour implements Providable{
	public void leisureSports() {
		System.out.println("�Ѱ� ����Ű ����");
	}
	public void sightSeeing() {
		System.out.println("�溹�� �����ϱ�");
	}
	public void food() {
		System.out.println("���� ����� �Ա�");
	}
}
class JapanTour implements Providable{
	public void leisureSports() {
		System.out.println("���� ������ ����");
	}
	public void sightSeeing() {
		System.out.println("���� �Ÿ� ü��");
	}
	public void food() {
		System.out.println("�Ϻ� �ʹ� �Ա�");
	}
}
class TourGuide{
	//private Providable tour=new KoreaTour();
	private Providable tour=new JapanTour();
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightSeeing() {
		tour.sightSeeing();
	}
	public void food() {
		tour.food();
	}
}