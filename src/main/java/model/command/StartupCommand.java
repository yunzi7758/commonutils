package model.command;

/**
 * �����������������ʵ���࣬ʵ��Command�ӿڣ�ͨ�����ý����ߵķ�����ʵ�����
 */
public class StartupCommand implements Command{
    /**
     * ����ʵ������Ľ����ߡ�����·����
     */
    private Icircuit circuit = null;
    /**�����·���󷽷�
     * @param circuit ��·����
     */
    public StartupCommand(Icircuit circuit) {
       this.circuit = circuit;
    }
    public String execute() {
    	return this.circuit.startup();
    }
}
