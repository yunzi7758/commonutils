package model.factorymethod;

/**  
 * <h1>工厂模式</h1>  
 * 
 * @author jianghc  
 *   
*/  
public class Client {   

   /**
 * <br>工厂方法模式实现时，客户端需要决定实例化那个工厂来实现运算类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。  
     * 你想要加的功能，本来是改工厂类的，而现在是修改客户端。  
     * @param args  
     */  
   public static void main(String[] args) {   
  
        IMachineFactory factory=new BecilityFactory();   
       XiaoMing becility=factory.CreateXiaoMing();   
       becility.SkillOne();   
       becility.SkillTwo();   
       //becility.Industry();             
      IMachineFactory factory2=new IndustryFactory();   
       XiaoMing industry=factory2.CreateXiaoMing();   
      // industry.SkillOne();   
     //  industry.SkillTwo();   
       industry.Industry();  
   }   
 }  