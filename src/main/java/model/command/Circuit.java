package model.command;

/**
 * ��·�࣬�������������ʵ���ߣ� Receiver�ӿڵ�ʵ����
 */
public class Circuit implements Icircuit{
    /**
     * ���������������ʵ��
     */
    public String startup(){
    	String a="��ǰ����·�������������Եȣ�";
    	String b="��Դ�ѽ�ͨ��";
    	String c="��������";
    	String d="Ӧ�ó������룡";
    	String e="����������ת������";
    	String f="�������Ѿ������򿪣�������������";
       System.out.println("��ǰ����·�������������Եȣ�");
       System.out.println("��Դ�ѽ�ͨ��");
       System.out.println("��������");
       System.out.println("Ӧ�ó������룡");
       System.out.println("����������ת������");
       System.out.println("�������Ѿ������򿪣�������������");
       return a+b+c+d+e+f;
    }
}
