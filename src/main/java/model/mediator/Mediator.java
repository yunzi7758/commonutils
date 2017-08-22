package model.mediator;

/**  
 * 抽象中介者类,此角色定义统一接口用于各同事角色间通信  
 */  
public abstract class Mediator {   
    // 创建获取同事对象、发送消息的一个抽象发送消息方法。   
    public abstract String send(String info,Schoolgirl schoolgirl);   
}  