package model.composite;

import java.util.ArrayList;
/**
 * 展现树型结构：
 * 一级节点是排长platoonOfficer，二级节点是副排长platoonSergeant，三级节点是班长monitor
 */
public class ClientCase {
	//实现树型结构
	public static Node compositeNodeTree(){
		//一级节点：排长
		Node node = new Node("杰克","排长","A0001");//姓名，官职，编号
		//二级节点：二个副排长
		Node platoonSergeant1 = new Node("李东","副排长","A0002");
		Node platoonSergeant2 = new Node("蒋飞","副排长","A0003");
		//三级节点：班长
		Monitor A0002_1 = new Monitor("陈小小","班长","A0002_1");
		Monitor A0002_2 = new Monitor("李梅","班长","A0002_2");
		Monitor A0002_3 = new Monitor("司徒青云","班长","A0002_3");
		Monitor A0003_1 = new Monitor("金虹","班长","A0003_1");
		Monitor A0003_2 = new Monitor("麻小遇","班长","A0003_2");
		Monitor A0003_3 = new Monitor("林东悄","班长","A0003_3");
		//设置下级-------------------
		//排长下属二个副排长
		node.addJunior(platoonSergeant1);
		node.addJunior(platoonSergeant2);
		//二个副排长的下属
		platoonSergeant1.addJunior(A0002_1);
		platoonSergeant1.addJunior(A0002_2);
		platoonSergeant1.addJunior(A0002_3);
		platoonSergeant2.addJunior(A0003_1);
		platoonSergeant2.addJunior(A0003_2);
		platoonSergeant2.addJunior(A0003_3);
		return node;
	}
	//为了遍历全树,需要通过根节点，遍历出所有的节点。
	public static String getTreeMessage(Node spring){
		ArrayList<Group> juniorList = spring.getJunior();
		String message = "";
		for(Group g :juniorList){
			if(g instanceof Monitor){ //是无下属的军官就直接获得信息
				message = message+ g.getMessage()+"\n";
			}else{ //是个有下属的下级军官
				message = message +g.getMessage() +"\n"+ getTreeMessage((Node)g);
			}
		}
		return message;
	}
	//主方法用于打印信息。
	public static void main(String[] args) 
	{
		//实现树型结构
		Node platoonOfficer = compositeNodeTree();
		//一级节点-排长：
		System.out.println(platoonOfficer.getMessage());
		//所有军官信息
		System.out.println(getTreeMessage(platoonOfficer));
	}

}
