package model.composite;

import java.util.ArrayList;
/**
 * 节点类
 */
public class Node extends Group {
	//上级军官下属包括那些下级军官和下下级军官
	ArrayList<Group> JuniorList = new ArrayList<Group>();
	//构造函数,定义参数
	public Node(String _name,String _post,String _no){
		super(_name,_post,_no);
	}
	//增加一个下属，可能是下级军官，也可能是个下下级军官
	public void addJunior(Group group) {
		group.setParent(this); //设置父节点
		this.JuniorList.add(group);
	}
	//上级拥有的下属
	public ArrayList<Group> getJunior() {
		return this.JuniorList;
	}
}
