package model.visitor3;

////��������߽�ɫ-����                   
public class Weight implements IVisitor,IMokeVisitor,IHorseVisitor,IMuleVisitor {
	//��������ɳ¿���صı��� 
	public String visit(Horse horse) {
		String a="������,����400��450ǧ��.";
		System.out.println("������,����400��450ǧ��.");
		return a;
	}
	public String visit(Moke moke) {
        String b="��ɳ¿������140��190ǧ��.";
		System.out.println("��ɳ¿������140��190ǧ��.");
		return b;
	}
	public String visit(Mule mule) {
	    String c="��������δ֪!!";
		System.out.println("��������δ֪!!");
		return c;
	}
}
