package model.visitor3;

import java.util.*;

public class ObjectStructure {
	private List<IEquid> elements = new ArrayList<IEquid>();
	public void increase(IEquid element) { //����increase                       
		elements.add(element);
	}
	public void discerption(IEquid element) { //discerption�ֿ�,�Ƴ�                    
		elements.remove(elements); //�Ƴ�                       
	}
	//�����������͵ľ���Ԫ�أ���������accept����                                                                     
	public String show(IVisitor visitor) {
		String a1="";
		String a2=""; 
		String a3="";
		String a4=""; 
		String a5="";
		String a6=""; 
		  if(visitor instanceof Stature ){
			  Moke moke = null;
			  IMokeVisitor Imv = (Stature) visitor;
              a1=Imv.visit(moke);
		  }
		  if(visitor instanceof Stature ){
			  Horse horse = null;
			  IHorseVisitor Ihv = (Stature) visitor;
              a2=Ihv.visit(horse);
		  }
		  if(visitor instanceof Weight ){
			  Moke moke = null;
			  IMokeVisitor Imv = (Weight) visitor;
              a3=Imv.visit(moke);
		  }
		  if(visitor instanceof Weight ){
			  Horse horse = null;
			  IHorseVisitor Ihv = (Weight) visitor;
              a4=Ihv.visit(horse);
		  }
		  if(visitor instanceof Stature ){
			  Mule mule = null;
			  IMuleVisitor Imv = (Stature) visitor;
              a5=Imv.visit(mule);
		  }
		  if(visitor instanceof Weight ){
			  Mule mule = null;
			  IMuleVisitor Imv = (Weight) visitor;
              a6=Imv.visit(mule);
		  }  
		 for (IEquid equid : elements) {
			equid.accept(visitor);
		 }
		 return a1+a2+a3+a4+a5+a6;
	}
}
