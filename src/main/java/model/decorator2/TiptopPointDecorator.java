package model.decorator2;

/*
 @author jianghc  	ConcreteDecorator ��  ��������ְ��
  ��֪Ա��������߿��˷���װ��
 */
public class TiptopPointDecorator extends Decorator {
	//���캯��
	public TiptopPointDecorator(ExamineeRecord er){
		super(er);
	}
	//���ŵ���߿��˷������
	private String reportHighScore(){
		String a="�˴ο���,���ƽ����Ϊ4.2��2010�����߿��˷�Ϊ4.1��";
		System.out.println("�˴ο���,���ƽ����Ϊ4.2��2010�����߿��˷�Ϊ4.1��");
		return a;
	}
//������߿��˷���Ա���Ŀ��˷�
	public String record(){
		this.reportHighScore();
		super.record();
		return this.reportHighScore()+super.record();
	}
}
