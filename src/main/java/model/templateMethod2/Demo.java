package model.templateMethod2;

/**
 * @author jackjiang 模板抽象类
 */
public abstract class Demo {

	/*
	 *设计图所含主体内容
	 */
	public abstract String search();//查询

	public abstract String update();//修改

	public abstract String add();//添加

	public abstract String del();//删除
	
	public abstract String leadin();//导入
	
	public abstract String export();//导出

}
