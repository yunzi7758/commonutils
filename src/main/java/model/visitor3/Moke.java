package model.visitor3;

//����Ԫ�ؽ�ɫ-¿
public class Moke implements IEquid {
	public void accept(IVisitor visitor) {
		if (visitor instanceof IMokeVisitor) {
			IMokeVisitor Imv = (IMokeVisitor) visitor;
			Imv.visit(this);
		}
	}
}