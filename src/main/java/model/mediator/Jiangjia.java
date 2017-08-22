package model.mediator;

/**  
 * 具体同事对象1,其角色必须了解对应的具体中介者角色，  
 * 以便与其他同事角色通信时，通过中介者角色实现协作。  
 */  
public class Jiangjia extends Schoolgirl{   
  
    public Jiangjia(Mediator mediator) {   
        super(mediator);   
   }   
       
   public String send(String info){   
        // 发送消息时通常由中介者发送出去   
       return mediator.send(info, this); 
    }   
       
   public String notifyInfo(String info){   
	   String a="蒋佳说：";
        System.out.println("蒋佳说："+info);  
        return a+info;
    }   
}  