package model.command;

/**
 * ӵ�й��ܼ���Ӧ�������Ķ���������  invoker
 */
public class SoyMilkGrinder {
    /**
     * �����������
     */
    private Command startupCommand;
    /**
     * �������������������
     * @param command ���������������
     */
    public void setStartupCommand(Command command){
       this.startupCommand = command;
    }
    /**
     *Ϊ�ͻ��ṩ�����ղ���Ӧ�û�����Ĺ��ܡ�Ҳ���ǰ��¹��ܼ������еķ�����
     */
    public String startupFunctionKey(){
       return startupCommand.execute();
    }
}
