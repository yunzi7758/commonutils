package principle.dip2;

public class Code implements IEmployee{ //����Ա����   
	private static final String Run = "����";
	public String code(ICode code){ 
		System.out.println(code+"����Ա��ʼ����..."); 
		 return code.getRun(Run);   
	} 
	}