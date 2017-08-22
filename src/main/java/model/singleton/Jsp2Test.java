package model.singleton;

public class Jsp2Test {

	public static void main(String[] args) {
		//运用饿汉式单例模式，来调用类的实例    
		  System.out.println("1.饿汉式单例模式调用类的实例:");
		  System.out.println("*****************************************");
		  for(int x=0;x<5;x++)
		  { 
		    int y=x+1;
		   System.out.println("第 "+y+" 次"+"得到的对象值为"+JackSingleton.getInstance());
		  }
		//运用懒汉式单例模式，来调用类的实例    
		  System.out.println("2.懒汉单例模式调用类的实例:");
		  System.out.println("*****************************************");
		  for(int x=0;x<5;x++)
		  { 
		    int y=x+1;
		   System.out.println("第 "+y+" 次"+"得到的对象值为"+JackSingletonOne.getInstance());
		  } 
		//不使用单例模式，来调用类的实例   
		  System.out.println("3.非单例模式调用类的实例：");
		  System.out.println("*****************************************");  
		  for(int x=0;x<5;x++)
		  {
		       int z=x+1;
		       NoName noName=new NoName();
		       System.out.println("第 "+z+" 次"+"得到的对象值为"+noName);
		  }
	}
}
