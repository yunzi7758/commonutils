package model.state2;
/**
 * ״̬ģʽ--�����ڲ�ͬ��״̬�в�ͬ����Ϊ
 * 
 * �����״̬����������ֵ��ͬ�����ǲ�ͬ��״̬
 * 
 * ���ģʽ����ʵ��
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
			
		WarningSound warning = new WarningSound();
		
		System.out.println("������:"+warning.Sound());
		warning.setState(new HighSound());
		System.out.println("�ش��쳣:"+warning.Sound());
		
		warning.setState(new LowSound());
		System.out.println("����:"+warning.Sound());
		

	}
}
