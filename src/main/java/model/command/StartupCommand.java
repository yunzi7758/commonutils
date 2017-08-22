package model.command;

/**
 * 具有启动机器命令的实现类，实现Command接口，通过调用接收者的方法来实现命令。
 */
public class StartupCommand implements Command{
    /**
     * 真正实现命令的接收者——电路对象
     */
    private Icircuit circuit = null;
    /**传入电路对象方法
     * @param circuit 电路对象
     */
    public StartupCommand(Icircuit circuit) {
       this.circuit = circuit;
    }
    public String execute() {
    	return this.circuit.startup();
    }
}
