package model.decorator2;

public class Jsp2Test {

	public static void main(String[] args) {
      //�������
  		// ���˱���
  		ExamineeRecord er;
  		er = new YearExamineeRecord();  //Ա�����п������     
  		//���ſ�����߷�
  		er = new TiptopPointDecorator(er);
  		//��������
  		er = new OrderDecorator(er);
  		//���������ʾ
  		//er.record();
  		//er.signature("Ԭ��");  //����������	
  		System.out.println("�鿴�������:"+er.record());	

  		System.out.println("ǩ��"+er.signature("�"));
	}
}
