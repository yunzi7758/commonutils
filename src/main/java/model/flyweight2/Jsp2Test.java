package model.flyweight2;

public class Jsp2Test {

	public static void main(String[] args) {
        ShareFactory factory=new ShareFactory();   
        Share share=(Share) factory.factory("������");   
        //share.work("����");   
        System.out.println("���̶����ϲ�ͬ�����̾�Ϊ����:"+share.work("����"));
	}
}
