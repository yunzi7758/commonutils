package model.visitor3;

//具体元素角色-骡子
public class Mule implements IEquid {
	public void accept(IVisitor visitor) {
		if (visitor instanceof IMuleVisitor) {
			IMuleVisitor Imv = (IMuleVisitor) visitor;
			Imv.visit(this);
		}
		//视情况判断，else不一定要写   
		else {
			String s = visitor.getClass().getName();
			String state = s.substring(s.lastIndexOf(".") + 1, s.length());
			System.out.println("骡子在" + state + "时没有设置体重!!");
		}
	}
}   

