package model.singleton;

public class Jsp2Test {

	public static void main(String[] args) {
		//���ö���ʽ����ģʽ�����������ʵ��    
		  System.out.println("1.����ʽ����ģʽ�������ʵ��:");
		  System.out.println("*****************************************");
		  for(int x=0;x<5;x++)
		  { 
		    int y=x+1;
		   System.out.println("�� "+y+" ��"+"�õ��Ķ���ֵΪ"+JackSingleton.getInstance());
		  }
		//��������ʽ����ģʽ�����������ʵ��    
		  System.out.println("2.��������ģʽ�������ʵ��:");
		  System.out.println("*****************************************");
		  for(int x=0;x<5;x++)
		  { 
		    int y=x+1;
		   System.out.println("�� "+y+" ��"+"�õ��Ķ���ֵΪ"+JackSingletonOne.getInstance());
		  } 
		//��ʹ�õ���ģʽ�����������ʵ��   
		  System.out.println("3.�ǵ���ģʽ�������ʵ����");
		  System.out.println("*****************************************");  
		  for(int x=0;x<5;x++)
		  {
		       int z=x+1;
		       NoName noName=new NoName();
		       System.out.println("�� "+z+" ��"+"�õ��Ķ���ֵΪ"+noName);
		  }
	}
}
