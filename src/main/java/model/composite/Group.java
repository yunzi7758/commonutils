package model.composite;

/**
 * ����һ�������ż���λ�ĳ�����-��Component
 */
public abstract class Group {
	private String name ="";	//����
	private String post ="";//��ְ
	private String no ="";//���
	private Group parent = null;//���ڵ��ʼ��
	//ʵ�������Ŀ�й��캯���Ķ���
	public Group(String _name,String _post,String _no){
		this.name = _name;
		this.post = _post;
		this.no = _no;
	}
	//��þ�����Ϣ
	public String getMessage(){
		String message = "";
		message = "������" + this.name;
		message = message + "\t��ְ��"+ this.post;
		message = message + "\t��ţ�" + this.no;
		return message;
	}
	//���ø��ڵ�
	protected void setParent(Group _parent){
		this.parent = _parent;
	}
	//��ȡ���ڵ�
	public Group getParent(){
		return this.parent;
	}
}
