package model.decorator2;

/*
 @author jianghc   ConcreteDecorator��  ��������ְ�� 
  ����װ��
 */
public class OrderDecorator extends Decorator {
	//���캯��
	public OrderDecorator(ExamineeRecord er){
		super(er);
	}
	//Ա���ڲ��ŵ��������
	private String recordOrder(){
		String a="����������7...";
		System.out.println("����������7...");
		return a;
	}
	//�鿴���˷����벿������
	public String record(){
		super.record();
		this.recordOrder();
		return super.record()+this.recordOrder();
	}
}
