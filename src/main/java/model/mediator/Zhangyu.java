package model.mediator;

/**  
 * 具体同事对象2,其角色必须了解对应的具体中介者角色，  
 * 以便与其他同事角色通信时，通过中介者角色实现协作。  
 */   
public class Zhangyu extends Schoolgirl{   
  
    public Zhangyu(Mediator mediator) {   
       super(mediator);   
    }   
       
    public String send(String info){   
        // 发送消息时通常是由中介者发送出去   
    	return  mediator.send(info, this);  
    }   
       
    public String notifyInfo(String info){   
    	String a="张余说：";
        System.out.println("张余说："+info);
		return a+info;   
    }   
}  
