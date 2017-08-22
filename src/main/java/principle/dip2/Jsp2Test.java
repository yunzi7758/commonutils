package principle.dip2;

public class Jsp2Test {

	public static void main(String[] args) {
		IEmployee employee = new Code();
		ICode code = new SeniorProgrammer();
		ICode code1 = new CommonProgrammer();
		//高级程序员张三开始编码
		System.out.println(""+employee.code(code));
		//普通程序员李四开始编码
		System.out.println("管理人员张三派高级程序员李四:"+employee.code(code1) );
	}
}
