package model.mediator;
/**
 * �н�ģʽ---��ֱ����ϵ��ͨ���н���ϵ
 * 
 * ʵ��
 * ��������ͬʱ�����н飬û��ֱ�ӹ�ϵ
 * �н�ͬʱ�����������󣬴�����Ϣ
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
			
		// �����н��߶���   
		ConcreteMediator cm = new ConcreteMediator();   
		   
		// ʹ��������ͬ�����˽��н��߶���   
		Jiangjia jj1 = new Jiangjia(cm);   
		Zhangyu zy2 = new Zhangyu(cm);   
		   
		// ʹ�н����˽��������ͬ�������   
		cm.setJiangjia(jj1);   
		cm.setZhangyu(zy2);   
		   
		System.out.println("����:"+String.valueOf(jj1.send("���������ѣ����ĺ�˧�ޣ�"))); 
		System.out.println("����:"+String.valueOf(zy2.send("�У��ҵ������ѱ���ĸ�˧��")));
		

	}
}
