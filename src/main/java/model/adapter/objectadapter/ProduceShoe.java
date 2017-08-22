package model.adapter.objectadapter;

/**  
 * Adapter 适配器  对象适配器与类适配器的区别，只是本处用组合的方式引用ProduceDress
 * */  
public class ProduceShoe  implements ProduceCompany {   
	ProduceDress produceDress;
   public	ProduceShoe(ProduceDress produceDress){   
		      this.produceDress = produceDress ;   
		    }   
    public String getShoe() {   
        System.out.println("--鞋--");   
        return "shoe";   
    }
	public String getDress() {
        System.out.println("--衣服--");  
		return "dress";
	};   
}  
