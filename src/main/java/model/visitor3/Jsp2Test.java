package model.visitor3;

public class Jsp2Test {

	public static void main(String[] args) {
		  	ObjectStructure obj = new ObjectStructure();  //����ObjectStructure                                            
		  	
		  	//����Ԫ�ص�ʵ����                                                     
		  	 obj.increase(new Horse()); 
		  	 obj.increase(new Moke());
		  	 obj.increase(new Mule());      //����һ�־���Ԫ��mule  
		  	                                                                             
		  	//�ڴ������ʱ����Ԫ�صĲ�ͬ��Ӧ
		  	IVisitor stature = new Stature();           //����Visitor�ӿ� 
		  
		  	System.out.print(obj.show(stature)+" ");   
		  
		  	//�ڴ�������ʱ����Ԫ�صĲ�ͬ��Ӧ                                                                                                             
		  	IVisitor weight = new Weight();          //����Visitor�ӿ�        
		  	
		  	System.out.print(obj.show(weight)+" ");     
	}
}
