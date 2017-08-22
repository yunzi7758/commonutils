package model.mediator;

/**  
 * ����ͬ�¶���2,���ɫ�����˽��Ӧ�ľ����н��߽�ɫ��  
 * �Ա�������ͬ�½�ɫͨ��ʱ��ͨ���н��߽�ɫʵ��Э����  
 */   
public class Zhangyu extends Schoolgirl{   
  
    public Zhangyu(Mediator mediator) {   
       super(mediator);   
    }   
       
    public String send(String info){   
        // ������Ϣʱͨ�������н��߷��ͳ�ȥ   
    	return  mediator.send(info, this);  
    }   
       
    public String notifyInfo(String info){   
    	String a="����˵��";
        System.out.println("����˵��"+info);
		return a+info;   
    }   
}  
