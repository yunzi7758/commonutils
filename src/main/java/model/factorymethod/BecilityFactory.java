package model.factorymethod;

public class BecilityFactory implements IMachineFactory {   
 
//  @Override  
   public XiaoMing CreateXiaoMing() {   
	       return new Becility();   
	   }   
	 
}  
