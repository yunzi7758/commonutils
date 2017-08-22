package model.visitor3;

//����Ԫ�ؽ�ɫ-��
public class Horse implements IEquid {
	public void accept(IVisitor visitor) {
		if (visitor instanceof IHorseVisitor) {
			IHorseVisitor Ihv = (IHorseVisitor) visitor;
			Ihv.visit(this);
		}
	}
}
