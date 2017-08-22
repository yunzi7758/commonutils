package model.visitor3;

public class Jsp2Test {

	public static void main(String[] args) {
		  	ObjectStructure obj = new ObjectStructure();  //依赖ObjectStructure                                            
		  	
		  	//具体元素的实例化                                                     
		  	 obj.increase(new Horse()); 
		  	 obj.increase(new Moke());
		  	 obj.increase(new Mule());      //新增一种具体元素mule  
		  	                                                                             
		  	//在处理身高时，各元素的不同反应
		  	IVisitor stature = new Stature();           //依赖Visitor接口 
		  
		  	System.out.print(obj.show(stature)+" ");   
		  
		  	//在处理体重时，各元素的不同反应                                                                                                             
		  	IVisitor weight = new Weight();          //依赖Visitor接口        
		  	
		  	System.out.print(obj.show(weight)+" ");     
	}
}
