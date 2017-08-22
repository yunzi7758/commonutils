package model.responsibility;
/**
 * 责任链--给A做一件事，A把职责以外的事交给B，B把职责以外的事交给C
 * (链条的顺序时固定，他们的职责时互斥的)
 * 
 * 通过组合即可实现
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
			
		 
			//先要组装责任链
		 Approval a1 = new BusinessManager();
		 Approval a2 = new Teamleader();
		 Approval a3 = new Cm();
		 a3.setPass(a2);
		 a2.setPass(a1);
		
		 //测试
		 String one = a3.handleMenuRequest("程序员", 29);
		 System.out.println("one = " + one);	
		 //测试
		 String two = a3.handleMenuRequest("业务员", 29);
		 System.out.println("two = " + two);
		  
		 //测试
		 String three = a3.handleMenuRequest("程序员", 40);
		 System.out.println("three = " + three);
		 //测试
		 String four = a3.handleMenuRequest("业务员", 40);
		 System. out.println("four = " + four);		
		 //测试
		 String five = a3.handleMenuRequest("程序员", 55);
		 System.out.println("five = " + five);	
		 //测试
		 String six = a3.handleMenuRequest("业务员", 55);
		 System.out.println("six = " + six);	

	}
}
