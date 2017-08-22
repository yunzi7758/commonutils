package principle.lkp2;

public class Jsp2Test {

	public static void main(String[] args) {
		SomeMan jack = new SomeMan();   
		   jack.setLinkMan(new LinkMan());        
		   System.out.println(jack.getLinkMan().playWithSomeGirl());
	}
}
