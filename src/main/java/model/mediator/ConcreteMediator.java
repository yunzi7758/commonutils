package model.mediator;

/**  
 * 具体中介者类，通过了解全体具体同事对象来协调各同事角色，从而达到协作的目标。  
 */  
public class ConcreteMediator extends Mediator{   
    // 具体同事对象1   
    private Jiangjia jiangjia;   
    // 具体同事对象2   
    private Zhangyu zhangyu;   
       
    // 重写发送消息方法，以对象为依据进行选择判断，从而达到通知对象的目的。   
    @Override  
    public String send(String info, Schoolgirl schoolgirl) {         
        if(schoolgirl == jiangjia){   
        	zhangyu.notifyInfo(info);   
        }else{   
        	jiangjia.notifyInfo(info);   
        }
		return info+schoolgirl.toString();          
    }   
  
    public Jiangjia getJiangjia() {   
        return jiangjia;   
    }   
  
    public void setJiangjia(Jiangjia jiangjia) {   
        this.jiangjia = jiangjia;   
    }   
  
    public Zhangyu getZhangyu() {   
        return zhangyu;   
    }   
  
    public void setZhangyu(Zhangyu zhangyu) {   
        this.zhangyu = zhangyu;   
    }   
}  
