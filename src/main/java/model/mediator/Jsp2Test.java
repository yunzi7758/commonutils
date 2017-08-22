package model.mediator;
/**
 * 中介模式---不直接联系，通过中介联系
 * 
 * 实现
 * 两个对象同时持有中介，没有直接关系
 * 中介同时持有两个对象，传递消息
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
			
		// 具体中介者对象   
		ConcreteMediator cm = new ConcreteMediator();   
		   
		// 使两个具体同事类了解中介者对象   
		Jiangjia jj1 = new Jiangjia(cm);   
		Zhangyu zy2 = new Zhangyu(cm);   
		   
		// 使中介者了解各个具体同事类对象   
		cm.setJiangjia(jj1);   
		cm.setZhangyu(zy2);   
		   
		System.out.println("蒋佳:"+String.valueOf(jj1.send("瞧我男朋友，长的很帅噢！"))); 
		System.out.println("张余:"+String.valueOf(zy2.send("切，我的男朋友比你的更帅！")));
		

	}
}
