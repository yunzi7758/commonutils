package model.visitor3;

//����Ԫ�ؽ�ɫ-����
public class Mule implements IEquid {
	public void accept(IVisitor visitor) {
		if (visitor instanceof IMuleVisitor) {
			IMuleVisitor Imv = (IMuleVisitor) visitor;
			Imv.visit(this);
		}
		//������жϣ�else��һ��Ҫд   
		else {
			String s = visitor.getClass().getName();
			String state = s.substring(s.lastIndexOf(".") + 1, s.length());
			System.out.println("������" + state + "ʱû����������!!");
		}
	}
}   

