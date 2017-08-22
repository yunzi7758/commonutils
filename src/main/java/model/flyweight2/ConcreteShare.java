package model.flyweight2;
//属于ConcerteFlyweight角色
public class ConcreteShare implements Share   
    {   
      private Character intrinsicFettle=null;   
      //传入内蕴状态作为参数   
     public ConcreteShare(Character fettle)   
     {   
        this.intrinsicFettle=fettle;   
      }   
      //传入外蕴状态   
      public String work(String fellte)   
      {   
    	String work="Intrinsic fellte="+intrinsicFettle+",Exterior fellte=";
        System.out.println("Intrinsic fellte="+intrinsicFettle+",Exterior fellte="+fellte);   
        return work+fellte;
      }   
    }  
