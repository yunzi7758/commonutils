package model.flyweight2;

public class Test {   
//属于client角色
    public static void main(String[] args) 
    {   
       ShareFactory factory=new ShareFactory();   
       Share share=(Share) factory.factory("东西南东");   
       share.work("宋体");   
    }   
}  
