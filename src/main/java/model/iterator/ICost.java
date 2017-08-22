package model.iterator;

/**
 * @author jianghch
 * 定义一个接口，所有的成本都是一个接口- 聚合(Aggregate可使用接口或抽象类)
 */
public interface ICost {
	//增加项目
	public void add(String name,int num,int cost);
	//小张查看成本信息
	public String getProjectInfo();	
	//取得一个可被遍历对象
	public ICostIterator iterator();
}
