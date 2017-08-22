package model.adapter.objectadapter;

public class Jsp2Test {

	public static void main(String[] args) {
		
//		创建一个对象
        ProduceShoe p = new ProduceShoe(null);   
        p.getShoe();   
        p.getDress();   
        System.out.println("公司产品:"+  p.getShoe());	
        System.out.println(  p.getDress());
	}
}
