package model.decorator2;

/*
 @author jianghc  
   Ա���࣬����Ա��С�Ų鿴��ȿ�����ϸ
 */
public class Employee {
	public static void main(String[] args) {
		// ���˱���
		ExamineeRecord er;
		er = new YearExamineeRecord();  //Ա�����п������     
		//���ſ�����߷�
		er = new TiptopPointDecorator(er);
		//��������
		er = new OrderDecorator(er);
		//���������ʾ
		er.record();
		er.signature("Ԭ��");  //����������
	}
}
