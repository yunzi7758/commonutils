package model.mediator;

/**  
 * �����н����࣬ͨ���˽�ȫ�����ͬ�¶�����Э����ͬ�½�ɫ���Ӷ��ﵽЭ����Ŀ�ꡣ  
 */  
public class ConcreteMediator extends Mediator{   
    // ����ͬ�¶���1   
    private Jiangjia jiangjia;   
    // ����ͬ�¶���2   
    private Zhangyu zhangyu;   
       
    // ��д������Ϣ�������Զ���Ϊ���ݽ���ѡ���жϣ��Ӷ��ﵽ֪ͨ�����Ŀ�ġ�   
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
