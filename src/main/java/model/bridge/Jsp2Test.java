package model.bridge;

public class Jsp2Test {

	public static void main(String[] args) {
		HouseImp villaimp = new VillaImp();
       ExtensionHouse ext = new ExtensionHouse();
       ext.setHouseImp(villaimp);
       ext.method("Show1:");
       System.out.println("房子类别:"+ ext.method("Show1:"));
       HouseImp flatimp = new FlatImp();
       ext.setHouseImp(flatimp);
       ext.method("Show2:"); 
		System.out.println(  ext.method("Show2:"));
	}
}
