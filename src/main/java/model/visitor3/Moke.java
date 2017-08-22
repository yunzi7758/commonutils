package model.visitor3;

//具体元素角色-驴
public class Moke implements IEquid {
	public void accept(IVisitor visitor) {
		if (visitor instanceof IMokeVisitor) {
			IMokeVisitor Imv = (IMokeVisitor) visitor;
			Imv.visit(this);
		}
	}
}