package model.prototype;

public class Jsp2Test {

	public static void main(String[] args) {
		AbstractPig pig = new SonPig();
		System.out.println(pig.getPigName());
		// ͨ�������clone()����,���ɻ�ö����һ��copy.
		AbstractPig pig2 = (AbstractPig) pig.clone();
		
		System.out.println("������"+pig2.getPigName()); 
	}
}
