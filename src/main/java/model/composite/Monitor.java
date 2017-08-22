package model.composite;

/**
 * 班长-无下属军官的军官--Leaf
 */
public class Monitor extends Group {
	//构造函数
	public Monitor(String _name,String _post,String _no){
		super(_name,_post,_no);
	}
}
