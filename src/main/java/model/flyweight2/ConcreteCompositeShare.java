package model.flyweight2;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
//UnsharableFlyweight ��ɫ
public class ConcreteCompositeShare implements Share{          
	      private Hashtable matter=new Hashtable(10);   
	      private Share share;   
	      public ConcreteCompositeShare() {  }   
	      //���һ���µĵ�����Ԫ���󵽾ۼ���   
	      public void add(Character key,Share share)   
	      {   
	    	  matter.put(key,share);   
	      }   
	      //��������״̬  
	      public String work(String exteriorFettle)   
	      {   
	        Share share=null;   
	        for(Iterator it=matter.entrySet().iterator();it.hasNext();)   
	        {   
	          Map.Entry e=(Map.Entry)it.next();   
	          share=(Share)e.getValue();   
	          share.work(exteriorFettle); //����״̬  
	        }
			return exteriorFettle;   
	      }   
	    }  
