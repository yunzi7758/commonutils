package model.visitor3;

////具体访问者角色-体重                   
public class Weight implements IVisitor,IMokeVisitor,IHorseVisitor,IMuleVisitor {
	//伊犁马、滚沙驴体重的表现 
	public String visit(Horse horse) {
		String a="伊犁马,体重400～450千克.";
		System.out.println("伊犁马,体重400～450千克.");
		return a;
	}
	public String visit(Moke moke) {
        String b="滚沙驴，体重140～190千克.";
		System.out.println("滚沙驴，体重140～190千克.");
		return b;
	}
	public String visit(Mule mule) {
	    String c="骡子体重未知!!";
		System.out.println("骡子体重未知!!");
		return c;
	}
}
