package model.flyweight2;

public class Jsp2Test {

	public static void main(String[] args) {
        ShareFactory factory=new ShareFactory();   
        Share share=(Share) factory.factory("东西南");   
        //share.work("宋体");   
        System.out.println("内蕴东西南不同，外蕴均为字体:"+share.work("宋体"));
	}
}
