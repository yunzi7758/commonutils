package model.adapter.objectadapter;

/**  
 * Adapter ������  ��������������������������ֻ�Ǳ�������ϵķ�ʽ����ProduceDress
 * */  
public class ProduceShoe  implements ProduceCompany {   
	ProduceDress produceDress;
   public	ProduceShoe(ProduceDress produceDress){   
		      this.produceDress = produceDress ;   
		    }   
    public String getShoe() {   
        System.out.println("--Ь--");   
        return "shoe";   
    }
	public String getDress() {
        System.out.println("--�·�--");  
		return "dress";
	};   
}  
