package model.prototype;

public class Jsp2Test {

	public static void main(String[] args) {
		AbstractPig pig = new SonPig();
		System.out.println(pig.getPigName());
		// 通过对象的clone()方法,即可获得对象的一个copy.
		AbstractPig pig2 = (AbstractPig) pig.clone();
		
		System.out.println("拷贝："+pig2.getPigName()); 
	}
}
