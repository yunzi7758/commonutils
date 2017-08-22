package model.composite;

public class Jsp2Test {

	public static void main(String[] args) {
  	//实现树型结构
  		Node platoonOfficer = ClientCase.compositeNodeTree();
  		//一级节点-排长：
  		System.out.println("我国军官级别呈树形结构:"+ platoonOfficer.getMessage());	

  		System.out.println(  ClientCase.getTreeMessage(platoonOfficer));
	}
}
