package model.command;

public class Jsp2Test {
//�������ģʽ
	public static void main(String[] args) {
		
		//A.�������������ʵ�����������Ҳ������װ�����������������ܼ��ϵ����������·�����ӡ�
		Icircuit circuit = new Circuit();
		StartupCommand startupCommand = new StartupCommand(circuit);
		//B.Ϊ�������Ĺ��ܼ����ö�Ӧ�����ʹ���ܼ���������ƥ�䡣
		SoyMilkGrinder soyMilkGrinder = new SoyMilkGrinder();
		soyMilkGrinder.setStartupCommand(startupCommand);
		//C.���¶������ϵĹ��ܼ�
		System.out.println(soyMilkGrinder.startupFunctionKey());
		 
		  
	}
}
