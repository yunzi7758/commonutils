package model.flyweight2;

public class Test {   
//����client��ɫ
    public static void main(String[] args) 
    {   
       ShareFactory factory=new ShareFactory();   
       Share share=(Share) factory.factory("�����϶�");   
       share.work("����");   
    }   
}  
