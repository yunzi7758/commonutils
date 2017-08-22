package model.observer;
/**
 * 观察者模式
 * 做一件事，监听者观察到事件的发生
 * 
 * 通过注册监听器，组合模式即可实现
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
		//新书原价100元
		Book book = new Book(100);
		System.out.println("通过EMAIL发送给所有邮箱注册用户:"+String.valueOf(new EmailObserver(book)));//电邮 observer
		
		System.out.println("JAVA编程思想价格变为:"+String.valueOf(book.updatePrice(85)+"元")); //增加产品价格 

		  	
		
	}
}
