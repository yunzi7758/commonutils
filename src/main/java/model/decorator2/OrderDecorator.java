package model.decorator2;

/*
 @author jianghc   ConcreteDecorator—  向组件添加职责 
  排名装饰
 */
public class OrderDecorator extends Decorator {
	//构造函数
	public OrderDecorator(ExamineeRecord er){
		super(er);
	}
	//员工在部门的排名情况
	private String recordOrder(){
		String a="部门排名第7...";
		System.out.println("部门排名第7...");
		return a;
	}
	//查看考核分数与部门排名
	public String record(){
		super.record();
		this.recordOrder();
		return super.record()+this.recordOrder();
	}
}
