package model.visitor3;

//��������߽�ɫ-���                                             
public  class Stature implements IVisitor,IMokeVisitor,IHorseVisitor,IMuleVisitor {
//��������ɳ¿��ߵı��� 
	public String visit(Horse horse) {
		String a="������,һ�����144��148����.";
		System.out.println("������,һ�����144��148����.");
		return a;
	}
	public String visit(Moke moke) {
		String b="��ɳ¿,һ�����107����.";
		System.out.println("��ɳ¿,һ�����107����.");
		return b;
	}
	public String visit(Mule mule) {
		String c="����,Ӣ�������������ֻ��50����.";
		System.out.println("����,Ӣ�������������ֻ��50����.");
		return c;
	}
}
