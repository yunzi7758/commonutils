package model.factorymethod;

/**  
 * <h1>����ģʽ</h1>  
 * 
 * @author jianghc  
 *   
*/  
public class Client {   

   /**
 * <br>��������ģʽʵ��ʱ���ͻ�����Ҫ����ʵ�����Ǹ�������ʵ�������࣬ѡ���жϵ����⻹�Ǵ��ڵģ�Ҳ����˵�����������Ѽ򵥹������ڲ��߼��ж��Ƶ��˿ͻ��˴��������С�  
     * ����Ҫ�ӵĹ��ܣ������ǸĹ�����ģ����������޸Ŀͻ��ˡ�  
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