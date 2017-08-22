package model.mediator;

/**  
 * 抽象同事类  -学校女生
 */  
public abstract class Schoolgirl {      
    protected Mediator mediator;        
    // 创建获取中介者对象的方法   
    public Schoolgirl(Mediator mediator){   
        this.mediator = mediator;   
    }   
}  