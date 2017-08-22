package model.factorymethod;

public class Jsp2Test {

	public static void main(String[] args) {
		XiaoMing becility=new BecilityFactory().CreateXiaoMing();   
		System.out.println("Becility");   
	System.out.println("SkillOne: " + becility.SkillOne()); 
	System.out.println("SkillTwo: " + becility.SkillTwo()); 
	System.out.println("Industry: " + becility.Industry()); 
	
		XiaoMing Industry=new IndustryFactory().CreateXiaoMing();   
		System.out.println("Industry");   
	System.out.println("SkillOne: " + Industry.SkillOne()); 
	System.out.println("SkillTwo: " + Industry.SkillTwo()); 
	System.out.println("Industry: " + Industry.Industry()); 
	}
}
