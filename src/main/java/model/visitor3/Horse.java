package model.visitor3;

//具体元素角色-马
public class Horse implements IEquid {
	public void accept(IVisitor visitor) {
		if (visitor instanceof IHorseVisitor) {
			IHorseVisitor Ihv = (IHorseVisitor) visitor;
			Ihv.visit(this);
		}
	}
}
