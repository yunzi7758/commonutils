package model.decorator2;

/*
 @author jianghc  
 考核报告   Component  定义一个对象接口，可以给这些对象动态地添加职责。
 考核抽象类
 */
public abstract class ExamineeRecord {
     // 考核情况显示
	public abstract String record();
	//需要评价人签字
	public abstract String signature(String name);
}
