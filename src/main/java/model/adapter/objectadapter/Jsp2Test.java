package model.adapter.objectadapter;

public class Jsp2Test {

	public static void main(String[] args) {
		
//		����һ������
        ProduceShoe p = new ProduceShoe(null);   
        p.getShoe();   
        p.getDress();   
        System.out.println("��˾��Ʒ:"+  p.getShoe());	
        System.out.println(  p.getDress());
	}
}
