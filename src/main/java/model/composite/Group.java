package model.composite;

/**
 * 定义一个军队排级单位的抽象类-即Component
 */
public abstract class Group {
	private String name ="";	//姓名
	private String post ="";//官职
	private String no ="";//编号
	private Group parent = null;//父节点初始化
	//实际软件项目中构造函数的定义
	public Group(String _name,String _post,String _no){
		this.name = _name;
		this.post = _post;
		this.no = _no;
	}
	//获得军官信息
	public String getMessage(){
		String message = "";
		message = "姓名：" + this.name;
		message = message + "\t官职："+ this.post;
		message = message + "\t编号：" + this.no;
		return message;
	}
	//设置父节点
	protected void setParent(Group _parent){
		this.parent = _parent;
	}
	//获取父节点
	public Group getParent(){
		return this.parent;
	}
}
