package principle.dip2;

public class CommonProgrammer implements ICode{ //普通程序员
	private static final String Run = "JACK";
	public String getRun(String Run1){ 
		String Run2="工作"; 
		System.out.println(Run+"普通程序员开始工作..."); 
		  return Run2;
		}
	} 
	