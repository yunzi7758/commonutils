package model.decorator2;

/*
 @author jianghc  	ConcreteDecorator —  向组件添加职责
  告知员工部门最高考核分类装饰
 */
public class TiptopPointDecorator extends Decorator {
	//构造函数
	public TiptopPointDecorator(ExamineeRecord er){
		super(er);
	}
	//部门的最高考核分数情况
	private String reportHighScore(){
		String a="此次考核,最高平均分为4.2，2010年度最高考核分为4.1。";
		System.out.println("此次考核,最高平均分为4.2，2010年度最高考核分为4.1。");
		return a;
	}
//部门最高考核分与员工的考核分
	public String record(){
		this.reportHighScore();
		super.record();
		return this.reportHighScore()+super.record();
	}
}
