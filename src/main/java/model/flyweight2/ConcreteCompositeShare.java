package model.flyweight2;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
//UnsharableFlyweight 角色
public class ConcreteCompositeShare implements Share{          
	      private Hashtable matter=new Hashtable(10);   
	      private Share share;   
	      public ConcreteCompositeShare() {  }   
	      //添加一个新的单纯享元对象到聚集中   
	      public void add(Character key,Share share)   
	      {   
	    	  matter.put(key,share);   
	      }   
	      //传入外蕴状态  
	      public String work(String exteriorFettle)   
	      {   
	        Share share=null;   
	        for(Iterator it=matter.entrySet().iterator();it.hasNext();)   
	        {   
	          Map.Entry e=(Map.Entry)it.next();   
	          share=(Share)e.getValue();   
	          share.work(exteriorFettle); //外蕴状态  
	        }
			return exteriorFettle;   
	      }   
	    }  
