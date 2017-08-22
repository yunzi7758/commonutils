package model.command;

/**
 * 电路类，启动命令的真正实现者， Receiver接口的实现类
 */
public class Circuit implements Icircuit{
    /**
     * 真正的启动命令的实现
     */
    public String startup(){
    	String a="当前，电路正在启动，请稍等！";
    	String b="电源已接通！";
    	String c="检查机器！";
    	String d="应用程序载入！";
    	String e="机器正常运转起来！";
    	String f="豆浆机已经正常打开，请正常操作！";
       System.out.println("当前，电路正在启动，请稍等！");
       System.out.println("电源已接通！");
       System.out.println("检查机器！");
       System.out.println("应用程序载入！");
       System.out.println("机器正常运转起来！");
       System.out.println("豆浆机已经正常打开，请正常操作！");
       return a+b+c+d+e+f;
    }
}
