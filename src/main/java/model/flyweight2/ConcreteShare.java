package model.flyweight2;
//����ConcerteFlyweight��ɫ
public class ConcreteShare implements Share   
    {   
      private Character intrinsicFettle=null;   
      //��������״̬��Ϊ����   
     public ConcreteShare(Character fettle)   
     {   
        this.intrinsicFettle=fettle;   
      }   
      //��������״̬   
      public String work(String fellte)   
      {   
    	String work="Intrinsic fellte="+intrinsicFettle+",Exterior fellte=";
        System.out.println("Intrinsic fellte="+intrinsicFettle+",Exterior fellte="+fellte);   
        return work+fellte;
      }   
    }  
