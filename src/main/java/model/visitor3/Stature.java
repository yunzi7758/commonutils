package model.visitor3;

//具体访问者角色-身高                                             
public  class Stature implements IVisitor,IMokeVisitor,IHorseVisitor,IMuleVisitor {
//伊犁马、滚沙驴身高的表现 
	public String visit(Horse horse) {
		String a="伊犁马,一般体高144～148厘米.";
		System.out.println("伊犁马,一般体高144～148厘米.");
		return a;
	}
	public String visit(Moke moke) {
		String b="滚沙驴,一般体高107厘米.";
		System.out.println("滚沙驴,一般体高107厘米.");
		return b;
	}
	public String visit(Mule mule) {
		String c="骡子,英国迷你骡子身高只有50厘米.";
		System.out.println("骡子,英国迷你骡子身高只有50厘米.");
		return c;
	}
}
