package model.state2;
/**
 * 状态模式--对象在不同的状态有不同的行为
 * 
 * 对象的状态：对象属性值不同，就是不同的状态
 * 
 * 组合模式即可实现
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
			
		WarningSound warning = new WarningSound();
		
		System.out.println("不正常:"+warning.Sound());
		warning.setState(new HighSound());
		System.out.println("重大异常:"+warning.Sound());
		
		warning.setState(new LowSound());
		System.out.println("正常:"+warning.Sound());
		

	}
}
