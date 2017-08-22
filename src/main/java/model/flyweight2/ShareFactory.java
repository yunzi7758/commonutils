package model.flyweight2;

import java.util.Hashtable;
//FlyweightFactory角色
public class ShareFactory   
{   
  private Hashtable matter=new Hashtable();   
  public ShareFactory() {  }   
  //单纯享元工厂方法，所需状态以参量形式传入   
  public Share factory(Character fettle)     
  {   
    if(matter.containsKey(fettle))   
    {   
      return (Share)matter.get(fettle);   
    } else {   
      Share share=new ConcreteShare(fettle);   
      matter.put(fettle,share);   
      return share;   
    }   
  }   
  //享元工厂方法,运用String参量传入状态
  public Share factory(String compositeState)   
  {   
    ConcreteCompositeShare compositeShare=new ConcreteCompositeShare();   
    int length=compositeState.length();   
    Character fettle=null;   
    for(int i=0;i<length;i++)   
    {   
      fettle=new Character(compositeState.charAt(i));   
      System.out.println("factory("+fettle+")");   
      compositeShare.add(fettle,this.factory(fettle));   
    }   
    return compositeShare;   
  }     
}  
