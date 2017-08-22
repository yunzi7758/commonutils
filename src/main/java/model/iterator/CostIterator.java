package model.iterator;

import java.util.ArrayList;

/**
 * @author jianghc
 * 定义一个迭代器
 */
public class CostIterator implements ICostIterator {
	//所有的项目都放在这里ArrayList中
	private ArrayList<ICost> costList = new ArrayList<ICost>();
	private int currentItem = 0; 
	//构造函数出入costList
	public CostIterator(ArrayList<ICost> projectList){
		this.costList = projectList;
	}
	//判断是否还有元素，必须实现
	public boolean hasNext() {
		//定义一个返回值
		boolean b = true;
		if(this.currentItem>=costList.size() || this.costList.get(this.currentItem) == null){
			b =false;
		}
		return b;
	}
	//取得下一个值
	public ICost next() {
		return (ICost)this.costList.get(this.currentItem++);
	}
	//删除一个对象
	public void remove() {
		//暂时没有使用到
	}
}
