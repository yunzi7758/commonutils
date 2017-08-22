package model.iterator;

import java.util.ArrayList;

/**
 * @author jianghc   
 * 成本信息类--具体聚合(ConcreteAggregate)
 */
public class Cost implements ICost {
	//定义一个成本列表
	private ArrayList<ICost> costList = new ArrayList<ICost>();
	//成本内容
	private String content = "";
	//员工数量
	private int num = 0;
	//费用
	private int charge = 0;
	public Cost(){
	
	}
	//定义一个构造函数，把所有老板需要看到的信息存储起来
	private Cost(String content,int num,int charge){
		//赋值到类的成员变量中
		this.content = content;
		this.num = num;
		this.charge=charge;
	}
	//增加项目
	public void add(String content,int num,int charge){
		this.costList.add(new Cost(content,num,charge));
	}
	//得到项目的信息
	public String getProjectInfo() {
		String info = "";
		//成本内容
		info = info+ "成本名称：" + this.content;
		//人力成本数
		info = info + "\t人力成本: "+ this.num;
		//费用
		info = info+ "\t 费用："+ this.charge;
		return info;
	}
	//产生一个遍历对象
	public ICostIterator iterator(){
		return new CostIterator(this.costList);
	}

}
