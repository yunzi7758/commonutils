package model.templateMethod2;
/**
 * ģ��---���벻��
 * ��һ���£��й̶��Ĳ�������Ҫ����Ĳ��֡�
 * ��һ��ģ�������ձ䶯�Ĳ�����������µķ�����д���ˡ�
 * 
 * *�����ģ�淽�����ڵ�ǰ�����棬������ֻҪʵ��ģ�淽������
 * 
 * *���������ν��ģ�涨�ڽӿ����棬�ӿ���Ϊ��������ʱ�䶯ͨ���ӿ�д���ˡ�
 * ʵ������ʱ���䶯�Ĳ��ֶ�̬�󶨵�ʵ�ʵ�ʵ��
 * 
 * �����Խ�ͬʱ�б�Ͳ���ķ���д�á�
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
		//�汾1�����쵼�õ�,WAR����
		Decorator demod1=new WarDecorator(new FirstEdition());
		System.out.print("�汾1�����쵼�õ�,WAR������");
		 
		 System.out.print(demod1.add()+" ");
		 System.out.print(demod1.del()+" ");
		 System.out.print(demod1.export()+" ");
		 System.out.print(demod1.search()+" ");
		 System.out.print(demod1.leadin()+" ");
		 System.out.print(demod1.update()+" ");
		 //�汾2����Ա���õ�,EAR������
		  Decorator demod2=new EarDecorator(new SecondEdition());
		  System.out.print("�汾2����Ա���õ�,EAR������");
		 System.out.print(demod2.add()+" ");
		 System. out.print(demod2.del()+" ");
		 System.out.print(demod2.export()+" ");
		 System.out.print(demod2.search()+" ");
		 System.out.print(demod2.leadin()+" ");
		 System.out.print(demod2.update()+" ");		
		 
		  
	}
}
