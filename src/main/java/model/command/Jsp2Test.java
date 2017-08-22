package model.command;

public class Jsp2Test {
//就是组合模式
	public static void main(String[] args) {
		
		//A.将命令和真正的实现组合起来，也就是组装机器，将豆浆机功能键上的连接线与电路相连接。
		Icircuit circuit = new Circuit();
		StartupCommand startupCommand = new StartupCommand(circuit);
		//B.为豆浆机的功能键设置对应的命令，使功能键与命令相匹配。
		SoyMilkGrinder soyMilkGrinder = new SoyMilkGrinder();
		soyMilkGrinder.setStartupCommand(startupCommand);
		//C.按下豆浆机上的功能键
		System.out.println(soyMilkGrinder.startupFunctionKey());
		 
		  
	}
}
