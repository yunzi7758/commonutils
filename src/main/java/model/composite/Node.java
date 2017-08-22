package model.composite;

import java.util.ArrayList;
/**
 * �ڵ���
 */
public class Node extends Group {
	//�ϼ���������������Щ�¼����ٺ����¼�����
	ArrayList<Group> JuniorList = new ArrayList<Group>();
	//���캯��,�������
	public Node(String _name,String _post,String _no){
		super(_name,_post,_no);
	}
	//����һ���������������¼����٣�Ҳ�����Ǹ����¼�����
	public void addJunior(Group group) {
		group.setParent(this); //���ø��ڵ�
		this.JuniorList.add(group);
	}
	//�ϼ�ӵ�е�����
	public ArrayList<Group> getJunior() {
		return this.JuniorList;
	}
}
