package model.decorator2;

/*
 @author jianghc  ConcreteComponent — 定义一个对象，可以给这个对象添加一些职责。 
 员工小张的考核情况，员工考核类
 */
public class YearExamineeRecord extends ExamineeRecord {
	//员工小张的考核情况
	public String record() {
		String a1="员工:小张   部门：市场";
		String a2="考核情况：  平均分 3.5  2010年度考核分  3.6";
		String a3="  .......";
		System.out.println("员工:小张   部门：市场");  
		System.out.println("考核情况：  平均分 3.5  2010年度考核分  3.6");
		System.out.println("  .......");
		return a1+a2+a3;
	}
	//考核评价人
	public String signature(String name) {
		String a="评价人";
		System.out.println("评价人："+name);
		return a+name;
	}
}
