package model.templateMethod2;
/**
 * 模版---变与不变
 * 做一件事，有固定的部分与需要输入的部分。
 * 定一个模版来接收变动的参数，做这件事的方法就写好了。
 * 
 * *当这个模版方法定在当前类里面，具体类只要实现模版方法即可
 * 
 * *当把这个所谓的模版定在接口里面，接口作为参数。此时变动通过接口写好了。
 * 实际运行时，变动的部分动态绑定到实际的实现
 * 
 * 都可以将同时有变和不变的方法写好。
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
		//版本1，给领导用的,WAR发布
		Decorator demod1=new WarDecorator(new FirstEdition());
		System.out.print("版本1，给领导用的,WAR发布。");
		 
		 System.out.print(demod1.add()+" ");
		 System.out.print(demod1.del()+" ");
		 System.out.print(demod1.export()+" ");
		 System.out.print(demod1.search()+" ");
		 System.out.print(demod1.leadin()+" ");
		 System.out.print(demod1.update()+" ");
		 //版本2，给员工用的,EAR发布。
		  Decorator demod2=new EarDecorator(new SecondEdition());
		  System.out.print("版本2，给员工用的,EAR发布。");
		 System.out.print(demod2.add()+" ");
		 System. out.print(demod2.del()+" ");
		 System.out.print(demod2.export()+" ");
		 System.out.print(demod2.search()+" ");
		 System.out.print(demod2.leadin()+" ");
		 System.out.print(demod2.update()+" ");		
		 
		  
	}
}
