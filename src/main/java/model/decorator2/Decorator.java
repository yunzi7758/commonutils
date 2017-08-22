package model.decorator2;

/*
 @author jianghc  
    Decorator  — 维持一个指向Component对象的指针，并定义一个与 Component接口一致的接口。 
    装饰类，装饰考核报告。
 */
public abstract class Decorator extends ExamineeRecord{
	//  考核报告
	private ExamineeRecord er;
	// 用于传送考核报告的构造函数
	public Decorator(ExamineeRecord er){
		this.er = er;
	}
	// 显示考核报告
	public String record(){
		return this.er.record();
	}
	// 评价人签字
	public String signature(String name){
		return	this.er.signature(name);
	}
	
}
