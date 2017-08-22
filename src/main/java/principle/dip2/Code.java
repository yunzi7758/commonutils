package principle.dip2;

public class Code implements IEmployee{ //程序员编码   
	private static final String Run = "编码活动";
	public String code(ICode code){ 
		System.out.println(code+"程序员开始编码..."); 
		 return code.getRun(Run);   
	} 
	}