package model.composite;

import java.util.ArrayList;
/**
 * չ�����ͽṹ��
 * һ���ڵ����ų�platoonOfficer�������ڵ��Ǹ��ų�platoonSergeant�������ڵ��ǰ೤monitor
 */
public class ClientCase {
	//ʵ�����ͽṹ
	public static Node compositeNodeTree(){
		//һ���ڵ㣺�ų�
		Node node = new Node("�ܿ�","�ų�","A0001");//��������ְ�����
		//�����ڵ㣺�������ų�
		Node platoonSergeant1 = new Node("�","���ų�","A0002");
		Node platoonSergeant2 = new Node("����","���ų�","A0003");
		//�����ڵ㣺�೤
		Monitor A0002_1 = new Monitor("��СС","�೤","A0002_1");
		Monitor A0002_2 = new Monitor("��÷","�೤","A0002_2");
		Monitor A0002_3 = new Monitor("˾ͽ����","�೤","A0002_3");
		Monitor A0003_1 = new Monitor("���","�೤","A0003_1");
		Monitor A0003_2 = new Monitor("��С��","�೤","A0003_2");
		Monitor A0003_3 = new Monitor("�ֶ���","�೤","A0003_3");
		//�����¼�-------------------
		//�ų������������ų�
		node.addJunior(platoonSergeant1);
		node.addJunior(platoonSergeant2);
		//�������ų�������
		platoonSergeant1.addJunior(A0002_1);
		platoonSergeant1.addJunior(A0002_2);
		platoonSergeant1.addJunior(A0002_3);
		platoonSergeant2.addJunior(A0003_1);
		platoonSergeant2.addJunior(A0003_2);
		platoonSergeant2.addJunior(A0003_3);
		return node;
	}
	//Ϊ�˱���ȫ��,��Ҫͨ�����ڵ㣬���������еĽڵ㡣
	public static String getTreeMessage(Node spring){
		ArrayList<Group> juniorList = spring.getJunior();
		String message = "";
		for(Group g :juniorList){
			if(g instanceof Monitor){ //���������ľ��پ�ֱ�ӻ����Ϣ
				message = message+ g.getMessage()+"\n";
			}else{ //�Ǹ����������¼�����
				message = message +g.getMessage() +"\n"+ getTreeMessage((Node)g);
			}
		}
		return message;
	}
	//���������ڴ�ӡ��Ϣ��
	public static void main(String[] args) 
	{
		//ʵ�����ͽṹ
		Node platoonOfficer = compositeNodeTree();
		//һ���ڵ�-�ų���
		System.out.println(platoonOfficer.getMessage());
		//���о�����Ϣ
		System.out.println(getTreeMessage(platoonOfficer));
	}

}
