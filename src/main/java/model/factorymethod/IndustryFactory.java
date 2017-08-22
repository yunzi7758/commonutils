package model.factorymethod;

public class IndustryFactory implements IMachineFactory {   
//  @Override  
	   public XiaoMing CreateXiaoMing() {   
	       return new Industry();   
	    }   
	 
	}  
