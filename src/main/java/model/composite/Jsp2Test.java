package model.composite;

public class Jsp2Test {

	public static void main(String[] args) {
  	//ʵ�����ͽṹ
  		Node platoonOfficer = ClientCase.compositeNodeTree();
  		//һ���ڵ�-�ų���
  		System.out.println("�ҹ����ټ�������νṹ:"+ platoonOfficer.getMessage());	

  		System.out.println(  ClientCase.getTreeMessage(platoonOfficer));
	}
}
