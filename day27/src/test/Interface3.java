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
		System.out.println("ÇÑ°­ ¼ö»ó½ºÅ° Åõ¾î");
	}
	public void sightSeeing() {
		System.out.println("°æº¹±Ã °ü¶÷ÇÏ±â");
	}
	public void food() {
		System.out.println("ÀüÁÖ ºñºö¹ä ¸Ô±â");
	}
}
class JapanTour implements Providable{
	public void leisureSports() {
		System.out.println("µµÄì ½ºÆ÷Ã÷ ·¹Àú");
	}
	public void sightSeeing() {
		System.out.println("µµÄì °Å¸® Ã¼Çè");
	}
	public void food() {
		System.out.println("ÀÏº» ÃÊ¹ä ¸Ô±â");
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